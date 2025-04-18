package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcnv implements zzcnf {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzu.zzo().zzi();

    public zzcnv(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean parseBoolean = Boolean.parseBoolean(str);
        zzgVar.zzI(parseBoolean);
        if (parseBoolean) {
            com.google.android.gms.ads.internal.util.zzad.zzc(this.zza);
        }
    }
}
