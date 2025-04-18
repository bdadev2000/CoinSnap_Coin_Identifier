package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzclt implements zzclr {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzclt(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        this.zza.zzu(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
