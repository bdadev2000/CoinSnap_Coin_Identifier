package com.mbridge.msdk.mbbanner.common.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class a {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f13783b;

    /* renamed from: c, reason: collision with root package name */
    private String f13784c;

    /* renamed from: d, reason: collision with root package name */
    private String f13785d;

    /* renamed from: e, reason: collision with root package name */
    private String f13786e;

    /* renamed from: f, reason: collision with root package name */
    private String f13787f;

    /* renamed from: g, reason: collision with root package name */
    private String f13788g;

    /* renamed from: h, reason: collision with root package name */
    private int f13789h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13790i;

    private a() {
    }

    public final a a(boolean z10) {
        this.f13790i = z10;
        return this;
    }

    public final a b(String str) {
        this.f13783b = str;
        return this;
    }

    public final a c(String str) {
        this.f13784c = str;
        return this;
    }

    public final a d(String str) {
        this.f13785d = str;
        return this;
    }

    public final a e(String str) {
        this.f13786e = str;
        return this;
    }

    public final a f(String str) {
        this.f13787f = str;
        return this;
    }

    public final a g(String str) {
        this.f13788g = str;
        return this;
    }

    public static a a() {
        return new a();
    }

    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.f13783b)) {
            sb2.append("unit_id=");
            sb2.append(this.f13783b);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.f13784c)) {
            sb2.append("cid=");
            sb2.append(this.f13784c);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.f13785d)) {
            sb2.append("rid=");
            sb2.append(this.f13785d);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.f13786e)) {
            sb2.append("rid_n=");
            sb2.append(this.f13786e);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.f13787f)) {
            sb2.append("creative_id=");
            sb2.append(this.f13787f);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.f13788g)) {
            sb2.append("reason=");
            sb2.append(this.f13788g);
            sb2.append("&");
        }
        if (this.f13789h != 0) {
            sb2.append("result=");
            sb2.append(this.f13789h);
            sb2.append("&");
        }
        if (this.f13790i) {
            sb2.append("hb=1&");
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

    public final a a(String str) {
        this.a = str;
        return this;
    }

    public final a a(int i10) {
        this.f13789h = i10;
        return this;
    }
}
