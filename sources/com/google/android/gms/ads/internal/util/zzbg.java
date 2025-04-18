package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbg {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbg(zzbe zzbeVar, zzbf zzbfVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbeVar.zzb;
        int size = list.size();
        list2 = zzbeVar.zza;
        this.zza = (String[]) list2.toArray(new String[size]);
        list3 = zzbeVar.zzb;
        this.zzb = zzc(list3);
        list4 = zzbeVar.zzc;
        this.zzc = zzc(list4);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        zzbg zzbgVar = this;
        ArrayList arrayList = new ArrayList(zzbgVar.zza.length);
        int i10 = 0;
        while (true) {
            String[] strArr = zzbgVar.zza;
            if (i10 < strArr.length) {
                String str = strArr[i10];
                double[] dArr = zzbgVar.zzc;
                double[] dArr2 = zzbgVar.zzb;
                int[] iArr = zzbgVar.zzd;
                double d10 = dArr[i10];
                double d11 = dArr2[i10];
                int i11 = iArr[i10];
                arrayList.add(new zzbd(str, d10, d11, i11 / zzbgVar.zze, i11));
                i10++;
                zzbgVar = this;
            } else {
                return arrayList;
            }
        }
    }

    public final void zzb(double d10) {
        this.zze++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i10 < dArr.length) {
                double d11 = dArr[i10];
                if (d11 <= d10 && d10 < this.zzb[i10]) {
                    int[] iArr = this.zzd;
                    iArr[i10] = iArr[i10] + 1;
                }
                if (d10 >= d11) {
                    i10++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
