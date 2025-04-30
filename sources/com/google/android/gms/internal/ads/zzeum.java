package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzeum implements zzexv {
    public final Bundle zza;

    public zzeum(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putBundle("content_info", this.zza);
    }
}
