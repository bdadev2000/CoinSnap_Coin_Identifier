package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes4.dex */
public abstract class zzgba implements Map, Serializable {
    private transient zzgbc zza;
    private transient zzgbc zzb;
    private transient zzgas zzc;

    public static zzgba zzc(Map map) {
        Set entrySet = map.entrySet();
        zzgaz zzgazVar = new zzgaz(entrySet instanceof Collection ? entrySet.size() : 4);
        zzgazVar.zzb(entrySet);
        return zzgazVar.zzc();
    }

    public static zzgba zzd() {
        return zzgco.zza;
    }

    public static zzgba zze(Object obj, Object obj2) {
        zzfzu.zzb("dialog_not_shown_reason", obj2);
        return zzgco.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgbu.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgcz.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfzu.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z2 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(SignatureVisitor.INSTANCEOF);
            sb.append(entry.getValue());
            z2 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzgas zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzgas values() {
        zzgas zzgasVar = this.zzc;
        if (zzgasVar != null) {
            return zzgasVar;
        }
        zzgas zza = zza();
        this.zzc = zza;
        return zza;
    }

    public abstract zzgbc zzf();

    public abstract zzgbc zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgbc entrySet() {
        zzgbc zzgbcVar = this.zza;
        if (zzgbcVar != null) {
            return zzgbcVar;
        }
        zzgbc zzf = zzf();
        this.zza = zzf;
        return zzf;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzgbc keySet() {
        zzgbc zzgbcVar = this.zzb;
        if (zzgbcVar != null) {
            return zzgbcVar;
        }
        zzgbc zzg = zzg();
        this.zzb = zzg;
        return zzg;
    }
}
