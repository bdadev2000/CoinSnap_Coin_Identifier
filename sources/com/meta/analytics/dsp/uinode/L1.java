package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public abstract class L1 {
    public static AdError A00(C1242Jb c1242Jb) {
        if (c1242Jb.A03().isPublicError()) {
            return new AdError(c1242Jb.A03().getErrorCode(), c1242Jb.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
