package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzvi extends zzdc {
    private final zzbu zzc;

    public zzvi(zzbu zzbuVar) {
        this.zzc = zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zza(Object obj) {
        if (obj == zzvh.zzd) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzcz zzd(int i9, zzcz zzczVar, boolean z8) {
        Integer num;
        Object obj = null;
        if (z8) {
            num = 0;
        } else {
            num = null;
        }
        if (z8) {
            obj = zzvh.zzd;
        }
        zzczVar.zzl(num, obj, 0, C.TIME_UNSET, 0L, zzd.zza, true);
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzdb zze(int i9, zzdb zzdbVar, long j7) {
        zzdbVar.zza(zzdb.zza, this.zzc, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
        zzdbVar.zzm = true;
        return zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final Object zzf(int i9) {
        return zzvh.zzd;
    }
}
