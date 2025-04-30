package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class zzaan {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaaj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzaam) obj).zza - ((zzaam) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaak
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzaam) obj).zzc, ((zzaam) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzaam[] zzd = new zzaam[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzaan(int i9) {
    }

    public final float zza(float f9) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f10 = this.zzg;
        int i9 = 0;
        for (int i10 = 0; i10 < this.zzc.size(); i10++) {
            float f11 = 0.5f * f10;
            zzaam zzaamVar = (zzaam) this.zzc.get(i10);
            i9 += zzaamVar.zzb;
            if (i9 >= f11) {
                return zzaamVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzaam) this.zzc.get(r6.size() - 1)).zzc;
    }

    public final void zzb(int i9, float f9) {
        zzaam zzaamVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i10 = this.zzh;
        if (i10 > 0) {
            zzaam[] zzaamVarArr = this.zzd;
            int i11 = i10 - 1;
            this.zzh = i11;
            zzaamVar = zzaamVarArr[i11];
        } else {
            zzaamVar = new zzaam(null);
        }
        int i12 = this.zzf;
        this.zzf = i12 + 1;
        zzaamVar.zza = i12;
        zzaamVar.zzb = i9;
        zzaamVar.zzc = f9;
        this.zzc.add(zzaamVar);
        this.zzg += i9;
        while (true) {
            int i13 = this.zzg;
            if (i13 > 2000) {
                int i14 = i13 - 2000;
                zzaam zzaamVar2 = (zzaam) this.zzc.get(0);
                int i15 = zzaamVar2.zzb;
                if (i15 <= i14) {
                    this.zzg -= i15;
                    this.zzc.remove(0);
                    int i16 = this.zzh;
                    if (i16 < 5) {
                        zzaam[] zzaamVarArr2 = this.zzd;
                        this.zzh = i16 + 1;
                        zzaamVarArr2[i16] = zzaamVar2;
                    }
                } else {
                    zzaamVar2.zzb = i15 - i14;
                    this.zzg -= i14;
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
