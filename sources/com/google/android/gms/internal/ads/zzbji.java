package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzbji implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        if (zzcfkVar.zzJ() != null) {
            zzcfkVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzcfkVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzM = zzcfkVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
