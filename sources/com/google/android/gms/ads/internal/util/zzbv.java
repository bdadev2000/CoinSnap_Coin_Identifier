package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzbv extends zzb {
    private final com.google.android.gms.ads.internal.util.client.zzr zza;
    private final String zzb;

    public zzbv(Context context, String str, String str2) {
        this.zza = new com.google.android.gms.ads.internal.util.client.zzr(com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.zza.zza(this.zzb);
    }
}
