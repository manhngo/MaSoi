package com.example.ngoxuanmanh.masoi.Util;

import com.example.ngoxuanmanh.masoi.NguoiChoi;

import java.util.List;

/**
 * Created by NgoXuanManh on 7/23/2017.
 */

public class MyUtils {

    public static void prepareRecyclerViewData(final List<NguoiChoi> nguoiChois) {
        NguoiChoi nguoiChoi = new NguoiChoi("Manh");
        nguoiChois.add(nguoiChoi);
        nguoiChoi = new NguoiChoi("Trang");
        nguoiChois.add(nguoiChoi);
        nguoiChoi = new NguoiChoi("Ba Duc");
        nguoiChois.add(nguoiChoi);
        nguoiChoi = new NguoiChoi("Me Huong");
        nguoiChois.add(nguoiChoi);
    }
}
