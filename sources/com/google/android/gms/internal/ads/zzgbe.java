package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgbe {
    Object[] zza;
    int zzb;
    zzgbd zzc;

    public zzgbe() {
        this(4);
    }

    private final void zzd(int i9) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i9 + i9;
        if (i10 > length) {
            this.zza = Arrays.copyOf(objArr, zzgaw.zze(length, i10));
        }
    }

    public final zzgbe zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfzz.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i9 = this.zzb;
        int i10 = i9 + i9;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        this.zzb = i9 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzgbe zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(iterable.size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgbf zzc() {
        zzgbd zzgbdVar = this.zzc;
        if (zzgbdVar == null) {
            zzgct zzj = zzgct.zzj(this.zzb, this.zza, this);
            zzgbd zzgbdVar2 = this.zzc;
            if (zzgbdVar2 == null) {
                return zzj;
            }
            throw zzgbdVar2.zza();
        }
        throw zzgbdVar.zza();
    }

    public zzgbe(int i9) {
        this.zza = new Object[i9 + i9];
        this.zzb = 0;
    }
}
