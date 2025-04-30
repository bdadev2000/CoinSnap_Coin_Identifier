package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzblg implements zzblp {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        if (zzchdVar.zzJ() != null) {
            zzchdVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzchdVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzM = zzchdVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
