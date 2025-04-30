package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzarn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbj implements zzari {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbn zzb;

    public zzbj(zzbq zzbqVar, String str, zzbn zzbnVar) {
        this.zza = str;
        this.zzb = zzbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zza(zzarn zzarnVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to load URL: " + this.zza + "\n" + zzarnVar.toString());
        this.zzb.zza((Object) null);
    }
}
