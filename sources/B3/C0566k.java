package b3;

import a3.C0339a;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import j5.C2400c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566k extends UnifiedNativeAdMapper {
    public final MediationNativeAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f5303c;

    /* renamed from: d, reason: collision with root package name */
    public final a3.c f5304d;

    /* renamed from: f, reason: collision with root package name */
    public final a3.f f5305f;

    /* renamed from: g, reason: collision with root package name */
    public final C0339a f5306g;

    /* renamed from: h, reason: collision with root package name */
    public final a3.e f5307h;

    /* renamed from: i, reason: collision with root package name */
    public MediationNativeAdCallback f5308i;

    /* renamed from: j, reason: collision with root package name */
    public PAGNativeAd f5309j;

    public C0566k(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a3.c cVar, a3.f fVar, C0339a c0339a, a3.e eVar) {
        this.b = mediationNativeAdConfiguration;
        this.f5303c = mediationAdLoadCallback;
        this.f5304d = cVar;
        this.f5305f = fVar;
        this.f5306g = c0339a;
        this.f5307h = eVar;
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
        this.f5309j.registerViewForInteraction((ViewGroup) view, new ArrayList(hashMap.values()), arrayList, (View) null, new C2400c(this, 25));
        getAdChoicesContent().setOnClickListener(new B3.m(this, 1));
    }
}
