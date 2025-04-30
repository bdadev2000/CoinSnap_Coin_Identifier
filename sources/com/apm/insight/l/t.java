package com.apm.insight.l;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final CharSequence f5941a = "sony";
    private static final CharSequence b = "amigo";

    /* renamed from: c, reason: collision with root package name */
    private static final CharSequence f5942c = "funtouch";

    public static String a() {
        if (d.c()) {
            return j();
        }
        if (d.d()) {
            return l();
        }
        if (m()) {
            return n();
        }
        String k6 = k();
        if (!TextUtils.isEmpty(k6)) {
            return k6;
        }
        if (e()) {
            return d();
        }
        if (f()) {
            return g();
        }
        if (c()) {
            return b();
        }
        String h6 = h();
        return !TextUtils.isEmpty(h6) ? h6 : Build.DISPLAY;
    }

    public static String b() {
        return a("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean c() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static String d() {
        return a("ro.vivo.os.build.display.id") + "_" + a("ro.vivo.product.version");
    }

    public static boolean e() {
        String a6 = a("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(a6) && a6.toLowerCase(Locale.getDefault()).contains(f5942c);
    }

    public static boolean f() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase(Locale.getDefault()).contains(b);
    }

    public static String g() {
        return Build.DISPLAY + "_" + a("ro.gn.sv.version");
    }

    public static String h() {
        if (!i()) {
            return "";
        }
        return "eui_" + a("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static boolean i() {
        return !TextUtils.isEmpty(a("ro.letv.release.version"));
    }

    public static String j() {
        if (!d.c()) {
            return "";
        }
        return "miui_" + a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    public static String k() {
        String a6 = d.a();
        if (a6 != null && a6.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            StringBuilder c9 = AbstractC2965e.c(a6, "_");
            c9.append(Build.DISPLAY);
            return c9.toString();
        }
        return "";
    }

    public static String l() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str;
    }

    public static boolean m() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains("oppo");
    }

    public static String n() {
        if (!m()) {
            return "";
        }
        return "coloros_" + a("ro.build.version.opporom") + "_" + Build.DISPLAY;
    }

    private static String a(String str) {
        Process exec;
        BufferedReader bufferedReader;
        String str2 = "";
        BufferedReader bufferedReader2 = null;
        try {
            exec = Runtime.getRuntime().exec("getprop " + str);
            bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
        } catch (Throwable unused) {
        }
        try {
            str2 = bufferedReader.readLine();
            exec.destroy();
            k.a(bufferedReader);
            return str2;
        } catch (Throwable unused2) {
            bufferedReader2 = bufferedReader;
            k.a(bufferedReader2);
            return str2;
        }
    }
}
