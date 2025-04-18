package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgoo {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgoo(Class cls, Class cls2, zzgop zzgopVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoo)) {
            return false;
        }
        zzgoo zzgooVar = (zzgoo) obj;
        if (!zzgooVar.zza.equals(this.zza) || !zzgooVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
