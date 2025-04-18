package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzfca implements zzfck {
    private final zzfck zza;

    @Nullable
    private zzcvt zzb;

    public zzfca(zzfck zzfckVar) {
        this.zza = zzfckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvt zzd() {
        return this.zzb;
    }

    public final synchronized ua.b zzb(zzfcl zzfclVar, zzfcj zzfcjVar, @Nullable zzcvt zzcvtVar) {
        this.zzb = zzcvtVar;
        if (zzfclVar.zza != null) {
            zzcsy zzb = zzcvtVar.zzb();
            return zzb.zzi(zzb.zzk(zzgei.zzh(zzfclVar.zza)));
        }
        return ((zzfbz) this.zza).zzb(zzfclVar, zzfcjVar, zzcvtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ ua.b zzc(zzfcl zzfclVar, zzfcj zzfcjVar, @Nullable Object obj) {
        return zzb(zzfclVar, zzfcjVar, null);
    }
}
