package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzko {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzko(zzkm zzkmVar, zzkn zzknVar) {
        this.zza = zzkm.zzc(zzkmVar);
        this.zzb = zzkm.zza(zzkmVar);
        this.zzc = zzkm.zzb(zzkmVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzko)) {
            return false;
        }
        zzko zzkoVar = (zzko) obj;
        if (this.zza == zzkoVar.zza && this.zzb == zzkoVar.zzb && this.zzc == zzkoVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzkm zza() {
        return new zzkm(this, null);
    }
}
