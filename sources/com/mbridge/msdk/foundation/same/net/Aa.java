package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.x;

/* loaded from: classes4.dex */
public class Aa {
    private static final String C_END = "_mv_end";
    private static final String C_START = "mv_channel_";
    private static String a = "";

    public static String a() {
        return a;
    }

    public static String b() {
        return null;
    }

    private static Integer c(String str) {
        Throwable th2;
        Integer num;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(C_START);
        int indexOf2 = str.indexOf(C_END);
        if (indexOf == -1 || indexOf2 == -1 || indexOf2 <= indexOf) {
            return null;
        }
        try {
            num = Integer.valueOf(str.substring(indexOf + 11, indexOf2));
        } catch (Throwable th3) {
            th2 = th3;
            num = null;
        }
        try {
            if (num.intValue() <= 0) {
                return null;
            }
            return num;
        } catch (Throwable th4) {
            th2 = th4;
            th2.printStackTrace();
            return num;
        }
    }

    private static void g() {
        new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.Aa.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Process.killProcess(Process.myPid());
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }, 500L);
    }

    private static void b(String str) {
        String str2;
        Integer c10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            str2 = x.a(str);
        } catch (Throwable th2) {
            th2.printStackTrace();
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2) && str2.startsWith(C_START) && str2.endsWith(C_END) && (c10 = c(str2)) != null) {
            a = String.valueOf(c10);
        } else if (!MBridgeConstans.DEBUG) {
            a = "";
        } else {
            g();
            throw new RuntimeException("please don't update this value");
        }
    }
}
