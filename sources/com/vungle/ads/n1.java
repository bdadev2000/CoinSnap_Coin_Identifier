package com.vungle.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class n1 {
    public /* synthetic */ n1(G7.f fVar) {
        this();
    }

    public final com.vungle.ads.internal.protos.g codeToLoggableReason(int i9) {
        com.vungle.ads.internal.protos.g forNumber = com.vungle.ads.internal.protos.g.forNumber(i9);
        G7.j.d(forNumber, "forNumber(errorCode)");
        return forNumber;
    }

    public final String getLocalizedMessage(int i9) {
        Map map;
        map = o1.EXCEPTION_CODE_TO_MESSAGE_MAP;
        String str = (String) map.get(Integer.valueOf(i9));
        if (str == null) {
            new k1(com.mbridge.msdk.foundation.entity.o.h(i9, "No adequate description for exceptionCode=")).logErrorNoReturnValue$vungle_ads_release();
        }
        if (str == null) {
            return com.mbridge.msdk.foundation.entity.o.h(i9, "Unknown Exception Code: ");
        }
        return str;
    }

    private n1() {
    }
}
