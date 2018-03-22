package com.example.demo.test;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelTest  {

    public static void main(String[] args) {
        //创建HSSFWorkbook对象
        HSSFWorkbook wb = new HSSFWorkbook();
//创建HSSFSheet对象
        HSSFSheet sheet = wb.createSheet("sheet0");
//创建HSSFRow对象
        HSSFRow row = sheet.createRow(0);
//创建HSSFCell对象
        HSSFCell cell=row.createCell(0);
//设置单元格的值
        cell.setCellValue("单元格中的中文");


        try {
//输出Excel文件
            FileOutputStream output=new FileOutputStream("d:\\workbook.xls");
            wb.write(output);
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
