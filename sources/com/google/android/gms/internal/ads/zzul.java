package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzul extends zzbv {
    private final zzaw zzb;

    public zzul(zzaw zzawVar) {
        this.zzb = zzawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zza(Object obj) {
        return obj == zzuk.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbt zzd(int i10, zzbt zzbtVar, boolean z10) {
        Integer num;
        Object obj = null;
        if (z10) {
            num = 0;
        } else {
            num = null;
        }
        if (z10) {
            obj = zzuk.zzc;
        }
        zzbtVar.zzi(num, obj, 0, C.TIME_UNSET, 0L, zzb.zza, true);
        return zzbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbu zze(int i10, zzbu zzbuVar, long j3) {
        zzbuVar.zza(zzbu.zza, this.zzb, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
        zzbuVar.zzk = true;
        return zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final Object zzf(int i10) {
        return zzuk.zzc;
    }
}
