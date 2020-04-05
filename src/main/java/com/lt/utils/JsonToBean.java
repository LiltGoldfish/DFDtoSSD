package com.lt.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lt.entity.DFD;

import java.io.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonToBean {
    public static DFD jsonToBean(String json) {
        ObjectMapper mapper = new ObjectMapper();
        DFD dfd = null;
        try {
            dfd = mapper.readValue(json, DFD.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dfd;
    }

    public static DFD jsonToBean(File file) {
        ObjectMapper mapper = new ObjectMapper();
        DFD dfd = null;
        try {
            dfd = mapper.readValue(file, DFD.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dfd;
    }

    /**
     * 读取json文件，返回json串
     *
     * @param pactFile
     * @return
     */
    public static String readJsonFile(String pactFile) {
        // 读取文件数据
        //System.out.println("读取文件数据util");

        StringBuffer strbuffer = new StringBuffer();
        File myFile = new File(pactFile);//"D:"+File.separatorChar+"DStores.json"
        if (!myFile.exists()) {
            System.err.println("Can't Find " + pactFile);
        }
        try {
            FileInputStream fis = new FileInputStream(pactFile);
            InputStreamReader inputStreamReader = new InputStreamReader(fis, "UTF-8");
            BufferedReader in = new BufferedReader(inputStreamReader);

            String str;
            while ((str = in.readLine()) != null) {
                strbuffer.append(str);  //new String(str,"UTF-8")
            }
            in.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        //System.out.println("读取文件结束util");
        return strbuffer.toString();
    }

}
