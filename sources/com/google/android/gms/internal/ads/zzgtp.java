package com.google.android.gms.internal.ads;

import Q7.n0;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzgtp {
    private final zzghk zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzgtp(zzghk zzghkVar, int i9, String str, String str2, zzgto zzgtoVar) {
        this.zza = zzghkVar;
        this.zzb = i9;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgtp)) {
            return false;
        }
        zzgtp zzgtpVar = (zzgtp) obj;
        if (this.zza != zzgtpVar.zza || this.zzb != zzgtpVar.zzb || !this.zzc.equals(zzgtpVar.zzc) || !this.zzd.equals(zzgtpVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzghk zzghkVar = this.zza;
        int i9 = this.zzb;
        String str = this.zzc;
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(zzghkVar);
        sb.append(", keyId=");
        sb.append(i9);
        sb.append(", keyType='");
        return n0.m(sb, str, "', keyPrefix='", str2, "')");
    }

    public final int zza() {
        return this.zzb;
    }
}
