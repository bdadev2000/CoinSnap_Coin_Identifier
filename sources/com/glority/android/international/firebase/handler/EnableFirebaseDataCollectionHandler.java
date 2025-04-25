package com.glority.android.international.firebase.handler;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.analysis.EnableFirebaseDataCollectionRequest;
import com.glority.android.core.route.analysis.UrlTracking;
import com.glority.android.core.utils.DeviceInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import io.reactivex.Observable;
import java.util.EnumMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnableFirebaseDataCollectionHandler.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/android/international/firebase/handler/EnableFirebaseDataCollectionHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EnableFirebaseDataCollectionHandler implements RouteHandler<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> routeRequest) {
        return (Boolean) RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlTracking.INSTANCE.getURL_ENABLE_FIREBASE_DATA_COLLECTION();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof EnableFirebaseDataCollectionRequest) {
            EnableFirebaseDataCollectionRequest enableFirebaseDataCollectionRequest = (EnableFirebaseDataCollectionRequest) request;
            boolean enable = enableFirebaseDataCollectionRequest.getEnable();
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(AppContext.INSTANCE.peekContext());
            Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(AppContext.peekContext())");
            firebaseAnalytics.setAnalyticsCollectionEnabled(enable);
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(enable);
            EnumMap enumMap = new EnumMap(FirebaseAnalytics.ConsentType.class);
            FirebaseAnalytics.ConsentStatus consentStatus = enable ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED;
            enumMap.put((EnumMap) FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, (FirebaseAnalytics.ConsentType) consentStatus);
            enumMap.put((EnumMap) FirebaseAnalytics.ConsentType.AD_STORAGE, (FirebaseAnalytics.ConsentType) consentStatus);
            enumMap.put((EnumMap) FirebaseAnalytics.ConsentType.AD_USER_DATA, (FirebaseAnalytics.ConsentType) consentStatus);
            enumMap.put((EnumMap) FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, (FirebaseAnalytics.ConsentType) consentStatus);
            firebaseAnalytics.setConsent(enumMap);
            String userId = enableFirebaseDataCollectionRequest.getUserId();
            if (userId != null) {
                FirebaseAnalytics.getInstance(AppContext.INSTANCE.peekContext().getApplicationContext()).setUserId(userId);
                if (Intrinsics.areEqual(enableFirebaseDataCollectionRequest.getUserId(), LikeItem.DISLIKE)) {
                    FirebaseCrashlytics.getInstance().setUserId(DeviceInfo.INSTANCE.getId());
                } else {
                    FirebaseCrashlytics.getInstance().setUserId(userId);
                }
            }
        }
    }
}
