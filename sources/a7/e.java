package a7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.vungle.ads.h2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements b {
    public final /* synthetic */ Context a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VungleMediationAdapter f309c;

    public e(VungleMediationAdapter vungleMediationAdapter, Context context, String str) {
        this.f309c = vungleMediationAdapter;
        this.a = context;
        this.f308b = str;
    }

    @Override // a7.b
    public final void a(AdError adError) {
        MediationAdLoadCallback mediationAdLoadCallback;
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        mediationAdLoadCallback = this.f309c.mediationAdLoadCallback;
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // a7.b
    public final void b() {
        a aVar;
        com.vungle.ads.d adConfig;
        h2 h2Var;
        String str;
        h2 h2Var2;
        h2 h2Var3;
        String str2;
        VungleMediationAdapter vungleMediationAdapter = this.f309c;
        aVar = vungleMediationAdapter.vungleFactory;
        adConfig = vungleMediationAdapter.adConfig;
        aVar.getClass();
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        String placementId = this.f308b;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        vungleMediationAdapter.rewardedAd = new h2(context, placementId, adConfig);
        h2Var = vungleMediationAdapter.rewardedAd;
        h2Var.setAdListener(vungleMediationAdapter);
        str = vungleMediationAdapter.userId;
        if (!TextUtils.isEmpty(str)) {
            h2Var3 = vungleMediationAdapter.rewardedAd;
            str2 = vungleMediationAdapter.userId;
            h2Var3.setUserId(str2);
        }
        h2Var2 = vungleMediationAdapter.rewardedAd;
        h2Var2.load(null);
    }
}
