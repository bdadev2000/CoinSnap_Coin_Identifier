package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class yRU {
    private static String COT = null;
    private static int HWF = Integer.MAX_VALUE;
    public static boolean lMd = false;
    public static boolean zp = false;
    private static final CharSequence KS = "amigo";
    private static final CharSequence jU = "funtouch";
    private static final ConcurrentHashMap<String, String> QR = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public static class zp implements Callable<String> {
        private final String zp;

        public zp(String str) {
            this.zp = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) yRU.QR.get(this.zp);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String KS = yRU.KS(this.zp);
            System.currentTimeMillis();
            if (KS != null) {
                yRU.QR.put(this.zp, KS);
            }
            return KS;
        }
    }

    public static boolean Bj() {
        if (!TextUtils.isEmpty(jU("ro.letv.release.version"))) {
            return true;
        }
        return false;
    }

    public static boolean COT() {
        if (!lMd) {
            try {
                Class.forName("miui.os.Build");
                zp = true;
                lMd = true;
                return true;
            } catch (Exception unused) {
                lMd = true;
            }
        }
        return zp;
    }

    public static String HWF() {
        return jU("ro.vivo.os.build.display.id") + "_" + jU("ro.vivo.product.version");
    }

    public static String KS() {
        return jU("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static String KVG() {
        if (dQp()) {
            try {
                return "smartisan_".concat(String.valueOf(jU("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static boolean QR() {
        String jU2 = jU("ro.vivo.os.build.display.id");
        if (!TextUtils.isEmpty(jU2) && jU2.toLowerCase().contains(jU)) {
            return true;
        }
        return false;
    }

    public static String YW() {
        return Build.DISPLAY + "_" + jU("ro.gn.sv.version");
    }

    public static boolean cz() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean dQp() {
        if (!"smartisan".equalsIgnoreCase(Build.MANUFACTURER) && !"smartisan".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return true;
    }

    public static String dT() {
        if (Bj()) {
            return "eui_" + jU("ro.letv.release.version") + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static boolean jU() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean ku() {
        String str = Build.DISPLAY;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(KS)) {
            return true;
        }
        return false;
    }

    private static String ot() {
        if (dQp()) {
            return KVG();
        }
        if (COT()) {
            return vDp();
        }
        if (lMd()) {
            return woN();
        }
        if (vwr()) {
            return pvr();
        }
        String tG = tG();
        if (!TextUtils.isEmpty(tG)) {
            return tG;
        }
        if (QR()) {
            return HWF();
        }
        if (ku()) {
            return YW();
        }
        if (jU()) {
            return KS();
        }
        String dT = dT();
        if (!TextUtils.isEmpty(dT)) {
            return dT;
        }
        return Build.DISPLAY;
    }

    public static String pvr() {
        if (vwr()) {
            return "coloros_" + jU(YhE.QR("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static String rV() {
        return jU("ro.build.version.emui");
    }

    public static String tG() {
        String rV = rV();
        if (rV != null && rV.toLowerCase().contains("emotionui")) {
            StringBuilder c9 = AbstractC2965e.c(rV, "_");
            c9.append(Build.DISPLAY);
            return c9.toString();
        }
        return "";
    }

    public static String vDp() {
        if (COT()) {
            return "miui_" + jU("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        return "";
    }

    public static boolean vwr() {
        if (HWF == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String QR2 = YhE.QR("kllk");
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(QR2)) {
                HWF = 1;
            } else {
                HWF = 0;
            }
        }
        if (HWF != 1) {
            return false;
        }
        return true;
    }

    public static String woN() {
        String str = Build.DISPLAY;
        if (str != null && str.toLowerCase().contains("flyme")) {
            return str;
        }
        return "";
    }

    public static String zp() {
        if (!TextUtils.isEmpty(COT)) {
            return COT;
        }
        String zp2 = com.bytedance.sdk.openadsdk.core.ku.zp("sdk_local_rom_info", 604800000L);
        COT = zp2;
        if (TextUtils.isEmpty(zp2)) {
            String ot = ot();
            COT = ot;
            com.bytedance.sdk.openadsdk.core.ku.zp("sdk_local_rom_info", ot);
        }
        return COT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String KS(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        String str2 = "";
        Process process = null;
        try {
            try {
                try {
                    Process exec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
                        try {
                            str2 = bufferedReader.readLine();
                            exec.exitValue();
                            bufferedReader.close();
                        } catch (IllegalThreadStateException unused) {
                            process = exec;
                            try {
                                process.destroy();
                            } catch (Throwable unused2) {
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return str2;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                com.bytedance.sdk.component.utils.tG.zp("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                                return str2;
                            } finally {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e4) {
                                        com.bytedance.sdk.component.utils.tG.zp("ToolUtils", "Exception while closing InputStream", e4);
                                    }
                                }
                            }
                        }
                    } catch (IllegalThreadStateException unused3) {
                        bufferedReader = null;
                    }
                } catch (IllegalThreadStateException unused4) {
                    bufferedReader = null;
                }
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        } catch (IOException e9) {
            com.bytedance.sdk.component.utils.tG.zp("ToolUtils", "Exception while closing InputStream", e9);
        }
        return str2;
    }

    public static boolean lMd() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String jU(java.lang.String r4) {
        /*
            java.lang.String r0 = ""
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = com.bytedance.sdk.openadsdk.utils.yRU.QR
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Ld
            return r1
        Ld:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L34
            com.bytedance.sdk.openadsdk.utils.yRU$zp r1 = new com.bytedance.sdk.openadsdk.utils.yRU$zp     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.component.ku.QR r4 = new com.bytedance.sdk.component.ku.QR     // Catch: java.lang.Throwable -> L34
            r2 = 5
            r3 = 2
            r4.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.openadsdk.utils.yRU$1 r1 = new com.bytedance.sdk.openadsdk.utils.yRU$1     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "_getSystemPropertyTask"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.openadsdk.utils.QUv.lMd(r1)     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L34
            r2 = 1
            java.lang.Object r4 = r4.get(r2, r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L34
            goto L35
        L34:
            r4 = r0
        L35:
            if (r4 != 0) goto L38
            goto L39
        L38:
            r0 = r4
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.yRU.jU(java.lang.String):java.lang.String");
    }

    public static boolean zp(String str) {
        if (TextUtils.isEmpty(str)) {
            str = rV();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || cz();
    }
}
