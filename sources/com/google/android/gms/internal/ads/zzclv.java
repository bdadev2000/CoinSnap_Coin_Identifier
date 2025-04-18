package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzclv implements zzclr {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzclv(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        this.zza.zzv(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
