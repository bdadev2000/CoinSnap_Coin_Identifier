package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgna extends zzggj {
    private final zzgox zza;

    public zzgna(zzgox zzgoxVar) {
        this.zza = zzgoxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgna)) {
            return false;
        }
        zzgox zzgoxVar = ((zzgna) obj).zza;
        if (!this.zza.zzc().zzg().equals(zzgoxVar.zzc().zzg()) || !this.zza.zzc().zzi().equals(zzgoxVar.zzc().zzi()) || !this.zza.zzc().zzh().equals(zzgoxVar.zzc().zzh())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzgox zzgoxVar = this.zza;
        return Objects.hash(zzgoxVar.zzc(), zzgoxVar.zzd());
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzc().zzi();
        int ordinal = this.zza.zzc().zzg().ordinal();
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
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgve.RAW;
    }

    public final zzgox zzb() {
        return this.zza;
    }
}
