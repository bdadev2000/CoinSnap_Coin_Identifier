package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes4.dex */
final class zzbuh extends zzbua {
    final /* synthetic */ List zza;

    public zzbuh(zzbuj zzbujVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final void zze(String str) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final void zzf(List list) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
