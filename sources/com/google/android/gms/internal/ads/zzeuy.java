package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzeuy implements zzexv {
    private final boolean zza;

    public zzeuy(boolean z8) {
        this.zza = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.zza);
    }
}
