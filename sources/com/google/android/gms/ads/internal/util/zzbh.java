package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
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
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = ((Double) list.get(i2)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        zzbh zzbhVar = this;
        ArrayList arrayList = new ArrayList(zzbhVar.zza.length);
        int i2 = 0;
        while (true) {
            String[] strArr = zzbhVar.zza;
            if (i2 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i2];
            double[] dArr = zzbhVar.zzc;
            double[] dArr2 = zzbhVar.zzb;
            int[] iArr = zzbhVar.zzd;
            double d = dArr[i2];
            double d2 = dArr2[i2];
            int i3 = iArr[i2];
            arrayList.add(new zzbe(str, d, d2, i3 / zzbhVar.zze, i3));
            i2++;
            zzbhVar = this;
        }
    }

    public final void zzb(double d) {
        this.zze++;
        int i2 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i2 >= dArr.length) {
                return;
            }
            double d2 = dArr[i2];
            if (d2 <= d && d < this.zzb[i2]) {
                int[] iArr = this.zzd;
                iArr[i2] = iArr[i2] + 1;
            }
            if (d < d2) {
                return;
            } else {
                i2++;
            }
        }
    }
}
