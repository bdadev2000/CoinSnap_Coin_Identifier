package com.google.android.gms.ads.internal.overlay;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzf implements View.OnClickListener {
    final /* synthetic */ zzm zza;

    public zzf(zzm zzmVar) {
        this.zza = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.zza;
        zzmVar.zzn = 2;
        zzmVar.zzb.finish();
    }
}
