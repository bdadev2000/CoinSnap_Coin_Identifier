package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdvh extends zzdvk {
    private final CsiParamDefaults zzg;

    public zzdvh(Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, CsiParamDefaults csiParamDefaults, CsiUrlBuilder csiUrlBuilder, Context context) {
        super(executor, zzrVar, csiUrlBuilder, context);
        this.zzg = csiParamDefaults;
        csiParamDefaults.set(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
