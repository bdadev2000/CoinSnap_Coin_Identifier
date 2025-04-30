package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class zzbuc implements View.OnClickListener {
    final /* synthetic */ zzbud zza;

    public zzbuc(zzbud zzbudVar) {
        this.zza = zzbudVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
