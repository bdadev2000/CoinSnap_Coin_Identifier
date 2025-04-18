package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzoe implements zzgu {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzoj zzb;
    private final /* synthetic */ zznv zzc;

    public zzoe(zznv zznvVar, String str, zzoj zzojVar) {
        this.zza = str;
        this.zzb = zzojVar;
        this.zzc = zznvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final void zza(String str, int i10, Throwable th2, byte[] bArr, Map<String, List<String>> map) {
        this.zzc.zza(this.zza, i10, th2, bArr, this.zzb);
    }
}
