package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class zzzt {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzp
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzzs) obj).zza - ((zzzs) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzq
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzzs) obj).zzc, ((zzzs) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzzs[] zzd = new zzzs[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzzt(int i2) {
    }

    public final float zza(float f2) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f3 = this.zzg;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.size(); i3++) {
            float f4 = 0.5f * f3;
            zzzs zzzsVar = (zzzs) this.zzc.get(i3);
            i2 += zzzsVar.zzb;
            if (i2 >= f4) {
                return zzzsVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzzs) this.zzc.get(r6.size() - 1)).zzc;
    }

    public final void zzb(int i2, float f2) {
        zzzs zzzsVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i3 = this.zzh;
        if (i3 > 0) {
            zzzs[] zzzsVarArr = this.zzd;
            int i4 = i3 - 1;
            this.zzh = i4;
            zzzsVar = zzzsVarArr[i4];
        } else {
            zzzsVar = new zzzs(null);
        }
        int i5 = this.zzf;
        this.zzf = i5 + 1;
        zzzsVar.zza = i5;
        zzzsVar.zzb = i2;
        zzzsVar.zzc = f2;
        this.zzc.add(zzzsVar);
        this.zzg += i2;
        while (true) {
            int i6 = this.zzg;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            zzzs zzzsVar2 = (zzzs) this.zzc.get(0);
            int i8 = zzzsVar2.zzb;
            if (i8 <= i7) {
                this.zzg -= i8;
                this.zzc.remove(0);
                int i9 = this.zzh;
                if (i9 < 5) {
                    zzzs[] zzzsVarArr2 = this.zzd;
                    this.zzh = i9 + 1;
                    zzzsVarArr2[i9] = zzzsVar2;
                }
            } else {
                zzzsVar2.zzb = i8 - i7;
                this.zzg -= i7;
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
