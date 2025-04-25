package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
final class zzd extends com.google.android.gms.maps.internal.zzag {
    final /* synthetic */ GoogleMap.OnInfoWindowLongClickListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(GoogleMap googleMap, GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.zza = onInfoWindowLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzah
    public final void zzb(com.google.android.gms.internal.maps.zzah zzahVar) {
        this.zza.onInfoWindowLongClick(new Marker(zzahVar));
    }
}
