package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzede extends zzeeb {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzm zzb;
    private String zzc;
    private String zzd;

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeeb zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeeb zzb(@Nullable com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzb = zzmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeeb zzc(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeeb zzd(@Nullable String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeec zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzedg(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
