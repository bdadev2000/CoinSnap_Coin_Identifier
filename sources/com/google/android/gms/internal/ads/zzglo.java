package com.google.android.gms.internal.ads;

import Q7.n0;
import java.util.Objects;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzglo extends zzgii {
    private final zzglm zza;
    private final String zzb;
    private final zzgll zzc;
    private final zzgii zzd;

    public /* synthetic */ zzglo(zzglm zzglmVar, String str, zzgll zzgllVar, zzgii zzgiiVar, zzgln zzglnVar) {
        this.zza = zzglmVar;
        this.zzb = str;
        this.zzc = zzgllVar;
        this.zzd = zzgiiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzglo)) {
            return false;
        }
        zzglo zzgloVar = (zzglo) obj;
        if (!zzgloVar.zzc.equals(this.zzc) || !zzgloVar.zzd.equals(this.zzd) || !zzgloVar.zzb.equals(this.zzb) || !zzgloVar.zza.equals(this.zza)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzglo.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzglm zzglmVar = this.zza;
        zzgii zzgiiVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzgiiVar);
        String valueOf3 = String.valueOf(zzglmVar);
        StringBuilder sb = new StringBuilder("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        AbstractC2914a.j(sb, this.zzb, ", dekParsingStrategy: ", valueOf, ", dekParametersForNewKeys: ");
        return n0.m(sb, valueOf2, ", variant: ", valueOf3, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zza != zzglm.zzb;
    }

    public final zzgii zzb() {
        return this.zzd;
    }

    public final zzglm zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}
