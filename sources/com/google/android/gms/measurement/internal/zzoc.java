package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzoc implements zzgu {
    private final /* synthetic */ String zza;
    private final /* synthetic */ List zzb;
    private final /* synthetic */ zznv zzc;

    public zzoc(zznv zznvVar, String str, List list) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zznvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final void zza(String str, int i10, Throwable th2, byte[] bArr, Map<String, List<String>> map) {
        this.zzc.zza(true, i10, th2, bArr, this.zza, this.zzb);
    }
}
