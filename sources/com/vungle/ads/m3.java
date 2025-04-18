package com.vungle.ads;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m3 {
    private m3() {
    }

    public /* synthetic */ m3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final com.vungle.ads.internal.protos.g codeToLoggableReason(int i10) {
        com.vungle.ads.internal.protos.g forNumber = com.vungle.ads.internal.protos.g.forNumber(i10);
        Intrinsics.checkNotNullExpressionValue(forNumber, "forNumber(errorCode)");
        return forNumber;
    }

    public final String getLocalizedMessage(int i10) {
        Map map;
        map = n3.EXCEPTION_CODE_TO_MESSAGE_MAP;
        String str = (String) map.get(Integer.valueOf(i10));
        if (str == null) {
            new j3(eb.j.i("No adequate description for exceptionCode=", i10)).logErrorNoReturnValue$vungle_ads_release();
        }
        if (str == null) {
            return eb.j.i("Unknown Exception Code: ", i10);
        }
        return str;
    }
}
