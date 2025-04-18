package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzenr implements zzevy {
    private final boolean zza;

    public zzenr(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (true != this.zza) {
            str = "0";
        } else {
            str = "1";
        }
        bundle.putString("adid_p", str);
    }
}
