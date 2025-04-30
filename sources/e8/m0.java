package e8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import t7.C2725n;

/* loaded from: classes3.dex */
public final class m0 implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public final a8.b f20178a;
    public final a8.b b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.b f20179c;

    /* renamed from: d, reason: collision with root package name */
    public final c8.h f20180d = android.support.v4.media.session.a.d("kotlin.Triple", new c8.g[0], new G7.w(this, 11));

    public m0(a8.b bVar, a8.b bVar2, a8.b bVar3) {
        this.f20178a = bVar;
        this.b = bVar2;
        this.f20179c = bVar3;
    }

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.h hVar = this.f20180d;
        d8.a b = cVar.b(hVar);
        Object obj = W.f20142c;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int h6 = b.h(hVar);
            if (h6 != -1) {
                if (h6 != 0) {
                    if (h6 != 1) {
                        if (h6 == 2) {
                            obj4 = b.A(hVar, 2, this.f20179c, null);
                        } else {
                            throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(h6, "Unexpected index "));
                        }
                    } else {
                        obj3 = b.A(hVar, 1, this.b, null);
                    }
                } else {
                    obj2 = b.A(hVar, 0, this.f20178a, null);
                }
            } else {
                b.c(hVar);
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        if (obj4 != obj) {
                            return new C2725n(obj2, obj3, obj4);
                        }
                        throw new IllegalArgumentException("Element 'third' is missing");
                    }
                    throw new IllegalArgumentException("Element 'second' is missing");
                }
                throw new IllegalArgumentException("Element 'first' is missing");
            }
        }
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return this.f20180d;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        C2725n c2725n = (C2725n) obj;
        G7.j.e(dVar, "encoder");
        G7.j.e(c2725n, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.h hVar = this.f20180d;
        d8.b b = dVar.b(hVar);
        b.m(hVar, 0, this.f20178a, c2725n.b);
        b.m(hVar, 1, this.b, c2725n.f23026c);
        b.m(hVar, 2, this.f20179c, c2725n.f23027d);
        b.c(hVar);
    }
}
