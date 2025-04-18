package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public final class zzfdn implements zzfdy {

    @Nullable
    private zzcxh zza;

    @Override // com.google.android.gms.internal.ads.zzfdy
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcxh zzd() {
        return this.zza;
    }

    public final synchronized ListenableFuture zzb(zzfdz zzfdzVar, zzfdx zzfdxVar, @Nullable zzcxh zzcxhVar) {
        zzcum zzb;
        try {
            if (zzcxhVar != null) {
                this.zza = zzcxhVar;
            } else {
                this.zza = (zzcxh) zzfdxVar.zza(zzfdzVar.zzb).zzh();
            }
            zzb = this.zza.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzb.zzi(zzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfdz zzfdzVar, zzfdx zzfdxVar, @Nullable Object obj) {
        return zzb(zzfdzVar, zzfdxVar, null);
    }
}
