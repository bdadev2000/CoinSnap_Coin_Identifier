package com.apm.insight.l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static String f5936a;
    private static File b;

    /* renamed from: c, reason: collision with root package name */
    private static File f5937c;

    /* renamed from: d, reason: collision with root package name */
    private static File f5938d;

    public static File a() {
        File file = f5937c;
        return file == null ? d(com.apm.insight.i.g()) : file;
    }

    public static File b(@NonNull Context context) {
        return new File(j(context), "apminsight/CrashLogSimple");
    }

    public static File c(@NonNull Context context) {
        return new File(j(context), "apminsight/RuntimeContext");
    }

    public static File d(@NonNull Context context) {
        if (f5937c == null) {
            if (context == null) {
                context = com.apm.insight.i.g();
            }
            f5937c = new File(j(context), "apminsight/CrashLogNative");
        }
        return f5937c;
    }

    public static File e(@NonNull Context context) {
        if (f5938d == null) {
            f5938d = new File(j(context) + "/apminsight/CrashCommonLog/" + com.apm.insight.i.f());
        }
        return f5938d;
    }

    public static File f(Context context) {
        return new File(j(context), "apminsight/CrashCommonLog");
    }

    public static File g(Context context) {
        return new File(j(context), "apminsight/issueCrashTimes");
    }

    public static File h(Context context) {
        return new File(j(context) + "/apminsight/issueCrashTimes/current.times");
    }

    public static File i(@NonNull Context context) {
        return new File(j(context), "apminsight/alogCrash");
    }

    public static File j(File file) {
        return new File(a(com.apm.insight.i.g(), file.getName()), "threads.txt");
    }

    public static File k(File file) {
        return new File(a(com.apm.insight.i.g(), file.getName()), "meminfo.txt");
    }

    public static File l(File file) {
        return new File(a(com.apm.insight.i.g(), file.getName()), "pthreads.txt");
    }

    public static File m(File file) {
        return new File(a(com.apm.insight.i.g(), file.getName()), "rountines.txt");
    }

    public static File n(File file) {
        return new File(a(com.apm.insight.i.g(), file.getName()), "leakd_threads.txt");
    }

    public static File o(File file) {
        return new File(file, "abortmsg.txt");
    }

    public static File a(@NonNull Context context) {
        return new File(j(context), "apminsight/CrashLogJava");
    }

    public static File b(File file) {
        return new File(file, "tombstone.txt");
    }

    public static File c(File file) {
        return new File(file, "header.bin");
    }

    public static File d(File file) {
        return new File(a(com.apm.insight.i.g(), file.getName()), "maps.txt");
    }

    public static File e(File file) {
        return new File(file, "callback.json");
    }

    public static File f(File file) {
        return new File(file, "upload.json");
    }

    public static File g(File file) {
        return new File(file, "javastack.txt");
    }

    public static File h(File file) {
        return new File(a(com.apm.insight.i.g(), file.getName()), "logcat.txt");
    }

    public static File i(File file) {
        return new File(a(com.apm.insight.i.g(), file.getName()), "fds.txt");
    }

    public static String j(@NonNull Context context) {
        if (TextUtils.isEmpty(f5936a)) {
            try {
                f5936a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e4) {
                f5936a = "/sdcard/";
                e4.printStackTrace();
            }
        }
        return f5936a;
    }

    public static File a(@NonNull Context context, String str) {
        return new File(j(context) + "/apminsight/CrashCommonLog/" + str);
    }

    public static File b(String str) {
        return new File(a(com.apm.insight.i.g(), str), "fds.txt");
    }

    public static File c(String str) {
        return new File(a(com.apm.insight.i.g(), str), "threads.txt");
    }

    public static File d(String str) {
        return new File(a(com.apm.insight.i.g(), str), "meminfo.txt");
    }

    public static File e(String str) {
        return new File(a(com.apm.insight.i.g(), str), "pthreads.txt");
    }

    public static File f(String str) {
        return new File(a(com.apm.insight.i.g(), str), "rountines.txt");
    }

    public static File g(String str) {
        return new File(a(com.apm.insight.i.g(), str), "leakd_threads.txt");
    }

    public static File a(File file) {
        return new File(file, "flog.txt");
    }

    public static String b() {
        return "anr_" + com.apm.insight.i.e();
    }

    public static String c() {
        return AbstractC2914a.d("ensure_", com.apm.insight.i.e());
    }

    public static File a(File file, String str) {
        return new File(file, file.getName() + str);
    }

    public static String a(String str) {
        return AbstractC2914a.d("dart_", str);
    }
}
