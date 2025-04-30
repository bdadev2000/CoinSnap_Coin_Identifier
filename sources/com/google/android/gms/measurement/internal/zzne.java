package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzne implements zzgc {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zznc zzb;

    public zzne(zznc zzncVar, String str) {
        this.zza = str;
        this.zzb = zzncVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgc
    public final void zza(String str, int i9, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.zzb.zza(true, i9, th, bArr, this.zza);
    }
}
