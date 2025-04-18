package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbnq implements zzcaq {
    final /* synthetic */ zzbno zza;

    public zzbnq(zzbnt zzbntVar, zzbno zzbnoVar) {
        this.zza = zzbnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("Rejecting reference for JS Engine.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhq)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
