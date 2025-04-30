package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcct implements zzgfp {
    final /* synthetic */ zzccr zza;
    final /* synthetic */ zzccp zzb;

    public zzcct(zzccu zzccuVar, zzccr zzccrVar, zzccp zzccpVar) {
        this.zza = zzccrVar;
        this.zzb = zzccpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zzb(@Nullable Object obj) {
        this.zza.zza(obj);
    }
}
