package com.vungle.ads.internal.downloader;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {
    public static final a Companion = new a(null);
    public static final int DEFAULT_SERVER_CODE = -1;
    private final Throwable cause;

    @c
    private final int reason;
    private final int serverCode;

    public d(int i10, Throwable cause, int i11) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.serverCode = i10;
        this.cause = cause;
        this.reason = i11;
    }

    public final Throwable getCause() {
        return this.cause;
    }

    public final int getReason() {
        return this.reason;
    }

    public final int getServerCode() {
        return this.serverCode;
    }
}
