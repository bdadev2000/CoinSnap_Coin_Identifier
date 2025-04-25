package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
final class zzw extends com.google.android.gms.maps.internal.zzs {
    final /* synthetic */ GoogleMap.OnCameraMoveListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(GoogleMap googleMap, GoogleMap.OnCameraMoveListener onCameraMoveListener) {
        this.zza = onCameraMoveListener;
    }

    @Override // com.google.android.gms.maps.internal.zzt
    public final void zzb() {
        this.zza.onCameraMove();
    }
}
