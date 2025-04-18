package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzbcg {
    @Nullable
    public static final SharedPreferences zza(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e2);
            return null;
        }
    }
}
