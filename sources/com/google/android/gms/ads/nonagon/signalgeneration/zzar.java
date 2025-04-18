package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzgee;

/* loaded from: classes3.dex */
final class zzar implements zzgee {
    final /* synthetic */ zzdfa zza;

    public zzar(zzdfa zzdfaVar) {
        this.zza = zzdfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        this.zza.zzb(th2.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* synthetic */ void zzb(@Nullable Object obj) {
        this.zza.zza((zzbd) obj);
    }
}
