package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class zzaz {
    public static final zzaz zza = new zzaz(new zzay());

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

    private zzaz(zzay zzayVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaz)) {
            return false;
        }
        Uri uri = ((zzaz) obj).zzb;
        return true;
    }

    public final int hashCode() {
        return 0;
    }
}
