package com.xcode.HouseRentalManagementserver.util;

import java.util.*;

public class ResponseUtil {

    public static Map<String, Object> list(String message, List results) {

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", message);
        response.put("data", results);

        return response;
    }

    public static Map<String, Object> retrieve(String message, Object result) {

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", message);
        response.put("data", result);

        return response;
    }

    public static Map<String, Object> message(boolean success, String message) {

        Map<String, Object> response = new HashMap<>();
        response.put("success", success);
        response.put("message", message);

        return response;
    }

    public static Map<String, Object> error(String message, Object error) {

        Map<String, Object> response = new HashMap<>();
        response.put("success", false);
        response.put("message", message);
        response.put("error", error);

        return response;
    }

}
