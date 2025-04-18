package z6;

import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class e implements y6.b {
    public final /* synthetic */ Context a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28534c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f28535d;

    public e(f fVar, Context context, String str, String str2) {
        this.f28535d = fVar;
        this.a = context;
        this.f28533b = str;
        this.f28534c = str2;
    }

    @Override // y6.b
    public final void a(AdError adError) {
        Log.w(PangleMediationAdapter.TAG, adError.toString());
        this.f28535d.f28537c.onFailure(adError);
    }

    @Override // y6.b
    public final void b() {
        f fVar = this.f28535d;
        AdSize adSize = fVar.f28536b.getAdSize();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new AdSize(320, 50));
        arrayList.add(new AdSize(300, 250));
        arrayList.add(new AdSize(728, 90));
        Context context = this.a;
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize == null) {
            AdError i10 = com.bumptech.glide.d.i(102, "Failed to request banner ad from Pangle. Invalid banner size.");
            Log.w(PangleMediationAdapter.TAG, i10.toString());
            fVar.f28537c.onFailure(i10);
            return;
        }
        fVar.f28541h = new FrameLayout(context);
        y6.a aVar = fVar.f28539f;
        PAGBannerSize pAGBannerSize = new PAGBannerSize(findClosestSize.getWidth(), findClosestSize.getHeight());
        aVar.getClass();
        PAGBannerRequest pAGBannerRequest = new PAGBannerRequest(pAGBannerSize);
        String str = this.f28533b;
        pAGBannerRequest.setAdString(str);
        com.bumptech.glide.c.U(pAGBannerRequest, str, fVar.f28536b);
        y6.f fVar2 = fVar.f28538d;
        d dVar = new d(this);
        fVar2.getClass();
        PAGBannerAd.loadAd(this.f28534c, pAGBannerRequest, dVar);
    }
}
