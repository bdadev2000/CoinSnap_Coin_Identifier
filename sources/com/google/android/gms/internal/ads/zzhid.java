package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public class zzhid {
    final LinkedHashMap zza;

    public zzhid(int i2) {
        this.zza = zzhif.zzb(i2);
    }

    public final zzhid zza(Object obj, zzhir zzhirVar) {
        zzhiq.zza(obj, SDKConstants.PARAM_KEY);
        zzhiq.zza(zzhirVar, "provider");
        this.zza.put(obj, zzhirVar);
        return this;
    }
}
