package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes3.dex */
public final class zzdyf extends zzbvo {
    final /* synthetic */ zzdyh zza;

    public zzdyf(zzdyh zzdyhVar) {
        this.zza = zzdyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zza.zzd(zzbaVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdyh zzdyhVar = this.zza;
        zzdyhVar.zza.zzc(new zzdyx(autoCloseInputStream, zzdyhVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvx zzbvxVar) {
        this.zza.zza.zzc(new zzdyx(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvxVar));
    }
}
