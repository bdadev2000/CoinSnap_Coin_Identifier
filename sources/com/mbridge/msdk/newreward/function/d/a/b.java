package com.mbridge.msdk.newreward.function.d.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.d.c.d;
import com.mbridge.msdk.newreward.function.d.c.e;
import com.mbridge.msdk.newreward.function.d.c.i;
import com.mbridge.msdk.newreward.function.d.c.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {
    private String A;
    private int B;
    private int C;
    private List<CampaignEx> D;
    private int E;
    private long G;
    private Map<String, Object> H;
    private String I;
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private String f14536b;

    /* renamed from: c, reason: collision with root package name */
    private String f14537c;

    /* renamed from: d, reason: collision with root package name */
    private String f14538d;

    /* renamed from: e, reason: collision with root package name */
    private String f14539e;

    /* renamed from: f, reason: collision with root package name */
    private String f14540f;

    /* renamed from: g, reason: collision with root package name */
    private String f14541g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14542h;

    /* renamed from: j, reason: collision with root package name */
    private int f14544j;

    /* renamed from: k, reason: collision with root package name */
    private String f14545k;

    /* renamed from: l, reason: collision with root package name */
    private String f14546l;

    /* renamed from: m, reason: collision with root package name */
    private String f14547m;

    /* renamed from: n, reason: collision with root package name */
    private String f14548n;

    /* renamed from: o, reason: collision with root package name */
    private int f14549o;

    /* renamed from: p, reason: collision with root package name */
    private long f14550p;

    /* renamed from: q, reason: collision with root package name */
    private long f14551q;

    /* renamed from: r, reason: collision with root package name */
    private long f14552r;

    /* renamed from: s, reason: collision with root package name */
    private double f14553s;

    /* renamed from: t, reason: collision with root package name */
    private int f14554t;
    private List<a> u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f14555v;

    /* renamed from: w, reason: collision with root package name */
    private d<?> f14556w;

    /* renamed from: z, reason: collision with root package name */
    private Context f14559z;

    /* renamed from: i, reason: collision with root package name */
    private long f14543i = 30000;

    /* renamed from: x, reason: collision with root package name */
    private int f14557x = 60000;

    /* renamed from: y, reason: collision with root package name */
    private int f14558y = 60000;
    private int F = 0;
    private boolean J = false;

    public b(int i10, String str, String str2, String str3) {
        this.a = i10;
        this.f14536b = str;
        this.f14537c = str2;
        this.f14538d = str3;
    }

    public final int A() {
        return this.C;
    }

    public final int B() {
        return this.B;
    }

    public final List<CampaignEx> C() {
        return this.D;
    }

    public final int D() {
        int i10 = this.E;
        if (i10 <= 0) {
            return 1;
        }
        return i10;
    }

    public final int E() {
        return this.F;
    }

    public final Map<String, Object> F() {
        if (this.H == null) {
            this.H = new HashMap();
        }
        return this.H;
    }

    public final long G() {
        return this.G;
    }

    public final String H() {
        return this.I;
    }

    public final boolean I() {
        return this.J;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.f14537c;
    }

    public final String c() {
        return this.f14538d;
    }

    public final String d() {
        return this.f14539e;
    }

    public final String e() {
        return this.f14540f;
    }

    public final String f() {
        return this.f14541g;
    }

    public final boolean g() {
        return this.f14542h;
    }

    public final int h() {
        return this.f14544j;
    }

    public final String i() {
        return this.f14545k;
    }

    public final String j() {
        return this.f14546l;
    }

    public final String k() {
        return this.f14547m;
    }

    public final String l() {
        return this.f14548n;
    }

    public final int m() {
        return this.f14549o;
    }

    public final long n() {
        return this.f14550p;
    }

    public final long o() {
        return this.f14551q;
    }

    public final long p() {
        return this.f14552r;
    }

    public final double q() {
        return this.f14553s;
    }

    public final int r() {
        return this.f14554t;
    }

    public final List<a> s() {
        return this.u;
    }

    public final JSONObject t() {
        return this.f14555v;
    }

    public final d<?> u() {
        d<?> dVar = this.f14556w;
        if (dVar != null) {
            return dVar;
        }
        String str = this.A;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f14556w == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                this.f14556w = new e(this, null);
            } else {
                this.f14556w = new i(this, null);
            }
        }
        return this.f14556w;
    }

    public final int v() {
        return this.f14557x;
    }

    public final Context w() {
        return this.f14559z;
    }

    public final boolean x() {
        boolean z10;
        List<a> list;
        boolean z11;
        boolean z12;
        boolean z13;
        d<?> dVar = this.f14556w;
        if (dVar != null && !dVar.c()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || (list = this.u) == null || list.isEmpty()) {
            return false;
        }
        int size = this.u.size();
        int i10 = 0;
        for (a aVar : this.u) {
            n d10 = aVar.d();
            if (d10 != null && !d10.c()) {
                z11 = false;
            } else {
                z11 = true;
            }
            d<?> f10 = aVar.f();
            if (f10 != null && !f10.c()) {
                z12 = false;
            } else {
                z12 = true;
            }
            d<?> c10 = aVar.c();
            if (c10 != null && !c10.c()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z11 && z12 && z13) {
                i10++;
            }
        }
        if (i10 == size) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        boolean z10;
        boolean z11;
        boolean z12;
        List<a> list;
        boolean z13;
        boolean z14;
        boolean z15;
        if (this.f14550p > System.currentTimeMillis()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean x10 = x();
        d<?> dVar = this.f14556w;
        if (dVar != null && !dVar.c()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && (list = this.u) != null && !list.isEmpty()) {
            int size = this.u.size();
            int i10 = 0;
            for (a aVar : this.u) {
                n d10 = aVar.d();
                if (d10 != null && !d10.d()) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                d<?> f10 = aVar.f();
                if (f10 != null && !f10.d()) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                d<?> c10 = aVar.c();
                if (c10 != null && !c10.d()) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z13 && z14 && z15) {
                    i10++;
                }
            }
            if (i10 == size) {
                z12 = true;
                if (!z10 && x10 && z12) {
                    return true;
                }
                return false;
            }
        }
        z12 = false;
        if (!z10) {
        }
        return false;
    }

    public final String z() {
        return this.A;
    }

    public final void a(String str) {
        this.f14539e = str;
    }

    public final void b(String str) {
        this.f14540f = str;
    }

    public final void c(String str) {
        this.f14541g = str;
    }

    public final void d(String str) {
        this.f14545k = str;
    }

    public final void e(String str) {
        this.f14546l = str;
    }

    public final void f(String str) {
        this.f14547m = str;
    }

    public final void g(String str) {
        this.f14548n = str;
    }

    public final void h(String str) {
        this.A = str;
    }

    public final void i(int i10) {
        this.F = i10;
    }

    public final void a(boolean z10) {
        this.f14542h = z10;
    }

    public final void b(int i10) {
        this.f14549o = i10;
    }

    public final void c(long j3) {
        this.f14551q = j3;
    }

    public final void d(long j3) {
        this.f14552r = j3;
    }

    public final void e(int i10) {
        this.f14558y = i10;
    }

    public final void f(int i10) {
        this.C = i10;
    }

    public final void g(int i10) {
        this.B = i10;
    }

    public final void h(int i10) {
        this.E = i10;
    }

    public final void i(String str) {
        this.I = str;
    }

    public final void a(long j3) {
        this.f14543i = j3;
    }

    public final void b(long j3) {
        this.f14550p = j3;
    }

    public final void c(int i10) {
        this.f14554t = i10;
    }

    public final void d(int i10) {
        this.f14557x = i10;
    }

    public final void e(long j3) {
        this.G = j3;
    }

    public final void a(int i10) {
        this.f14544j = i10;
    }

    public final void b(List<CampaignEx> list) {
        this.D = list;
    }

    public final void a(double d10) {
        this.f14553s = d10;
    }

    public final void b(boolean z10) {
        this.J = z10;
    }

    public final void a(List<a> list) {
        this.u = list;
    }

    public final void a(JSONObject jSONObject) {
        this.f14555v = jSONObject;
    }
}
