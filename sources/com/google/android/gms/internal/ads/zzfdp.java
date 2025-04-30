package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfdp implements zzfjx {
    public final zzfej zza;
    public final zzfel zzb;
    public final com.google.android.gms.ads.internal.client.zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzw zzf;
    public final zzfjm zzg;

    public zzfdp(zzfej zzfejVar, zzfel zzfelVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzw zzwVar, zzfjm zzfjmVar) {
        this.zza = zzfejVar;
        this.zzb = zzfelVar;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzwVar;
        this.zzg = zzfjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjx
    public final zzfjm zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfjx
    public final Executor zzb() {
        return this.zze;
    }
}
