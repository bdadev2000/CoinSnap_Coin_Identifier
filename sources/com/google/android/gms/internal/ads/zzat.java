package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzat {
    public static final zzat zza = new zzat(new zzas());

    @Nullable
    public final Uri zzb = null;

    @Nullable
    public final String zzc = null;

    @Nullable
    public final Bundle zzd = null;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    private zzat(zzas zzasVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        Uri uri = ((zzat) obj).zzb;
        return true;
    }

    public final int hashCode() {
        return 0;
    }
}
