package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzuj implements zzup, zzuo {
    public final zzur zza;
    private final long zzb;
    private zzut zzc;
    private zzup zzd;

    @Nullable
    private zzuo zze;
    private long zzf = C.TIME_UNSET;
    private final zzys zzg;

    public zzuj(zzur zzurVar, zzys zzysVar, long j3) {
        this.zza = zzurVar;
        this.zzg = zzysVar;
        this.zzb = j3;
    }

    private final long zzv(long j3) {
        long j10 = this.zzf;
        return j10 != C.TIME_UNSET ? j10 : j3;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j3, zzls zzlsVar) {
        zzup zzupVar = this.zzd;
        int i10 = zzen.zza;
        return zzupVar.zza(j3, zzlsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        zzup zzupVar = this.zzd;
        int i10 = zzen.zza;
        return zzupVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        zzup zzupVar = this.zzd;
        int i10 = zzen.zza;
        return zzupVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        zzup zzupVar = this.zzd;
        int i10 = zzen.zza;
        return zzupVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j3) {
        zzup zzupVar = this.zzd;
        int i10 = zzen.zza;
        return zzupVar.zze(j3);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyd[] zzydVarArr, boolean[] zArr, zzwg[] zzwgVarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.zzf;
        if (j11 != C.TIME_UNSET && j3 == this.zzb) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.zzf = C.TIME_UNSET;
        zzup zzupVar = this.zzd;
        int i10 = zzen.zza;
        return zzupVar.zzf(zzydVarArr, zArr, zzwgVarArr, zArr2, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final /* bridge */ /* synthetic */ void zzg(zzwi zzwiVar) {
        zzuo zzuoVar = this.zze;
        int i10 = zzen.zza;
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzwr zzh() {
        zzup zzupVar = this.zzd;
        int i10 = zzen.zza;
        return zzupVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        zzuo zzuoVar = this.zze;
        int i10 = zzen.zza;
        zzuoVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j3, boolean z10) {
        zzup zzupVar = this.zzd;
        int i10 = zzen.zza;
        zzupVar.zzj(j3, false);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() throws IOException {
        zzup zzupVar = this.zzd;
        if (zzupVar != null) {
            zzupVar.zzk();
            return;
        }
        zzut zzutVar = this.zzc;
        if (zzutVar != null) {
            zzutVar.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j3) {
        this.zze = zzuoVar;
        zzup zzupVar = this.zzd;
        if (zzupVar != null) {
            zzupVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j3) {
        zzup zzupVar = this.zzd;
        int i10 = zzen.zza;
        zzupVar.zzm(j3);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        zzup zzupVar = this.zzd;
        return zzupVar != null && zzupVar.zzo(zzkoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        zzup zzupVar = this.zzd;
        return zzupVar != null && zzupVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzur zzurVar) {
        long zzv = zzv(this.zzb);
        zzut zzutVar = this.zzc;
        zzutVar.getClass();
        zzup zzI = zzutVar.zzI(zzurVar, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzl(this, zzv);
        }
    }

    public final void zzs(long j3) {
        this.zzf = j3;
    }

    public final void zzt() {
        zzup zzupVar = this.zzd;
        if (zzupVar != null) {
            zzut zzutVar = this.zzc;
            zzutVar.getClass();
            zzutVar.zzG(zzupVar);
        }
    }

    public final void zzu(zzut zzutVar) {
        zzdb.zzf(this.zzc == null);
        this.zzc = zzutVar;
    }
}
