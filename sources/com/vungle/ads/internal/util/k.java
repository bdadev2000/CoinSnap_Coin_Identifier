package com.vungle.ads.internal.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class k {
    public static final j Companion = new j(null);
    private static final long OPERATION_TIMEOUT = TimeUnit.SECONDS.toMillis(4);

    public final long getTimeout() {
        if (c0.INSTANCE.isMainThread()) {
            return OPERATION_TIMEOUT;
        }
        return Long.MAX_VALUE;
    }
}
