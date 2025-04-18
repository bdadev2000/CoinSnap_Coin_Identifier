package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzgbb extends zzgaq {
    Object[] zzd;
    private int zze;

    public zzgbb() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgaq, com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ zzgar zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgbb zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzgbc.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzgap.zza(hashCode);
                while (true) {
                    int i2 = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i2];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza = i2 + 1;
                    } else {
                        objArr2[i2] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzgbb zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i2 = 0; i2 < 2; i2++) {
                zzf(objArr[i2]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    public final zzgbb zzh(Iterable iterable) {
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

    public final zzgbc zzi() {
        zzgbc zzv;
        boolean zzw;
        int i2 = this.zzb;
        if (i2 == 0) {
            return zzgcp.zza;
        }
        if (i2 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgda(obj);
        }
        if (this.zzd == null || zzgbc.zzh(i2) != this.zzd.length) {
            zzv = zzgbc.zzv(this.zzb, this.zza);
            this.zzb = zzv.size();
        } else {
            int i3 = this.zzb;
            Object[] objArr = this.zza;
            zzw = zzgbc.zzw(i3, objArr.length);
            if (zzw) {
                objArr = Arrays.copyOf(objArr, i3);
            }
            zzv = new zzgcp(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzv;
    }

    public zzgbb(int i2) {
        super(i2);
        this.zzd = new Object[zzgbc.zzh(i2)];
    }
}
