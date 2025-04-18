package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class y extends ec {

    /* renamed from: f, reason: collision with root package name */
    private final z f28008f;

    /* renamed from: g, reason: collision with root package name */
    private final a0 f28009g;

    /* renamed from: h, reason: collision with root package name */
    private final ir f28010h;

    /* renamed from: i, reason: collision with root package name */
    private final String f28011i;

    /* renamed from: j, reason: collision with root package name */
    private final List f28012j;

    /* renamed from: k, reason: collision with root package name */
    private final List f28013k;

    /* renamed from: l, reason: collision with root package name */
    private final List f28014l;

    /* loaded from: classes2.dex */
    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* loaded from: classes2.dex */
    public class b extends cg {

        /* renamed from: p, reason: collision with root package name */
        private final ir f28019p;

        public b(ir irVar, String str, boolean z2) {
            super(irVar.b().d(), y.this.f23676a);
            this.f28019p = irVar;
            this.f23448c = StringUtils.createSpannedString(irVar.b().a(), -16777216, 18, 1);
            this.d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f23447b = z2;
        }

        @Override // com.applovin.impl.dc
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.cg, com.applovin.impl.dc
        public boolean o() {
            return this.f23447b;
        }

        public ir v() {
            return this.f28019p;
        }
    }

    public y(z zVar, a0 a0Var, ir irVar, Context context) {
        super(context);
        this.f28008f = zVar;
        this.f28010h = irVar;
        this.f28009g = a0Var != null ? a0Var : zVar.f();
        this.f28011i = a0Var != null ? a0Var.c() : zVar.d();
        this.f28012j = h();
        this.f28013k = e();
        this.f28014l = l();
        notifyDataSetChanged();
    }

    private List e() {
        ir irVar = this.f28010h;
        if (irVar != null && !irVar.d()) {
            return new ArrayList();
        }
        List<ir> a2 = this.f28009g.a();
        ArrayList arrayList = new ArrayList(a2.size());
        for (ir irVar2 : a2) {
            ir irVar3 = this.f28010h;
            if (irVar3 == null || irVar3.b().c().equals(irVar2.b().c())) {
                arrayList.add(new b(irVar2, irVar2.a() != null ? irVar2.a().a() : "", this.f28010h == null));
            }
        }
        return arrayList;
    }

    private dc f() {
        return dc.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private dc g() {
        return dc.a().d("ID").c(this.f28008f.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f28009g.b() != null) {
            arrayList.add(f());
        }
        if (this.f28010h != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private dc i() {
        return dc.a().d("Selected Network").c(this.f28010h.b().a()).a();
    }

    private List l() {
        ir irVar = this.f28010h;
        if (irVar != null && irVar.d()) {
            return new ArrayList();
        }
        List<ir> e = this.f28009g.e();
        ArrayList arrayList = new ArrayList(e.size());
        for (ir irVar2 : e) {
            ir irVar3 = this.f28010h;
            if (irVar3 == null || irVar3.b().c().equals(irVar2.b().c())) {
                arrayList.add(new b(irVar2, null, this.f28010h == null));
                for (dg dgVar : irVar2.c()) {
                    arrayList.add(dc.a().d(dgVar.a()).c(dgVar.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.ec
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.ec
    public List c(int i2) {
        return i2 == a.INFO.ordinal() ? this.f28012j : i2 == a.BIDDERS.ordinal() ? this.f28013k : this.f28014l;
    }

    @Override // com.applovin.impl.ec
    public int d(int i2) {
        if (i2 == a.INFO.ordinal()) {
            return this.f28012j.size();
        }
        if (i2 == a.BIDDERS.ordinal()) {
            return this.f28013k.size();
        }
        return this.f28014l.size();
    }

    public a0 j() {
        return this.f28009g;
    }

    public String k() {
        return this.f28011i;
    }

    private dc d() {
        return dc.a().d("Ad Format").c(this.f28008f.b()).a();
    }

    @Override // com.applovin.impl.ec
    public dc e(int i2) {
        if (i2 == a.INFO.ordinal()) {
            return new fj("INFO");
        }
        if (i2 == a.BIDDERS.ordinal()) {
            return new fj("BIDDERS");
        }
        return new fj("WATERFALL");
    }
}
