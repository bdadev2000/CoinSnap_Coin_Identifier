package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0777y extends zb {

    /* renamed from: f, reason: collision with root package name */
    private final C0781z f12296f;

    /* renamed from: g, reason: collision with root package name */
    private final C0668a0 f12297g;

    /* renamed from: h, reason: collision with root package name */
    private final kr f12298h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12299i;

    /* renamed from: j, reason: collision with root package name */
    private final List f12300j;

    /* renamed from: k, reason: collision with root package name */
    private final List f12301k;
    private final List l;

    /* renamed from: com.applovin.impl.y$a */
    /* loaded from: classes.dex */
    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* renamed from: com.applovin.impl.y$b */
    /* loaded from: classes.dex */
    public class b extends xf {

        /* renamed from: p, reason: collision with root package name */
        private final kr f12306p;

        public b(kr krVar, String str, boolean z8) {
            super(krVar.b().d(), C0777y.this.f12545a);
            SpannedString spannedString;
            this.f12306p = krVar;
            this.f12370c = StringUtils.createSpannedString(krVar.b().a(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            if (!TextUtils.isEmpty(str)) {
                spannedString = new SpannedString(str);
            } else {
                spannedString = null;
            }
            this.f12371d = spannedString;
            this.b = z8;
        }

        @Override // com.applovin.impl.yb
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public boolean o() {
            return this.b;
        }

        public kr v() {
            return this.f12306p;
        }
    }

    public C0777y(C0781z c0781z, C0668a0 c0668a0, kr krVar, Context context) {
        super(context);
        C0668a0 f9;
        String d2;
        this.f12296f = c0781z;
        this.f12298h = krVar;
        if (c0668a0 != null) {
            f9 = c0668a0;
        } else {
            f9 = c0781z.f();
        }
        this.f12297g = f9;
        if (c0668a0 != null) {
            d2 = c0668a0.c();
        } else {
            d2 = c0781z.d();
        }
        this.f12299i = d2;
        this.f12300j = h();
        this.f12301k = e();
        this.l = l();
        notifyDataSetChanged();
    }

    private List e() {
        kr krVar = this.f12298h;
        if (krVar != null && !krVar.d()) {
            return new ArrayList();
        }
        List<kr> a6 = this.f12297g.a();
        ArrayList arrayList = new ArrayList(a6.size());
        for (kr krVar2 : a6) {
            kr krVar3 = this.f12298h;
            if (krVar3 == null || krVar3.b().c().equals(krVar2.b().c())) {
                arrayList.add(new b(krVar2, krVar2.a() != null ? krVar2.a().a() : "", this.f12298h == null));
            }
        }
        return arrayList;
    }

    private yb f() {
        return yb.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private yb g() {
        return yb.a().d("ID").c(this.f12296f.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f12297g.b() != null) {
            arrayList.add(f());
        }
        if (this.f12298h != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private yb i() {
        return yb.a().d("Selected Network").c(this.f12298h.b().a()).a();
    }

    private List l() {
        boolean z8;
        kr krVar = this.f12298h;
        if (krVar != null && krVar.d()) {
            return new ArrayList();
        }
        List<kr> e4 = this.f12297g.e();
        ArrayList arrayList = new ArrayList(e4.size());
        for (kr krVar2 : e4) {
            kr krVar3 = this.f12298h;
            if (krVar3 == null || krVar3.b().c().equals(krVar2.b().c())) {
                if (this.f12298h == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                arrayList.add(new b(krVar2, null, z8));
                for (yf yfVar : krVar2.c()) {
                    arrayList.add(yb.a().d(yfVar.a()).c(yfVar.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.zb
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.zb
    public List c(int i9) {
        if (i9 == a.INFO.ordinal()) {
            return this.f12300j;
        }
        if (i9 == a.BIDDERS.ordinal()) {
            return this.f12301k;
        }
        return this.l;
    }

    @Override // com.applovin.impl.zb
    public int d(int i9) {
        if (i9 == a.INFO.ordinal()) {
            return this.f12300j.size();
        }
        if (i9 == a.BIDDERS.ordinal()) {
            return this.f12301k.size();
        }
        return this.l.size();
    }

    public C0668a0 j() {
        return this.f12297g;
    }

    public String k() {
        return this.f12299i;
    }

    private yb d() {
        return yb.a().d("Ad Format").c(this.f12296f.b()).a();
    }

    @Override // com.applovin.impl.zb
    public yb e(int i9) {
        if (i9 == a.INFO.ordinal()) {
            return new bj("INFO");
        }
        if (i9 == a.BIDDERS.ordinal()) {
            return new bj("BIDDERS");
        }
        return new bj("WATERFALL");
    }
}
