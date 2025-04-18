package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzdrm implements zzcyv {

    @Nullable
    private final zzcfo zza;

    public zzdrm(@Nullable zzcfo zzcfoVar) {
        this.zza = zzcfoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdj(@Nullable Context context) {
        zzcfo zzcfoVar = this.zza;
        if (zzcfoVar != null) {
            zzcfoVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdl(@Nullable Context context) {
        zzcfo zzcfoVar = this.zza;
        if (zzcfoVar != null) {
            zzcfoVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdm(@Nullable Context context) {
        zzcfo zzcfoVar = this.zza;
        if (zzcfoVar != null) {
            zzcfoVar.onResume();
        }
    }
}
