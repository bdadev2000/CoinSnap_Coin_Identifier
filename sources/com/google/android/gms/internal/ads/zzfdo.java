package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public final class zzfdo implements zzfdy {
    private final zzfdy zza;

    @Nullable
    private zzcxh zzb;

    public zzfdo(zzfdy zzfdyVar) {
        this.zza = zzfdyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcxh zzd() {
        return this.zzb;
    }

    public final synchronized ListenableFuture zzb(zzfdz zzfdzVar, zzfdx zzfdxVar, @Nullable zzcxh zzcxhVar) {
        this.zzb = zzcxhVar;
        if (zzfdzVar.zza == null) {
            return ((zzfdn) this.zza).zzb(zzfdzVar, zzfdxVar, zzcxhVar);
        }
        zzcum zzb = zzcxhVar.zzb();
        return zzb.zzi(zzb.zzk(zzgfo.zzh(zzfdzVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfdz zzfdzVar, zzfdx zzfdxVar, @Nullable Object obj) {
        return zzb(zzfdzVar, zzfdxVar, null);
    }
}
