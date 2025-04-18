package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgoq extends zzghs {
    private final zzgqs zza;

    public zzgoq(zzgqs zzgqsVar) {
        this.zza = zzgqsVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoq)) {
            return false;
        }
        zzgqs zzgqsVar = ((zzgoq) obj).zza;
        return this.zza.zzc().zzg().equals(zzgqsVar.zzc().zzg()) && this.zza.zzc().zzi().equals(zzgqsVar.zzc().zzi()) && this.zza.zzc().zzh().equals(zzgqsVar.zzc().zzh());
    }

    public final int hashCode() {
        zzgqs zzgqsVar = this.zza;
        return Objects.hash(zzgqsVar.zzc(), zzgqsVar.zzd());
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzc().zzi();
        int ordinal = this.zza.zzc().zzg().ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgxf.RAW;
    }

    public final zzgqs zzb() {
        return this.zza;
    }
}
