package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public abstract class a<Resource> implements o {
    private final com.mbridge.msdk.newreward.function.d.a.b b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f17225c;

    /* renamed from: d, reason: collision with root package name */
    private int f17226d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17227e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17228f = false;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f17224a = false;

    public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        this.b = bVar;
        this.f17225c = aVar;
    }

    public final com.mbridge.msdk.newreward.function.d.a.b a() {
        return this.b;
    }

    public final com.mbridge.msdk.newreward.function.d.a.a b() {
        return this.f17225c;
    }

    public boolean c() {
        if (!TextUtils.isEmpty(j()) && !g() && !this.f17227e) {
            return false;
        }
        return true;
    }

    public boolean d() {
        if (!TextUtils.isEmpty(j()) && !i() && !this.f17228f) {
            return false;
        }
        return true;
    }

    public final int e() {
        return this.f17226d;
    }

    public final void a(boolean z8) {
        this.f17224a = z8;
    }

    public final void b(boolean z8) {
        this.f17227e = z8;
    }

    public final void a(int i9) {
        this.f17226d = i9;
    }
}
