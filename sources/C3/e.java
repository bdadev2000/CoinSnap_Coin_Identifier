package c3;

import G7.j;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.vungle.ads.C2073d;
import com.vungle.ads.J0;

/* loaded from: classes.dex */
public final class e implements InterfaceC0604b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5408a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VungleMediationAdapter f5409c;

    public e(VungleMediationAdapter vungleMediationAdapter, Context context, String str) {
        this.f5409c = vungleMediationAdapter;
        this.f5408a = context;
        this.b = str;
    }

    @Override // c3.InterfaceC0604b
    public final void a(AdError adError) {
        MediationAdLoadCallback mediationAdLoadCallback;
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        mediationAdLoadCallback = this.f5409c.mediationAdLoadCallback;
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // c3.InterfaceC0604b
    public final void b() {
        C0603a c0603a;
        C2073d c2073d;
        J0 j02;
        String str;
        J0 j03;
        J0 j04;
        String str2;
        VungleMediationAdapter vungleMediationAdapter = this.f5409c;
        c0603a = vungleMediationAdapter.vungleFactory;
        c2073d = vungleMediationAdapter.adConfig;
        c0603a.getClass();
        Context context = this.f5408a;
        j.e(context, "context");
        String str3 = this.b;
        j.e(str3, "placementId");
        j.e(c2073d, "adConfig");
        vungleMediationAdapter.rewardedAd = new J0(context, str3, c2073d);
        j02 = vungleMediationAdapter.rewardedAd;
        j02.setAdListener(vungleMediationAdapter);
        str = vungleMediationAdapter.userId;
        if (!TextUtils.isEmpty(str)) {
            j04 = vungleMediationAdapter.rewardedAd;
            str2 = vungleMediationAdapter.userId;
            j04.setUserId(str2);
        }
        j03 = vungleMediationAdapter.rewardedAd;
        j03.load(null);
    }
}
