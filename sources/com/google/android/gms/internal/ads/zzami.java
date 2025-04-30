package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzami {
    private final zzfu zza = new zzfu();
    private final int[] zzb = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public static /* bridge */ /* synthetic */ void zzb(zzami zzamiVar, zzfu zzfuVar, int i9) {
        int zzo;
        if (i9 >= 4) {
            zzfuVar.zzL(3);
            int i10 = i9 - 4;
            if ((zzfuVar.zzm() & 128) != 0) {
                if (i10 >= 7 && (zzo = zzfuVar.zzo()) >= 4) {
                    zzamiVar.zzh = zzfuVar.zzq();
                    zzamiVar.zzi = zzfuVar.zzq();
                    zzamiVar.zza.zzH(zzo - 4);
                    i10 = i9 - 11;
                } else {
                    return;
                }
            }
            zzfu zzfuVar2 = zzamiVar.zza;
            int zzd = zzfuVar2.zzd();
            int zze = zzfuVar2.zze();
            if (zzd < zze && i10 > 0) {
                int min = Math.min(i10, zze - zzd);
                zzfuVar.zzG(zzfuVar2.zzM(), zzd, min);
                zzamiVar.zza.zzK(zzd + min);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzc(zzami zzamiVar, zzfu zzfuVar, int i9) {
        if (i9 < 19) {
            return;
        }
        zzamiVar.zzd = zzfuVar.zzq();
        zzamiVar.zze = zzfuVar.zzq();
        zzfuVar.zzL(11);
        zzamiVar.zzf = zzfuVar.zzq();
        zzamiVar.zzg = zzfuVar.zzq();
    }

    public static /* bridge */ /* synthetic */ void zzd(zzami zzamiVar, zzfu zzfuVar, int i9) {
        if (i9 % 5 != 2) {
            return;
        }
        zzfuVar.zzL(2);
        int i10 = 0;
        Arrays.fill(zzamiVar.zzb, 0);
        int i11 = i9 / 5;
        int i12 = 0;
        while (i12 < i11) {
            int zzm = zzfuVar.zzm();
            int zzm2 = zzfuVar.zzm();
            int zzm3 = zzfuVar.zzm();
            int zzm4 = zzfuVar.zzm();
            int zzm5 = zzfuVar.zzm();
            double d2 = zzm2;
            int[] iArr = zzamiVar.zzb;
            double d9 = zzm3 - 128;
            int max = Math.max(i10, Math.min((int) ((1.402d * d9) + d2), 255)) << 16;
            double d10 = zzm4 - 128;
            iArr[zzm] = Math.max(0, Math.min((int) ((d10 * 1.772d) + d2), 255)) | (zzm5 << 24) | max | (Math.max(0, Math.min((int) ((d2 - (0.34414d * d10)) - (d9 * 0.71414d)), 255)) << 8);
            i12++;
            i10 = 0;
        }
        zzamiVar.zzc = true;
    }

    @Nullable
    public final zzei zza() {
        int i9;
        int i10;
        if (this.zzd != 0 && this.zze != 0 && this.zzh != 0 && this.zzi != 0) {
            zzfu zzfuVar = this.zza;
            if (zzfuVar.zze() != 0 && zzfuVar.zzd() == zzfuVar.zze() && this.zzc) {
                zzfuVar.zzK(0);
                int i11 = this.zzh * this.zzi;
                int[] iArr = new int[i11];
                int i12 = 0;
                while (i12 < i11) {
                    int zzm = this.zza.zzm();
                    if (zzm != 0) {
                        i9 = i12 + 1;
                        iArr[i12] = this.zzb[zzm];
                    } else {
                        int zzm2 = this.zza.zzm();
                        if (zzm2 != 0) {
                            int i13 = zzm2 & 63;
                            if ((zzm2 & 64) != 0) {
                                i13 = (i13 << 8) | this.zza.zzm();
                            }
                            if ((zzm2 & 128) == 0) {
                                i10 = 0;
                            } else {
                                i10 = this.zzb[this.zza.zzm()];
                            }
                            i9 = i13 + i12;
                            Arrays.fill(iArr, i12, i9, i10);
                        }
                    }
                    i12 = i9;
                }
                Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
                zzeg zzegVar = new zzeg();
                zzegVar.zzc(createBitmap);
                zzegVar.zzh(this.zzf / this.zzd);
                zzegVar.zzi(0);
                zzegVar.zze(this.zzg / this.zze, 0);
                zzegVar.zzf(0);
                zzegVar.zzk(this.zzh / this.zzd);
                zzegVar.zzd(this.zzi / this.zze);
                return zzegVar.zzp();
            }
            return null;
        }
        return null;
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzH(0);
        this.zzc = false;
    }
}
