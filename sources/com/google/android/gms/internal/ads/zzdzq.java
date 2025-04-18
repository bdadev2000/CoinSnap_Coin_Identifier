package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes4.dex */
public final class zzdzq extends zzbvs {
    final /* synthetic */ zzdzr zza;

    public zzdzq(zzdzr zzdzrVar) {
        this.zza = zzdzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdzr zzdzrVar = this.zza;
        zzdzrVar.zza.zzc(new zzeah(autoCloseInputStream, zzdzrVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbwa zzbwaVar) {
        this.zza.zza.zzc(new zzeah(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbwaVar));
    }
}
