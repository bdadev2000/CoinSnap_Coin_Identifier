package com.google.android.gms.internal.ads;

import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbjj implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfo zzcfoVar = (zzcfo) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfxi.zzc(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, str) && !zzfxi.zzc("false", str)) {
                return;
            }
            zzfuv.zzi(zzcfoVar.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
