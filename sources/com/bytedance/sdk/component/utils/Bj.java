package com.bytedance.sdk.component.utils;

import java.util.List;

/* loaded from: classes.dex */
public class Bj {
    public static boolean lMd(List<?> list) {
        if (!zp(list)) {
            return true;
        }
        return false;
    }

    public static boolean zp(List<?> list) {
        if (list != null && list.size() != 0) {
            return false;
        }
        return true;
    }
}
