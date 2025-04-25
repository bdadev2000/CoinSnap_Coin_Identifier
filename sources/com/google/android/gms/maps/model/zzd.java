package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.zzaq;
import com.google.android.gms.maps.model.FeatureLayer;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
final class zzd extends zzaq {
    final /* synthetic */ FeatureLayer.StyleFactory zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(FeatureLayer featureLayer, FeatureLayer.StyleFactory styleFactory) {
        this.zza = styleFactory;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final FeatureStyle zzb(com.google.android.gms.internal.maps.zzp zzpVar) {
        Feature zza = Feature.zza(zzpVar);
        if (zza == null) {
            return null;
        }
        return this.zza.getStyle(zza);
    }
}
