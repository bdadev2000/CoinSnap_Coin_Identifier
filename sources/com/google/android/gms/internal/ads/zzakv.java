package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzakv {
    private final zzed zza = new zzed();
    private final int[] zzb = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public static /* bridge */ /* synthetic */ void zzb(zzakv zzakvVar, zzed zzedVar, int i10) {
        int zzo;
        if (i10 >= 4) {
            zzedVar.zzM(3);
            int i11 = i10 - 4;
            if ((zzedVar.zzm() & 128) != 0) {
                if (i11 >= 7 && (zzo = zzedVar.zzo()) >= 4) {
                    zzakvVar.zzh = zzedVar.zzq();
                    zzakvVar.zzi = zzedVar.zzq();
                    zzakvVar.zza.zzI(zzo - 4);
                    i11 -= 7;
                } else {
                    return;
                }
            }
            zzed zzedVar2 = zzakvVar.zza;
            int zzd = zzedVar2.zzd();
            int zze = zzedVar2.zze();
            if (zzd < zze && i11 > 0) {
                int min = Math.min(i11, zze - zzd);
                zzedVar.zzH(zzedVar2.zzN(), zzd, min);
                zzakvVar.zza.zzL(zzd + min);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzc(zzakv zzakvVar, zzed zzedVar, int i10) {
        if (i10 < 19) {
            return;
        }
        zzakvVar.zzd = zzedVar.zzq();
        zzakvVar.zze = zzedVar.zzq();
        zzedVar.zzM(11);
        zzakvVar.zzf = zzedVar.zzq();
        zzakvVar.zzg = zzedVar.zzq();
    }

    public static /* bridge */ /* synthetic */ void zzd(zzakv zzakvVar, zzed zzedVar, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        zzedVar.zzM(2);
        int i11 = 0;
        Arrays.fill(zzakvVar.zzb, 0);
        int i12 = i10 / 5;
        int i13 = 0;
        while (i13 < i12) {
            int zzm = zzedVar.zzm();
            int zzm2 = zzedVar.zzm();
            int zzm3 = zzedVar.zzm();
            int zzm4 = zzedVar.zzm();
            int zzm5 = zzedVar.zzm();
            double d10 = zzm2;
            int[] iArr = zzakvVar.zzb;
            double d11 = zzm3 - 128;
            int max = Math.max(i11, Math.min((int) ((1.402d * d11) + d10), 255)) << 16;
            double d12 = zzm4 - 128;
            iArr[zzm] = Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255)) | (zzm5 << 24) | max | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8);
            i13++;
            i11 = 0;
        }
        zzakvVar.zzc = true;
    }

    @Nullable
    public final zzct zza() {
        int i10;
        int i11;
        if (this.zzd != 0 && this.zze != 0 && this.zzh != 0 && this.zzi != 0) {
            zzed zzedVar = this.zza;
            if (zzedVar.zze() != 0 && zzedVar.zzd() == zzedVar.zze() && this.zzc) {
                zzedVar.zzL(0);
                int i12 = this.zzh * this.zzi;
                int[] iArr = new int[i12];
                int i13 = 0;
                while (i13 < i12) {
                    int zzm = this.zza.zzm();
                    if (zzm != 0) {
                        i10 = i13 + 1;
                        iArr[i13] = this.zzb[zzm];
                    } else {
                        int zzm2 = this.zza.zzm();
                        if (zzm2 != 0) {
                            int i14 = zzm2 & 63;
                            if ((zzm2 & 64) != 0) {
                                i14 = (i14 << 8) | this.zza.zzm();
                            }
                            if ((zzm2 & 128) == 0) {
                                i11 = this.zzb[0];
                            } else {
                                i11 = this.zzb[this.zza.zzm()];
                            }
                            i10 = i14 + i13;
                            Arrays.fill(iArr, i13, i10, i11);
                        }
                    }
                    i13 = i10;
                }
                Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
                zzcr zzcrVar = new zzcr();
                zzcrVar.zzc(createBitmap);
                zzcrVar.zzh(this.zzf / this.zzd);
                zzcrVar.zzi(0);
                zzcrVar.zze(this.zzg / this.zze, 0);
                zzcrVar.zzf(0);
                zzcrVar.zzk(this.zzh / this.zzd);
                zzcrVar.zzd(this.zzi / this.zze);
                return zzcrVar.zzp();
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
        this.zza.zzI(0);
        this.zzc = false;
    }
}
