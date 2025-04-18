package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzerg implements zzhfx {
    public static zzerg zza() {
        zzerg zzergVar;
        zzergVar = zzerf.zza;
        return zzergVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbce zzbceVar = zzbcn.zzlu;
        if (!((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).split(","));
        }
        zzhgf.zzb(arrayList);
        return arrayList;
    }
}
