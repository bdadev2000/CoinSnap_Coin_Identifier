package com.vungle.ads.internal.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wh.u0;
import wh.y0;

/* loaded from: classes4.dex */
public final class i {
    private i() {
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final <T> j error(y0 y0Var, u0 rawResponse) {
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        if (!rawResponse.j()) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new j(rawResponse, defaultConstructorMarker, y0Var, defaultConstructorMarker);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response".toString());
    }

    public final <T> j success(T t5, u0 rawResponse) {
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        if (rawResponse.j()) {
            return new j(rawResponse, t5, null, 0 == true ? 1 : 0);
        }
        throw new IllegalArgumentException("rawResponse must be successful response".toString());
    }
}
