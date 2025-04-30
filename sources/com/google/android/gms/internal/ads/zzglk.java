package com.google.android.gms.internal.ads;

import Q7.n0;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzglk {
    private zzglm zza;
    private String zzb;
    private zzgll zzc;
    private zzgii zzd;

    private zzglk() {
        throw null;
    }

    public final zzglk zza(zzgii zzgiiVar) {
        this.zzd = zzgiiVar;
        return this;
    }

    public final zzglk zzb(zzgll zzgllVar) {
        this.zzc = zzgllVar;
        return this;
    }

    public final zzglk zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzglk zzd(zzglm zzglmVar) {
        this.zza = zzglmVar;
        return this;
    }

    public final zzglo zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzglm.zzb;
        }
        if (this.zzb != null) {
            zzgll zzgllVar = this.zzc;
            if (zzgllVar != null) {
                zzgii zzgiiVar = this.zzd;
                if (zzgiiVar != null) {
                    if (!zzgiiVar.zza()) {
                        if ((zzgllVar.equals(zzgll.zza) && (zzgiiVar instanceof zzgjz)) || ((zzgllVar.equals(zzgll.zzc) && (zzgiiVar instanceof zzgks)) || ((zzgllVar.equals(zzgll.zzb) && (zzgiiVar instanceof zzgmh)) || ((zzgllVar.equals(zzgll.zzd) && (zzgiiVar instanceof zzgja)) || ((zzgllVar.equals(zzgll.zze) && (zzgiiVar instanceof zzgjm)) || (zzgllVar.equals(zzgll.zzf) && (zzgiiVar instanceof zzgkm))))))) {
                            return new zzglo(this.zza, this.zzb, this.zzc, this.zzd, null);
                        }
                        throw new GeneralSecurityException(n0.j("Cannot use parsing strategy ", this.zzc.toString(), " when new keys are picked according to ", String.valueOf(this.zzd), "."));
                    }
                    throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                }
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        throw new GeneralSecurityException("kekUri must be set");
    }

    public /* synthetic */ zzglk(zzglj zzgljVar) {
    }
}
