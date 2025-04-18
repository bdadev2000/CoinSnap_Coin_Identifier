package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzri extends IOException {
    public final int zza;

    public zzri(Throwable th2, int i10) {
        super(th2);
        this.zza = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
    }
}
