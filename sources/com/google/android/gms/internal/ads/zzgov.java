package com.google.android.gms.internal.ads;

import Q7.n0;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzgov extends zzghx {
    private final zzgqm zza;

    public zzgov(zzgqm zzgqmVar) {
        this.zza = zzgqmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgov)) {
            return false;
        }
        zzgqm zzgqmVar = ((zzgov) obj).zza;
        if (!this.zza.zzc().zzg().equals(zzgqmVar.zzc().zzg()) || !this.zza.zzc().zzi().equals(zzgqmVar.zzc().zzi()) || !this.zza.zzc().zzh().equals(zzgqmVar.zzc().zzh())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzgqm zzgqmVar = this.zza;
        return Objects.hash(zzgqmVar.zzc(), zzgqmVar.zzd());
    }

    public final String toString() {
        String str;
        String zzi = this.zza.zzc().zzi();
        zzgxn zzg = this.zza.zzc().zzg();
        zzgxn zzgxnVar = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzg.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        return n0.j("(typeUrl=", zzi, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        if (this.zza.zzc().zzg() != zzgxn.RAW) {
            return true;
        }
        return false;
    }

    public final zzgqm zzb() {
        return this.zza;
    }
}
