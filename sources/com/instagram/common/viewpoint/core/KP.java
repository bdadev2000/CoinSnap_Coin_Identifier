package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public abstract class KP {
    public static void A00(KL kl) {
        new Handler(Looper.getMainLooper()).post(kl);
    }
}
