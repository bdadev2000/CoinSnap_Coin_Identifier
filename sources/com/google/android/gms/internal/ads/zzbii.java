package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbii implements zzbjr {
    private final zzbij zza;

    public zzbii(zzbij zzbijVar) {
        this.zza = zzbijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("App event with no name parameter.");
        } else {
            this.zza.zzb(str, (String) map.get("info"));
        }
    }
}
