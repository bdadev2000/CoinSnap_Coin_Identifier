package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapt;
import com.google.android.gms.internal.ads.zzapy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbh implements zzapt {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbj zzb;

    public zzbh(zzbn zzbnVar, String str, zzbj zzbjVar) {
        this.zza = str;
        this.zzb = zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza(zzapy zzapyVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to load URL: " + this.zza + "\n" + zzapyVar.toString());
        this.zzb.zza((Object) null);
    }
}
