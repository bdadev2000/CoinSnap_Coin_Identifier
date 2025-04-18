package com.mbridge.msdk.splash.f;

import a4.j;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class f {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private String f15241b;

    /* renamed from: c, reason: collision with root package name */
    private int f15242c;

    /* renamed from: d, reason: collision with root package name */
    private int f15243d;

    /* renamed from: e, reason: collision with root package name */
    private int f15244e;

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.f15241b;
    }

    public final int c() {
        return this.f15242c;
    }

    public final int d() {
        return this.f15243d;
    }

    public final int e() {
        return this.f15244e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NativeAdvancedV3ParamsEntity{reqType=");
        sb2.append(this.a);
        sb2.append(", session_id='");
        sb2.append(this.f15241b);
        sb2.append("', offset=");
        sb2.append(this.f15242c);
        sb2.append(", expectWidth=");
        sb2.append(this.f15243d);
        sb2.append(", expectHeight=");
        return j.i(sb2, this.f15244e, AbstractJsonLexerKt.END_OBJ);
    }

    public final void a(int i10) {
        this.a = i10;
    }

    public final void b(int i10) {
        this.f15242c = i10;
    }

    public final void c(int i10) {
        this.f15243d = i10;
    }

    public final void d(int i10) {
        this.f15244e = i10;
    }

    public final void a(String str) {
        this.f15241b = str;
    }
}
