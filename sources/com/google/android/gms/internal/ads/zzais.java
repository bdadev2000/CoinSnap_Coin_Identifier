package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzais {
    public final zzadx zza;
    public zzajh zzd;
    public zzaio zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzajg zzb = new zzajg();
    public final zzed zzc = new zzed();
    private final zzed zzj = new zzed(1);
    private final zzed zzk = new zzed();

    public zzais(zzadx zzadxVar, zzajh zzajhVar, zzaio zzaioVar) {
        this.zza = zzadxVar;
        this.zzd = zzajhVar;
        this.zze = zzaioVar;
        zzh(zzajhVar, zzaioVar);
    }

    public final int zza() {
        int i10;
        if (!this.zzl) {
            i10 = this.zzd.zzg[this.zzf];
        } else if (this.zzb.zzj[this.zzf]) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (zzf() != null) {
            return i10 | 1073741824;
        }
        return i10;
    }

    public final int zzb() {
        if (!this.zzl) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i10, int i11) {
        zzed zzedVar;
        boolean z10;
        int i12;
        zzajf zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i13 = zzf.zzd;
        if (i13 != 0) {
            zzedVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i14 = zzen.zza;
            zzed zzedVar2 = this.zzk;
            int length = bArr.length;
            zzedVar2.zzJ(bArr, length);
            zzedVar = this.zzk;
            i13 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        if (!zzb && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzed zzedVar3 = this.zzj;
        if (true != z10) {
            i12 = 0;
        } else {
            i12 = 128;
        }
        zzedVar3.zzN()[0] = (byte) (i12 | i13);
        zzedVar3.zzL(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzedVar, i13, 1);
        if (!z10) {
            return i13 + 1;
        }
        if (!zzb) {
            this.zzc.zzI(8);
            zzed zzedVar4 = this.zzc;
            byte[] zzN = zzedVar4.zzN();
            zzN[0] = 0;
            zzN[1] = 1;
            zzN[2] = 0;
            zzN[3] = (byte) i11;
            zzN[4] = (byte) ((i10 >> 24) & 255);
            zzN[5] = (byte) ((i10 >> 16) & 255);
            zzN[6] = (byte) ((i10 >> 8) & 255);
            zzN[7] = (byte) (i10 & 255);
            this.zza.zzr(zzedVar4, 8, 1);
            return i13 + 9;
        }
        int i15 = i13 + 1;
        zzed zzedVar5 = this.zzb.zzn;
        int zzq = zzedVar5.zzq();
        zzedVar5.zzM(-2);
        int i16 = (zzq * 6) + 2;
        if (i11 != 0) {
            this.zzc.zzI(i16);
            byte[] zzN2 = this.zzc.zzN();
            zzedVar5.zzH(zzN2, 0, i16);
            int i17 = (((zzN2[2] & UByte.MAX_VALUE) << 8) | (zzN2[3] & UByte.MAX_VALUE)) + i11;
            zzN2[2] = (byte) ((i17 >> 8) & 255);
            zzN2[3] = (byte) (i17 & 255);
            zzedVar5 = this.zzc;
        }
        this.zza.zzr(zzedVar5, i16, 1);
        return i15 + i16;
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
        zzajg zzajgVar = this.zzb;
        return zzajgVar.zzi[this.zzf];
    }

    @Nullable
    public final zzajf zzf() {
        if (!this.zzl) {
            return null;
        }
        zzajg zzajgVar = this.zzb;
        zzaio zzaioVar = zzajgVar.zza;
        int i10 = zzen.zza;
        int i11 = zzaioVar.zza;
        zzajf zzajfVar = zzajgVar.zzm;
        if (zzajfVar == null) {
            zzajfVar = this.zzd.zza.zza(i11);
        }
        if (zzajfVar == null || !zzajfVar.zza) {
            return null;
        }
        return zzajfVar;
    }

    public final void zzh(zzajh zzajhVar, zzaio zzaioVar) {
        this.zzd = zzajhVar;
        this.zze = zzaioVar;
        this.zza.zzl(zzajhVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzajg zzajgVar = this.zzb;
        zzajgVar.zzd = 0;
        zzajgVar.zzp = 0L;
        zzajgVar.zzq = false;
        zzajgVar.zzk = false;
        zzajgVar.zzo = false;
        zzajgVar.zzm = null;
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
        int i10 = this.zzg + 1;
        this.zzg = i10;
        int[] iArr = this.zzb.zzg;
        int i11 = this.zzh;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.zzh = i11 + 1;
        this.zzg = 0;
        return false;
    }
}
