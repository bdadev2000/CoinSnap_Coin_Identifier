package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbpp implements zzccp {
    final /* synthetic */ zzbpn zza;

    public zzbpp(zzbps zzbpsVar, zzbpn zzbpnVar) {
        this.zza = zzbpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("Rejecting reference for JS Engine.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhO)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
