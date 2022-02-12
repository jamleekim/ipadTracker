package com.jamlee.ipadtracker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Response {
    private String result;
    private String resultMessage;
    private String responseType;

//    @Override
//    public String toString() {
//        return "Response{" +
//                "result='" + result + '\'' +
//                ", resultMessage='" + resultMessage + '\'' +
//                ", responseType='" + responseType + '\'' +
//                '}';
//    }
}
