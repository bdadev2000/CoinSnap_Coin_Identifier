package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class zzhbj extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private boolean zzd;
    private volatile zzhbh zze;
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    private zzhbj() {
    }

    public static /* bridge */ /* synthetic */ int zzb(zzhbj zzhbjVar) {
        return zzhbjVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Object zze(zzhbj zzhbjVar, int i10) {
        return zzhbjVar.zzm(i10);
    }

    public static /* bridge */ /* synthetic */ Map zzh(zzhbj zzhbjVar) {
        return zzhbjVar.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzhbj zzhbjVar) {
        zzhbjVar.zzo();
    }

    public static /* bridge */ /* synthetic */ Object[] zzk(zzhbj zzhbjVar) {
        return zzhbjVar.zza;
    }

    private final int zzl(Comparable comparable) {
        int i10 = this.zzb - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((zzhbf) this.zza[i10]).zza());
            if (compareTo > 0) {
                return -(i10 + 2);
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((zzhbf) this.zza[i12]).zza());
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else if (compareTo2 > 0) {
                i11 = i12 + 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public final Object zzm(int i10) {
        zzo();
        Object value = ((zzhbf) this.zza[i10]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.zzb - i10) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzn().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i11 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new zzhbf(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    public final void zzo() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zzl(comparable) < 0 && !this.zzc.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzhbh(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhbj)) {
            return super.equals(obj);
        }
        zzhbj zzhbjVar = (zzhbj) obj;
        int size = size();
        if (size != zzhbjVar.size()) {
            return false;
        }
        int i10 = this.zzb;
        if (i10 == zzhbjVar.zzb) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (!zzg(i11).equals(zzhbjVar.zzg(i11))) {
                    return false;
                }
            }
            if (i10 == size) {
                return true;
            }
            return this.zzc.equals(zzhbjVar.zzc);
        }
        return entrySet().equals(zzhbjVar.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zzhbf) this.zza[zzl]).getValue();
        }
        return this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += this.zza[i12].hashCode();
        }
        if (this.zzc.size() > 0) {
            return this.zzc.hashCode() + i11;
        }
        return i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzo();
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return zzm(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb;
    }

    public void zza() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.zzc);
            }
            this.zzc = unmodifiableMap;
            if (this.zzf.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.zzf);
            }
            this.zzf = unmodifiableMap2;
            this.zzd = true;
        }
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        if (this.zzc.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf */
    public final Object put(Comparable comparable, Object obj) {
        zzo();
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zzhbf) this.zza[zzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i10 = -(zzl + 1);
        if (i10 >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzhbf zzhbfVar = (zzhbf) this.zza[15];
            this.zzb = 15;
            zzn().put(zzhbfVar.zza(), zzhbfVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, (16 - i10) - 1);
        this.zza[i10] = new zzhbf(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zzg(int i10) {
        if (i10 < this.zzb) {
            return (zzhbf) this.zza[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    public /* synthetic */ zzhbj(zzhbi zzhbiVar) {
    }
}
