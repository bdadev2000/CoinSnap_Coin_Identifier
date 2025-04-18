package androidx.compose.animation.core;

import android.os.Bundle;
import android.support.v4.media.d;
import androidx.arch.core.util.Function;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.text.TextInclusionStrategy;
import com.applovin.impl.adview.b;
import com.applovin.impl.adview.m;
import com.applovin.impl.e5;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.tl;
import com.applovin.impl.tr;
import com.applovin.impl.vb;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.cooldev.gba.emulator.gameboy.MyApplication;
import com.cooldev.gba.emulator.gameboy.features.in_app_update.InAppUpdateManager;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsManager$start$1;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Easing, DoubleFunction, TextInclusionStrategy, vb.b, Function, AppLovinSdk.SdkInitializationListener, FeatureManager.Callback, FacebookSdk.GraphRequestCreator, OnFailureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2406b;

    public /* synthetic */ a(int i2) {
        this.f2406b = i2;
    }

    @Override // com.applovin.impl.vb.b
    public void a(Object obj) {
        tr.d((b) obj);
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        m s2;
        Boolean u2;
        String n2;
        Boolean v2;
        Bundle k2;
        e5 h2;
        String p2;
        Boolean t2;
        String o2;
        Map m2;
        Bundle lambda$getDirectDownloadParameters$4;
        tl tlVar = (tl) obj;
        switch (this.f2406b) {
            case 8:
                s2 = com.applovin.impl.sdk.ad.b.s(tlVar);
                return s2;
            case 9:
                u2 = com.applovin.impl.sdk.ad.b.u(tlVar);
                return u2;
            case 10:
                n2 = com.applovin.impl.sdk.ad.b.n(tlVar);
                return n2;
            case 11:
                v2 = com.applovin.impl.sdk.ad.b.v(tlVar);
                return v2;
            case 12:
                k2 = com.applovin.impl.sdk.ad.b.k(tlVar);
                return k2;
            case 13:
                h2 = com.applovin.impl.sdk.ad.b.h(tlVar);
                return h2;
            case 14:
                p2 = com.applovin.impl.sdk.ad.b.p(tlVar);
                return p2;
            case 15:
                t2 = com.applovin.impl.sdk.ad.b.t(tlVar);
                return t2;
            case 16:
                o2 = com.applovin.impl.sdk.ad.b.o(tlVar);
                return o2;
            case 17:
                m2 = com.applovin.impl.sdk.ad.b.m(tlVar);
                return m2;
            default:
                lambda$getDirectDownloadParameters$4 = AppLovinNativeAdImpl.lambda$getDirectDownloadParameters$4(tlVar);
                return lambda$getDirectDownloadParameters$4;
        }
    }

    @Override // androidx.compose.animation.core.Easing
    public float b(float f2) {
        switch (this.f2406b) {
            case 3:
                int i2 = EasingFunctionsKt.f2082a;
                if (f2 < 0.36363637f) {
                    return 7.5625f * f2 * f2;
                }
                if (f2 < 0.72727275f) {
                    float f3 = f2 - 0.54545456f;
                    return d.D(f3, 7.5625f, f3, 0.75f);
                }
                if (f2 < 0.90909094f) {
                    float f4 = f2 - 0.8181818f;
                    return d.D(f4, 7.5625f, f4, 0.9375f);
                }
                float f5 = f2 - 0.95454544f;
                return d.D(f5, 7.5625f, f5, 0.984375f);
            default:
                CubicBezierEasing cubicBezierEasing = EasingKt.f2083a;
                return f2;
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double c(double d) {
        switch (this.f2406b) {
            case 0:
                float[] fArr = ColorSpaces.f15073a;
                double d2 = d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 1:
                float[] fArr2 = ColorSpaces.f15073a;
                double d3 = d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d3, d);
            default:
                return d;
        }
    }

    @Override // com.facebook.FacebookSdk.GraphRequestCreator
    public GraphRequest createPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        GraphRequest m417graphRequestCreator$lambda0;
        m417graphRequestCreator$lambda0 = FacebookSdk.m417graphRequestCreator$lambda0(accessToken, str, jSONObject, callback);
        return m417graphRequestCreator$lambda0;
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z2) {
        switch (this.f2406b) {
            case 20:
                FacebookSdk.m420sdkInitialize$lambda4(z2);
                return;
            case 21:
                FacebookSdk.m421sdkInitialize$lambda5(z2);
                return;
            case 22:
                FacebookSdk.m422sdkInitialize$lambda6(z2);
                return;
            case 23:
                FacebookSdk.m423sdkInitialize$lambda7(z2);
                return;
            case 24:
                FacebookSdk.m424sdkInitialize$lambda8(z2);
                return;
            case 25:
            default:
                AppEventsManager$start$1.a(z2);
                return;
            case 26:
                AppEventsManager$start$1.f(z2);
                return;
            case 27:
                AppEventsManager$start$1.c(z2);
                return;
            case 28:
                AppEventsManager$start$1.k(z2);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.f2406b) {
            case 0:
                InAppUpdateManager.checkForUpdate$lambda$1(exc);
                return;
            default:
                FirebaseCrashlytics.a(exc);
                return;
        }
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        MyApplication.a(appLovinSdkConfiguration);
    }

    @Override // androidx.compose.ui.text.TextInclusionStrategy
    public boolean a(Rect rect, Rect rect2) {
        switch (this.f2406b) {
            case 3:
                return rect.k(rect2);
            default:
                return rect2.a(rect.d());
        }
    }
}
