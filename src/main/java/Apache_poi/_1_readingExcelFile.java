package Apache_poi;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class _1_readingExcelFile {


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

        //specific data from cell and rows
        System.out.println(" Data in cell 1 and row 1 is : " +sheet.getRow(1).getCell(1));
        System.out.println(" Data in cell 1 and row 2 is : " +sheet.getRow(2).getCell(1));


        //print whole table
        for (int r = 0 ; r <= totalrows ; r ++)
        {
            XSSFRow row = sheet.getRow(r);
            for( int c = 0; c <= totalcells ; c++ )
            {
                XSSFCell cell = row.getCell(c);

                String value = formatter.formatCellValue(cell);
                System.out.print("   |   " + value);

            }
            System.out.println(" ");
        }


    }
}




