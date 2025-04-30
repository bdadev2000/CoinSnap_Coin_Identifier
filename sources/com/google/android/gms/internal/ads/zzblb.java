package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzblb implements zzblp {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        try {
            zzfvg.zzj(zzchdVar.getContext()).zzk();
            zzfvh.zzi(zzchdVar.getContext()).zzj();
        } catch (IOException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
