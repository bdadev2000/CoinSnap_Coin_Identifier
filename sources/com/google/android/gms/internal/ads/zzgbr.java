package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgbr extends zzfzt {
    final transient Object zza;

    public zzgbr(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzfzj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfzx(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return e.f("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final int zza(Object[] objArr, int i10) {
        objArr[i10] = this.zza;
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzfzj
    public final zzfzo zzd() {
        return zzfzo.zzo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzfzj
    /* renamed from: zze */
    public final zzgbu iterator() {
        return new zzfzx(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final boolean zzf() {
        return false;
    }
}
