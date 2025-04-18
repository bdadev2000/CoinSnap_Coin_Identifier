package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes3.dex */
public final class zzeao extends zzbvl {
    final /* synthetic */ zzeap zza;

    public zzeao(zzeap zzeapVar) {
        this.zza = zzeapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zza.zzd(zzbaVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
