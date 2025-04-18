package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y extends zb {

    /* renamed from: f, reason: collision with root package name */
    private final z f9090f;

    /* renamed from: g, reason: collision with root package name */
    private final a0 f9091g;

    /* renamed from: h, reason: collision with root package name */
    private final kr f9092h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9093i;

    /* renamed from: j, reason: collision with root package name */
    private final List f9094j;

    /* renamed from: k, reason: collision with root package name */
    private final List f9095k;

    /* renamed from: l, reason: collision with root package name */
    private final List f9096l;

    /* loaded from: classes.dex */
    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* loaded from: classes.dex */
    public class b extends xf {

        /* renamed from: p, reason: collision with root package name */
        private final kr f9101p;

        public b(kr krVar, String str, boolean z10) {
            super(krVar.b().d(), y.this.a);
            SpannedString spannedString;
            this.f9101p = krVar;
            this.f9168c = StringUtils.createSpannedString(krVar.b().a(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            if (!TextUtils.isEmpty(str)) {
                spannedString = new SpannedString(str);
            } else {
                spannedString = null;
            }
            this.f9169d = spannedString;
            this.f9167b = z10;
        }

        @Override // com.applovin.impl.yb
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public boolean o() {
            return this.f9167b;
        }

        public kr v() {
            return this.f9101p;
        }
    }

    public y(z zVar, a0 a0Var, kr krVar, Context context) {
        super(context);
        a0 f10;
        String d10;
        this.f9090f = zVar;
        this.f9092h = krVar;
        if (a0Var != null) {
            f10 = a0Var;
        } else {
            f10 = zVar.f();
        }
        this.f9091g = f10;
        if (a0Var != null) {
            d10 = a0Var.c();
        } else {
            d10 = zVar.d();
        }
        this.f9093i = d10;
        this.f9094j = h();
        this.f9095k = e();
        this.f9096l = l();
        notifyDataSetChanged();
    }

    private List e() {
        kr krVar = this.f9092h;
        if (krVar != null && !krVar.d()) {
            return new ArrayList();
        }
        List<kr> a10 = this.f9091g.a();
        ArrayList arrayList = new ArrayList(a10.size());
        for (kr krVar2 : a10) {
            kr krVar3 = this.f9092h;
            if (krVar3 == null || krVar3.b().c().equals(krVar2.b().c())) {
                arrayList.add(new b(krVar2, krVar2.a() != null ? krVar2.a().a() : "", this.f9092h == null));
            }
        }
        return arrayList;
    }

    private yb f() {
        return yb.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private yb g() {
        return yb.a().d("ID").c(this.f9090f.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f9091g.b() != null) {
            arrayList.add(f());
        }
        if (this.f9092h != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private yb i() {
        return yb.a().d("Selected Network").c(this.f9092h.b().a()).a();
    }

    private List l() {
        boolean z10;
        kr krVar = this.f9092h;
        if (krVar != null && krVar.d()) {
            return new ArrayList();
        }
        List<kr> e2 = this.f9091g.e();
        ArrayList arrayList = new ArrayList(e2.size());
        for (kr krVar2 : e2) {
            kr krVar3 = this.f9092h;
            if (krVar3 == null || krVar3.b().c().equals(krVar2.b().c())) {
                if (this.f9092h == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new b(krVar2, null, z10));
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
    public List c(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f9094j;
        }
        if (i10 == a.BIDDERS.ordinal()) {
            return this.f9095k;
        }
        return this.f9096l;
    }

    @Override // com.applovin.impl.zb
    public int d(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f9094j.size();
        }
        if (i10 == a.BIDDERS.ordinal()) {
            return this.f9095k.size();
        }
        return this.f9096l.size();
    }

    public a0 j() {
        return this.f9091g;
    }

    public String k() {
        return this.f9093i;
    }

    private yb d() {
        return yb.a().d("Ad Format").c(this.f9090f.b()).a();
    }

    @Override // com.applovin.impl.zb
    public yb e(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return new bj("INFO");
        }
        if (i10 == a.BIDDERS.ordinal()) {
            return new bj("BIDDERS");
        }
        return new bj("WATERFALL");
    }
}
