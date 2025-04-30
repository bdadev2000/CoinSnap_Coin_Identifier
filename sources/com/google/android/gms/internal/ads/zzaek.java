package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaek {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;

    @Nullable
    public final String zzi;

    private zzaek(List list, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f9, @Nullable String str) {
        this.zza = list;
        this.zzb = i9;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
        this.zzg = i16;
        this.zzh = f9;
        this.zzi = str;
    }

    public static zzaek zza(zzfu zzfuVar) throws zzch {
        List singletonList;
        int i9;
        int i10;
        int i11;
        try {
            zzfuVar.zzL(21);
            int zzm = zzfuVar.zzm() & 3;
            int zzm2 = zzfuVar.zzm();
            int zzd = zzfuVar.zzd();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < zzm2; i14++) {
                zzfuVar.zzL(1);
                int zzq = zzfuVar.zzq();
                for (int i15 = 0; i15 < zzq; i15++) {
                    int zzq2 = zzfuVar.zzq();
                    i13 += zzq2 + 4;
                    zzfuVar.zzL(zzq2);
                }
            }
            zzfuVar.zzK(zzd);
            byte[] bArr = new byte[i13];
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            String str = null;
            float f9 = 1.0f;
            int i23 = 0;
            int i24 = 0;
            while (i23 < zzm2) {
                int zzm3 = zzfuVar.zzm() & 63;
                int zzq3 = zzfuVar.zzq();
                int i25 = i12;
                while (i25 < zzq3) {
                    int zzq4 = zzfuVar.zzq();
                    int i26 = zzm2;
                    System.arraycopy(zzgr.zza, i12, bArr, i24, 4);
                    int i27 = i24 + 4;
                    System.arraycopy(zzfuVar.zzM(), zzfuVar.zzd(), bArr, i27, zzq4);
                    int i28 = i27 + zzq4;
                    if (zzm3 == 33 && i25 == 0) {
                        zzgo zzc = zzgr.zzc(bArr, i24 + 6, i28);
                        i16 = zzc.zzi;
                        i17 = zzc.zzj;
                        i18 = zzc.zze + 8;
                        i19 = zzc.zzf + 8;
                        int i29 = zzc.zzl;
                        int i30 = zzc.zzm;
                        int i31 = zzc.zzn;
                        i9 = i28;
                        float f10 = zzc.zzk;
                        i10 = zzm3;
                        i11 = zzq3;
                        str = zzes.zzb(zzc.zza, zzc.zzb, zzc.zzc, zzc.zzd, zzc.zzg, zzc.zzh);
                        f9 = f10;
                        i20 = i29;
                        i21 = i30;
                        i22 = i31;
                        i25 = 0;
                    } else {
                        i9 = i28;
                        i10 = zzm3;
                        i11 = zzq3;
                    }
                    zzfuVar.zzL(zzq4);
                    i25++;
                    zzm2 = i26;
                    i24 = i9;
                    zzm3 = i10;
                    zzq3 = i11;
                    i12 = 0;
                }
                i23++;
                i12 = 0;
            }
            if (i13 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new zzaek(singletonList, zzm + 1, i16, i17, i18, i19, i20, i21, i22, f9, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw zzch.zza("Error parsing HEVC config", e4);
        }
    }
}
