package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgpe {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgpe(Class cls, Class cls2, zzgpf zzgpfVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpe)) {
            return false;
        }
        zzgpe zzgpeVar = (zzgpe) obj;
        if (!zzgpeVar.zza.equals(this.zza) || !zzgpeVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
