package io.demo1a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FileReaderDemo {

    public static void renderProvinceCityList(ProvinceCityList provinceCityList) {
        for (ProvinceCity provinceCity : provinceCityList.getList()) {
            System.out.println("~~ " + provinceCity);
        }
    }

    public static void main(String[] args) {
        // localization/internationalization
        final ResourceBundle bundle = ResourceBundle.getBundle("io.demo1a.application");
        final String provinceCityCsvFilePath = bundle.getString("province.city.csv");
        CsvReader reader = new ProvinceCityCsvFileReader(provinceCityCsvFilePath);
        renderProvinceCityList(reader.read());

        System.out.println("jdbc.url: " + bundle.getString("jdbc.url"));
        System.out.println("jdbc.username: " + bundle.getString("jdbc.username"));
        System.out.println("jdbc.password: " + bundle.getString("jdbc.password"));
    }

}

class ProvinceCityCsvFileReader implements CsvReader {
    private File csvFile;

    public ProvinceCityCsvFileReader(String fileName) {
        csvFile = new File(fileName);
    }

    @Override
    public ProvinceCityList read() {
        FileReader fileReader = null;
        BufferedReader reader = null;
        ProvinceCityList provinceCityList = null;

        try {
            fileReader = new FileReader(csvFile);
            reader = new BufferedReader(fileReader);

            provinceCityList = new ProvinceCityList();

            String line = null;
            while ((line = reader.readLine()) != null) {
                ProvinceCity provinceCity = parseAndCreateInstance(line);
                provinceCityList.add(provinceCity);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }

        return provinceCityList;
    }

    private ProvinceCity parseAndCreateInstance(String line) {
        String[] rowData = line.split(",");
        String id = StringUtil.removeQuotes(rowData[0]);
        String psgcCode = StringUtil.removeQuotes(rowData[1]);
        String name = StringUtil.removeQuotes(rowData[2]);
        String registrationCode = StringUtil.removeQuotes(rowData[3]);
        String provinceCode = StringUtil.removeQuotes(rowData[4]);
        ProvinceCity provinceCity = ProvinceCity.newInstance(id, psgcCode, name, registrationCode, provinceCode);
        return provinceCity;
    }

}

class StringUtil {
    public static String removeQuotes(String value) {
        return value.substring(1, value.length() - 1);
    }
}

class ProvinceCityList {
    private final List<ProvinceCity> provincesAndCities;

    public ProvinceCityList() {
        provincesAndCities = new ArrayList<>();
    }

    public void add(ProvinceCity provinceCity) {
        provincesAndCities.add(provinceCity);
    }

    public List<ProvinceCity> getList() {
        return provincesAndCities;
    }
}

class ProvinceCity {
    private int id;
    private String psgcCode;
    private String name;
    private String registrationCode;
    private String provinceCode;

    public ProvinceCity() {
    }

    public ProvinceCity(int id, String psgcCode, String name, String registrationCode, String provinceCode) {

        this.id = id;
        this.psgcCode = psgcCode;
        this.name = name;
        this.registrationCode = registrationCode;
        this.provinceCode = provinceCode;
    }

    public static ProvinceCity newInstance(String id, String psgcCode, String name, String registrationCode, String provinceCode) {
        return new ProvinceCity(Integer.parseInt(id), psgcCode, name, registrationCode, provinceCode);
    }

    @Override
    public String toString() {
        return String.format("id=%s, psgcCode=%s, name=%s, registrationCode=%s, provinceCode=%s",
                             getId(),
                             getPsgcCode(),
                             getName(),
                             getRegistrationCode(),
                             getProvinceCode());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPsgcCode() {
        return psgcCode;
    }

    public void setPsgcCode(String psgcCode) {
        this.psgcCode = psgcCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

}
