package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzag implements zzaq {
    private final boolean zza;

    public zzag(Boolean bool) {
        if (bool == null) {
            this.zza = false;
        } else {
            this.zza = bool.booleanValue();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzag) && this.zza == ((zzag) obj).zza) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.zza).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        if ("toString".equals(str)) {
            return new zzas(Boolean.toString(this.zza));
        }
        throw new IllegalArgumentException(AbstractC2914a.f(Boolean.toString(this.zza), ".", str, " is not a function."));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzag(Boolean.valueOf(this.zza));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        double d2;
        if (this.zza) {
            d2 = 1.0d;
        } else {
            d2 = 0.0d;
        }
        return Double.valueOf(d2);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return Boolean.toString(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return null;
    }
}
