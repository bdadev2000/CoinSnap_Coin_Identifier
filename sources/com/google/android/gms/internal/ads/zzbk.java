package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbk {
    private final zzx zza = new zzx();

    public final zzbk zza(int i10) {
        this.zza.zza(i10);
        return this;
    }

    public final zzbk zzb(zzbl zzblVar) {
        zzz zzzVar;
        zzzVar = zzblVar.zza;
        for (int i10 = 0; i10 < zzzVar.zzb(); i10++) {
            this.zza.zza(zzzVar.zza(i10));
        }
        return this;
    }

    public final zzbk zzc(int... iArr) {
        for (int i10 = 0; i10 < 20; i10++) {
            this.zza.zza(iArr[i10]);
        }
        return this;
    }

    public final zzbk zzd(int i10, boolean z10) {
        if (z10) {
            this.zza.zza(i10);
        }
        return this;
    }

    public final zzbl zze() {
        return new zzbl(this.zza.zzb(), null);
    }
}
