package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgnh {
    private final zzgfy zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzgnh(zzgfy zzgfyVar, int i10, String str, String str2, zzgni zzgniVar) {
        this.zza = zzgfyVar;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnh)) {
            return false;
        }
        zzgnh zzgnhVar = (zzgnh) obj;
        if (this.zza != zzgnhVar.zza || this.zzb != zzgnhVar.zzb || !this.zzc.equals(zzgnhVar.zzc) || !this.zzd.equals(zzgnhVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
