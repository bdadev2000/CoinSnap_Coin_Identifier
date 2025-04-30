package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcn {
    private final zzaf zza = new zzaf();

    public final zzcn zza(int i9) {
        this.zza.zza(i9);
        return this;
    }

    public final zzcn zzb(zzcp zzcpVar) {
        zzah zzahVar;
        zzahVar = zzcpVar.zzd;
        for (int i9 = 0; i9 < zzahVar.zzb(); i9++) {
            this.zza.zza(zzahVar.zza(i9));
        }
        return this;
    }

    public final zzcn zzc(int... iArr) {
        for (int i9 = 0; i9 < 20; i9++) {
            this.zza.zza(iArr[i9]);
        }
        return this;
    }

    public final zzcn zzd(int i9, boolean z8) {
        if (z8) {
            this.zza.zza(i9);
        }
        return this;
    }

    public final zzcp zze() {
        return new zzcp(this.zza.zzb(), null);
    }
}
