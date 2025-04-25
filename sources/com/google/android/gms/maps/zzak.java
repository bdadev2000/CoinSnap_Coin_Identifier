package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbk;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
final class zzak extends zzbk {
    final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzak(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        this.zza = onStreetViewPanoramaCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbl
    public final void zzb(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zza.onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
    }
}
