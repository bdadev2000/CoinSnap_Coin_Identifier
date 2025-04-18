package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public abstract class L8 {
    public static AdError A00(C0625Jg c0625Jg) {
        if (c0625Jg.A03().isPublicError()) {
            return new AdError(c0625Jg.A03().getErrorCode(), c0625Jg.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
