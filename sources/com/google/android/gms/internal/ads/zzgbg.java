package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzgbg extends zzgav {
    Object[] zzd;
    private int zze;

    public zzgbg() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgav, com.google.android.gms.internal.ads.zzgaw
    public final /* bridge */ /* synthetic */ zzgaw zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgbg zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzgbh.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzgau.zza(hashCode);
                while (true) {
                    int i9 = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i9];
                    if (obj2 == null) {
                        objArr2[i9] = obj;
                        this.zze += hashCode;
                        zza(obj);
                        break;
                    }
                    if (obj2.equals(obj)) {
                        break;
                    }
                    zza = i9 + 1;
                }
                return this;
            }
        }
        this.zzd = null;
        zza(obj);
        return this;
    }

    public final zzgbg zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i9 = 0; i9 < 2; i9++) {
                zzf(objArr[i9]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    public final zzgbg zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            zzc(iterable);
        }
        return this;
    }

    public final zzgbh zzi() {
        zzgbh zzv;
        boolean zzw;
        int i9 = this.zzb;
        if (i9 != 0) {
            if (i9 != 1) {
                if (this.zzd != null && zzgbh.zzh(i9) == this.zzd.length) {
                    int i10 = this.zzb;
                    Object[] objArr = this.zza;
                    zzw = zzgbh.zzw(i10, objArr.length);
                    if (zzw) {
                        objArr = Arrays.copyOf(objArr, i10);
                    }
                    zzv = new zzgcu(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
                } else {
                    zzv = zzgbh.zzv(this.zzb, this.zza);
                    this.zzb = zzv.size();
                }
                this.zzc = true;
                this.zzd = null;
                return zzv;
            }
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgdf(obj);
        }
        return zzgcu.zza;
    }

    public zzgbg(int i9) {
        super(i9);
        this.zzd = new Object[zzgbh.zzh(i9)];
    }
}
