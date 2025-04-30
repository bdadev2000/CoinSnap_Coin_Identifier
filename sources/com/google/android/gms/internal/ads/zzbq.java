package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzbq {

    @Nullable
    public final Uri zzc = null;

    @Nullable
    public final String zzd = null;

    @Nullable
    public final Bundle zze = null;
    public static final zzbq zza = new zzbq(new zzbp());
    private static final String zzf = Integer.toString(0, 36);
    private static final String zzg = Integer.toString(1, 36);
    private static final String zzh = Integer.toString(2, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbo
    };

    private zzbq(zzbp zzbpVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbq)) {
            return false;
        }
        Uri uri = ((zzbq) obj).zzc;
        if (zzgd.zzG(null, null) && zzgd.zzG(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
