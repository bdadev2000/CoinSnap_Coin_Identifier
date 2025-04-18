package com.mbridge.msdk.foundation.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;
import vd.e;

/* loaded from: classes4.dex */
public final class b implements Serializable {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f13004b;

    /* renamed from: c, reason: collision with root package name */
    private String f13005c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f13006d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f13007e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f13008f;

    /* renamed from: g, reason: collision with root package name */
    private String f13009g;

    /* renamed from: h, reason: collision with root package name */
    private String f13010h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13011i;

    /* renamed from: j, reason: collision with root package name */
    private int f13012j = -1;

    /* renamed from: k, reason: collision with root package name */
    private String f13013k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f13014l;

    /* renamed from: m, reason: collision with root package name */
    private int f13015m;

    /* renamed from: n, reason: collision with root package name */
    private String f13016n;

    /* renamed from: o, reason: collision with root package name */
    private String f13017o;

    /* renamed from: p, reason: collision with root package name */
    private String f13018p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13019q;

    public b(int i10) {
        this.a = i10;
        this.f13004b = a.b(i10);
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        int i10;
        String str = !TextUtils.isEmpty(this.f13005c) ? this.f13005c : "";
        if (TextUtils.isEmpty(str) && (i10 = this.a) != -1) {
            str = a.a(i10);
        }
        Throwable th2 = this.f13006d;
        if (th2 == null) {
            return str;
        }
        String message = th2.getMessage();
        return !TextUtils.isEmpty(message) ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, " # ", message) : str;
    }

    public final CampaignEx c() {
        return this.f13007e;
    }

    public final MBridgeIds d() {
        if (this.f13008f == null) {
            this.f13008f = new MBridgeIds();
        }
        return this.f13008f;
    }

    public final boolean e() {
        return this.f13011i;
    }

    public final int f() {
        return this.f13004b;
    }

    public final int g() {
        return this.f13012j;
    }

    public final String h() {
        return this.f13013k;
    }

    public final int i() {
        return this.f13015m;
    }

    public final String j() {
        return this.f13016n;
    }

    public final String k() {
        return this.f13017o;
    }

    public final String l() {
        return this.f13018p;
    }

    public final boolean m() {
        return this.f13019q;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MBFailureReason{errorCode=");
        sb2.append(this.a);
        sb2.append(", errorSubType=");
        sb2.append(this.f13004b);
        sb2.append(", message='");
        sb2.append(this.f13005c);
        sb2.append("', cause=");
        sb2.append(this.f13006d);
        sb2.append(", campaign=");
        sb2.append(this.f13007e);
        sb2.append(", ids=");
        sb2.append(this.f13008f);
        sb2.append(", requestId='");
        sb2.append(this.f13009g);
        sb2.append("', localRequestId='");
        sb2.append(this.f13010h);
        sb2.append("', isHeaderBidding=");
        sb2.append(this.f13011i);
        sb2.append(", typeD=");
        sb2.append(this.f13012j);
        sb2.append(", reasonD='");
        sb2.append(this.f13013k);
        sb2.append("', extraMap=");
        sb2.append(this.f13014l);
        sb2.append(", serverErrorCode=");
        sb2.append(this.f13015m);
        sb2.append(", errorUrl='");
        sb2.append(this.f13016n);
        sb2.append("', serverErrorResponse='");
        return e.h(sb2, this.f13017o, "'}");
    }

    public final void a(String str) {
        this.f13005c = str;
    }

    public final void c(String str) {
        this.f13016n = str;
    }

    public final void e(String str) {
        this.f13018p = str;
    }

    public final void a(Throwable th2) {
        this.f13006d = th2;
    }

    public final void a(CampaignEx campaignEx) {
        this.f13007e = campaignEx;
    }

    public final void d(String str) {
        this.f13017o = str;
    }

    public b(int i10, String str) {
        this.a = i10;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f13005c = str;
        this.f13004b = a.b(i10);
    }

    public final void a(MBridgeIds mBridgeIds) {
        this.f13008f = mBridgeIds;
    }

    public final void a(boolean z10) {
        this.f13011i = z10;
    }

    public final void a(Object obj, Object obj2) {
        if (this.f13014l == null) {
            this.f13014l = new HashMap<>();
        }
        this.f13014l.put(obj, obj2);
    }

    public final Object a(Object obj) {
        HashMap<Object, Object> hashMap = this.f13014l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.f13014l.get(obj);
        }
        return null;
    }

    public b(int i10, int i11, String str) {
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
            this.f13005c = str;
        } else {
            this.f13005c = a.a(i11);
        }
        this.f13015m = i10;
        this.f13004b = a.b(i11);
    }

    public final void a(int i10) {
        this.f13012j = i10;
    }

    public final void b(String str) {
        this.f13013k = str;
    }

    public final void b(boolean z10) {
        this.f13019q = z10;
    }
}
