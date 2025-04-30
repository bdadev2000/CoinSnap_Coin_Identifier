package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzghv {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzghu zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzghu zzghuVar = (zzghu) it.next();
            if (zzghuVar.zza()) {
                return zzghuVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
