package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzdpv implements zzcxh {

    @Nullable
    private final zzcfk zza;

    public zzdpv(@Nullable zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdj(@Nullable Context context) {
        zzcfk zzcfkVar = this.zza;
        if (zzcfkVar != null) {
            zzcfkVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdl(@Nullable Context context) {
        zzcfk zzcfkVar = this.zza;
        if (zzcfkVar != null) {
            zzcfkVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdm(@Nullable Context context) {
        zzcfk zzcfkVar = this.zza;
        if (zzcfkVar != null) {
            zzcfkVar.onResume();
        }
    }
}
