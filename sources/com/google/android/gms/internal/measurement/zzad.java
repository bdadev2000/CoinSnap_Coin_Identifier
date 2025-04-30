package com.google.android.gms.internal.measurement;

import Q7.n0;
import d4.u;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzad {
    private static final u zza = u.j(3, "_syn", "_err", "_el");
    private String zzb;
    private long zzc;
    private Map<String, Object> zzd;

    public zzad(String str, long j7, Map<String, Object> map) {
        this.zzb = str;
        this.zzc = j7;
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new zzad(this.zzb, this.zzc, new HashMap(this.zzd));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        if (this.zzc != zzadVar.zzc || !this.zzb.equals(zzadVar.zzb)) {
            return false;
        }
        return this.zzd.equals(zzadVar.zzd);
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        long j7 = this.zzc;
        return this.zzd.hashCode() + ((hashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        long j7 = this.zzc;
        String valueOf = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j7);
        return n0.l(sb, ", params=", valueOf, "}");
    }

    public final long zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final Map<String, Object> zzc() {
        return this.zzd;
    }

    public final Object zza(String str) {
        if (this.zzd.containsKey(str)) {
            return this.zzd.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        this.zzb = str;
    }

    public static Object zza(String str, Object obj, Object obj2) {
        if (zza.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            return ((obj instanceof String) || obj == null) ? obj2 : obj;
        }
        if (obj instanceof Double) {
            return obj2;
        }
        if (obj instanceof Long) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        return obj instanceof String ? obj2.toString() : obj2;
    }

    public final void zza(String str, Object obj) {
        if (obj == null) {
            this.zzd.remove(str);
        } else {
            this.zzd.put(str, zza(str, this.zzd.get(str), obj));
        }
    }
}
