package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcov implements zzcot {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcov(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcot
    public final void zza(Map map) {
        this.zza.zzy(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
