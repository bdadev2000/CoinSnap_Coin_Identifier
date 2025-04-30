package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgcu extends zzgbh {
    static final zzgcu zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzgcu(objArr, 0, objArr, 0, 0);
    }

    public zzgcu(Object[] objArr, int i9, Object[] objArr2, int i10, int i11) {
        this.zzb = objArr;
        this.zze = i9;
        this.zzc = objArr2;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int zzb = zzgau.zzb(obj);
                while (true) {
                    int i9 = zzb & this.zzf;
                    Object obj2 = objArr[i9];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    zzb = i9 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgbh, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgbh, com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final int zza(Object[] objArr, int i9) {
        System.arraycopy(this.zzb, 0, objArr, i9, this.zzg);
        return i9 + this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgbh, com.google.android.gms.internal.ads.zzgax
    /* renamed from: zze */
    public final zzgdi iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final zzgbc zzi() {
        return zzgbc.zzj(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final boolean zzu() {
        return true;
    }
}
