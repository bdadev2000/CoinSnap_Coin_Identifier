package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import eb.j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public class bZ {
    public static boolean Sg = false;
    public static boolean YFl = false;

    /* renamed from: vc, reason: collision with root package name */
    private static int f10834vc = Integer.MAX_VALUE;
    private static String wN;
    private static final CharSequence tN = "amigo";
    private static final CharSequence AlY = "funtouch";
    private static final ConcurrentHashMap<String, String> DSW = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public static class YFl implements Callable<String> {
        private final String YFl;

        public YFl(String str) {
            this.YFl = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) bZ.DSW.get(this.YFl);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String tN = bZ.tN(this.YFl);
            System.currentTimeMillis();
            if (tN != null) {
                bZ.DSW.put(this.YFl, tN);
            }
            return tN;
        }
    }

    public static boolean AlY() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean DSW() {
        String AlY2 = AlY("ro.vivo.os.build.display.id");
        if (!TextUtils.isEmpty(AlY2) && AlY2.toLowerCase().contains(AlY)) {
            return true;
        }
        return false;
    }

    public static boolean EH() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static String GA() {
        String pDU = pDU();
        if (pDU != null && pDU.toLowerCase().contains("emotionui")) {
            StringBuilder n10 = j.n(pDU, "_");
            n10.append(Build.DISPLAY);
            return n10.toString();
        }
        return "";
    }

    private static String Ne() {
        if (EH()) {
            return rkt();
        }
        if (wN()) {
            return YoT();
        }
        if (Sg()) {
            return lG();
        }
        if (Wwa()) {
            return qO();
        }
        String GA = GA();
        if (!TextUtils.isEmpty(GA)) {
            return GA;
        }
        if (DSW()) {
            return vc();
        }
        if (qsH()) {
            return NjR();
        }
        if (AlY()) {
            return tN();
        }
        String nc2 = nc();
        if (!TextUtils.isEmpty(nc2)) {
            return nc2;
        }
        return Build.DISPLAY;
    }

    public static String NjR() {
        return Build.DISPLAY + "_" + AlY("ro.gn.sv.version");
    }

    public static boolean Wwa() {
        if (f10834vc == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String DSW2 = Sco.DSW("kllk");
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(DSW2)) {
                f10834vc = 1;
            } else {
                f10834vc = 0;
            }
        }
        if (f10834vc != 1) {
            return false;
        }
        return true;
    }

    public static String YFl() {
        if (!TextUtils.isEmpty(wN)) {
            return wN;
        }
        String YFl2 = com.bytedance.sdk.openadsdk.core.NjR.YFl("sdk_local_rom_info", 604800000L);
        wN = YFl2;
        if (TextUtils.isEmpty(YFl2)) {
            String Ne = Ne();
            wN = Ne;
            com.bytedance.sdk.openadsdk.core.NjR.YFl("sdk_local_rom_info", Ne);
        }
        return wN;
    }

    public static String YoT() {
        if (wN()) {
            return "miui_" + AlY("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        return "";
    }

    public static boolean aIu() {
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

    public static boolean eT() {
        if (!TextUtils.isEmpty(AlY("ro.letv.release.version"))) {
            return true;
        }
        return false;
    }

    public static String lG() {
        String str = Build.DISPLAY;
        if (str != null && str.toLowerCase().contains("flyme")) {
            return str;
        }
        return "";
    }

    public static String nc() {
        if (eT()) {
            return "eui_" + AlY("ro.letv.release.version") + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static String pDU() {
        return AlY("ro.build.version.emui");
    }

    public static String qO() {
        if (Wwa()) {
            return "coloros_" + AlY(Sco.DSW("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static boolean qsH() {
        String str = Build.DISPLAY;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(tN)) {
            return true;
        }
        return false;
    }

    public static String rkt() {
        if (EH()) {
            try {
                return "smartisan_".concat(String.valueOf(AlY("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String tN() {
        return AlY("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static String vc() {
        return AlY("ro.vivo.os.build.display.id") + "_" + AlY("ro.vivo.product.version");
    }

    public static boolean wN() {
        if (!Sg) {
            try {
                Class.forName("miui.os.Build");
                YFl = true;
                Sg = true;
                return true;
            } catch (Exception unused) {
                Sg = true;
            }
        }
        return YFl;
    }

    public static boolean Sg() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String tN(String str) {
        BufferedReader bufferedReader;
        Throwable th2;
        String str2 = "";
        Process process = null;
        try {
            try {
                try {
                    Process exec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
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
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                com.bytedance.sdk.component.utils.YoT.YFl("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th2);
                                return str2;
                            } finally {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e2) {
                                        com.bytedance.sdk.component.utils.YoT.YFl("ToolUtils", "Exception while closing InputStream", e2);
                                    }
                                }
                            }
                        }
                    } catch (IllegalThreadStateException unused3) {
                        bufferedReader = null;
                    }
                } catch (Throwable th4) {
                    bufferedReader = null;
                    th2 = th4;
                }
            } catch (IllegalThreadStateException unused4) {
                bufferedReader = null;
            }
        } catch (IOException e10) {
            com.bytedance.sdk.component.utils.YoT.YFl("ToolUtils", "Exception while closing InputStream", e10);
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String AlY(java.lang.String r4) {
        /*
            java.lang.String r0 = ""
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = com.bytedance.sdk.openadsdk.utils.bZ.DSW
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Ld
            return r1
        Ld:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L34
            com.bytedance.sdk.openadsdk.utils.bZ$YFl r1 = new com.bytedance.sdk.openadsdk.utils.bZ$YFl     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.component.qsH.DSW r4 = new com.bytedance.sdk.component.qsH.DSW     // Catch: java.lang.Throwable -> L34
            r2 = 5
            r3 = 2
            r4.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.openadsdk.utils.bZ$1 r1 = new com.bytedance.sdk.openadsdk.utils.bZ$1     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "_getSystemPropertyTask"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.openadsdk.utils.mn.Sg(r1)     // Catch: java.lang.Throwable -> L34
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.bZ.AlY(java.lang.String):java.lang.String");
    }

    public static boolean YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            str = pDU();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || aIu();
    }
}
