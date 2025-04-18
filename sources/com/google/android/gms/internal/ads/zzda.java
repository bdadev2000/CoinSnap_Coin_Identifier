package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzda {
    private static final String zzb = Integer.toString(0, 36);
    public final String zza;

    public zzda(String str) {
        this.zza = str;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzb, this.zza);
        return bundle;
    }
}
