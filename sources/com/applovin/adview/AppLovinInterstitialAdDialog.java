package com.applovin.adview;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractC0505o;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

/* loaded from: classes.dex */
public interface AppLovinInterstitialAdDialog {
    void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener);

    void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener);

    void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener);

    void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener);

    void setExtraInfo(@NonNull String str, @Nullable Object obj);

    void show();

    void showAndRender(AppLovinAd appLovinAd);

    void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, AbstractC0505o abstractC0505o);
}
