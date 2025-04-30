package com.bytedance.sdk.component.HWF.zp.lMd;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.HWF.zp.ku;
import com.bytedance.sdk.component.HWF.zp.zp.COT;

/* loaded from: classes.dex */
public class zp {
    public static boolean COT() {
        COT jU = ku.QR().jU();
        if (jU != null && !TextUtils.isEmpty(jU.KS())) {
            return true;
        }
        return false;
    }

    public static boolean HWF() {
        COT jU = ku.QR().jU();
        if (jU != null && !TextUtils.isEmpty(jU.HWF())) {
            return true;
        }
        return false;
    }

    public static boolean KS() {
        COT jU = ku.QR().jU();
        if (jU != null && !TextUtils.isEmpty(jU.jU())) {
            return true;
        }
        return false;
    }

    public static boolean jU() {
        COT jU = ku.QR().jU();
        if (jU != null && !TextUtils.isEmpty(jU.COT())) {
            return true;
        }
        return false;
    }

    private static long lMd(int i9, Context context) {
        if (context == null) {
            return i9;
        }
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory() / 1048576;
        long maxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (maxMemory <= 0) {
            if (freeMemory <= 2) {
                return 1L;
            }
            if (freeMemory <= 10) {
                return Math.min(i9, 10);
            }
            return Math.min((freeMemory / 2) * 10, i9);
        }
        long j7 = ((freeMemory + maxMemory) - 10) / 2;
        if (j7 <= 2) {
            return 1L;
        }
        if (j7 <= 10) {
            return Math.min(i9, 10);
        }
        return Math.min(j7 * 10, i9);
    }

    public static long zp(int i9, Context context) {
        return lMd(i9, context);
    }

    public static boolean zp() {
        COT jU = ku.QR().jU();
        return (jU == null || TextUtils.isEmpty(jU.zp())) ? false : true;
    }

    public static boolean lMd() {
        COT jU = ku.QR().jU();
        return (jU == null || TextUtils.isEmpty(jU.lMd())) ? false : true;
    }
}
