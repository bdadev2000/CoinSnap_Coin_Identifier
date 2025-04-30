package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzcpt implements zzdag {
    private final zzfim zza;

    public zzcpt(zzfim zzfimVar) {
        this.zza = zzfimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdj(@Nullable Context context) {
        try {
            this.zza.zzg();
        } catch (zzfhv e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onDestroy for the mediation adapter.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdl(@Nullable Context context) {
        try {
            this.zza.zzt();
        } catch (zzfhv e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onPause for the mediation adapter.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdm(@Nullable Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfhv e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onResume for the mediation adapter.", e4);
        }
    }
}
