package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {
    private static int a = 5;

    /* renamed from: b, reason: collision with root package name */
    private static b f3054b;

    /* renamed from: c, reason: collision with root package name */
    private static a f3055c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f3056d;

    /* renamed from: e, reason: collision with root package name */
    private static Printer f3057e;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j3);
    }

    /* loaded from: classes.dex */
    public static class b implements Printer {
        List<Printer> a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        List<Printer> f3058b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        List<Printer> f3059c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        boolean f3060d = false;

        /* renamed from: e, reason: collision with root package name */
        boolean f3061e = false;

        @Override // android.util.Printer
        public void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = j.f3055c != null ? System.currentTimeMillis() : 0L;
            if (str.charAt(0) == '>' && this.f3061e) {
                for (Printer printer : this.f3059c) {
                    if (!this.a.contains(printer)) {
                        this.a.add(printer);
                    }
                }
                this.f3059c.clear();
                this.f3061e = false;
            }
            if (this.a.size() > j.a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            if (str.charAt(0) == '<' && this.f3060d) {
                for (Printer printer3 : this.f3058b) {
                    this.a.remove(printer3);
                    this.f3059c.remove(printer3);
                }
                this.f3058b.clear();
                this.f3060d = false;
            }
            if (j.f3055c == null || currentTimeMillis <= 0) {
                return;
            }
            j.f3055c.a(System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public static void a() {
        if (f3056d) {
            return;
        }
        f3056d = true;
        f3054b = new b();
        Printer d10 = d();
        f3057e = d10;
        if (d10 != null) {
            f3054b.a.add(d10);
        }
        if (com.apm.insight.i.r()) {
            Looper.getMainLooper().setMessageLogging(f3054b);
        }
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f3054b.f3059c.contains(printer)) {
            return;
        }
        f3054b.f3059c.add(printer);
        f3054b.f3061e = true;
    }
}
