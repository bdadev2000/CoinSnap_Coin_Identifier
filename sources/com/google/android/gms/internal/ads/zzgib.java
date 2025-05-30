package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzgib {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzgib.class.getName());
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final Set zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(zzggy.class);
        hashSet.add(zzghe.class);
        hashSet.add(zzgid.class);
        hashSet.add(zzghg.class);
        hashSet.add(zzghf.class);
        hashSet.add(zzghw.class);
        hashSet.add(zzgts.class);
        hashSet.add(zzghz.class);
        hashSet.add(zzgia.class);
        zzd = Collections.unmodifiableSet(hashSet);
    }

    private zzgib() {
    }

    public static Class zza(Class cls) {
        try {
            return zzgpi.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzb(zzgwh zzgwhVar, Class cls) throws GeneralSecurityException {
        String zzg = zzgwhVar.zzg();
        return zzgoj.zzc().zza(zzg, cls).zzc(zzgwhVar.zzf());
    }
}
