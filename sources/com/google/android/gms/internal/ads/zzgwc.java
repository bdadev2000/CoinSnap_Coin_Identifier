package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzgwc {
    public static final zzgwc zza = new zzgwc(new zzgwd());
    public static final zzgwc zzb = new zzgwc(new zzgwh());
    private final zzgwa zzc;

    static {
        new zzgwc(new zzgwj());
        new zzgwc(new zzgwi());
        new zzgwc(new zzgwe());
        new zzgwc(new zzgwg());
        new zzgwc(new zzgwf());
    }

    public zzgwc(zzgwk zzgwkVar) {
        zzgwa zzgvzVar;
        zzgwb zzgwbVar = null;
        if (!zzgmi.zzb()) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                zzgvzVar = new zzgvx(zzgwkVar, zzgwbVar);
            } else {
                zzgvzVar = new zzgvy(zzgwkVar, zzgwbVar);
            }
        } else {
            zzgvzVar = new zzgvz(zzgwkVar, zzgwbVar);
        }
        this.zzc = zzgvzVar;
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
        return this.zzc.zza(str);
    }
}
