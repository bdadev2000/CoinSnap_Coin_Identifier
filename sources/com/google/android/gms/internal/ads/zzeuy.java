package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzeuy implements zzevy {
    private final String zza;

    public zzeuy(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putString("request_id", this.zza);
    }
}
