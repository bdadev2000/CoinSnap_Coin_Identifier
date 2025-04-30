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

    /* renamed from: a, reason: collision with root package name */
    private static int f5732a = 5;
    private static b b;

    /* renamed from: c, reason: collision with root package name */
    private static a f5733c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f5734d;

    /* renamed from: e, reason: collision with root package name */
    private static Printer f5735e;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j7);
    }

    /* loaded from: classes.dex */
    public static class b implements Printer {

        /* renamed from: a, reason: collision with root package name */
        List<Printer> f5736a = new ArrayList();
        List<Printer> b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        List<Printer> f5737c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        boolean f5738d = false;

        /* renamed from: e, reason: collision with root package name */
        boolean f5739e = false;

        @Override // android.util.Printer
        public void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = j.f5733c != null ? System.currentTimeMillis() : 0L;
            if (str.charAt(0) == '>' && this.f5739e) {
                for (Printer printer : this.f5737c) {
                    if (!this.f5736a.contains(printer)) {
                        this.f5736a.add(printer);
                    }
                }
                this.f5737c.clear();
                this.f5739e = false;
            }
            if (this.f5736a.size() > j.f5732a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f5736a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            if (str.charAt(0) == '<' && this.f5738d) {
                for (Printer printer3 : this.b) {
                    this.f5736a.remove(printer3);
                    this.f5737c.remove(printer3);
                }
                this.b.clear();
                this.f5738d = false;
            }
            if (j.f5733c == null || currentTimeMillis <= 0) {
                return;
            }
            j.f5733c.a(System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public static void a() {
        if (f5734d) {
            return;
        }
        f5734d = true;
        b = new b();
        Printer d2 = d();
        f5735e = d2;
        if (d2 != null) {
            b.f5736a.add(d2);
        }
        if (com.apm.insight.i.r()) {
            Looper.getMainLooper().setMessageLogging(b);
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
        if (printer == null || b.f5737c.contains(printer)) {
            return;
        }
        b.f5737c.add(printer);
        b.f5739e = true;
    }
}
