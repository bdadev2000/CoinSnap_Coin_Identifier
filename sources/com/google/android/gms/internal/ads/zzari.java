package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
final class zzari implements zzaqx {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzari(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
