package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzelh implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdfk zza;

    public zzelh(zzeli zzeliVar, zzdfk zzdfkVar) {
        this.zza = zzdfkVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}
