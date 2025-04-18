package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class zzgfz {
    public static final zzggj zza(zzggj zzggjVar) throws GeneralSecurityException {
        return zzggjVar != null ? zzggjVar : zzggp.zza(zzb(null).zzaV());
    }

    public static final zzgue zzb(zzggj zzggjVar) {
        try {
            return ((zzgox) zzgnz.zzc().zze(null, zzgox.class)).zzc();
        } catch (GeneralSecurityException e2) {
            throw new zzgpi("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(AbstractJsonLexerKt.NULL), e2);
        }
    }
}
