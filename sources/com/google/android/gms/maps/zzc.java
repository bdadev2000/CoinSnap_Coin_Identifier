package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
final class zzc extends com.google.android.gms.maps.internal.zzac {
    final /* synthetic */ GoogleMap.OnInfoWindowClickListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(GoogleMap googleMap, GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.zza = onInfoWindowClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzad
    public final void zzb(com.google.android.gms.internal.maps.zzah zzahVar) {
        this.zza.onInfoWindowClick(new Marker(zzahVar));
    }
}
