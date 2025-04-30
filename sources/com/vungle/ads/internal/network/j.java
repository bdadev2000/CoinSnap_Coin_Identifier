package com.vungle.ads.internal.network;

import i8.I;
import i8.M;

/* loaded from: classes3.dex */
public final class j {
    public static final i Companion = new i(null);
    private final Object body;
    private final M errorBody;
    private final I rawResponse;

    public /* synthetic */ j(I i9, Object obj, M m, G7.f fVar) {
        this(i9, obj, m);
    }

    public final Object body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.f20776f;
    }

    public final M errorBody() {
        return this.errorBody;
    }

    public final i8.s headers() {
        return this.rawResponse.f20778h;
    }

    public final boolean isSuccessful() {
        return this.rawResponse.c();
    }

    public final String message() {
        return this.rawResponse.f20775d;
    }

    public final I raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    private j(I i9, Object obj, M m) {
        this.rawResponse = i9;
        this.body = obj;
        this.errorBody = m;
    }
}
