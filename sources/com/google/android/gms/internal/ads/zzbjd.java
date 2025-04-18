package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbjd implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        try {
            zzftl.zzj(zzcfkVar.getContext()).zzk();
            zzftm.zzi(zzcfkVar.getContext()).zzj();
            zzftn.zza(zzcfkVar.getContext()).zzb(null);
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
