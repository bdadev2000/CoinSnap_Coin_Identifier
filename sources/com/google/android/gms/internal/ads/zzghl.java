package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzghl {
    public static final zzghx zza(zzghx zzghxVar) throws GeneralSecurityException {
        if (zzghxVar != null) {
            return zzghxVar;
        }
        return zzgie.zza(zzb(null).zzaV());
    }

    public static final zzgwm zzb(zzghx zzghxVar) {
        try {
            return ((zzgqm) zzgpl.zzc().zze(null, zzgqm.class)).zzc();
        } catch (GeneralSecurityException e4) {
            throw new zzgqz("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e4);
        }
    }
}
