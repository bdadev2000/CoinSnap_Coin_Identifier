package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzakc {
    public final zzafa zza;
    public zzaks zzd;
    public zzajy zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzakr zzb = new zzakr();
    public final zzfu zzc = new zzfu();
    private final zzfu zzj = new zzfu(1);
    private final zzfu zzk = new zzfu();

    public zzakc(zzafa zzafaVar, zzaks zzaksVar, zzajy zzajyVar) {
        this.zza = zzafaVar;
        this.zzd = zzaksVar;
        this.zze = zzajyVar;
        zzh(zzaksVar, zzajyVar);
    }

    public final int zza() {
        int i9;
        if (!this.zzl) {
            i9 = this.zzd.zzg[this.zzf];
        } else if (this.zzb.zzj[this.zzf]) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (zzf() != null) {
            return i9 | 1073741824;
        }
        return i9;
    }

    public final int zzb() {
        if (!this.zzl) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i9, int i10) {
        zzfu zzfuVar;
        boolean z8;
        int i11;
        zzakq zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i12 = zzf.zzd;
        if (i12 != 0) {
            zzfuVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i13 = zzgd.zza;
            zzfu zzfuVar2 = this.zzk;
            int length = bArr.length;
            zzfuVar2.zzI(bArr, length);
            zzfuVar = this.zzk;
            i12 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        if (zzb || i10 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfu zzfuVar3 = this.zzj;
        if (true != z8) {
            i11 = 0;
        } else {
            i11 = 128;
        }
        zzfuVar3.zzM()[0] = (byte) (i11 | i12);
        zzfuVar3.zzK(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzfuVar, i12, 1);
        if (!z8) {
            return i12 + 1;
        }
        if (!zzb) {
            this.zzc.zzH(8);
            zzfu zzfuVar4 = this.zzc;
            byte[] zzM = zzfuVar4.zzM();
            zzM[0] = 0;
            zzM[1] = 1;
            zzM[2] = 0;
            zzM[3] = (byte) i10;
            zzM[4] = (byte) ((i9 >> 24) & 255);
            zzM[5] = (byte) ((i9 >> 16) & 255);
            zzM[6] = (byte) ((i9 >> 8) & 255);
            zzM[7] = (byte) (i9 & 255);
            this.zza.zzr(zzfuVar4, 8, 1);
            return i12 + 9;
        }
        int i14 = i12 + 1;
        zzfu zzfuVar5 = this.zzb.zzn;
        int zzq = zzfuVar5.zzq();
        zzfuVar5.zzL(-2);
        int i15 = (zzq * 6) + 2;
        if (i10 != 0) {
            this.zzc.zzH(i15);
            byte[] zzM2 = this.zzc.zzM();
            zzfuVar5.zzG(zzM2, 0, i15);
            int i16 = (((zzM2[2] & 255) << 8) | (zzM2[3] & 255)) + i10;
            zzM2[2] = (byte) ((i16 >> 8) & 255);
            zzM2[3] = (byte) (i16 & 255);
            zzfuVar5 = this.zzc;
        }
        this.zza.zzr(zzfuVar5, i15, 1);
        return i14 + i15;
    }

    public final long zzd() {
        if (!this.zzl) {
            return this.zzd.zzc[this.zzf];
        }
        return this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzakr zzakrVar = this.zzb;
        return zzakrVar.zzi[this.zzf];
    }

    @Nullable
    public final zzakq zzf() {
        if (!this.zzl) {
            return null;
        }
        zzakr zzakrVar = this.zzb;
        zzajy zzajyVar = zzakrVar.zza;
        int i9 = zzgd.zza;
        int i10 = zzajyVar.zza;
        zzakq zzakqVar = zzakrVar.zzm;
        if (zzakqVar == null) {
            zzakqVar = this.zzd.zza.zza(i10);
        }
        if (zzakqVar == null || !zzakqVar.zza) {
            return null;
        }
        return zzakqVar;
    }

    public final void zzh(zzaks zzaksVar, zzajy zzajyVar) {
        this.zzd = zzaksVar;
        this.zze = zzajyVar;
        this.zza.zzl(zzaksVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzakr zzakrVar = this.zzb;
        zzakrVar.zzd = 0;
        zzakrVar.zzp = 0L;
        zzakrVar.zzq = false;
        zzakrVar.zzk = false;
        zzakrVar.zzo = false;
        zzakrVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i9 = this.zzg + 1;
        this.zzg = i9;
        int[] iArr = this.zzb.zzg;
        int i10 = this.zzh;
        if (i9 != iArr[i10]) {
            return true;
        }
        this.zzh = i10 + 1;
        this.zzg = 0;
        return false;
    }
}
