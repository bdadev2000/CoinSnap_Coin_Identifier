package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzghq {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzghp zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzghp zzghpVar = (zzghp) it.next();
            if (zzghpVar.zza()) {
                return zzghpVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
