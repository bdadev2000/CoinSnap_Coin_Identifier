package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzbr {
    private final zzz zza = new zzz();

    public final zzbr zza(int i2) {
        this.zza.zza(i2);
        return this;
    }

    public final zzbr zzb(zzbt zzbtVar) {
        zzab zzabVar;
        zzabVar = zzbtVar.zza;
        for (int i2 = 0; i2 < zzabVar.zzb(); i2++) {
            this.zza.zza(zzabVar.zza(i2));
        }
        return this;
    }

    public final zzbr zzc(int... iArr) {
        for (int i2 = 0; i2 < 20; i2++) {
            this.zza.zza(iArr[i2]);
        }
        return this;
    }

    public final zzbr zzd(int i2, boolean z2) {
        if (z2) {
            this.zza.zza(i2);
        }
        return this;
    }

    public final zzbt zze() {
        return new zzbt(this.zza.zzb(), null);
    }
}
