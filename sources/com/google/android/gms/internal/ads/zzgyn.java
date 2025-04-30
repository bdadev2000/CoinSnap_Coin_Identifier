package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzgyn {
    public static final zzgyn zza = new zzgyn(new zzgyo());
    public static final zzgyn zzb = new zzgyn(new zzgys());
    public static final zzgyn zzc = new zzgyn(new zzgyu());
    public static final zzgyn zzd = new zzgyn(new zzgyt());
    public static final zzgyn zze = new zzgyn(new zzgyp());
    public static final zzgyn zzf = new zzgyn(new zzgyr());
    public static final zzgyn zzg = new zzgyn(new zzgyq());
    private final zzgym zzh;

    public zzgyn(zzgyv zzgyvVar) {
        zzgym zzgylVar;
        zzgyg zzgygVar = null;
        byte b = 0;
        byte b8 = 0;
        if (!zzgod.zzb()) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                zzgylVar = new zzgyh(zzgyvVar, zzgygVar);
            } else {
                zzgylVar = new zzgyj(zzgyvVar, b8 == true ? 1 : 0);
            }
        } else {
            zzgylVar = new zzgyl(zzgyvVar, b == true ? 1 : 0);
        }
        this.zzh = zzgylVar;
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }
}
