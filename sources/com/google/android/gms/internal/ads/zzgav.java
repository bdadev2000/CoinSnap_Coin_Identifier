package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
class zzgav extends zzgaw {
    Object[] zza;
    int zzb = 0;
    boolean zzc;

    public zzgav(int i9) {
        this.zza = new Object[i9];
    }

    private final void zzf(int i9) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i9) {
            this.zza = Arrays.copyOf(objArr, zzgaw.zze(length, i9));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzgav zza(Object obj) {
        obj.getClass();
        zzf(this.zzb + 1);
        Object[] objArr = this.zza;
        int i9 = this.zzb;
        this.zzb = i9 + 1;
        objArr[i9] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    public /* bridge */ /* synthetic */ zzgaw zzb(Object obj) {
        throw null;
    }

    public final zzgaw zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size() + this.zzb);
            if (collection instanceof zzgax) {
                this.zzb = ((zzgax) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }

    public final void zzd(Object[] objArr, int i9) {
        zzgcm.zzb(objArr, 2);
        zzf(this.zzb + 2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }
}
