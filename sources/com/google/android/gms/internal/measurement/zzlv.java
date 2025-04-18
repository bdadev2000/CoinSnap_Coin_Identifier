package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzlv<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzmb zze;
    private Map<K, V> zzf;

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (!this.zzd) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zza((zzlv<K, V>) comparable) < 0 && !this.zzc.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzmb(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlv)) {
            return super.equals(obj);
        }
        zzlv zzlvVar = (zzlv) obj;
        int size = size();
        if (size != zzlvVar.size()) {
            return false;
        }
        int i10 = this.zzb;
        if (i10 != zzlvVar.zzb) {
            return entrySet().equals(zzlvVar.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!zza(i11).equals(zzlvVar.zza(i11))) {
                return false;
            }
        }
        if (i10 == size) {
            return true;
        }
        return this.zzc.equals(zzlvVar.zzc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzlv<K, V>) comparable);
        if (zza >= 0) {
            return (V) ((zzlz) this.zza[zza]).getValue();
        }
        return this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i10 = this.zzb;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += this.zza[i12].hashCode();
        }
        if (this.zzc.size() > 0) {
            return i11 + this.zzc.hashCode();
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzlv<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzlv<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzb(zza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzc.size() + this.zzb;
    }

    private zzlv() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        if (this.zzc.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzc.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzc() {
        return new zzma(this);
    }

    public void zzd() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzd) {
            return;
        }
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

    public final boolean zze() {
        return this.zzd;
    }

    private final int zza(K k10) {
        int i10 = this.zzb - 1;
        if (i10 >= 0) {
            int compareTo = k10.compareTo((Comparable) ((zzlz) this.zza[i10]).getKey());
            if (compareTo > 0) {
                return -(i10 + 2);
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = k10.compareTo((Comparable) ((zzlz) this.zza[i12]).getKey());
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i10) {
        zzg();
        V v10 = (V) ((zzlz) this.zza[i10]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.zzb - i10) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzlz(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v10;
    }

    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k10, V v10) {
        zzg();
        int zza = zza((zzlv<K, V>) k10);
        if (zza >= 0) {
            return (V) ((zzlz) this.zza[zza]).setValue(v10);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i10 = -(zza + 1);
        if (i10 >= 16) {
            return zzf().put(k10, v10);
        }
        int i11 = this.zzb;
        if (i11 == 16) {
            zzlz zzlzVar = (zzlz) this.zza[15];
            this.zzb = i11 - 1;
            zzf().put((Comparable) zzlzVar.getKey(), zzlzVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i10, objArr, i10 + 1, (objArr.length - i10) - 1);
        this.zza[i10] = new zzlz(this, k10, v10);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i10) {
        if (i10 < this.zzb) {
            return (zzlz) this.zza[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }
}
