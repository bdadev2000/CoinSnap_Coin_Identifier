package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfbp implements zzfhx {
    public final zzfcj zza;
    public final zzfcl zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzy zzf;
    public final zzfhm zzg;

    public zzfbp(zzfcj zzfcjVar, zzfcl zzfclVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzy zzyVar, zzfhm zzfhmVar) {
        this.zza = zzfcjVar;
        this.zzb = zzfclVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzyVar;
        this.zzg = zzfhmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhx
    public final zzfhm zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfhx
    public final Executor zzb() {
        return this.zze;
    }
}
