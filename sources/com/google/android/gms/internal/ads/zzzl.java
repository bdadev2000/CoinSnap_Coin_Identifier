package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class zzzl {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzzj) obj).zza - ((zzzj) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzzj) obj).zzc, ((zzzj) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzzj[] zzd = new zzzj[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzzl(int i10) {
    }

    public final float zza(float f10) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.size(); i11++) {
            float f12 = 0.5f * f11;
            zzzj zzzjVar = (zzzj) this.zzc.get(i11);
            i10 += zzzjVar.zzb;
            if (i10 >= f12) {
                return zzzjVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzzj) this.zzc.get(r6.size() - 1)).zzc;
    }

    public final void zzb(int i10, float f10) {
        zzzj zzzjVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzzj[] zzzjVarArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzzjVar = zzzjVarArr[i12];
        } else {
            zzzjVar = new zzzj(null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzzjVar.zza = i13;
        zzzjVar.zzb = i10;
        zzzjVar.zzc = f10;
        this.zzc.add(zzzjVar);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 > 2000) {
                int i15 = i14 - 2000;
                zzzj zzzjVar2 = (zzzj) this.zzc.get(0);
                int i16 = zzzjVar2.zzb;
                if (i16 <= i15) {
                    this.zzg -= i16;
                    this.zzc.remove(0);
                    int i17 = this.zzh;
                    if (i17 < 5) {
                        zzzj[] zzzjVarArr2 = this.zzd;
                        this.zzh = i17 + 1;
                        zzzjVarArr2[i17] = zzzjVar2;
                    }
                } else {
                    zzzjVar2.zzb = i16 - i15;
                    this.zzg -= i15;
                }
            } else {
                return;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
