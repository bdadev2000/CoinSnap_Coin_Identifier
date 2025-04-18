package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzeti implements zzevy {
    private final Boolean zza;

    public zzeti(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Boolean bool = this.zza;
        Bundle bundle = (Bundle) obj;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
