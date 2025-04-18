package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcof implements zzcyv {
    private final zzfia zza;

    public zzcof(zzfia zzfiaVar) {
        this.zza = zzfiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdj(@Nullable Context context) {
        try {
            this.zza.zzg();
        } catch (zzfhj e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdl(@Nullable Context context) {
        try {
            this.zza.zzt();
        } catch (zzfhj e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdm(@Nullable Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfhj e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
