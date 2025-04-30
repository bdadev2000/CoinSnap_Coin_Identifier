package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class ox {
    private static String KS = null;
    private static volatile boolean jU = true;
    private static String lMd;
    private static String zp;

    /* loaded from: classes.dex */
    public static class zp extends com.bytedance.sdk.component.ku.ku {
        public static AtomicBoolean zp = new AtomicBoolean(false);
        private static final AtomicLong lMd = new AtomicLong(0);

        public zp(String str, int i9) {
            super(str, i9);
        }

        public static void zp() {
            if (!zp.get()) {
                long currentTimeMillis = System.currentTimeMillis();
                AtomicLong atomicLong = lMd;
                if (currentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                    return;
                }
                atomicLong.set(currentTimeMillis);
                QUv.lMd(new zp("UpdateSimStatusTask", 5));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            zp.set(true);
            ox.COT();
            zp.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void COT() {
        String str;
        String str2;
        String str3;
        String str4;
        if (com.bytedance.sdk.openadsdk.core.KVG.zp() == null) {
            return;
        }
        jU = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.KVG.zp().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState != 0) {
                    if (simState == 1) {
                        jU = false;
                    }
                } else {
                    jU = false;
                }
                if (jU) {
                    str4 = "Have SIM card";
                } else {
                    str4 = "No SIM card";
                }
                com.bytedance.sdk.component.utils.tG.zp("MCC", str4);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("SimUtils", th.getMessage());
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
                zp = str;
            }
            if (!TextUtils.isEmpty(str5)) {
                lMd = str5;
            }
            if (!TextUtils.isEmpty(str3)) {
                KS = str3;
            }
        } catch (Throwable unused4) {
        }
    }

    public static String KS() {
        zp.zp();
        return KS;
    }

    public static String lMd() {
        String str;
        String str2;
        try {
            zp.zp();
            if (!jU) {
                StringBuilder sb = new StringBuilder("getMCC");
                if (jU) {
                    str2 = "Have SIM card";
                } else {
                    str2 = "No SIM card, MCC returns null";
                }
                sb.append(str2);
                com.bytedance.sdk.component.utils.tG.zp("MCC", sb.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.KVG.zp().getResources().getConfiguration();
            int i9 = configuration.mcc;
            if (i9 != 0) {
                str = String.valueOf(i9);
            } else {
                str = lMd;
            }
            com.bytedance.sdk.component.utils.tG.zp("MCC", "config=" + configuration.mcc + ",sMCC=" + lMd);
            return str;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("SimUtils", th.getMessage());
            return null;
        }
    }

    public static String zp() {
        zp.zp();
        return zp;
    }
}
