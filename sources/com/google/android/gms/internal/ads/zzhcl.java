package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzhcl extends zzgzl implements RandomAccess, zzhcm {

    @Deprecated
    public static final zzhcm zza;
    private static final zzhcl zzb;
    private final List zzc;

    static {
        zzhcl zzhclVar = new zzhcl(false);
        zzb = zzhclVar;
        zza = zzhclVar;
    }

    public zzhcl() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzhac) {
            return ((zzhac) obj).zzx(zzhcb.zzb);
        }
        return zzhcb.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        zzdJ();
        this.zzc.add(i9, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        zzdJ();
        if (collection instanceof zzhcm) {
            collection = ((zzhcm) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i9, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzdJ();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zzdJ();
        Object remove = this.zzc.remove(i9);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        zzdJ();
        return zzj(this.zzc.set(i9, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final zzhcm zzd() {
        if (zzc()) {
            return new zzhev(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final Object zze(int i9) {
        return this.zzc.get(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final /* bridge */ /* synthetic */ zzhca zzf(int i9) {
        if (i9 >= size()) {
            ArrayList arrayList = new ArrayList(i9);
            arrayList.addAll(this.zzc);
            return new zzhcl(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i9) {
        Object obj = this.zzc.get(i9);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzhac) {
            zzhac zzhacVar = (zzhac) obj;
            String zzx = zzhacVar.zzx(zzhcb.zzb);
            if (zzhacVar.zzp()) {
                this.zzc.set(i9, zzx);
            }
            return zzx;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzhcb.zzd(bArr);
        if (zzhff.zzi(bArr)) {
            this.zzc.set(i9, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final void zzi(zzhac zzhacVar) {
        zzdJ();
        this.zzc.add(zzhacVar);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhcl(int i9) {
        super(true);
        ArrayList arrayList = new ArrayList(i9);
        this.zzc = arrayList;
    }

    private zzhcl(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzhcl(boolean z8) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
