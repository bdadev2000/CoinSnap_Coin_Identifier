package com.google.android.gms.internal.measurement;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlz implements Comparable, Map.Entry {
    private final Comparable zza;
    private Object zzb;
    private final /* synthetic */ zzlv zzc;

    public zzlz(zzlv zzlvVar, Map.Entry entry) {
        this(zzlvVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzlz) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zza(this.zza, entry.getKey()) && zza(this.zzb, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zza;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzb;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zzc.zzg();
        Object obj2 = this.zzb;
        this.zzb = obj;
        return obj2;
    }

    public final String toString() {
        return a.m(String.valueOf(this.zza), "=", String.valueOf(this.zzb));
    }

    public zzlz(zzlv zzlvVar, Comparable comparable, Object obj) {
        this.zzc = zzlvVar;
        this.zza = comparable;
        this.zzb = obj;
    }
}
