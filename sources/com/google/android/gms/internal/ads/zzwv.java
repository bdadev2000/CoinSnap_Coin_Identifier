package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzwv implements zzuw, zzuv {
    private final zzuw zza;
    private final long zzb;
    private zzuv zzc;

    public zzwv(zzuw zzuwVar, long j2) {
        this.zza = zzuwVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zza(long j2, zzlw zzlwVar) {
        long j3 = this.zzb;
        return this.zza.zza(j2 - j3, zzlwVar) + j3;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zze(long j2) {
        long j3 = this.zzb;
        return this.zza.zze(j2 - j3) + j3;
    }

    @Override // com.google.android.gms.internal.ads.zzwo
    public final /* bridge */ /* synthetic */ void zzf(zzwp zzwpVar) {
        zzuv zzuvVar = this.zzc;
        zzuvVar.getClass();
        zzuvVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzg(zzyl[] zzylVarArr, boolean[] zArr, zzwn[] zzwnVarArr, boolean[] zArr2, long j2) {
        zzwn[] zzwnVarArr2 = new zzwn[zzwnVarArr.length];
        int i2 = 0;
        while (true) {
            zzwn zzwnVar = null;
            if (i2 >= zzwnVarArr.length) {
                break;
            }
            zzwu zzwuVar = (zzwu) zzwnVarArr[i2];
            if (zzwuVar != null) {
                zzwnVar = zzwuVar.zzc();
            }
            zzwnVarArr2[i2] = zzwnVar;
            i2++;
        }
        long zzg = this.zza.zzg(zzylVarArr, zArr, zzwnVarArr2, zArr2, j2 - this.zzb);
        for (int i3 = 0; i3 < zzwnVarArr.length; i3++) {
            zzwn zzwnVar2 = zzwnVarArr2[i3];
            if (zzwnVar2 == null) {
                zzwnVarArr[i3] = null;
            } else {
                zzwn zzwnVar3 = zzwnVarArr[i3];
                if (zzwnVar3 == null || ((zzwu) zzwnVar3).zzc() != zzwnVar2) {
                    zzwnVarArr[i3] = new zzwu(zzwnVar2, this.zzb);
                }
            }
        }
        return zzg + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final void zzh(zzuw zzuwVar) {
        zzuv zzuvVar = this.zzc;
        zzuvVar.getClass();
        zzuvVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final zzwy zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzj(long j2, boolean z2) {
        this.zza.zzj(j2 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzl(zzuv zzuvVar, long j2) {
        this.zzc = zzuvVar;
        this.zza.zzl(this, j2 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final void zzm(long j2) {
        this.zza.zzm(j2 - this.zzb);
    }

    public final zzuw zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzo(zzks zzksVar) {
        long j2 = zzksVar.zza;
        long j3 = this.zzb;
        zzkq zza = zzksVar.zza();
        zza.zze(j2 - j3);
        return this.zza.zzo(zza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
