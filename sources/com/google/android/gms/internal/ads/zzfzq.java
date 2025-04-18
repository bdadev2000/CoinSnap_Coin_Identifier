package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzfzq {
    Object[] zza;
    int zzb;
    zzfzp zzc;

    public zzfzq() {
        this(4);
    }

    private final void zzd(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzfzi.zze(length, i11));
        }
    }

    public final zzfzq zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfyl.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    public final zzfzq zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfzr zzc() {
        zzfzp zzfzpVar = this.zzc;
        if (zzfzpVar == null) {
            zzgbf zzj = zzgbf.zzj(this.zzb, this.zza, this);
            zzfzp zzfzpVar2 = this.zzc;
            if (zzfzpVar2 == null) {
                return zzj;
            }
            throw zzfzpVar2.zza();
        }
        throw zzfzpVar.zza();
    }

    public zzfzq(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }
}
