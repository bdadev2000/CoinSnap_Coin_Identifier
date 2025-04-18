package com.google.android.gms.internal.ads;

import a4.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgjm {
    private zzgjo zza;
    private String zzb;
    private zzgjn zzc;
    private zzggt zzd;

    private zzgjm() {
        throw null;
    }

    public /* synthetic */ zzgjm(zzgjp zzgjpVar) {
    }

    public final zzgjm zza(zzggt zzggtVar) {
        this.zzd = zzggtVar;
        return this;
    }

    public final zzgjm zzb(zzgjn zzgjnVar) {
        this.zzc = zzgjnVar;
        return this;
    }

    public final zzgjm zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzgjm zzd(zzgjo zzgjoVar) {
        this.zza = zzgjoVar;
        return this;
    }

    public final zzgjq zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzgjo.zzb;
        }
        if (this.zzb != null) {
            zzgjn zzgjnVar = this.zzc;
            if (zzgjnVar != null) {
                zzggt zzggtVar = this.zzd;
                if (zzggtVar != null) {
                    if (!zzggtVar.zza()) {
                        if ((zzgjnVar.equals(zzgjn.zza) && (zzggtVar instanceof zzgie)) || ((zzgjnVar.equals(zzgjn.zzc) && (zzggtVar instanceof zzgiv)) || ((zzgjnVar.equals(zzgjn.zzb) && (zzggtVar instanceof zzgkm)) || ((zzgjnVar.equals(zzgjn.zzd) && (zzggtVar instanceof zzghj)) || ((zzgjnVar.equals(zzgjn.zze) && (zzggtVar instanceof zzght)) || (zzgjnVar.equals(zzgjn.zzf) && (zzggtVar instanceof zzgip))))))) {
                            return new zzgjq(this.zza, this.zzb, this.zzc, this.zzd, null);
                        }
                        throw new GeneralSecurityException(j.h("Cannot use parsing strategy ", this.zzc.toString(), " when new keys are picked according to ", String.valueOf(this.zzd), "."));
                    }
                    throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                }
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        throw new GeneralSecurityException("kekUri must be set");
    }
}
