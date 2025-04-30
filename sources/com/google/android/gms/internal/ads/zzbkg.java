package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbkg implements zzblp {
    private final zzbkh zza;

    public zzbkg(zzbkh zzbkhVar) {
        this.zza = zzbkhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("App event with no name parameter.");
        } else {
            this.zza.zzb(str, (String) map.get("info"));
        }
    }
}
