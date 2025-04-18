package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzks {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzks(zzkq zzkqVar, zzkr zzkrVar) {
        this.zza = zzkq.zzc(zzkqVar);
        this.zzb = zzkq.zza(zzkqVar);
        this.zzc = zzkq.zzb(zzkqVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzks)) {
            return false;
        }
        zzks zzksVar = (zzks) obj;
        return this.zza == zzksVar.zza && this.zzb == zzksVar.zzb && this.zzc == zzksVar.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzkq zza() {
        return new zzkq(this, null);
    }
}
