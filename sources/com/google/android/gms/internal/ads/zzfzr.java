package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public abstract class zzfzr implements Map, Serializable {
    private transient zzfzt zza;
    private transient zzfzt zzb;
    private transient zzfzj zzc;

    public static zzfzr zzc(Map map) {
        int i10;
        Set entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i10 = entrySet.size();
        } else {
            i10 = 4;
        }
        zzfzq zzfzqVar = new zzfzq(i10);
        zzfzqVar.zzb(entrySet);
        return zzfzqVar.zzc();
    }

    public static zzfzr zzd() {
        return zzgbf.zza;
    }

    public static zzfzr zze(Object obj, Object obj2) {
        zzfyl.zzb("dialog_not_shown_reason", obj2);
        return zzgbf.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
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
        return zzgal.zzb(this, obj);
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
        return zzgbq.zza(entrySet());
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
        zzfyl.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public abstract zzfzj zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfzj values() {
        zzfzj zzfzjVar = this.zzc;
        if (zzfzjVar != null) {
            return zzfzjVar;
        }
        zzfzj zza = zza();
        this.zzc = zza;
        return zza;
    }

    public abstract zzfzt zzf();

    public abstract zzfzt zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfzt entrySet() {
        zzfzt zzfztVar = this.zza;
        if (zzfztVar != null) {
            return zzfztVar;
        }
        zzfzt zzf = zzf();
        this.zza = zzf;
        return zzf;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzfzt keySet() {
        zzfzt zzfztVar = this.zzb;
        if (zzfztVar != null) {
            return zzfztVar;
        }
        zzfzt zzg = zzg();
        this.zzb = zzg;
        return zzg;
    }
}
