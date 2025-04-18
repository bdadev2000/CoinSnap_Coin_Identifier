package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzuq implements zzuw, zzuv {
    public final zzuy zza;
    private final long zzb;
    private zzva zzc;
    private zzuw zzd;

    @Nullable
    private zzuv zze;
    private long zzf = -9223372036854775807L;
    private final zzza zzg;

    public zzuq(zzuy zzuyVar, zzza zzzaVar, long j2) {
        this.zza = zzuyVar;
        this.zzg = zzzaVar;
        this.zzb = j2;
    }

    private final long zzv(long j2) {
        long j3 = this.zzf;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zza(long j2, zzlw zzlwVar) {
        zzuw zzuwVar = this.zzd;
        int i2 = zzeu.zza;
        return zzuwVar.zza(j2, zzlwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzb() {
        zzuw zzuwVar = this.zzd;
        int i2 = zzeu.zza;
        return zzuwVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzc() {
        zzuw zzuwVar = this.zzd;
        int i2 = zzeu.zza;
        return zzuwVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzd() {
        zzuw zzuwVar = this.zzd;
        int i2 = zzeu.zza;
        return zzuwVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zze(long j2) {
        zzuw zzuwVar = this.zzd;
        int i2 = zzeu.zza;
        return zzuwVar.zze(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzwo
    public final /* bridge */ /* synthetic */ void zzf(zzwp zzwpVar) {
        zzuv zzuvVar = this.zze;
        int i2 = zzeu.zza;
        zzuvVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzg(zzyl[] zzylVarArr, boolean[] zArr, zzwn[] zzwnVarArr, boolean[] zArr2, long j2) {
        long j3 = this.zzf;
        long j4 = (j3 == -9223372036854775807L || j2 != this.zzb) ? j2 : j3;
        this.zzf = -9223372036854775807L;
        zzuw zzuwVar = this.zzd;
        int i2 = zzeu.zza;
        return zzuwVar.zzg(zzylVarArr, zArr, zzwnVarArr, zArr2, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final void zzh(zzuw zzuwVar) {
        zzuv zzuvVar = this.zze;
        int i2 = zzeu.zza;
        zzuvVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final zzwy zzi() {
        zzuw zzuwVar = this.zzd;
        int i2 = zzeu.zza;
        return zzuwVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzj(long j2, boolean z2) {
        zzuw zzuwVar = this.zzd;
        int i2 = zzeu.zza;
        zzuwVar.zzj(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzk() throws IOException {
        zzuw zzuwVar = this.zzd;
        if (zzuwVar != null) {
            zzuwVar.zzk();
            return;
        }
        zzva zzvaVar = this.zzc;
        if (zzvaVar != null) {
            zzvaVar.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzl(zzuv zzuvVar, long j2) {
        this.zze = zzuvVar;
        zzuw zzuwVar = this.zzd;
        if (zzuwVar != null) {
            zzuwVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final void zzm(long j2) {
        zzuw zzuwVar = this.zzd;
        int i2 = zzeu.zza;
        zzuwVar.zzm(j2);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzo(zzks zzksVar) {
        zzuw zzuwVar = this.zzd;
        return zzuwVar != null && zzuwVar.zzo(zzksVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzp() {
        zzuw zzuwVar = this.zzd;
        return zzuwVar != null && zzuwVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzuy zzuyVar) {
        long zzv = zzv(this.zzb);
        zzva zzvaVar = this.zzc;
        zzvaVar.getClass();
        zzuw zzI = zzvaVar.zzI(zzuyVar, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzl(this, zzv);
        }
    }

    public final void zzs(long j2) {
        this.zzf = j2;
    }

    public final void zzt() {
        zzuw zzuwVar = this.zzd;
        if (zzuwVar != null) {
            zzva zzvaVar = this.zzc;
            zzvaVar.getClass();
            zzvaVar.zzG(zzuwVar);
        }
    }

    public final void zzu(zzva zzvaVar) {
        zzdi.zzf(this.zzc == null);
        this.zzc = zzvaVar;
    }
}
