package com.google.android.gms.internal.measurement;

import Q7.n0;
import android.content.Context;
import c4.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgh extends zzhg {
    private final Context zza;
    private final e zzb;

    public zzgh(Context context, e eVar) {
        if (context != null) {
            this.zza = context;
            this.zzb = eVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhg) {
            zzhg zzhgVar = (zzhg) obj;
            if (this.zza.equals(zzhgVar.zza()) && ((eVar = this.zzb) != null ? eVar.equals(zzhgVar.zzb()) : zzhgVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.zza.hashCode() ^ 1000003) * 1000003;
        e eVar = this.zzb;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return n0.j("FlagsContext{context=", String.valueOf(this.zza), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final e zzb() {
        return this.zzb;
    }
}
