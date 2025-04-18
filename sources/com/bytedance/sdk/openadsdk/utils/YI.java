package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class YI {
    private static volatile boolean AlY = true;
    private static String Sg;
    private static String YFl;
    private static String tN;

    /* loaded from: classes.dex */
    public static class YFl extends com.bytedance.sdk.component.qsH.qsH {
        public static AtomicBoolean YFl = new AtomicBoolean(false);
        private static final AtomicLong Sg = new AtomicLong(0);

        public YFl(String str, int i10) {
            super(str, i10);
        }

        public static void YFl() {
            if (!YFl.get()) {
                long currentTimeMillis = System.currentTimeMillis();
                AtomicLong atomicLong = Sg;
                if (currentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                    return;
                }
                atomicLong.set(currentTimeMillis);
                mn.Sg((com.bytedance.sdk.component.qsH.qsH) new YFl("UpdateSimStatusTask", 5));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            YFl.set(true);
            YI.wN();
            YFl.set(false);
        }
    }

    public static String Sg() {
        String str;
        String str2;
        try {
            YFl.YFl();
            if (!AlY) {
                StringBuilder sb2 = new StringBuilder("getMCC");
                if (AlY) {
                    str2 = "Have SIM card";
                } else {
                    str2 = "No SIM card, MCC returns null";
                }
                sb2.append(str2);
                com.bytedance.sdk.component.utils.YoT.YFl("MCC", sb2.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.lG.YFl().getResources().getConfiguration();
            int i10 = configuration.mcc;
            if (i10 != 0) {
                str = String.valueOf(i10);
            } else {
                str = Sg;
            }
            com.bytedance.sdk.component.utils.YoT.YFl("MCC", "config=" + configuration.mcc + ",sMCC=" + Sg);
            return str;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("SimUtils", th2.getMessage());
            return null;
        }
    }

    public static String YFl() {
        YFl.YFl();
        return YFl;
    }

    public static String tN() {
        YFl.YFl();
        return tN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wN() {
        String str;
        String str2;
        String str3;
        String str4;
        if (com.bytedance.sdk.openadsdk.core.lG.YFl() == null) {
            return;
        }
        AlY = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.lG.YFl().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState != 0) {
                    if (simState == 1) {
                        AlY = false;
                    }
                } else {
                    AlY = false;
                }
                if (AlY) {
                    str4 = "Have SIM card";
                } else {
                    str4 = "No SIM card";
                }
                com.bytedance.sdk.component.utils.YoT.YFl("MCC", str4);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("SimUtils", th2.getMessage());
            }
            String str5 = null;
            try {
                str = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                str = null;
            }
            try {
                str2 = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                str2 = null;
            }
            if (str2 == null || str2.length() < 5) {
                try {
                    str2 = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (!TextUtils.isEmpty(str2) && str2.length() > 4) {
                String substring = str2.substring(0, 3);
                str3 = str2.substring(3);
                str5 = substring;
            } else {
                str3 = null;
            }
            if (!TextUtils.isEmpty(str)) {
                YFl = str;
            }
            if (!TextUtils.isEmpty(str5)) {
                Sg = str5;
            }
            if (!TextUtils.isEmpty(str3)) {
                tN = str3;
            }
        } catch (Throwable unused4) {
        }
    }
}
