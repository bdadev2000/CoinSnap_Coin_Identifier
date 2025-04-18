package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* loaded from: classes3.dex */
final class zzcz extends com.google.android.gms.location.zzt {
    private final zzcs zza;

    public zzcz(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // com.google.android.gms.location.zzu
    public final void zzd(Location location) {
        this.zza.zza().notifyListener(new zzcx(this, location));
    }

    @Override // com.google.android.gms.location.zzu
    public final void zze() {
        this.zza.zza().notifyListener(new zzcy(this));
    }

    public final zzcz zzf(ListenerHolder listenerHolder) {
        this.zza.zzc(listenerHolder);
        return this;
    }

    public final void zzg() {
        this.zza.zza().clear();
    }
}
