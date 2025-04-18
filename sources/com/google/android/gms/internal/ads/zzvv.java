package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* loaded from: classes3.dex */
public final class zzvv implements zzuq {
    private final zzgc zza;
    private int zzb;
    private final zzvu zzc;
    private final zzyw zzd;

    public zzvv(zzgc zzgcVar, zzvu zzvuVar) {
        zzyw zzywVar = new zzyw(-1);
        this.zza = zzgcVar;
        this.zzc = zzvuVar;
        this.zzd = zzywVar;
        this.zzb = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }

    public final zzvv zza(int i10) {
        this.zzb = i10;
        return this;
    }

    public final zzvx zzb(zzaw zzawVar) {
        zzawVar.zzb.getClass();
        return new zzvx(zzawVar, this.zza, this.zzc, zzrp.zza, this.zzd, this.zzb, null);
    }
}
