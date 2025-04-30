package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzbwa extends zzbvu {
    final /* synthetic */ List zza;

    public zzbwa(zzbwd zzbwdVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zze(String str) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zzf(List list) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
