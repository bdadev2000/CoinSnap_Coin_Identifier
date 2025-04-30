package b3;

import a3.C0339a;
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
import w4.v0;
import y2.AbstractC2947c;

/* renamed from: b3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560e implements a3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5286a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0561f f5288d;

    public C0560e(C0561f c0561f, Context context, String str, String str2) {
        this.f5288d = c0561f;
        this.f5286a = context;
        this.b = str;
        this.f5287c = str2;
    }

    @Override // a3.b
    public final void a(AdError adError) {
        Log.w(PangleMediationAdapter.TAG, adError.toString());
        this.f5288d.f5289c.onFailure(adError);
    }

    @Override // a3.b
    public final void b() {
        C0561f c0561f = this.f5288d;
        AdSize adSize = c0561f.b.getAdSize();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new AdSize(320, 50));
        arrayList.add(new AdSize(300, 250));
        arrayList.add(new AdSize(728, 90));
        Context context = this.f5286a;
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize == null) {
            AdError h6 = v0.h(102, "Failed to request banner ad from Pangle. Invalid banner size.");
            Log.w(PangleMediationAdapter.TAG, h6.toString());
            c0561f.f5289c.onFailure(h6);
            return;
        }
        c0561f.f5293h = new FrameLayout(context);
        C0339a c0339a = c0561f.f5291f;
        PAGBannerSize pAGBannerSize = new PAGBannerSize(findClosestSize.getWidth(), findClosestSize.getHeight());
        c0339a.getClass();
        PAGBannerRequest pAGBannerRequest = new PAGBannerRequest(pAGBannerSize);
        String str = this.b;
        pAGBannerRequest.setAdString(str);
        AbstractC2947c.y(pAGBannerRequest, str, c0561f.b);
        a3.f fVar = c0561f.f5290d;
        C0559d c0559d = new C0559d(this);
        fVar.getClass();
        PAGBannerAd.loadAd(this.f5287c, pAGBannerRequest, c0559d);
    }
}
