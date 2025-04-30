package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class zzhkk {
    final LinkedHashMap zza;

    public zzhkk(int i9) {
        this.zza = zzhkm.zzb(i9);
    }

    public final zzhkk zza(Object obj, zzhky zzhkyVar) {
        zzhkx.zza(obj, "key");
        zzhkx.zza(zzhkyVar, "provider");
        this.zza.put(obj, zzhkyVar);
        return this;
    }
}
