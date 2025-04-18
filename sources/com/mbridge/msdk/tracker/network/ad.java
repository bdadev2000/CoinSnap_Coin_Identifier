package com.mbridge.msdk.tracker.network;

/* loaded from: classes4.dex */
public abstract class ad extends Exception {
    public final r a;

    /* renamed from: b, reason: collision with root package name */
    private long f15413b;

    /* renamed from: c, reason: collision with root package name */
    private int f15414c;

    /* renamed from: d, reason: collision with root package name */
    private String f15415d;

    public ad() {
        this.f15414c = 0;
        this.f15415d = "";
        this.a = null;
    }

    public abstract int a();

    public final void a(long j3) {
        this.f15413b = j3;
    }

    public final int b() {
        return this.f15414c;
    }

    public final String c() {
        return this.f15415d;
    }

    public final void a(int i10) {
        this.f15414c = i10;
    }

    public final void a(String str) {
        this.f15415d = str;
    }

    public ad(r rVar) {
        this.f15414c = 0;
        this.f15415d = "";
        this.a = rVar;
    }

    public ad(String str) {
        super(str);
        this.f15414c = 0;
        this.f15415d = "";
        this.a = null;
    }

    public ad(Throwable th2) {
        super(th2);
        this.f15414c = 0;
        this.f15415d = "";
        this.a = null;
    }
}
