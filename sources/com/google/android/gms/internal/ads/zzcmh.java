package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcmh implements zzclr {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzv.zzp().zzi();

    public zzcmh(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        String str;
        if (!map.isEmpty() && (str = (String) map.get("gad_idless")) != null) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
            boolean parseBoolean = Boolean.parseBoolean(str);
            zzgVar.zzD(parseBoolean);
            if (parseBoolean) {
                com.google.android.gms.ads.internal.util.zzac.zzc(this.zza);
            }
        }
    }
}
