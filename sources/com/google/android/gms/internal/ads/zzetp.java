package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzetp implements zzevy {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzetp(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = z12;
        this.zze = z13;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.zza.isEmpty()) {
            bundle.putString("inspector_extras", this.zza);
        }
        bundle.putInt("test_mode", this.zzb ? 1 : 0);
        bundle.putInt("linked_device", this.zzc ? 1 : 0);
        if (this.zzb || this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziP)).booleanValue()) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziT)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}
