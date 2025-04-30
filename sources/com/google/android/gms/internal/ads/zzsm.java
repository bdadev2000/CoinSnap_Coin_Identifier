package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzsm extends IOException {
    public final int zza;

    public zzsm(Throwable th, int i9) {
        super(th);
        this.zza = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
    }
}
