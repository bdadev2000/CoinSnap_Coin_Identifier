package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzgtr {
    private final zzgtk zza;
    private final List zzb;
    private final Integer zzc;

    public /* synthetic */ zzgtr(zzgtk zzgtkVar, List list, Integer num, zzgtq zzgtqVar) {
        this.zza = zzgtkVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgtr)) {
            return false;
        }
        zzgtr zzgtrVar = (zzgtr) obj;
        if (!this.zza.equals(zzgtrVar.zza) || !this.zzb.equals(zzgtrVar.zzb) || !Objects.equals(this.zzc, zzgtrVar.zzc)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
