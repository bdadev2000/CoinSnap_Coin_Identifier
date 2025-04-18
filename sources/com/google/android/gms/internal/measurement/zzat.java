package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzat implements zzaq {
    private final String zza;
    private final ArrayList<zzaq> zzb;

    public zzat(String str, List<zzaq> list) {
        this.zza = str;
        ArrayList<zzaq> arrayList = new ArrayList<>();
        this.zzb = arrayList;
        arrayList.addAll(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        zzat zzatVar = (zzat) obj;
        String str = this.zza;
        if (str == null ? zzatVar.zza != null : !str.equals(zzatVar.zza)) {
            return false;
        }
        ArrayList<zzaq> arrayList = this.zzb;
        ArrayList<zzaq> arrayList2 = zzatVar.zzb;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        if (arrayList2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.zza;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        ArrayList<zzaq> arrayList = this.zzb;
        if (arrayList != null) {
            i11 = arrayList.hashCode();
        }
        return i12 + i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final ArrayList<zzaq> zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return null;
    }

    public final String zza() {
        return this.zza;
    }
}
