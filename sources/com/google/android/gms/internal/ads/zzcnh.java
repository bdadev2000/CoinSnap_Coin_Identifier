package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzcnh implements zzcnf {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcnh(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(Map map) {
        this.zza.zzy(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
