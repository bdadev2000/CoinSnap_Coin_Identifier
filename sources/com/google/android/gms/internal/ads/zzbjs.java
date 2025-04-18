package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzbjs implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfo zzcfoVar = (zzcfo) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcfoVar.zzdg();
        } else if ("resume".equals(str)) {
            zzcfoVar.zzdh();
        }
    }
}
