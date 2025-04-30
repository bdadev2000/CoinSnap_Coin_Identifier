package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractC0505o;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinSdk;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public abstract class MediationAdapterBase implements MaxAdapter, MaxNativeAdAdapter, MaxInterstitialAdViewAdapter, MaxRewardedAdViewAdapter, MaxAppOpenAdapter {
    private boolean alwaysRewardUser;
    private final t mLogger;
    private final k mSdk;
    private final String mTag;
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        k a6 = appLovinSdk.a();
        this.mSdk = a6;
        this.mLogger = a6.L();
        this.mTag = getClass().getSimpleName();
    }

    public static String mediationTag() {
        return "AppLovinSdk_" + AppLovinSdk.VERSION;
    }

    public void checkActivities(Context context, Class<?>... clsArr) {
    }

    public void checkExistence(Class<?>... clsArr) {
        if (clsArr != null && clsArr.length > 0) {
            for (Class<?> cls : clsArr) {
                log("Found: ".concat(cls.getName()));
            }
        }
    }

    public void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i9 = BundleUtils.getInt("amount", 0, serverParameters);
        String string = BundleUtils.getString(AppLovinEventParameters.REVENUE_CURRENCY, "", serverParameters);
        log("Creating reward: " + i9 + " " + string);
        this.reward = MaxRewardImpl.create(i9, string);
    }

    public Future<Drawable> createDrawableFuture(final String str, final Resources resources) {
        return getCachingExecutorService().submit(new Callable<Drawable>() { // from class: com.applovin.mediation.adapters.MediationAdapterBase.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Drawable call() throws Exception {
                InputStream openStream = FirebasePerfUrlConnection.openStream(new URL(str));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(openStream));
                openStream.close();
                return bitmapDrawable;
            }
        });
    }

    public void d(String str) {
        if (t.a()) {
            this.mLogger.a(this.mTag, str);
        }
    }

    public void e(String str) {
        if (t.a()) {
            this.mLogger.b(this.mTag, str);
        }
    }

    public Context getApplicationContext() {
        return k.k();
    }

    public ExecutorService getCachingExecutorService() {
        return this.mSdk.l0().b();
    }

    public MaxReward getReward() {
        MaxReward maxReward = this.reward;
        if (maxReward == null) {
            return MaxRewardImpl.createDefault();
        }
        return maxReward;
    }

    public String getVersionString(Class cls, String str) {
        String b = zp.b(cls, str);
        if (b == null) {
            log("Failed to retrieve version string.");
        }
        return b;
    }

    public AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    public void i(String str) {
        if (t.a()) {
            this.mLogger.d(this.mTag, str);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public boolean isBeta() {
        return false;
    }

    public void loadAppOpenAd(@NonNull MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, @NonNull MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support native ads.");
        maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void log(String str) {
        if (t.a()) {
            this.mLogger.d(this.mTag, str);
        }
    }

    public boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    @Nullable
    public Boolean shouldCollectSignalsOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    @Nullable
    public Boolean shouldInitializeOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    @Nullable
    public Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    @Nullable
    public Boolean shouldShowAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return null;
    }

    public void showAppOpenAd(@NonNull MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, @NonNull MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, AbstractC0505o abstractC0505o, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support interstitial ad view ads.");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, AbstractC0505o abstractC0505o, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support rewarded ad view ads.");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void userError(String str) {
        userError(str, null);
    }

    public void w(String str) {
        if (t.a()) {
            this.mLogger.k(this.mTag, str);
        }
    }

    public void e(String str, Throwable th) {
        if (t.a()) {
            this.mLogger.a(this.mTag, str, th);
        }
    }

    public void log(String str, Throwable th) {
        if (t.a()) {
            this.mLogger.a(this.mTag, str, th);
        }
    }

    public void userError(String str, Throwable th) {
        t.c(this.mTag, str, th);
    }
}
