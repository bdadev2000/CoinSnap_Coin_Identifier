package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdh extends zzde {
    static final zzdh zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzdh(objArr, 0, objArr, 0, 0);
    }

    public zzdh(Object[] objArr, int i9, Object[] objArr2, int i10, int i11) {
        this.zzb = objArr;
        this.zze = i9;
        this.zzc = objArr2;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int zza2 = zzcz.zza(obj.hashCode());
                while (true) {
                    int i9 = zza2 & this.zzf;
                    Object obj2 = objArr[i9];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    zza2 = i9 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, com.google.android.gms.internal.consent_sdk.zzda, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    public final int zza(Object[] objArr, int i9) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, com.google.android.gms.internal.consent_sdk.zzda
    /* renamed from: zzd */
    public final zzdj iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    public final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde
    public final zzdd zzh() {
        return zzdd.zzg(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde
    public final boolean zzk() {
        return true;
    }
}
