package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
final class zzbub extends zzbtu {
    final /* synthetic */ List zza;

    public zzbub(zzbud zzbudVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zze(String str) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzf(List list) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
