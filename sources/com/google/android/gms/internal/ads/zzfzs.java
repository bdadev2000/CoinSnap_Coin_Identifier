package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzfzs extends zzfzh {
    Object[] zzd;
    private int zze;

    public zzfzs() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfzh, com.google.android.gms.internal.ads.zzfzi
    public final /* bridge */ /* synthetic */ zzfzi zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfzs zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzfzt.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfzg.zza(hashCode);
                while (true) {
                    int i10 = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i10];
                    if (obj2 == null) {
                        objArr2[i10] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                    if (obj2.equals(obj)) {
                        break;
                    }
                    zza = i10 + 1;
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzfzs zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                zzf(objArr[i10]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    public final zzfzs zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfzt zzi() {
        zzfzt zzv;
        boolean zzw;
        int i10 = this.zzb;
        if (i10 != 0) {
            if (i10 != 1) {
                if (this.zzd != null && zzfzt.zzh(i10) == this.zzd.length) {
                    int i11 = this.zzb;
                    Object[] objArr = this.zza;
                    zzw = zzfzt.zzw(i11, objArr.length);
                    if (zzw) {
                        objArr = Arrays.copyOf(objArr, i11);
                    }
                    zzv = new zzgbg(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
                } else {
                    zzv = zzfzt.zzv(this.zzb, this.zza);
                    this.zzb = zzv.size();
                }
                this.zzc = true;
                this.zzd = null;
                return zzv;
            }
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgbr(obj);
        }
        return zzgbg.zza;
    }

    public zzfzs(int i10, boolean z10) {
        super(i10);
        this.zzd = new Object[zzfzt.zzh(i10)];
    }
}
