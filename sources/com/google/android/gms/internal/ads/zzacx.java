package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzacx {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;

    @Nullable
    public final String zzk;

    private zzacx(List list, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f9, @Nullable String str) {
        this.zza = list;
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = i16;
        this.zzj = f9;
        this.zzk = str;
    }

    public static zzacx zza(zzfu zzfuVar) throws zzch {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        float f9;
        try {
            zzfuVar.zzL(4);
            int zzm = zzfuVar.zzm() & 3;
            int i16 = zzm + 1;
            if (i16 != 3) {
                ArrayList arrayList = new ArrayList();
                int zzm2 = zzfuVar.zzm() & 31;
                for (int i17 = 0; i17 < zzm2; i17++) {
                    arrayList.add(zzb(zzfuVar));
                }
                int zzm3 = zzfuVar.zzm();
                for (int i18 = 0; i18 < zzm3; i18++) {
                    arrayList.add(zzb(zzfuVar));
                }
                if (zzm2 > 0) {
                    zzgq zze = zzgr.zze((byte[]) arrayList.get(0), zzm + 2, ((byte[]) arrayList.get(0)).length);
                    int i19 = zze.zze;
                    int i20 = zze.zzf;
                    int i21 = zze.zzh + 8;
                    int i22 = zze.zzi + 8;
                    int i23 = zze.zzj;
                    int i24 = zze.zzk;
                    int i25 = zze.zzl;
                    float f10 = zze.zzg;
                    str = zzes.zza(zze.zza, zze.zzb, zze.zzc);
                    i14 = i24;
                    i15 = i25;
                    f9 = f10;
                    i11 = i21;
                    i12 = i22;
                    i13 = i23;
                    i9 = i19;
                    i10 = i20;
                } else {
                    i9 = -1;
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    i15 = -1;
                    str = null;
                    f9 = 1.0f;
                }
                return new zzacx(arrayList, i16, i9, i10, i11, i12, i13, i14, i15, f9, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw zzch.zza("Error parsing AVC config", e4);
        }
    }

    private static byte[] zzb(zzfu zzfuVar) {
        int zzq = zzfuVar.zzq();
        int zzd = zzfuVar.zzd();
        zzfuVar.zzL(zzq);
        return zzes.zzc(zzfuVar.zzM(), zzd, zzq);
    }
}
