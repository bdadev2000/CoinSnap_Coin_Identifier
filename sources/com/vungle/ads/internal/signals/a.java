package com.vungle.ads.internal.signals;

import c7.w1;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import e8.C2228c;
import e8.D;
import e8.K;
import e8.O;
import e8.W;
import e8.Y;
import e8.k0;
import java.util.List;

/* loaded from: classes3.dex */
public final class a implements D {
    public static final a INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        a aVar = new a();
        INSTANCE = aVar;
        Y y4 = new Y("com.vungle.ads.internal.signals.SessionData", aVar, 7);
        y4.l("103", false);
        y4.l(StatisticData.ERROR_CODE_IO_ERROR, true);
        y4.l(StatisticData.ERROR_CODE_NOT_FOUND, true);
        y4.l("106", true);
        y4.l(MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE, true);
        y4.l("104", true);
        y4.l("105", true);
        descriptor = y4;
    }

    private a() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        C2228c c2228c = new C2228c(k.INSTANCE, 0);
        C2228c c2228c2 = new C2228c(w1.INSTANCE, 0);
        K k6 = K.f20127a;
        O o3 = O.f20131a;
        return new a8.b[]{k6, k0.f20172a, o3, c2228c, o3, k6, c2228c2};
    }

    @Override // a8.b
    public c deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj = null;
        String str = null;
        long j7 = 0;
        long j9 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z8 = true;
        Object obj2 = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            switch (h6) {
                case -1:
                    z8 = false;
                    break;
                case 0:
                    i10 = b.E(descriptor2, 0);
                    i9 |= 1;
                    break;
                case 1:
                    str = b.w(descriptor2, 1);
                    i9 |= 2;
                    break;
                case 2:
                    j7 = b.o(descriptor2, 2);
                    i9 |= 4;
                    break;
                case 3:
                    obj = b.A(descriptor2, 3, new C2228c(k.INSTANCE, 0), obj);
                    i9 |= 8;
                    break;
                case 4:
                    j9 = b.o(descriptor2, 4);
                    i9 |= 16;
                    break;
                case 5:
                    i11 = b.E(descriptor2, 5);
                    i9 |= 32;
                    break;
                case 6:
                    obj2 = b.A(descriptor2, 6, new C2228c(w1.INSTANCE, 0), obj2);
                    i9 |= 64;
                    break;
                default:
                    throw new a8.l(h6);
            }
        }
        b.c(descriptor2);
        return new c(i9, i10, str, j7, (List) obj, j9, i11, (List) obj2, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, c cVar) {
        G7.j.e(dVar, "encoder");
        G7.j.e(cVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        c.write$Self(cVar, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return W.b;
    }
}
