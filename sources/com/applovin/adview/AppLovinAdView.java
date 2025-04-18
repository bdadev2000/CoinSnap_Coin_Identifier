package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.a;
import com.applovin.impl.sdk.t;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";
    private a a;

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    private void a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            a aVar = new a();
            this.a = aVar;
            aVar.a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
            return;
        }
        a(attributeSet, context);
    }

    public void destroy() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public a getController() {
        return this.a;
    }

    public AppLovinAdSize getSize() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.m();
        }
        return null;
    }

    public String getZoneId() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.n();
        }
        return null;
    }

    public void loadNextAd() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.v();
        } else {
            t.i("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.a;
        if (aVar != null) {
            aVar.A();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.B();
        }
        super.onDetachedFromWindow();
    }

    public void pause() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.E();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.c(appLovinAd);
        }
    }

    public void resume() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.G();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdViewEventListener);
        }
    }

    public void setExtraInfo(@NonNull String str, @Nullable Object obj) {
        if (str != null) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(str, obj);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    @Override // android.view.View
    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + AbstractJsonLexerKt.END_OBJ;
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        a(appLovinAdSize, str, null, context, null);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, null, context);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        a(appLovinAdSize, str, appLovinSdk, context, null);
    }

    private void a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int applyDimension = (int) TypedValue.applyDimension(1, 50.0f, displayMetrics);
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, i10, applyDimension);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(null, null, null, context, attributeSet);
    }
}
