package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public final class zzegi {
    private final Context zza;

    public zzegi(Context context) {
        this.zza = context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest$Builder, java.lang.Object] */
    public final ListenableFuture zza(boolean z2) {
        try {
            ?? obj = new Object();
            obj.f20862a = "";
            obj.f20863b = true;
            obj.f20862a = MobileAds.ERROR_DOMAIN;
            obj.f20863b = z2;
            if (MobileAds.ERROR_DOMAIN.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set".toString());
            }
            GetTopicsRequest getTopicsRequest = new GetTopicsRequest(obj.f20862a, obj.f20863b);
            TopicsManagerFutures a2 = TopicsManagerFutures.a(this.zza);
            return a2 != null ? a2.b(getTopicsRequest) : zzgfo.zzg(new IllegalStateException());
        } catch (Exception e) {
            return zzgfo.zzg(e);
        }
    }
}
