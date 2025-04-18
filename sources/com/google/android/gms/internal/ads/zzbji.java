package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbji implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfo zzcfoVar = (zzcfo) obj;
        try {
            zzfuu.zzj(zzcfoVar.getContext()).zzk();
            zzfuv.zzi(zzcfoVar.getContext()).zzj();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
