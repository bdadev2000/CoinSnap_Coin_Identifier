package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgpd {
    private final Class zza;
    private final zzgwu zzb;

    public /* synthetic */ zzgpd(Class cls, zzgwu zzgwuVar, zzgpf zzgpfVar) {
        this.zza = cls;
        this.zzb = zzgwuVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpd)) {
            return false;
        }
        zzgpd zzgpdVar = (zzgpd) obj;
        if (!zzgpdVar.zza.equals(this.zza) || !zzgpdVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
