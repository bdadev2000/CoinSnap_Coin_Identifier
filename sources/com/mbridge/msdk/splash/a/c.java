package com.mbridge.msdk.splash.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class c {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f15080b;

    /* renamed from: c, reason: collision with root package name */
    private String f15081c;

    /* renamed from: d, reason: collision with root package name */
    private String f15082d;

    /* renamed from: e, reason: collision with root package name */
    private String f15083e;

    /* renamed from: f, reason: collision with root package name */
    private String f15084f;

    /* renamed from: g, reason: collision with root package name */
    private String f15085g;

    /* renamed from: h, reason: collision with root package name */
    private int f15086h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15087i;

    /* renamed from: j, reason: collision with root package name */
    private int f15088j;

    private c() {
    }

    public final c a(boolean z10) {
        this.f15087i = z10;
        return this;
    }

    public final c b(String str) {
        this.f15080b = str;
        return this;
    }

    public final c c(String str) {
        this.f15081c = str;
        return this;
    }

    public final c d(String str) {
        this.f15082d = str;
        return this;
    }

    public final c e(String str) {
        this.f15084f = str;
        return this;
    }

    public final c f(String str) {
        this.f15085g = str;
        return this;
    }

    public final c g(String str) {
        this.f15083e = str;
        return this;
    }

    public static c a() {
        return new c();
    }

    public final c b(int i10) {
        this.f15086h = i10;
        return this;
    }

    public final c a(String str) {
        this.a = str;
        return this;
    }

    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.f15080b)) {
            sb2.append("unit_id=");
            sb2.append(this.f15080b);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.f15081c)) {
            sb2.append("cid=");
            sb2.append(this.f15081c);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.f15082d)) {
            sb2.append("rid=");
            sb2.append(this.f15082d);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.f15083e)) {
            sb2.append("rid_n=");
            sb2.append(this.f15083e);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.f15084f)) {
            sb2.append("creative_id=");
            sb2.append(this.f15084f);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.f15085g)) {
            sb2.append("reason=");
            sb2.append(this.f15085g);
            sb2.append("&");
        }
        if (this.f15086h != 0) {
            sb2.append("result=");
            sb2.append(this.f15086h);
            sb2.append("&");
        }
        if (this.f15087i) {
            sb2.append("hb=1&");
        }
        if (this.f15088j != 0) {
            sb2.append("close_type=");
            sb2.append(this.f15088j);
            sb2.append("&");
        }
        sb2.append("network_type=");
        sb2.append(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        sb2.append("&");
        if (!TextUtils.isEmpty(this.a)) {
            sb2.append("key=");
            sb2.append(this.a);
        }
        return sb2.toString();
    }

    public final void a(int i10) {
        this.f15088j = i10;
    }
}
