package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzj;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends UnifiedNativeAdMapper {
    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        if (!(view instanceof zzj)) {
            if (((zze) zze.zza.get(view)) == null) {
                return;
            } else {
                throw null;
            }
        }
        throw null;
    }
}
