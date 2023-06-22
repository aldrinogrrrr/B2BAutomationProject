package utility;



import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.python.antlr.ast.Str;


import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ExcelReport {

    private static String[] columns = {"STEP", "STATUS"};
    public static String outputDir = System.getProperty("user.dir") + "\\TestLogs\\";
    public static Map<String, String> testDataMap;

    public static void generateTestLogReport(String fileName, List<TestLog> _testLogs) throws IOException {


        // Create a Workbook
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file
        CreationHelper createHelper = workbook.getCreationHelper();
        // Create a Sheet
        Sheet sheet = workbook.createSheet("Employee");
        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());
        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);
        // Create a Row
        Row headerRow = sheet.createRow(0);
        // Create cells
        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }
        //filling cell value from the TestLog class
        int rowNum = 1;
        for (TestLog test_log : _testLogs) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(test_log.getStep());

            row.createCell(1)
                    .setCellValue(test_log.getStatus());
        }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        DateTimeFormatter timeStampPattern = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        String dtimeStamp = timeStampPattern.format(java.time.LocalDateTime.now());
        FileOutputStream fileOut = new FileOutputStream(outputDir + "TestLog-" + fileName + dtimeStamp + ".xlsx");
        workbook.write(fileOut);
        fileOut.close();
        // Closing the workbook
        //System.out.println("output dir: "+outputDir);
        workbook.close();
    }

    //READ EXCEL FILE : FOR TEST DATA READING
    public static Map<String,String> readExcelFile() throws IOException {
        //Path of the excel file
        String inputStream = System.getProperty("user.dir") + "\\src\\TestData\\TestDataFile.xlsx";
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        ExcelReport.testDataMap = new HashMap<>();
        System.out.println("# OF ROWS: " +sheet.getPhysicalNumberOfRows());
        for (int i = 2; i <= sheet.getPhysicalNumberOfRows(); i++) {

            CellAddress col1 = new CellAddress("A" + i);
            CellAddress col2 = new CellAddress("B" + i);
            Row row1 = sheet.getRow(col1.getRow());
            Cell cell1 = row1.getCell(col1.getColumn());
            // Row row2 = sheet.getRow(col2.getRow());
            Cell cell2 = row1.getCell(col2.getColumn());
            testDataMap.put(cell1.getStringCellValue(), cell2.getStringCellValue());
//          System.out.println(testDataMap.get("Vorname")); //TO GET SEPECIFIC DATA
//          System.out.println(cell1.getRichStringCellValue() + " " + cell2.getRichStringCellValue());
        }
        return  testDataMap;
    }

    //call this method to fill data in TestLog class
    public void writeLog(String _step, String _status, List<TestLog> testLogs) {
        testLogs.add(new TestLog(_step, _status));
    }
}
