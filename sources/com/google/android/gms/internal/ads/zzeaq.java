package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzeaq implements zzgfp {
    final /* synthetic */ Context zza;

    public zzeaq(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        if (((Boolean) zzbgc.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzba)) {
            zzbdz.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbgc.zzj.zze()).booleanValue()) {
            zzbdz.zze(this.zza);
        }
    }
}
