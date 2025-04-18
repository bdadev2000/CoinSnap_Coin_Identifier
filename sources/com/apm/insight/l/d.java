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
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public class d {
    private static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private static int f3230b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f3231c = Pattern.compile("^0-([\\d]+)$");

    public static String a() {
        return b("ro.build.version.emui");
    }

    private static String b(String str) {
        BufferedReader bufferedReader;
        String str2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            try {
                str2 = bufferedReader.readLine();
                bufferedReader.close();
                j.a(bufferedReader);
                return str2;
            } catch (Throwable unused) {
                j.a(bufferedReader);
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
            } catch (Throwable unused) {
            }
            try {
                readLine = bufferedReader.readLine();
            } catch (Throwable unused2) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 == null) {
                    return -1;
                }
                bufferedReader2.close();
                return -1;
            }
            if (readLine == null) {
                bufferedReader.close();
                return -1;
            }
            int d10 = d(readLine);
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
            return d10;
        } catch (IOException unused4) {
            return -1;
        }
    }

    private static int d(String str) {
        Matcher matcher = f3231c.matcher(str);
        if (matcher.matches()) {
            try {
                return Integer.parseInt(matcher.group(1)) + 1;
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static int e() {
        int i10 = f3230b;
        if (i10 > 0) {
            return i10;
        }
        int c10 = c("/sys/devices/system/cpu/possible");
        if (c10 <= 0) {
            c10 = c("/sys/devices/system/cpu/present");
        }
        if (c10 <= 0) {
            c10 = e("/sys/devices/system/cpu/");
        }
        if (c10 <= 0) {
            c10 = Runtime.getRuntime().availableProcessors();
        }
        if (c10 <= 0) {
            c10 = 1;
        }
        f3230b = c10;
        return c10;
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
        if (!a) {
            try {
                Class.forName("miui.os.Build");
                com.apm.insight.k.e.a = true;
                a = true;
                return true;
            } catch (Exception unused) {
                a = true;
            }
        }
        return com.apm.insight.k.e.a;
    }

    public static boolean d() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    private static int e(String str) {
        try {
            File[] listFiles = new File(str).listFiles(new FilenameFilter() { // from class: com.apm.insight.l.d.1
                private final Pattern a = Pattern.compile("^cpu[\\d]+$");

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    return this.a.matcher(str2).matches();
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
