package com.bykv.vk.openvk.preload.geckox.utils;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;

/* loaded from: classes.dex */
public final class b {
    public static void a(Throwable th) {
        if (!d.a()) {
            GeckoLogger.w("gecko-debug-tag", "throwIfDebug:", th);
        } else {
            GeckoLogger.e("gecko-debug-tag", "throwIfDebug:", th);
            throw new RuntimeException(th);
        }
    }
}
