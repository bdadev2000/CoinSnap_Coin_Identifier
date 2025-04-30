package com.google.android.gms.internal.ads;

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
public class zzhem extends AbstractMap {
    private final int zza;
    private boolean zzd;
    private volatile zzhek zze;
    private List zzb = Collections.emptyList();
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    private final int zzk(Comparable comparable) {
        int size = this.zzb.size();
        int i9 = size - 1;
        int i10 = 0;
        if (i9 >= 0) {
            int compareTo = comparable.compareTo(((zzheg) this.zzb.get(i9)).zza());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i9;
            }
        }
        while (i10 <= i9) {
            int i11 = (i10 + i9) / 2;
            int compareTo2 = comparable.compareTo(((zzheg) this.zzb.get(i11)).zza());
            if (compareTo2 < 0) {
                i9 = i11 - 1;
            } else if (compareTo2 > 0) {
                i10 = i11 + 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzl(int i9) {
        zzn();
        Object value = ((zzheg) this.zzb.remove(i9)).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator it = zzm().entrySet().iterator();
            List list = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzheg(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        if (!this.zzd) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zzk(comparable) < 0 && !this.zzc.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzhek(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhem)) {
            return super.equals(obj);
        }
        zzhem zzhemVar = (zzhem) obj;
        int size = size();
        if (size != zzhemVar.size()) {
            return false;
        }
        int zzb = zzb();
        if (zzb == zzhemVar.zzb()) {
            for (int i9 = 0; i9 < zzb; i9++) {
                if (!zzg(i9).equals(zzhemVar.zzg(i9))) {
                    return false;
                }
            }
            if (zzb == size) {
                return true;
            }
            return this.zzc.equals(zzhemVar.zzc);
        }
        return entrySet().equals(zzhemVar.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((zzheg) this.zzb.get(zzk)).getValue();
        }
        return this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int zzb = zzb();
        int i9 = 0;
        for (int i10 = 0; i10 < zzb; i10++) {
            i9 += ((zzheg) this.zzb.get(i10)).hashCode();
        }
        if (this.zzc.size() > 0) {
            return this.zzc.hashCode() + i9;
        }
        return i9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return zzl(zzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb.size();
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

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable zzc() {
        if (this.zzc.isEmpty()) {
            return zzhef.zza();
        }
        return this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzn();
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((zzheg) this.zzb.get(zzk)).setValue(obj);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i9 = -(zzk + 1);
        if (i9 >= this.zza) {
            return zzm().put(comparable, obj);
        }
        int size = this.zzb.size();
        int i10 = this.zza;
        if (size == i10) {
            zzheg zzhegVar = (zzheg) this.zzb.remove(i10 - 1);
            zzm().put(zzhegVar.zza(), zzhegVar.getValue());
        }
        this.zzb.add(i9, new zzheg(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzg(int i9) {
        return (Map.Entry) this.zzb.get(i9);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
