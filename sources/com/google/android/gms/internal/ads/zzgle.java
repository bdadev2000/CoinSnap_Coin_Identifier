package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgle {
    private zzglg zza;
    private String zzb;
    private zzglf zzc;
    private zzgic zzd;

    private zzgle() {
        throw null;
    }

    public /* synthetic */ zzgle(zzgld zzgldVar) {
    }

    public final zzgle zza(zzgic zzgicVar) {
        this.zzd = zzgicVar;
        return this;
    }

    public final zzgle zzb(zzglf zzglfVar) {
        this.zzc = zzglfVar;
        return this;
    }

    public final zzgle zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzgle zzd(zzglg zzglgVar) {
        this.zza = zzglgVar;
        return this;
    }

    public final zzgli zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzglg.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzglf zzglfVar = this.zzc;
        if (zzglfVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzgic zzgicVar = this.zzd;
        if (zzgicVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzgicVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzglfVar.equals(zzglf.zza) && (zzgicVar instanceof zzgjt)) || ((zzglfVar.equals(zzglf.zzc) && (zzgicVar instanceof zzgkm)) || ((zzglfVar.equals(zzglf.zzb) && (zzgicVar instanceof zzgmb)) || ((zzglfVar.equals(zzglf.zzd) && (zzgicVar instanceof zzgiu)) || ((zzglfVar.equals(zzglf.zze) && (zzgicVar instanceof zzgjg)) || (zzglfVar.equals(zzglf.zzf) && (zzgicVar instanceof zzgkg))))))) {
            return new zzgli(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        throw new GeneralSecurityException(androidx.compose.foundation.text.input.a.m("Cannot use parsing strategy ", this.zzc.toString(), " when new keys are picked according to ", String.valueOf(this.zzd), "."));
    }
}
