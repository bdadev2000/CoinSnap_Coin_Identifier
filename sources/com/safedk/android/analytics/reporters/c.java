package com.safedk.android.analytics.reporters;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29863a = "application";

    /* renamed from: b, reason: collision with root package name */
    private StackTraceElement f29864b;

    /* renamed from: c, reason: collision with root package name */
    private String f29865c;
    private String d;
    private int e;

    public c(StackTraceElement stackTraceElement, String str) {
        this.f29864b = stackTraceElement;
        this.f29865c = str;
    }

    public c(StackTraceElement stackTraceElement) {
        this.f29864b = stackTraceElement;
        this.f29865c = "application";
    }

    public StackTraceElement a() {
        return this.f29864b;
    }

    public String b() {
        return this.f29865c;
    }

    public int c() {
        return this.e;
    }

    public void a(int i2) {
        this.e = i2;
    }
}
