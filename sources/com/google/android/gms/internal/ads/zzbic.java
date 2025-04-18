package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzbic {
    private final com.google.android.gms.ads.formats.zzg zza;

    @Nullable
    private final com.google.android.gms.ads.formats.zzf zzb;

    @Nullable
    private zzbgt zzc;

    public zzbic(com.google.android.gms.ads.formats.zzg zzgVar, @Nullable com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzbgt zzf(zzbgs zzbgsVar) {
        zzbgt zzbgtVar = this.zzc;
        if (zzbgtVar != null) {
            return zzbgtVar;
        }
        zzbgt zzbgtVar2 = new zzbgt(zzbgsVar);
        this.zzc = zzbgtVar2;
        return zzbgtVar2;
    }

    @Nullable
    public final zzbhc zzc() {
        zzbib zzbibVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbhz(this, zzbibVar);
    }

    public final zzbhf zzd() {
        return new zzbia(this, null);
    }
}
