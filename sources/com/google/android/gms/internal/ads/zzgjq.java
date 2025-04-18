package com.google.android.gms.internal.ads;

import a4.j;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgjq extends zzggt {
    private final zzgjo zza;
    private final String zzb;
    private final zzgjn zzc;
    private final zzggt zzd;

    public /* synthetic */ zzgjq(zzgjo zzgjoVar, String str, zzgjn zzgjnVar, zzggt zzggtVar, zzgjp zzgjpVar) {
        this.zza = zzgjoVar;
        this.zzb = str;
        this.zzc = zzgjnVar;
        this.zzd = zzggtVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjq)) {
            return false;
        }
        zzgjq zzgjqVar = (zzgjq) obj;
        if (!zzgjqVar.zzc.equals(this.zzc) || !zzgjqVar.zzd.equals(this.zzd) || !zzgjqVar.zzb.equals(this.zzb) || !zzgjqVar.zza.equals(this.zza)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgjq.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzgjo zzgjoVar = this.zza;
        zzggt zzggtVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzggtVar);
        String valueOf3 = String.valueOf(zzgjoVar);
        StringBuilder sb2 = new StringBuilder("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb2.append(this.zzb);
        sb2.append(", dekParsingStrategy: ");
        sb2.append(valueOf);
        sb2.append(", dekParametersForNewKeys: ");
        return j.k(sb2, valueOf2, ", variant: ", valueOf3, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zza != zzgjo.zzb;
    }

    public final zzggt zzb() {
        return this.zzd;
    }

    public final zzgjo zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}
