package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes2.dex */
public final class zzear extends zzbxm {
    final /* synthetic */ zzeas zza;

    public zzear(zzeas zzeasVar) {
        this.zza = zzeasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzeas zzeasVar = this.zza;
        zzeasVar.zza.zzc(new zzebi(autoCloseInputStream, zzeasVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbxu zzbxuVar) {
        this.zza.zza.zzc(new zzebi(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbxuVar));
    }
}
