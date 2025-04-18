package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.b6;
import com.applovin.impl.ma;
import com.applovin.impl.od;
import com.applovin.impl.w5;
import java.util.Map;

/* loaded from: classes.dex */
public final class x5 implements a7 {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private od.e f8952b;

    /* renamed from: c, reason: collision with root package name */
    private z6 f8953c;

    /* renamed from: d, reason: collision with root package name */
    private ma.b f8954d;

    /* renamed from: e, reason: collision with root package name */
    private String f8955e;

    private z6 a(od.e eVar) {
        ma.b bVar = this.f8954d;
        if (bVar == null) {
            bVar = new b6.b().a(this.f8955e);
        }
        Uri uri = eVar.f6500b;
        na naVar = new na(uri == null ? null : uri.toString(), eVar.f6504f, bVar);
        qp it = eVar.f6501c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            naVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        w5 a = new w5.b().a(eVar.a, k9.f5638d).a(eVar.f6502d).b(eVar.f6503e).a(pb.a(eVar.f6505g)).a(naVar);
        a.a(0, eVar.b());
        return a;
    }

    @Override // com.applovin.impl.a7
    public z6 a(od odVar) {
        z6 z6Var;
        a1.a(odVar.f6477b);
        od.e eVar = odVar.f6477b.f6525c;
        if (eVar != null && yp.a >= 18) {
            synchronized (this.a) {
                if (!yp.a(eVar, this.f8952b)) {
                    this.f8952b = eVar;
                    this.f8953c = a(eVar);
                }
                z6Var = (z6) a1.a(this.f8953c);
            }
            return z6Var;
        }
        return z6.a;
    }
}
