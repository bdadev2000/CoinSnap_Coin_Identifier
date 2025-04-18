package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzabv {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;

    @Nullable
    public final String zzl;

    private zzabv(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, @Nullable String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = i17;
        this.zzj = i18;
        this.zzk = f10;
        this.zzl = str;
    }

    public static zzabv zza(zzed zzedVar) throws zzbh {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str;
        float f10;
        try {
            zzedVar.zzM(4);
            int zzm = (zzedVar.zzm() & 3) + 1;
            if (zzm != 3) {
                ArrayList arrayList = new ArrayList();
                int zzm2 = zzedVar.zzm() & 31;
                for (int i18 = 0; i18 < zzm2; i18++) {
                    arrayList.add(zzb(zzedVar));
                }
                int zzm3 = zzedVar.zzm();
                for (int i19 = 0; i19 < zzm3; i19++) {
                    arrayList.add(zzb(zzedVar));
                }
                if (zzm2 > 0) {
                    zzfo zzf = zzfp.zzf((byte[]) arrayList.get(0), zzm + 1, ((byte[]) arrayList.get(0)).length);
                    int i20 = zzf.zze;
                    int i21 = zzf.zzf;
                    int i22 = zzf.zzh + 8;
                    int i23 = zzf.zzi + 8;
                    int i24 = zzf.zzj;
                    int i25 = zzf.zzk;
                    int i26 = zzf.zzl;
                    int i27 = zzf.zzm;
                    float f11 = zzf.zzg;
                    str = zzdd.zzc(zzf.zza, zzf.zzb, zzf.zzc);
                    i16 = i26;
                    i17 = i27;
                    f10 = f11;
                    i13 = i23;
                    i14 = i24;
                    i15 = i25;
                    i10 = i20;
                    i11 = i21;
                    i12 = i22;
                } else {
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    i15 = -1;
                    i16 = -1;
                    i17 = 16;
                    str = null;
                    f10 = 1.0f;
                }
                return new zzabv(arrayList, zzm, i10, i11, i12, i13, i14, i15, i16, i17, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw zzbh.zza("Error parsing AVC config", e2);
        }
    }

    private static byte[] zzb(zzed zzedVar) {
        int zzq = zzedVar.zzq();
        int zzd = zzedVar.zzd();
        zzedVar.zzM(zzq);
        return zzdd.zze(zzedVar.zzN(), zzd, zzq);
    }
}
