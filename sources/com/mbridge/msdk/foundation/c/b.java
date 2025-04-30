package com.mbridge.msdk.foundation.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int f15362a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private String f15363c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f15364d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f15365e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f15366f;

    /* renamed from: g, reason: collision with root package name */
    private String f15367g;

    /* renamed from: h, reason: collision with root package name */
    private String f15368h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15369i;

    /* renamed from: j, reason: collision with root package name */
    private int f15370j = -1;

    /* renamed from: k, reason: collision with root package name */
    private String f15371k;
    private HashMap<Object, Object> l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private String f15372n;

    /* renamed from: o, reason: collision with root package name */
    private String f15373o;

    /* renamed from: p, reason: collision with root package name */
    private String f15374p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f15375q;

    public b(int i9) {
        this.f15362a = i9;
        this.b = a.b(i9);
    }

    public final int a() {
        return this.f15362a;
    }

    public final String b() {
        String str;
        int i9;
        if (!TextUtils.isEmpty(this.f15363c)) {
            str = this.f15363c;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (i9 = this.f15362a) != -1) {
            str = a.a(i9);
        }
        Throwable th = this.f15364d;
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        return !TextUtils.isEmpty(message) ? o.k(str, " # ", message) : str;
    }

    public final CampaignEx c() {
        return this.f15365e;
    }

    public final MBridgeIds d() {
        if (this.f15366f == null) {
            this.f15366f = new MBridgeIds();
        }
        return this.f15366f;
    }

    public final boolean e() {
        return this.f15369i;
    }

    public final int f() {
        return this.b;
    }

    public final int g() {
        return this.f15370j;
    }

    public final String h() {
        return this.f15371k;
    }

    public final int i() {
        return this.m;
    }

    public final String j() {
        return this.f15372n;
    }

    public final String k() {
        return this.f15373o;
    }

    public final String l() {
        return this.f15374p;
    }

    public final boolean m() {
        return this.f15375q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MBFailureReason{errorCode=");
        sb.append(this.f15362a);
        sb.append(", errorSubType=");
        sb.append(this.b);
        sb.append(", message='");
        sb.append(this.f15363c);
        sb.append("', cause=");
        sb.append(this.f15364d);
        sb.append(", campaign=");
        sb.append(this.f15365e);
        sb.append(", ids=");
        sb.append(this.f15366f);
        sb.append(", requestId='");
        sb.append(this.f15367g);
        sb.append("', localRequestId='");
        sb.append(this.f15368h);
        sb.append("', isHeaderBidding=");
        sb.append(this.f15369i);
        sb.append(", typeD=");
        sb.append(this.f15370j);
        sb.append(", reasonD='");
        sb.append(this.f15371k);
        sb.append("', extraMap=");
        sb.append(this.l);
        sb.append(", serverErrorCode=");
        sb.append(this.m);
        sb.append(", errorUrl='");
        sb.append(this.f15372n);
        sb.append("', serverErrorResponse='");
        return AbstractC2914a.h(sb, this.f15373o, "'}");
    }

    public final void a(String str) {
        this.f15363c = str;
    }

    public final void c(String str) {
        this.f15372n = str;
    }

    public final void e(String str) {
        this.f15374p = str;
    }

    public final void a(Throwable th) {
        this.f15364d = th;
    }

    public final void a(CampaignEx campaignEx) {
        this.f15365e = campaignEx;
    }

    public final void d(String str) {
        this.f15373o = str;
    }

    public b(int i9, String str) {
        this.f15362a = i9;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f15363c = str;
        this.b = a.b(i9);
    }

    public final void a(MBridgeIds mBridgeIds) {
        this.f15366f = mBridgeIds;
    }

    public final void a(boolean z8) {
        this.f15369i = z8;
    }

    public final void a(Object obj, Object obj2) {
        if (this.l == null) {
            this.l = new HashMap<>();
        }
        this.l.put(obj, obj2);
    }

    public final Object a(Object obj) {
        HashMap<Object, Object> hashMap = this.l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.l.get(obj);
        }
        return null;
    }

    public b(int i9, int i10, String str) {
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
            this.f15363c = str;
        } else {
            this.f15363c = a.a(i10);
        }
        this.m = i9;
        this.b = a.b(i10);
    }

    public final void a(int i9) {
        this.f15370j = i9;
    }

    public final void b(String str) {
        this.f15371k = str;
    }

    public final void b(boolean z8) {
        this.f15375q = z8;
    }
}
