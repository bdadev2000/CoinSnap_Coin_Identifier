package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzlm<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private List<zzls> zza;
    private Map<K, V> zzb;
    private boolean zzc;
    private volatile zzlx zzd;
    private Map<K, V> zze;
    private volatile zzlq zzf;

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzb.isEmpty() && !(this.zzb instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzb = treeMap;
            this.zze = treeMap.descendingMap();
        }
        return (SortedMap) this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (!this.zzc) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (!this.zza.isEmpty()) {
            this.zza.clear();
        }
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zza((zzlm<K, V>) comparable) < 0 && !this.zzb.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzd == null) {
            this.zzd = new zzlx(this);
        }
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlm)) {
            return super.equals(obj);
        }
        zzlm zzlmVar = (zzlm) obj;
        int size = size();
        if (size != zzlmVar.size()) {
            return false;
        }
        int zza = zza();
        if (zza != zzlmVar.zza()) {
            return entrySet().equals(zzlmVar.entrySet());
        }
        for (int i9 = 0; i9 < zza; i9++) {
            if (!zza(i9).equals(zzlmVar.zza(i9))) {
                return false;
            }
        }
        if (zza == size) {
            return true;
        }
        return this.zzb.equals(zzlmVar.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzlm<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zza.get(zza).getValue();
        }
        return this.zzb.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zza = zza();
        int i9 = 0;
        for (int i10 = 0; i10 < zza; i10++) {
            i9 += this.zza.get(i10).hashCode();
        }
        if (this.zzb.size() > 0) {
            return i9 + this.zzb.hashCode();
        }
        return i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzlm<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzlm<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzb(zza);
        }
        if (this.zzb.isEmpty()) {
            return null;
        }
        return this.zzb.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb.size() + this.zza.size();
    }

    public final boolean zze() {
        return this.zzc;
    }

    private zzlm() {
        this.zza = Collections.emptyList();
        this.zzb = Collections.emptyMap();
        this.zze = Collections.emptyMap();
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        if (this.zzb.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzb.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzc() {
        if (this.zzf == null) {
            this.zzf = new zzlq(this);
        }
        return this.zzf;
    }

    public void zzd() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzc) {
            return;
        }
        if (this.zzb.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzb);
        }
        this.zzb = unmodifiableMap;
        if (this.zze.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zze);
        }
        this.zze = unmodifiableMap2;
        this.zzc = true;
    }

    private final int zza(K k6) {
        int i9;
        int size = this.zza.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = k6.compareTo((Comparable) this.zza.get(i10).getKey());
            if (compareTo > 0) {
                i9 = size + 1;
                return -i9;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = k6.compareTo((Comparable) this.zza.get(i12).getKey());
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        i9 = i11 + 1;
        return -i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i9) {
        zzg();
        V v6 = (V) this.zza.remove(i9).getValue();
        if (!this.zzb.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza.add(new zzls(this, it.next()));
            it.remove();
        }
        return v6;
    }

    public final int zza() {
        return this.zza.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k6, V v6) {
        zzg();
        int zza = zza((zzlm<K, V>) k6);
        if (zza >= 0) {
            return (V) this.zza.get(zza).setValue(v6);
        }
        zzg();
        if (this.zza.isEmpty() && !(this.zza instanceof ArrayList)) {
            this.zza = new ArrayList(16);
        }
        int i9 = -(zza + 1);
        if (i9 >= 16) {
            return zzf().put(k6, v6);
        }
        if (this.zza.size() == 16) {
            zzls remove = this.zza.remove(15);
            zzf().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.zza.add(i9, new zzls(this, k6, v6));
        return null;
    }

    public final Map.Entry<K, V> zza(int i9) {
        return this.zza.get(i9);
    }
}
