package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzali {
    private final zzek zza = new zzek();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public static /* bridge */ /* synthetic */ void zzb(zzali zzaliVar, zzek zzekVar, int i2) {
        int zzo;
        if (i2 < 4) {
            return;
        }
        zzekVar.zzM(3);
        int i3 = i2 - 4;
        if ((zzekVar.zzm() & 128) != 0) {
            if (i3 < 7 || (zzo = zzekVar.zzo()) < 4) {
                return;
            }
            zzaliVar.zzh = zzekVar.zzq();
            zzaliVar.zzi = zzekVar.zzq();
            zzaliVar.zza.zzI(zzo - 4);
            i3 = i2 - 11;
        }
        zzek zzekVar2 = zzaliVar.zza;
        int zzd = zzekVar2.zzd();
        int zze = zzekVar2.zze();
        if (zzd >= zze || i3 <= 0) {
            return;
        }
        int min = Math.min(i3, zze - zzd);
        zzekVar.zzH(zzekVar2.zzN(), zzd, min);
        zzaliVar.zza.zzL(zzd + min);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzali zzaliVar, zzek zzekVar, int i2) {
        if (i2 < 19) {
            return;
        }
        zzaliVar.zzd = zzekVar.zzq();
        zzaliVar.zze = zzekVar.zzq();
        zzekVar.zzM(11);
        zzaliVar.zzf = zzekVar.zzq();
        zzaliVar.zzg = zzekVar.zzq();
    }

    public static /* bridge */ /* synthetic */ void zzd(zzali zzaliVar, zzek zzekVar, int i2) {
        if (i2 % 5 != 2) {
            return;
        }
        zzekVar.zzM(2);
        int i3 = 0;
        Arrays.fill(zzaliVar.zzb, 0);
        int i4 = i2 / 5;
        int i5 = 0;
        while (i5 < i4) {
            int zzm = zzekVar.zzm();
            int zzm2 = zzekVar.zzm();
            int zzm3 = zzekVar.zzm();
            int zzm4 = zzekVar.zzm();
            int zzm5 = zzekVar.zzm();
            double d = zzm2;
            int[] iArr = zzaliVar.zzb;
            double d2 = zzm3 - 128;
            int max = Math.max(i3, Math.min((int) ((1.402d * d2) + d), 255)) << 16;
            double d3 = zzm4 - 128;
            iArr[zzm] = Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)) | (zzm5 << 24) | max | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
            i5++;
            i3 = 0;
        }
        zzaliVar.zzc = true;
    }

    @Nullable
    public final zzdb zza() {
        int i2;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzek zzekVar = this.zza;
        if (zzekVar.zze() == 0 || zzekVar.zzd() != zzekVar.zze() || !this.zzc) {
            return null;
        }
        zzekVar.zzL(0);
        int i3 = this.zzh * this.zzi;
        int[] iArr = new int[i3];
        int i4 = 0;
        while (i4 < i3) {
            int zzm = this.zza.zzm();
            if (zzm != 0) {
                i2 = i4 + 1;
                iArr[i4] = this.zzb[zzm];
            } else {
                int zzm2 = this.zza.zzm();
                if (zzm2 != 0) {
                    int i5 = zzm2 & 63;
                    if ((zzm2 & 64) != 0) {
                        i5 = (i5 << 8) | this.zza.zzm();
                    }
                    i2 = i5 + i4;
                    Arrays.fill(iArr, i4, i2, (zzm2 & 128) == 0 ? this.zzb[0] : this.zzb[this.zza.zzm()]);
                }
            }
            i4 = i2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcz zzczVar = new zzcz();
        zzczVar.zzc(createBitmap);
        zzczVar.zzh(this.zzf / this.zzd);
        zzczVar.zzi(0);
        zzczVar.zze(this.zzg / this.zze, 0);
        zzczVar.zzf(0);
        zzczVar.zzk(this.zzh / this.zzd);
        zzczVar.zzd(this.zzi / this.zze);
        return zzczVar.zzp();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzI(0);
        this.zzc = false;
    }
}
