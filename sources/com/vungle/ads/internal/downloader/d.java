package com.vungle.ads.internal.downloader;

/* loaded from: classes3.dex */
public final class d {
    public static final a Companion = new a(null);
    public static final int DEFAULT_SERVER_CODE = -1;
    private final Throwable cause;

    @c
    private final int reason;
    private final int serverCode;

    public d(int i9, Throwable th, int i10) {
        G7.j.e(th, "cause");
        this.serverCode = i9;
        this.cause = th;
        this.reason = i10;
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
