package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class zzesq implements zzevy {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;

    public /* synthetic */ zzesq(String str, String str2, Bundle bundle, zzesr zzesrVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.zza);
        bundle.putString("fc_consent", this.zzb);
        bundle.putBundle("iab_consent_info", this.zzc);
    }
}
