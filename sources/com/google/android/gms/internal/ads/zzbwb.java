package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzbwb extends zzbvu {
    final /* synthetic */ List zza;

    public zzbwb(zzbwd zzbwdVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zze(String str) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zzf(List list) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
