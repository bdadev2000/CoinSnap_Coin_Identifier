package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzfzh extends zzfzi {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzfzh(int i10) {
        zzfyl.zza(i10, "initialCapacity");
        this.zza = new Object[i10];
        this.zzb = 0;
    }

    private final void zzf(int i10) {
        int length = this.zza.length;
        int zze = zzfzi.zze(length, this.zzb + i10);
        if (zze <= length && !this.zzc) {
            return;
        }
        this.zza = Arrays.copyOf(this.zza, zze);
        this.zzc = false;
    }

    public final zzfzh zza(Object obj) {
        obj.getClass();
        zzf(1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    public /* bridge */ /* synthetic */ zzfzi zzb(Object obj) {
        throw null;
    }

    public final zzfzi zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size());
            if (collection instanceof zzfzj) {
                this.zzb = ((zzfzj) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }

    public final void zzd(Object[] objArr, int i10) {
        zzgay.zzb(objArr, 2);
        zzf(2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }
}
