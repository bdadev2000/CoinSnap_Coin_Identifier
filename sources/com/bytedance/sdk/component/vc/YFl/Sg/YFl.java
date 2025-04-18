package com.bytedance.sdk.component.vc.YFl.Sg;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.vc.YFl.YFl.wN;
import com.bytedance.sdk.component.vc.YFl.qsH;

/* loaded from: classes.dex */
public class YFl {
    public static boolean AlY() {
        wN AlY = qsH.DSW().AlY();
        if (AlY != null && !TextUtils.isEmpty(AlY.wN())) {
            return true;
        }
        return false;
    }

    private static long Sg(int i10, Context context) {
        if (context == null) {
            return i10;
        }
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory() / 1048576;
        long maxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (maxMemory <= 0) {
            if (freeMemory <= 2) {
                return 1L;
            }
            if (freeMemory <= 10) {
                return Math.min(i10, 10);
            }
            return Math.min((freeMemory / 2) * 10, i10);
        }
        long j3 = ((freeMemory + maxMemory) - 10) / 2;
        if (j3 <= 2) {
            return 1L;
        }
        if (j3 <= 10) {
            return Math.min(i10, 10);
        }
        return Math.min(j3 * 10, i10);
    }

    public static long YFl(int i10, Context context) {
        return Sg(i10, context);
    }

    public static boolean tN() {
        wN AlY = qsH.DSW().AlY();
        if (AlY != null && !TextUtils.isEmpty(AlY.AlY())) {
            return true;
        }
        return false;
    }

    public static boolean vc() {
        wN AlY = qsH.DSW().AlY();
        if (AlY != null && !TextUtils.isEmpty(AlY.vc())) {
            return true;
        }
        return false;
    }

    public static boolean wN() {
        wN AlY = qsH.DSW().AlY();
        if (AlY != null && !TextUtils.isEmpty(AlY.tN())) {
            return true;
        }
        return false;
    }

    public static boolean YFl() {
        wN AlY = qsH.DSW().AlY();
        return (AlY == null || TextUtils.isEmpty(AlY.YFl())) ? false : true;
    }

    public static boolean Sg() {
        wN AlY = qsH.DSW().AlY();
        return (AlY == null || TextUtils.isEmpty(AlY.Sg())) ? false : true;
    }
}
