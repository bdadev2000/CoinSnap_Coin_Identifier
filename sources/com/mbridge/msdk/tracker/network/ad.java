package com.mbridge.msdk.tracker.network;

/* loaded from: classes3.dex */
public abstract class ad extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final r f18156a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private int f18157c;

    /* renamed from: d, reason: collision with root package name */
    private String f18158d;

    public ad() {
        this.f18157c = 0;
        this.f18158d = "";
        this.f18156a = null;
    }

    public abstract int a();

    public final void a(long j7) {
        this.b = j7;
    }

    public final int b() {
        return this.f18157c;
    }

    public final String c() {
        return this.f18158d;
    }

    public final void a(int i9) {
        this.f18157c = i9;
    }

    public final void a(String str) {
        this.f18158d = str;
    }

    public ad(r rVar) {
        this.f18157c = 0;
        this.f18158d = "";
        this.f18156a = rVar;
    }

    public ad(String str) {
        super(str);
        this.f18157c = 0;
        this.f18158d = "";
        this.f18156a = null;
    }

    public ad(Throwable th) {
        super(th);
        this.f18157c = 0;
        this.f18158d = "";
        this.f18156a = null;
    }
}
