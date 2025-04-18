package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzgaz {
    Object[] zza;
    int zzb;
    zzgay zzc;

    public zzgaz() {
        this(4);
    }

    private final void zzd(int i2) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i3 = i2 + i2;
        if (i3 > length) {
            this.zza = Arrays.copyOf(objArr, zzgar.zze(length, i3));
        }
    }

    public final zzgaz zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfzu.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + i2;
        objArr[i3] = obj;
        objArr[i3 + 1] = obj2;
        this.zzb = i2 + 1;
        return this;
    }

    public final zzgaz zzb(Iterable iterable) {
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

    public final zzgba zzc() {
        zzgay zzgayVar = this.zzc;
        if (zzgayVar != null) {
            throw zzgayVar.zza();
        }
        zzgco zzj = zzgco.zzj(this.zzb, this.zza, this);
        zzgay zzgayVar2 = this.zzc;
        if (zzgayVar2 == null) {
            return zzj;
        }
        throw zzgayVar2.zza();
    }

    public zzgaz(int i2) {
        this.zza = new Object[i2 + i2];
        this.zzb = 0;
    }
}
