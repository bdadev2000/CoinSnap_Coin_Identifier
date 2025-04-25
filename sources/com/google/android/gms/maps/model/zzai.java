package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzax;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public final class zzai implements TileProvider {
    final /* synthetic */ TileOverlayOptions zza;
    private final zzax zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(TileOverlayOptions tileOverlayOptions) {
        zzax zzaxVar;
        this.zza = tileOverlayOptions;
        zzaxVar = tileOverlayOptions.zza;
        this.zzb = zzaxVar;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.zzb.zzb(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
