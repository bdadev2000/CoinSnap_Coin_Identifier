package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public abstract class a<Resource> implements o {

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f14588b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f14589c;

    /* renamed from: d, reason: collision with root package name */
    private int f14590d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14591e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14592f = false;
    protected boolean a = false;

    public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        this.f14588b = bVar;
        this.f14589c = aVar;
    }

    public final com.mbridge.msdk.newreward.function.d.a.b a() {
        return this.f14588b;
    }

    public final com.mbridge.msdk.newreward.function.d.a.a b() {
        return this.f14589c;
    }

    public boolean c() {
        if (!TextUtils.isEmpty(j()) && !g() && !this.f14591e) {
            return false;
        }
        return true;
    }

    public boolean d() {
        if (!TextUtils.isEmpty(j()) && !i() && !this.f14592f) {
            return false;
        }
        return true;
    }

    public final int e() {
        return this.f14590d;
    }

    public final void a(boolean z10) {
        this.a = z10;
    }

    public final void b(boolean z10) {
        this.f14591e = z10;
    }

    public final void a(int i10) {
        this.f14590d = i10;
    }
}
