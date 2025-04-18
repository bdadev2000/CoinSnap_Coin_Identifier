package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzwo implements zzup, zzuo {
    private final zzup zza;
    private final long zzb;
    private zzuo zzc;

    public zzwo(zzup zzupVar, long j3) {
        this.zza = zzupVar;
        this.zzb = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j3, zzls zzlsVar) {
        long j10 = this.zzb;
        return this.zza.zza(j3 - j10, zzlsVar) + j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        long zzd = this.zza.zzd();
        return zzd == C.TIME_UNSET ? C.TIME_UNSET : zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j3) {
        long j10 = this.zzb;
        return this.zza.zze(j3 - j10) + j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyd[] zzydVarArr, boolean[] zArr, zzwg[] zzwgVarArr, boolean[] zArr2, long j3) {
        zzwg[] zzwgVarArr2 = new zzwg[zzwgVarArr.length];
        int i10 = 0;
        while (true) {
            zzwg zzwgVar = null;
            if (i10 >= zzwgVarArr.length) {
                break;
            }
            zzwn zzwnVar = (zzwn) zzwgVarArr[i10];
            if (zzwnVar != null) {
                zzwgVar = zzwnVar.zzc();
            }
            zzwgVarArr2[i10] = zzwgVar;
            i10++;
        }
        long zzf = this.zza.zzf(zzydVarArr, zArr, zzwgVarArr2, zArr2, j3 - this.zzb);
        for (int i11 = 0; i11 < zzwgVarArr.length; i11++) {
            zzwg zzwgVar2 = zzwgVarArr2[i11];
            if (zzwgVar2 == null) {
                zzwgVarArr[i11] = null;
            } else {
                zzwg zzwgVar3 = zzwgVarArr[i11];
                if (zzwgVar3 == null || ((zzwn) zzwgVar3).zzc() != zzwgVar2) {
                    zzwgVarArr[i11] = new zzwn(zzwgVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final /* bridge */ /* synthetic */ void zzg(zzwi zzwiVar) {
        zzuo zzuoVar = this.zzc;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzwr zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        zzuo zzuoVar = this.zzc;
        zzuoVar.getClass();
        zzuoVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j3, boolean z10) {
        this.zza.zzj(j3 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j3) {
        this.zzc = zzuoVar;
        this.zza.zzl(this, j3 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j3) {
        this.zza.zzm(j3 - this.zzb);
    }

    public final zzup zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        long j3 = zzkoVar.zza;
        long j10 = this.zzb;
        zzkm zza = zzkoVar.zza();
        zza.zze(j3 - j10);
        return this.zza.zzo(zza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
