package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzeqb implements zzexv {
    private final boolean zza;

    public zzeqb(boolean z8) {
        this.zza = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
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
