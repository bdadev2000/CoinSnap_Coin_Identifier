package com.google.android.gms.internal.measurement;

import a4.j;
import android.content.Context;
import ra.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgv extends zzhu {
    private final Context zza;
    private final p zzb;

    public zzgv(Context context, p pVar) {
        if (context != null) {
            this.zza = context;
            this.zzb = pVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        p pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhu) {
            zzhu zzhuVar = (zzhu) obj;
            if (this.zza.equals(zzhuVar.zza()) && ((pVar = this.zzb) != null ? pVar.equals(zzhuVar.zzb()) : zzhuVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.zza.hashCode() ^ 1000003) * 1000003;
        p pVar = this.zzb;
        if (pVar == null) {
            hashCode = 0;
        } else {
            hashCode = pVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return j.h("FlagsContext{context=", String.valueOf(this.zza), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final p zzb() {
        return this.zzb;
    }
}
