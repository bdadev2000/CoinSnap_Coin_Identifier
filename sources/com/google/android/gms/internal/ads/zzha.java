package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzha extends zzgy {
    public final int zzc;

    public zzha(int i2, @Nullable String str, @Nullable IOException iOException, Map map, zzgm zzgmVar, byte[] bArr) {
        super(d.i("Response code: ", i2), iOException, zzgmVar, AdError.INTERNAL_ERROR_2004, 1);
        this.zzc = i2;
    }
}
