package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzghv {
    public static final /* synthetic */ int zza = 0;

    static {
        Logger.getLogger(zzghv.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzggt.class);
        hashSet.add(zzggz.class);
        hashSet.add(zzghx.class);
        hashSet.add(zzghb.class);
        hashSet.add(zzgha.class);
        hashSet.add(zzghr.class);
        hashSet.add(zzgto.class);
        hashSet.add(zzght.class);
        hashSet.add(zzghu.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzghv() {
    }

    public static Class zza(Class cls) {
        try {
            return zzgpn.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzb(zzgwb zzgwbVar, Class cls) throws GeneralSecurityException {
        String zzg = zzgwbVar.zzg();
        return zzgoe.zzc().zza(zzg, cls).zzc(zzgwbVar.zzf());
    }
}
