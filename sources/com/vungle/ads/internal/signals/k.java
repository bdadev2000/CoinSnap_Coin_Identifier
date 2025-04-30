package com.vungle.ads.internal.signals;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.D;
import e8.K;
import e8.O;
import e8.W;
import e8.Y;
import e8.k0;

/* loaded from: classes3.dex */
public final class k implements D {
    public static final k INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        k kVar = new k();
        INSTANCE = kVar;
        Y y4 = new Y("com.vungle.ads.internal.signals.SignaledAd", kVar, 5);
        y4.l("500", true);
        y4.l("109", false);
        y4.l("107", true);
        y4.l("110", true);
        y4.l("108", true);
        descriptor = y4;
    }

    private k() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        k0 k0Var = k0.f20172a;
        a8.b r9 = C0219j.r(k0Var);
        a8.b r10 = C0219j.r(k0Var);
        O o3 = O.f20131a;
        return new a8.b[]{r9, o3, r10, o3, K.f20127a};
    }

    @Override // a8.b
    public m deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj = null;
        int i9 = 0;
        int i10 = 0;
        long j7 = 0;
        long j9 = 0;
        boolean z8 = true;
        Object obj2 = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else if (h6 == 0) {
                obj = b.z(descriptor2, 0, k0.f20172a, obj);
                i9 |= 1;
            } else if (h6 == 1) {
                j7 = b.o(descriptor2, 1);
                i9 |= 2;
            } else if (h6 == 2) {
                obj2 = b.z(descriptor2, 2, k0.f20172a, obj2);
                i9 |= 4;
            } else if (h6 == 3) {
                j9 = b.o(descriptor2, 3);
                i9 |= 8;
            } else {
                if (h6 != 4) {
                    throw new a8.l(h6);
                }
                i10 = b.E(descriptor2, 4);
                i9 |= 16;
            }
        }
        b.c(descriptor2);
        return new m(i9, (String) obj, j7, (String) obj2, j9, i10, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, m mVar) {
        G7.j.e(dVar, "encoder");
        G7.j.e(mVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        m.write$Self(mVar, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return W.b;
    }
}
