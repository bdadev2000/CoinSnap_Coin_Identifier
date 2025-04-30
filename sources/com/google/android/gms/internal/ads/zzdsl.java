package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzdsl implements zzdag {

    @Nullable
    private final zzchd zza;

    public zzdsl(@Nullable zzchd zzchdVar) {
        this.zza = zzchdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdj(@Nullable Context context) {
        zzchd zzchdVar = this.zza;
        if (zzchdVar != null) {
            zzchdVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdl(@Nullable Context context) {
        zzchd zzchdVar = this.zza;
        if (zzchdVar != null) {
            zzchdVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdm(@Nullable Context context) {
        zzchd zzchdVar = this.zza;
        if (zzchdVar != null) {
            zzchdVar.onResume();
        }
    }
}
