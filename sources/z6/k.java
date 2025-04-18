package z6;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k extends UnifiedNativeAdMapper {

    /* renamed from: b, reason: collision with root package name */
    public final MediationNativeAdConfiguration f28550b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f28551c;

    /* renamed from: d, reason: collision with root package name */
    public final y6.c f28552d;

    /* renamed from: f, reason: collision with root package name */
    public final y6.f f28553f;

    /* renamed from: g, reason: collision with root package name */
    public final y6.a f28554g;

    /* renamed from: h, reason: collision with root package name */
    public final y6.e f28555h;

    /* renamed from: i, reason: collision with root package name */
    public MediationNativeAdCallback f28556i;

    /* renamed from: j, reason: collision with root package name */
    public PAGNativeAd f28557j;

    public k(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, y6.c cVar, y6.f fVar, y6.a aVar, y6.e eVar) {
        this.f28550b = mediationNativeAdConfiguration;
        this.f28551c = mediationAdLoadCallback;
        this.f28552d = cVar;
        this.f28553f = fVar;
        this.f28554g = aVar;
        this.f28555h = eVar;
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        HashMap hashMap = new HashMap(map);
        hashMap.remove("3011");
        hashMap.remove("3012");
        View view2 = (View) hashMap.get("3002");
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.f28557j.registerViewForInteraction((ViewGroup) view, new ArrayList(hashMap.values()), arrayList, (View) null, new v3.c(this, 25));
        getAdChoicesContent().setOnClickListener(new h.b(this, 2));
    }
}
