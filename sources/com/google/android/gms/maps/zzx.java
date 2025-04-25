package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
final class zzx extends com.google.android.gms.maps.internal.zzq {
    final /* synthetic */ GoogleMap.OnCameraMoveCanceledListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(GoogleMap googleMap, GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.zza = onCameraMoveCanceledListener;
    }

    @Override // com.google.android.gms.maps.internal.zzr
    public final void zzb() {
        this.zza.onCameraMoveCanceled();
    }
}
