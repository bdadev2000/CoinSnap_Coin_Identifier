package com.mbridge.msdk.newreward.function.d.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.d.c.d;
import com.mbridge.msdk.newreward.function.d.c.e;
import com.mbridge.msdk.newreward.function.d.c.i;
import com.mbridge.msdk.newreward.function.d.c.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    private String f17165A;

    /* renamed from: B, reason: collision with root package name */
    private int f17166B;

    /* renamed from: C, reason: collision with root package name */
    private int f17167C;

    /* renamed from: D, reason: collision with root package name */
    private List<CampaignEx> f17168D;

    /* renamed from: E, reason: collision with root package name */
    private int f17169E;

    /* renamed from: G, reason: collision with root package name */
    private long f17171G;

    /* renamed from: H, reason: collision with root package name */
    private Map<String, Object> f17172H;

    /* renamed from: I, reason: collision with root package name */
    private String f17173I;

    /* renamed from: a, reason: collision with root package name */
    private int f17175a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f17176c;

    /* renamed from: d, reason: collision with root package name */
    private String f17177d;

    /* renamed from: e, reason: collision with root package name */
    private String f17178e;

    /* renamed from: f, reason: collision with root package name */
    private String f17179f;

    /* renamed from: g, reason: collision with root package name */
    private String f17180g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17181h;

    /* renamed from: j, reason: collision with root package name */
    private int f17183j;

    /* renamed from: k, reason: collision with root package name */
    private String f17184k;
    private String l;
    private String m;

    /* renamed from: n, reason: collision with root package name */
    private String f17185n;

    /* renamed from: o, reason: collision with root package name */
    private int f17186o;

    /* renamed from: p, reason: collision with root package name */
    private long f17187p;

    /* renamed from: q, reason: collision with root package name */
    private long f17188q;

    /* renamed from: r, reason: collision with root package name */
    private long f17189r;

    /* renamed from: s, reason: collision with root package name */
    private double f17190s;

    /* renamed from: t, reason: collision with root package name */
    private int f17191t;

    /* renamed from: u, reason: collision with root package name */
    private List<a> f17192u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f17193v;

    /* renamed from: w, reason: collision with root package name */
    private d<?> f17194w;

    /* renamed from: z, reason: collision with root package name */
    private Context f17197z;

    /* renamed from: i, reason: collision with root package name */
    private long f17182i = 30000;

    /* renamed from: x, reason: collision with root package name */
    private int f17195x = 60000;

    /* renamed from: y, reason: collision with root package name */
    private int f17196y = 60000;

    /* renamed from: F, reason: collision with root package name */
    private int f17170F = 0;

    /* renamed from: J, reason: collision with root package name */
    private boolean f17174J = false;

    public b(int i9, String str, String str2, String str3) {
        this.f17175a = i9;
        this.b = str;
        this.f17176c = str2;
        this.f17177d = str3;
    }

    public final int A() {
        return this.f17167C;
    }

    public final int B() {
        return this.f17166B;
    }

    public final List<CampaignEx> C() {
        return this.f17168D;
    }

    public final int D() {
        int i9 = this.f17169E;
        if (i9 <= 0) {
            return 1;
        }
        return i9;
    }

    public final int E() {
        return this.f17170F;
    }

    public final Map<String, Object> F() {
        if (this.f17172H == null) {
            this.f17172H = new HashMap();
        }
        return this.f17172H;
    }

    public final long G() {
        return this.f17171G;
    }

    public final String H() {
        return this.f17173I;
    }

    public final boolean I() {
        return this.f17174J;
    }

    public final int a() {
        return this.f17175a;
    }

    public final String b() {
        return this.f17176c;
    }

    public final String c() {
        return this.f17177d;
    }

    public final String d() {
        return this.f17178e;
    }

    public final String e() {
        return this.f17179f;
    }

    public final String f() {
        return this.f17180g;
    }

    public final boolean g() {
        return this.f17181h;
    }

    public final int h() {
        return this.f17183j;
    }

    public final String i() {
        return this.f17184k;
    }

    public final String j() {
        return this.l;
    }

    public final String k() {
        return this.m;
    }

    public final String l() {
        return this.f17185n;
    }

    public final int m() {
        return this.f17186o;
    }

    public final long n() {
        return this.f17187p;
    }

    public final long o() {
        return this.f17188q;
    }

    public final long p() {
        return this.f17189r;
    }

    public final double q() {
        return this.f17190s;
    }

    public final int r() {
        return this.f17191t;
    }

    public final List<a> s() {
        return this.f17192u;
    }

    public final JSONObject t() {
        return this.f17193v;
    }

    public final d<?> u() {
        d<?> dVar = this.f17194w;
        if (dVar != null) {
            return dVar;
        }
        String str = this.f17165A;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f17194w == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                this.f17194w = new e(this, null);
            } else {
                this.f17194w = new i(this, null);
            }
        }
        return this.f17194w;
    }

    public final int v() {
        return this.f17195x;
    }

    public final Context w() {
        return this.f17197z;
    }

    public final boolean x() {
        List<a> list;
        boolean z8;
        boolean z9;
        d<?> dVar = this.f17194w;
        if ((dVar != null && !dVar.c()) || (list = this.f17192u) == null || list.isEmpty()) {
            return false;
        }
        int size = this.f17192u.size();
        Iterator<a> it = this.f17192u.iterator();
        int i9 = 0;
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            n d2 = next.d();
            if (d2 != null && !d2.c()) {
                z8 = false;
            } else {
                z8 = true;
            }
            d<?> f9 = next.f();
            if (f9 != null && !f9.c()) {
                z9 = false;
            } else {
                z9 = true;
            }
            d<?> c9 = next.c();
            if (c9 != null && !c9.c()) {
                z10 = false;
            }
            if (z8 && z9 && z10) {
                i9++;
            }
        }
        if (i9 != size) {
            return false;
        }
        return true;
    }

    public final boolean y() {
        boolean z8;
        List<a> list;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f17187p > System.currentTimeMillis()) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean x9 = x();
        d<?> dVar = this.f17194w;
        if ((dVar == null || dVar.c()) && (list = this.f17192u) != null && !list.isEmpty()) {
            int size = this.f17192u.size();
            int i9 = 0;
            for (a aVar : this.f17192u) {
                n d2 = aVar.d();
                if (d2 != null && !d2.d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d<?> f9 = aVar.f();
                if (f9 != null && !f9.d()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                d<?> c9 = aVar.c();
                if (c9 != null && !c9.d()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z10 && z11 && z12) {
                    i9++;
                }
            }
            if (i9 == size) {
                z9 = true;
                if (!z8 && x9 && z9) {
                    return true;
                }
                return false;
            }
        }
        z9 = false;
        if (!z8) {
        }
        return false;
    }

    public final String z() {
        return this.f17165A;
    }

    public final void a(String str) {
        this.f17178e = str;
    }

    public final void b(String str) {
        this.f17179f = str;
    }

    public final void c(String str) {
        this.f17180g = str;
    }

    public final void d(String str) {
        this.f17184k = str;
    }

    public final void e(String str) {
        this.l = str;
    }

    public final void f(String str) {
        this.m = str;
    }

    public final void g(String str) {
        this.f17185n = str;
    }

    public final void h(String str) {
        this.f17165A = str;
    }

    public final void i(int i9) {
        this.f17170F = i9;
    }

    public final void a(boolean z8) {
        this.f17181h = z8;
    }

    public final void b(int i9) {
        this.f17186o = i9;
    }

    public final void c(long j7) {
        this.f17188q = j7;
    }

    public final void d(long j7) {
        this.f17189r = j7;
    }

    public final void e(int i9) {
        this.f17196y = i9;
    }

    public final void f(int i9) {
        this.f17167C = i9;
    }

    public final void g(int i9) {
        this.f17166B = i9;
    }

    public final void h(int i9) {
        this.f17169E = i9;
    }

    public final void i(String str) {
        this.f17173I = str;
    }

    public final void a(long j7) {
        this.f17182i = j7;
    }

    public final void b(long j7) {
        this.f17187p = j7;
    }

    public final void c(int i9) {
        this.f17191t = i9;
    }

    public final void d(int i9) {
        this.f17195x = i9;
    }

    public final void e(long j7) {
        this.f17171G = j7;
    }

    public final void a(int i9) {
        this.f17183j = i9;
    }

    public final void b(List<CampaignEx> list) {
        this.f17168D = list;
    }

    public final void a(double d2) {
        this.f17190s = d2;
    }

    public final void b(boolean z8) {
        this.f17174J = z8;
    }

    public final void a(List<a> list) {
        this.f17192u = list;
    }

    public final void a(JSONObject jSONObject) {
        this.f17193v = jSONObject;
    }
}
