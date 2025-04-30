package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzxn implements zzvm, zzvl {
    private final zzvm zza;
    private final long zzb;
    private zzvl zzc;

    public zzxn(zzvm zzvmVar, long j7) {
        this.zza = zzvmVar;
        this.zzb = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zza(long j7, zzmr zzmrVar) {
        long j9 = this.zzb;
        return this.zza.zza(j7 - j9, zzmrVar) + j9;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zze(long j7) {
        long j9 = this.zzb;
        return this.zza.zze(j7 - j9) + j9;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzf(zzzg[] zzzgVarArr, boolean[] zArr, zzxf[] zzxfVarArr, boolean[] zArr2, long j7) {
        zzxf[] zzxfVarArr2 = new zzxf[zzxfVarArr.length];
        int i9 = 0;
        while (true) {
            zzxf zzxfVar = null;
            if (i9 >= zzxfVarArr.length) {
                break;
            }
            zzxm zzxmVar = (zzxm) zzxfVarArr[i9];
            if (zzxmVar != null) {
                zzxfVar = zzxmVar.zzc();
            }
            zzxfVarArr2[i9] = zzxfVar;
            i9++;
        }
        long zzf = this.zza.zzf(zzzgVarArr, zArr, zzxfVarArr2, zArr2, j7 - this.zzb);
        for (int i10 = 0; i10 < zzxfVarArr.length; i10++) {
            zzxf zzxfVar2 = zzxfVarArr2[i10];
            if (zzxfVar2 == null) {
                zzxfVarArr[i10] = null;
            } else {
                zzxf zzxfVar3 = zzxfVarArr[i10];
                if (zzxfVar3 == null || ((zzxm) zzxfVar3).zzc() != zzxfVar2) {
                    zzxfVarArr[i10] = new zzxm(zzxfVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final /* bridge */ /* synthetic */ void zzg(zzxh zzxhVar) {
        zzvl zzvlVar = this.zzc;
        zzvlVar.getClass();
        zzvlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzxr zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzi(zzvm zzvmVar) {
        zzvl zzvlVar = this.zzc;
        zzvlVar.getClass();
        zzvlVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzj(long j7, boolean z8) {
        this.zza.zzj(j7 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl(zzvl zzvlVar, long j7) {
        this.zzc = zzvlVar;
        this.zza.zzl(this, j7 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j7) {
        this.zza.zzm(j7 - this.zzb);
    }

    public final zzvm zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        long j7 = zzloVar.zza;
        long j9 = this.zzb;
        zzlm zza = zzloVar.zza();
        zza.zze(j7 - j9);
        return this.zza.zzo(zza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
