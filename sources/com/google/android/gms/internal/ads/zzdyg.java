package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes3.dex */
public final class zzdyg extends zzbvo {
    private final zzcao zza;
    private final zzbvx zzb;

    public zzdyg(zzcao zzcaoVar, zzbvx zzbvxVar) {
        this.zza = zzcaoVar;
        this.zzb = zzbvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zzd(zzbaVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzdyx(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvx zzbvxVar) {
        this.zza.zzc(new zzdyx(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvxVar));
    }
}
