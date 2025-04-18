package oi;

import androidx.fragment.app.z;
import ki.k;
import ni.l;
import wh.a0;
import wh.y0;
import yg.q;

/* loaded from: classes5.dex */
public final class c implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final ki.l f23339c;

    /* renamed from: b, reason: collision with root package name */
    public final yg.l f23340b;

    static {
        ki.l lVar = ki.l.f20996f;
        f23339c = a0.n("EFBBBF");
    }

    public c(yg.l lVar) {
        this.f23340b = lVar;
    }

    @Override // ni.l
    public final Object convert(Object obj) {
        y0 y0Var = (y0) obj;
        k source = y0Var.source();
        try {
            if (source.h(f23339c)) {
                source.skip(r1.f20997b.length);
            }
            q qVar = new q(source);
            Object fromJson = this.f23340b.fromJson(qVar);
            if (qVar.u() == 10) {
                return fromJson;
            }
            throw new z("JSON document was not fully consumed.");
        } finally {
            y0Var.close();
        }
    }
}
