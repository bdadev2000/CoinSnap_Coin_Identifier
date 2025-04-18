package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
final class zzbua extends zzbtu {
    final /* synthetic */ List zza;

    public zzbua(zzbud zzbudVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zze(String str) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzf(List list) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
