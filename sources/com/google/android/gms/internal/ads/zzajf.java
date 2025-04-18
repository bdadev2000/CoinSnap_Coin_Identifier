package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes2.dex */
final class zzajf {
    public final zzaeh zza;
    public zzaju zzd;
    public zzajb zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzajt zzb = new zzajt();
    public final zzek zzc = new zzek();
    private final zzek zzj = new zzek(1);
    private final zzek zzk = new zzek();

    public zzajf(zzaeh zzaehVar, zzaju zzajuVar, zzajb zzajbVar) {
        this.zza = zzaehVar;
        this.zzd = zzajuVar;
        this.zze = zzajbVar;
        zzh(zzajuVar, zzajbVar);
    }

    public final int zza() {
        int i2 = !this.zzl ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i2 | Ints.MAX_POWER_OF_TWO : i2;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i2, int i3) {
        zzek zzekVar;
        zzajs zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i4 = zzf.zzd;
        if (i4 != 0) {
            zzekVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i5 = zzeu.zza;
            zzek zzekVar2 = this.zzk;
            int length = bArr.length;
            zzekVar2.zzJ(bArr, length);
            zzekVar = this.zzk;
            i4 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z2 = zzb || i3 != 0;
        zzek zzekVar3 = this.zzj;
        zzekVar3.zzN()[0] = (byte) ((true != z2 ? 0 : 128) | i4);
        zzekVar3.zzL(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzekVar, i4, 1);
        if (!z2) {
            return i4 + 1;
        }
        if (!zzb) {
            this.zzc.zzI(8);
            zzek zzekVar4 = this.zzc;
            byte[] zzN = zzekVar4.zzN();
            zzN[0] = 0;
            zzN[1] = 1;
            zzN[2] = 0;
            zzN[3] = (byte) i3;
            zzN[4] = (byte) ((i2 >> 24) & 255);
            zzN[5] = (byte) ((i2 >> 16) & 255);
            zzN[6] = (byte) ((i2 >> 8) & 255);
            zzN[7] = (byte) (i2 & 255);
            this.zza.zzr(zzekVar4, 8, 1);
            return i4 + 9;
        }
        int i6 = i4 + 1;
        zzek zzekVar5 = this.zzb.zzn;
        int zzq = zzekVar5.zzq();
        zzekVar5.zzM(-2);
        int i7 = (zzq * 6) + 2;
        if (i3 != 0) {
            this.zzc.zzI(i7);
            byte[] zzN2 = this.zzc.zzN();
            zzekVar5.zzH(zzN2, 0, i7);
            int i8 = (((zzN2[2] & UnsignedBytes.MAX_VALUE) << 8) | (zzN2[3] & UnsignedBytes.MAX_VALUE)) + i3;
            zzN2[2] = (byte) ((i8 >> 8) & 255);
            zzN2[3] = (byte) (i8 & 255);
            zzekVar5 = this.zzc;
        }
        this.zza.zzr(zzekVar5, i7, 1);
        return i6 + i7;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzajt zzajtVar = this.zzb;
        return zzajtVar.zzi[this.zzf];
    }

    @Nullable
    public final zzajs zzf() {
        if (!this.zzl) {
            return null;
        }
        zzajt zzajtVar = this.zzb;
        zzajb zzajbVar = zzajtVar.zza;
        int i2 = zzeu.zza;
        int i3 = zzajbVar.zza;
        zzajs zzajsVar = zzajtVar.zzm;
        if (zzajsVar == null) {
            zzajsVar = this.zzd.zza.zza(i3);
        }
        if (zzajsVar == null || !zzajsVar.zza) {
            return null;
        }
        return zzajsVar;
    }

    public final void zzh(zzaju zzajuVar, zzajb zzajbVar) {
        this.zzd = zzajuVar;
        this.zze = zzajbVar;
        this.zza.zzl(zzajuVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzajt zzajtVar = this.zzb;
        zzajtVar.zzd = 0;
        zzajtVar.zzp = 0L;
        zzajtVar.zzq = false;
        zzajtVar.zzk = false;
        zzajtVar.zzo = false;
        zzajtVar.zzm = null;
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
        int i2 = this.zzg + 1;
        this.zzg = i2;
        int[] iArr = this.zzb.zzg;
        int i3 = this.zzh;
        if (i2 != iArr[i3]) {
            return true;
        }
        this.zzh = i3 + 1;
        this.zzg = 0;
        return false;
    }
}
