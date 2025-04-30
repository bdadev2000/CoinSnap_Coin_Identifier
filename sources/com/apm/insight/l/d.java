package com.apm.insight.l;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f5922a = false;
    private static int b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f5923c = Pattern.compile("^0-([\\d]+)$");

    public static String a() {
        return b("ro.build.version.emui");
    }

    private static String b(String str) {
        BufferedReader bufferedReader;
        String str2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                str2 = bufferedReader.readLine();
                bufferedReader.close();
                k.a(bufferedReader);
                return str2;
            } catch (Throwable unused) {
                k.a(bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    private static int c(String str) {
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
                try {
                    readLine = bufferedReader.readLine();
                } catch (Throwable unused) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 == null) {
                        return -1;
                    }
                    bufferedReader2.close();
                    return -1;
                }
            } catch (Throwable unused2) {
            }
            if (readLine == null) {
                bufferedReader.close();
                return -1;
            }
            int d2 = d(readLine);
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
            return d2;
        } catch (IOException unused4) {
            return -1;
        }
    }

    private static int d(String str) {
        Matcher matcher = f5923c.matcher(str);
        if (matcher.matches()) {
            try {
                return Integer.parseInt(matcher.group(1)) + 1;
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static int e() {
        int i9 = b;
        if (i9 > 0) {
            return i9;
        }
        int c9 = c("/sys/devices/system/cpu/possible");
        if (c9 <= 0) {
            c9 = c("/sys/devices/system/cpu/present");
        }
        if (c9 <= 0) {
            c9 = e("/sys/devices/system/cpu/");
        }
        if (c9 <= 0) {
            c9 = Runtime.getRuntime().availableProcessors();
        }
        if (c9 <= 0) {
            c9 = 1;
        }
        b = c9;
        return c9;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = a();
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("emotionui")) {
            return b();
        }
        return true;
    }

    public static boolean b() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c() {
        if (!f5922a) {
            try {
                Class.forName("miui.os.Build");
                com.apm.insight.k.e.f5880a = true;
                f5922a = true;
                return true;
            } catch (Exception unused) {
                f5922a = true;
            }
        }
        return com.apm.insight.k.e.f5880a;
    }

    public static boolean d() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    private static int e(String str) {
        try {
            File[] listFiles = new File(str).listFiles(new FilenameFilter() { // from class: com.apm.insight.l.d.1

                /* renamed from: a, reason: collision with root package name */
                private final Pattern f5924a = Pattern.compile("^cpu[\\d]+$");

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    return this.f5924a.matcher(str2).matches();
                }
            });
            if (listFiles == null || listFiles.length <= 0) {
                return -1;
            }
            return listFiles.length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
