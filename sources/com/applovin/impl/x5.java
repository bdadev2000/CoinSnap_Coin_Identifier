package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.b6;
import com.applovin.impl.ma;
import com.applovin.impl.od;
import com.applovin.impl.w5;
import java.util.Map;

/* loaded from: classes.dex */
public final class x5 implements a7 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f12152a = new Object();
    private od.e b;

    /* renamed from: c, reason: collision with root package name */
    private z6 f12153c;

    /* renamed from: d, reason: collision with root package name */
    private ma.b f12154d;

    /* renamed from: e, reason: collision with root package name */
    private String f12155e;

    private z6 a(od.e eVar) {
        ma.b bVar = this.f12154d;
        if (bVar == null) {
            bVar = new b6.b().a(this.f12155e);
        }
        Uri uri = eVar.b;
        na naVar = new na(uri == null ? null : uri.toString(), eVar.f9437f, bVar);
        qp it = eVar.f9434c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            naVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        w5 a6 = new w5.b().a(eVar.f9433a, k9.f8610d).a(eVar.f9435d).b(eVar.f9436e).a(pb.a(eVar.f9438g)).a(naVar);
        a6.a(0, eVar.b());
        return a6;
    }

    @Override // com.applovin.impl.a7
    public z6 a(od odVar) {
        z6 z6Var;
        AbstractC0669a1.a(odVar.b);
        od.e eVar = odVar.b.f9458c;
        if (eVar != null && yp.f12451a >= 18) {
            synchronized (this.f12152a) {
                try {
                    if (!yp.a(eVar, this.b)) {
                        this.b = eVar;
                        this.f12153c = a(eVar);
                    }
                    z6Var = (z6) AbstractC0669a1.a(this.f12153c);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z6Var;
        }
        return z6.f12539a;
    }
}
