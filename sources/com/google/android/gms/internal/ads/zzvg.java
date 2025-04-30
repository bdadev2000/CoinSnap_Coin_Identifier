package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzvg implements zzvm, zzvl {
    public final zzvo zza;
    private final long zzb;
    private zzvq zzc;
    private zzvm zzd;

    @Nullable
    private zzvl zze;
    private long zzf = C.TIME_UNSET;
    private final zzzv zzg;

    public zzvg(zzvo zzvoVar, zzzv zzzvVar, long j7) {
        this.zza = zzvoVar;
        this.zzg = zzzvVar;
        this.zzb = j7;
    }

    private final long zzv(long j7) {
        long j9 = this.zzf;
        return j9 != C.TIME_UNSET ? j9 : j7;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zza(long j7, zzmr zzmrVar) {
        zzvm zzvmVar = this.zzd;
        int i9 = zzgd.zza;
        return zzvmVar.zza(j7, zzmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        zzvm zzvmVar = this.zzd;
        int i9 = zzgd.zza;
        return zzvmVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        zzvm zzvmVar = this.zzd;
        int i9 = zzgd.zza;
        return zzvmVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzd() {
        zzvm zzvmVar = this.zzd;
        int i9 = zzgd.zza;
        return zzvmVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zze(long j7) {
        zzvm zzvmVar = this.zzd;
        int i9 = zzgd.zza;
        return zzvmVar.zze(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzf(zzzg[] zzzgVarArr, boolean[] zArr, zzxf[] zzxfVarArr, boolean[] zArr2, long j7) {
        long j9;
        long j10 = this.zzf;
        if (j10 != C.TIME_UNSET && j7 == this.zzb) {
            j9 = j10;
        } else {
            j9 = j7;
        }
        this.zzf = C.TIME_UNSET;
        zzvm zzvmVar = this.zzd;
        int i9 = zzgd.zza;
        return zzvmVar.zzf(zzzgVarArr, zArr, zzxfVarArr, zArr2, j9);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final /* bridge */ /* synthetic */ void zzg(zzxh zzxhVar) {
        zzvl zzvlVar = this.zze;
        int i9 = zzgd.zza;
        zzvlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzxr zzh() {
        zzvm zzvmVar = this.zzd;
        int i9 = zzgd.zza;
        return zzvmVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzi(zzvm zzvmVar) {
        zzvl zzvlVar = this.zze;
        int i9 = zzgd.zza;
        zzvlVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzj(long j7, boolean z8) {
        zzvm zzvmVar = this.zzd;
        int i9 = zzgd.zza;
        zzvmVar.zzj(j7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() throws IOException {
        zzvm zzvmVar = this.zzd;
        if (zzvmVar != null) {
            zzvmVar.zzk();
            return;
        }
        zzvq zzvqVar = this.zzc;
        if (zzvqVar != null) {
            zzvqVar.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl(zzvl zzvlVar, long j7) {
        this.zze = zzvlVar;
        zzvm zzvmVar = this.zzd;
        if (zzvmVar != null) {
            zzvmVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j7) {
        zzvm zzvmVar = this.zzd;
        int i9 = zzgd.zza;
        zzvmVar.zzm(j7);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        zzvm zzvmVar = this.zzd;
        if (zzvmVar != null && zzvmVar.zzo(zzloVar)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        zzvm zzvmVar = this.zzd;
        if (zzvmVar != null && zzvmVar.zzp()) {
            return true;
        }
        return false;
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzvo zzvoVar) {
        long zzv = zzv(this.zzb);
        zzvq zzvqVar = this.zzc;
        zzvqVar.getClass();
        zzvm zzI = zzvqVar.zzI(zzvoVar, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzl(this, zzv);
        }
    }

    public final void zzs(long j7) {
        this.zzf = j7;
    }

    public final void zzt() {
        zzvm zzvmVar = this.zzd;
        if (zzvmVar != null) {
            zzvq zzvqVar = this.zzc;
            zzvqVar.getClass();
            zzvqVar.zzG(zzvmVar);
        }
    }

    public final void zzu(zzvq zzvqVar) {
        boolean z8;
        if (this.zzc == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        this.zzc = zzvqVar;
    }
}
