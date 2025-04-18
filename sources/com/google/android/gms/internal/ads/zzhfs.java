package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public class zzhfs {
    final LinkedHashMap zza;

    public zzhfs(int i10) {
        this.zza = zzhfu.zzb(i10);
    }

    public final zzhfs zza(Object obj, zzhgg zzhggVar) {
        zzhgf.zza(obj, "key");
        zzhgf.zza(zzhggVar, "provider");
        this.zza.put(obj, zzhggVar);
        return this;
    }
}
