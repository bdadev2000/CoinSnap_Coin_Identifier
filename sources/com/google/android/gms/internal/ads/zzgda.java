package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgda extends zzgbc {
    final transient Object zza;

    public zzgda(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgbg(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return androidx.compose.foundation.text.input.a.A("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zza(Object[] objArr, int i2) {
        objArr[i2] = this.zza;
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas
    public final zzgax zzd() {
        return zzgax.zzo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas
    /* renamed from: zze */
    public final zzgdd iterator() {
        return new zzgbg(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final boolean zzf() {
        return false;
    }
}
