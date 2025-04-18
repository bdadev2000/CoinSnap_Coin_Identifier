package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzacf {
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

    private zzacf(List list, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f2, @Nullable String str) {
        this.zza = list;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzh = i8;
        this.zzi = i9;
        this.zzj = i10;
        this.zzk = f2;
        this.zzl = str;
    }

    public static zzacf zza(zzek zzekVar) throws zzbo {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str;
        float f2;
        try {
            zzekVar.zzM(4);
            int zzm = zzekVar.zzm() & 3;
            int i10 = zzm + 1;
            if (i10 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzm2 = zzekVar.zzm() & 31;
            for (int i11 = 0; i11 < zzm2; i11++) {
                arrayList.add(zzb(zzekVar));
            }
            int zzm3 = zzekVar.zzm();
            for (int i12 = 0; i12 < zzm3; i12++) {
                arrayList.add(zzb(zzekVar));
            }
            if (zzm2 > 0) {
                zzfr zzf = zzfs.zzf((byte[]) arrayList.get(0), zzm + 2, ((byte[]) arrayList.get(0)).length);
                int i13 = zzf.zze;
                int i14 = zzf.zzf;
                int i15 = zzf.zzh + 8;
                int i16 = zzf.zzi + 8;
                int i17 = zzf.zzj;
                int i18 = zzf.zzk;
                int i19 = zzf.zzl;
                int i20 = zzf.zzm;
                float f3 = zzf.zzg;
                str = zzdk.zza(zzf.zza, zzf.zzb, zzf.zzc);
                i8 = i19;
                i9 = i20;
                f2 = f3;
                i5 = i16;
                i6 = i17;
                i7 = i18;
                i2 = i13;
                i3 = i14;
                i4 = i15;
            } else {
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = 16;
                str = null;
                f2 = 1.0f;
            }
            return new zzacf(arrayList, i10, i2, i3, i4, i5, i6, i7, i8, i9, f2, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbo.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzek zzekVar) {
        int zzq = zzekVar.zzq();
        int zzd = zzekVar.zzd();
        zzekVar.zzM(zzq);
        return zzdk.zzc(zzekVar.zzN(), zzd, zzq);
    }
}
