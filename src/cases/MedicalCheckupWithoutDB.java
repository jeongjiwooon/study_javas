package cases;

import java.util.ArrayList;
import java.util.HashMap;

public class MedicalCheckupWithoutDB
{
    public static void main(String[] args)
    {
        try
        {
            ArrayList<HashMap<String, String>> refer = medical_data();

            printmedicalData(refer);

            System.out.println();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static ArrayList<HashMap<String, String>> medical_data()
    {
        ArrayList<HashMap<String, String>> refer = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> medical = new HashMap<String, String>();

        medical.put("이름", "홍길동");
        medical.put("성별", "남");
        medical.put("나이", "30");
        medical.put("키, 체중", "175, 75");
        medical.put("혈압, 혈당", "120/80, 90");
        medical.put("검진 결과", "비정상");
        medical.put("재검진 항목", "폐암, 갑상선 질환");
        refer.add(medical);

        medical = new HashMap<String, String>();
        medical.put("이름", "김영희");
        medical.put("성별", "여");
        medical.put("나이", "25");
        medical.put("키, 체중", "160, 55");
        medical.put("혈압, 혈당", "110/70, 85");
        medical.put("검진 결과", "비정상");
        medical.put("재검진 항목", "간암, 뇌졸중");
        refer.add(medical);

        medical = new HashMap<String, String>();
        medical.put("이름", "박철수");
        medical.put("성별", "남");
        medical.put("나이", "45");
        medical.put("키, 체중", "180, 85");
        medical.put("혈압, 혈당", "130/85, 100");
        medical.put("검진 결과", "정상");
        medical.put("재검진 항목", "심장질환");
        refer.add(medical);

        medical = new HashMap<String, String>();
        medical.put("이름", "이지은");
        medical.put("성별", "여");
        medical.put("나이", "35");
        medical.put("키, 체중", "165, 60");
        medical.put("혈압, 혈당", "115/75, 95");
        medical.put("검진 결과", "비정상");
        medical.put("재검진 항목", "간암, 알츠하이머병");
        refer.add(medical);

        medical = new HashMap<String, String>();
        medical.put("이름", "최민호");
        medical.put("성별", "남");
        medical.put("나이", "28");
        medical.put("키, 체중", "170, 70");
        medical.put("혈압, 혈당", "125/80, 92");
        medical.put("검진 결과", "정상");
        medical.put("재검진 항목", "간암");
        refer.add(medical);

        return refer;
    }

    public static void printmedicalData(ArrayList<HashMap<String, String>> refer)
    {
        for (HashMap<String, String> i : refer)
        {
            System.out.println("이름: " + i.get("이름"));
            System.out.println("성별: " + i.get("성별"));
            System.out.println("키, 체중: " + i.get("키, 체중"));
            System.out.println("혈압, 혈당: " + i.get("혈압, 혈당"));
            System.out.println("검진 결과: " + i.get("검진 결과"));
            System.out.println("재검진 항목: " + i.get("재검진 항목"));
            System.out.println();
        }
    }
}