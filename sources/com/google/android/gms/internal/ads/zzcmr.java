package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzcmr implements zzcxh {
    private final zzfgm zza;

    public zzcmr(zzfgm zzfgmVar) {
        this.zza = zzfgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdj(@Nullable Context context) {
        try {
            this.zza.zzg();
        } catch (zzffv e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onDestroy for the mediation adapter.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdl(@Nullable Context context) {
        try {
            this.zza.zzt();
        } catch (zzffv e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onPause for the mediation adapter.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdm(@Nullable Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzffv e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onResume for the mediation adapter.", e2);
        }
    }
}
