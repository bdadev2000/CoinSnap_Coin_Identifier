package androidx.fragment.app;

import androidx.collection.ArrayMap;
import androidx.fragment.app.SpecialEffectsController;
import com.applovin.impl.gc;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.v7;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19880c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19881f;

    public /* synthetic */ a(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z2, ArrayMap arrayMap) {
        this.f19878a = 0;
        this.f19880c = operation;
        this.d = operation2;
        this.f19879b = z2;
        this.f19881f = arrayMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f19878a;
        boolean z2 = this.f19879b;
        Object obj = this.f19881f;
        Object obj2 = this.d;
        Object obj3 = this.f19880c;
        switch (i2) {
            case 0:
                ArrayMap arrayMap = (ArrayMap) obj;
                p0.a.s(arrayMap, "$lastInViews");
                FragmentTransition.a(((SpecialEffectsController.Operation) obj3).f19867c, ((SpecialEffectsController.Operation) obj2).f19867c, z2, arrayMap);
                return;
            case 1:
                gc.a(z2, (MaxAdExpirationListener) obj3, (MaxAd) obj2, (MaxAd) obj);
                return;
            case 2:
                gc.a(z2, (MaxAdListener) obj3, (MaxAd) obj2, (MaxError) obj);
                return;
            case 3:
                gc.a(z2, (MaxNativeAdListener) obj3, (MaxNativeAdView) obj2, (MaxAd) obj);
                return;
            case 4:
                gc.a(z2, (MaxAdListener) obj3, (String) obj2, (MaxError) obj);
                return;
            case 5:
                gc.a(z2, (MaxAdListener) obj3, (MaxAd) obj2, (MaxReward) obj);
                return;
            case 6:
                gc.a(z2, (MaxNativeAdListener) obj3, (String) obj2, (MaxError) obj);
                return;
            case 7:
                ((EventServiceImpl) obj3).a((v7) obj2, (Map) obj, z2);
                return;
            default:
                ((SessionReportingCoordinator) obj3).lambda$persistEvent$0((CrashlyticsReport.Session.Event) obj2, (String) obj, z2);
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, boolean z2, int i2) {
        this.f19878a = i2;
        this.f19880c = obj;
        this.d = obj2;
        this.f19881f = obj3;
        this.f19879b = z2;
    }

    public /* synthetic */ a(boolean z2, Object obj, Object obj2, Object obj3, int i2) {
        this.f19878a = i2;
        this.f19879b = z2;
        this.f19880c = obj;
        this.d = obj2;
        this.f19881f = obj3;
    }
}
