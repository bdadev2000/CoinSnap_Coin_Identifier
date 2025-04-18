package com.vungle.ads.internal.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import wh.u0;
import wh.y0;

/* loaded from: classes4.dex */
public final class j {
    public static final i Companion = new i(null);
    private final Object body;
    private final y0 errorBody;
    private final u0 rawResponse;

    public /* synthetic */ j(u0 u0Var, Object obj, y0 y0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(u0Var, obj, y0Var);
    }

    public final Object body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.f27216f;
    }

    public final y0 errorBody() {
        return this.errorBody;
    }

    public final wh.z headers() {
        return this.rawResponse.f27218h;
    }

    public final boolean isSuccessful() {
        return this.rawResponse.j();
    }

    public final String message() {
        return this.rawResponse.f27215d;
    }

    public final u0 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    private j(u0 u0Var, Object obj, y0 y0Var) {
        this.rawResponse = u0Var;
        this.body = obj;
        this.errorBody = y0Var;
    }
}
