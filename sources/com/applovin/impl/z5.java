package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.d6;
import com.applovin.impl.qa;
import com.applovin.impl.td;
import com.applovin.impl.y5;
import java.util.Map;

/* loaded from: classes4.dex */
public final class z5 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f28304a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private td.e f28305b;

    /* renamed from: c, reason: collision with root package name */
    private b7 f28306c;
    private qa.b d;
    private String e;

    private b7 a(td.e eVar) {
        qa.b bVar = this.d;
        if (bVar == null) {
            bVar = new d6.b().a(this.e);
        }
        Uri uri = eVar.f27080b;
        ra raVar = new ra(uri == null ? null : uri.toString(), eVar.f27082f, bVar);
        pp it = eVar.f27081c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            raVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        y5 a2 = new y5.b().a(eVar.f27079a, m9.d).a(eVar.d).b(eVar.e).a(ub.a(eVar.f27083g)).a(raVar);
        a2.a(0, eVar.b());
        return a2;
    }

    @Override // com.applovin.impl.c7
    public b7 a(td tdVar) {
        b7 b7Var;
        b1.a(tdVar.f27058b);
        td.e eVar = tdVar.f27058b.f27102c;
        if (eVar != null && xp.f27962a >= 18) {
            synchronized (this.f28304a) {
                try {
                    if (!xp.a(eVar, this.f28305b)) {
                        this.f28305b = eVar;
                        this.f28306c = a(eVar);
                    }
                    b7Var = (b7) b1.a(this.f28306c);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return b7Var;
        }
        return b7.f23026a;
    }
}
