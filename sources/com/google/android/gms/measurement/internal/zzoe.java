package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes12.dex */
public final class zzoe implements zzgu {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzoj zzb;
    private final /* synthetic */ zznv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzoe(zznv zznvVar, String str, zzoj zzojVar) {
        this.zza = str;
        this.zzb = zzojVar;
        this.zzc = zznvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.zzc.zza(this.zza, i, th, bArr, this.zzb);
    }
}
