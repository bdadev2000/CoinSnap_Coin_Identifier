package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbh {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbh(zzbf zzbfVar, zzbg zzbgVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbfVar.zzb;
        int size = list.size();
        list2 = zzbfVar.zza;
        this.zza = (String[]) list2.toArray(new String[size]);
        list3 = zzbfVar.zzb;
        this.zzb = zzc(list3);
        list4 = zzbfVar.zzc;
        this.zzc = zzc(list4);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i9 = 0; i9 < size; i9++) {
            dArr[i9] = ((Double) list.get(i9)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        zzbh zzbhVar = this;
        ArrayList arrayList = new ArrayList(zzbhVar.zza.length);
        int i9 = 0;
        while (true) {
            String[] strArr = zzbhVar.zza;
            if (i9 < strArr.length) {
                String str = strArr[i9];
                double[] dArr = zzbhVar.zzc;
                double[] dArr2 = zzbhVar.zzb;
                int[] iArr = zzbhVar.zzd;
                double d2 = dArr[i9];
                double d9 = dArr2[i9];
                int i10 = iArr[i9];
                arrayList.add(new zzbe(str, d2, d9, i10 / zzbhVar.zze, i10));
                i9++;
                zzbhVar = this;
            } else {
                return arrayList;
            }
        }
    }

    public final void zzb(double d2) {
        this.zze++;
        int i9 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i9 < dArr.length) {
                double d9 = dArr[i9];
                if (d9 <= d2 && d2 < this.zzb[i9]) {
                    int[] iArr = this.zzd;
                    iArr[i9] = iArr[i9] + 1;
                }
                if (d2 >= d9) {
                    i9++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
