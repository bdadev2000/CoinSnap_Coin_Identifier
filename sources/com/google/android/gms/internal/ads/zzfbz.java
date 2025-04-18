package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzfbz implements zzfck {

    @Nullable
    private zzcvt zza;

    @Override // com.google.android.gms.internal.ads.zzfck
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvt zzd() {
        return this.zza;
    }

    public final synchronized ua.b zzb(zzfcl zzfclVar, zzfcj zzfcjVar, @Nullable zzcvt zzcvtVar) {
        zzcsy zzb;
        if (zzcvtVar != null) {
            this.zza = zzcvtVar;
        } else {
            this.zza = (zzcvt) zzfcjVar.zza(zzfclVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ ua.b zzc(zzfcl zzfclVar, zzfcj zzfcjVar, @Nullable Object obj) {
        return zzb(zzfclVar, zzfcjVar, null);
    }
}
