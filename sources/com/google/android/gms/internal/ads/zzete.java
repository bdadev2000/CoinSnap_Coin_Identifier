package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzete implements zzevy {
    private final boolean zza;

    public zzete(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.zza);
    }
}
