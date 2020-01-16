package com.example.test.myapplication;

/**
 * Created by Administrator on 2019/6/30 0030.
 */

public class ToolsUni {
    private String strName;
    protected  String strName2;
    public String strName3;

    public void SetIcoView(String StrSomThing){
        String str1 = StrSomThing;
    }

    public void set1(){
        int aa = 12;
        strName = "11";
        strName2 = "22";
        strName3 = "33";
        String strPub= "";
        char chr1 = '1';

        
        chr1 = strName2.charAt(2);

        strName3 = new Character('3').toString();

        ToolsUni setVw = new  ToolsUni();
        if (aa == 12){
            strPub =  strName;
        }else if(aa == 13){
            strPub = strName2;
        }else if(aa == 14){
            strPub = strName3;
        }

        setVw.SetIcoView(strPub);
    }

}
