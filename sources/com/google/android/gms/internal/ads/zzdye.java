package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzdye implements zzgee {
    final /* synthetic */ Context zza;

    public zzdye(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        if (((Boolean) zzbef.zzh.zze()).booleanValue() && (th2 instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbbx.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbef.zzj.zze()).booleanValue()) {
            zzbbx.zze(this.zza);
        }
    }
}
