package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzexe implements zzexv {

    @Nullable
    private final String zza;

    public zzexe(@Nullable String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.zza)) {
            return;
        }
        bundle.putString("query_info", this.zza);
    }
}
