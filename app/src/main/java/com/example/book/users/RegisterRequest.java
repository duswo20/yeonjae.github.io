package com.example.book.users;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    //서버 URL 설정(php 파일 연동)
//    final static private String URL = "http://10.0.0.115/Register.php";
    final static private String URL = "http://192.168.33.224/Register.php";
    private Map<String, String> map;
    //private Map<String, String>parameters;

    public RegisterRequest(String userID, String userPassword, String userName, int userAge,String userGender, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID", userID);
        map.put("userPassword", userPassword);
        map.put("userName", userName);
        map.put("userAge", userAge+"");
        map.put("userGender", userGender);
    }

    @Override
    protected Map<String, String>getParams() throws AuthFailureError {
        return map;
    }
}