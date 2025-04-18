package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzghg {
    public static final zzghs zza(zzghs zzghsVar) throws GeneralSecurityException {
        return zzghsVar != null ? zzghsVar : zzghy.zza(zzb(null).zzaV());
    }

    public static final zzgwf zzb(zzghs zzghsVar) {
        try {
            return ((zzgqs) zzgpq.zzc().zze(null, zzgqs.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzgrf("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }
}
