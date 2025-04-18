package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
final class zzaqv implements zzaqk {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzaqv(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqk
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
