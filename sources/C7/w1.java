package c7;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class w1 implements e8.D {
    public static final w1 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        w1 w1Var = new w1();
        INSTANCE = w1Var;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.UnclosedAd", w1Var, 2);
        y4.l("107", false);
        y4.l(StatisticData.ERROR_CODE_IO_ERROR, true);
        descriptor = y4;
    }

    private w1() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{k0Var, k0Var};
    }

    @Override // a8.b
    public y1 deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        e8.g0 g0Var = null;
        boolean z8 = true;
        int i9 = 0;
        String str = null;
        String str2 = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else if (h6 == 0) {
                str = b.w(descriptor2, 0);
                i9 |= 1;
            } else {
                if (h6 != 1) {
                    throw new a8.l(h6);
                }
                str2 = b.w(descriptor2, 1);
                i9 |= 2;
            }
        }
        b.c(descriptor2);
        return new y1(i9, str, str2, g0Var);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, y1 y1Var) {
        G7.j.e(dVar, "encoder");
        G7.j.e(y1Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        y1.write$Self(y1Var, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
