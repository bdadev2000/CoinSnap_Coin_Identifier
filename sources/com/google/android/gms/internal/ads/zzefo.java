package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzefo extends zzegl {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzm zzb;
    private String zzc;
    private String zzd;

    @Override // com.google.android.gms.internal.ads.zzegl
    public final zzegl zza(Activity activity) {
        if (activity != null) {
            this.zza = activity;
            return this;
        }
        throw new NullPointerException("Null activity");
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final zzegl zzb(@Nullable com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzb = zzmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final zzegl zzc(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final zzegl zzd(@Nullable String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final zzegm zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzefq(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
