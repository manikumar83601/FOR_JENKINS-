package Apache_poi;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class _2_printingCell {
    static DataFormatter formatter = new DataFormatter();
    public static void main(String[] args) throws IOException {

        String path = "D:\\intelijj idea\\test running files\\Apache POI example 1.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        //total number of rows & cells =
        int totalrows = sheet.getLastRowNum();
        int totalcells = sheet.getRow(0).getLastCellNum();
        System.out.println("total cells :"+totalcells);
        System.out.println("total rows :"+totalrows);



        //print whole table
        for (int r = 0 ; r <= totalrows ; r ++)
        {
            XSSFRow row = sheet.getRow(r);
            XSSFCell cell = row.getCell(3);
            String value = formatter.formatCellValue(cell);
            System.out.println("       |       " + value);
        }
    }
}
