package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdhq implements zzbjr {
    private final WeakReference zza;

    public /* synthetic */ zzdhq(zzdhu zzdhuVar, zzdht zzdhtVar) {
        this.zza = new WeakReference(zzdhuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzdhu zzdhuVar = (zzdhu) this.zza.get();
        if (zzdhuVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzdhu.zzb(zzdhuVar).onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkt)).booleanValue()) {
                zzdhu.zzd(zzdhuVar).zzdG();
                if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    zzdhu.zzd(zzdhuVar).zzdf();
                }
            }
        }
    }
}
