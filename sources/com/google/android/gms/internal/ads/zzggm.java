package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzggm {
    public static final /* synthetic */ int zza = 0;

    static {
        Logger.getLogger(zzggm.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzgfm.class);
        hashSet.add(zzgfs.class);
        hashSet.add(zzggo.class);
        hashSet.add(zzgfu.class);
        hashSet.add(zzgft.class);
        hashSet.add(zzggi.class);
        hashSet.add(zzgrn.class);
        hashSet.add(zzggk.class);
        hashSet.add(zzggl.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzggm() {
    }

    public static Class zza(Class cls) {
        try {
            return zzgnw.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzb(zzgua zzguaVar, Class cls) throws GeneralSecurityException {
        String zzg = zzguaVar.zzg();
        return zzgmo.zzc().zza(zzg, cls).zzc(zzguaVar.zzf());
    }
}
