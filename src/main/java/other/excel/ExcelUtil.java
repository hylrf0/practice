package other.excel;

import lombok.Data;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linrufeng on 2017/5/19.
 */
public class ExcelUtil {

    /**
     * 读取Excel测试，兼容 Excel 2003/2007/2010
     */
//    public static List<User> read(String path, String fileName, String fileType) throws IOException {
//        InputStream stream = new FileInputStream(path + fileName + "." + fileType);
//        Workbook wb = null;
//        if (fileType.equals("xls")) {
//            wb = new HSSFWorkbook(stream);
//        } else if (fileType.equals("xlsx")) {
//            wb = new XSSFWorkbook(stream);
//        } else {
//            System.out.println("您输入的excel格式不正确");
//        }
//        Sheet sheet1 = wb.getSheetAt(0);
//        List<User> list = new ArrayList<User>(336951);
//        for (Row row : sheet1) {
//            row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
//            row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
//            row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
//            if (row.getCell(0).getStringCellValue().equals("uid")) {
//
//            } else {
//                User user = new User();
//                user.setUid(Integer.parseInt(row.getCell(0).getStringCellValue()));
//                user.setTel(row.getCell(1).getStringCellValue());
//                user.setStatus(Integer.parseInt(row.getCell(2).getStringCellValue()));
//                list.add(user);
//            }
//        }
//        return list;
//    }

//    public static void main(String[] args) {
//        List<User> alllist = null;
//        List<User> doenlist = null;
//        List<User> usedList = new ArrayList<User>();
//        try {
//            alllist = read("/Users/linrufeng/", "发券", "xlsx");
//            doenlist = read("/Users/linrufeng/", "已导入", "xlsx");
//            for (User allUser : alllist) {
//                for (User done : doenlist) {
//                    if (allUser.getUid().equals(done.getUid())) {
//                        alllist.remove(allUser);
//                        break;
//                    }
//                }
//            }
//            System.out.println("uid");
//            for (User user : alllist) {
//                System.out.println(user.getUid());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
}

//@Data
//class User {
//    private Integer uid;
//    private String tel;
//    private Integer status;
//}
