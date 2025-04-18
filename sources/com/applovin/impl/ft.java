package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.v;
import com.applovin.sdk.AppLovinAd;
import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24032c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24033f;

    public /* synthetic */ ft(int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f24030a = i2;
        this.f24031b = obj;
        this.f24033f = str;
        this.f24032c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24030a;
        Object obj = this.d;
        Object obj2 = this.f24032c;
        Object obj3 = this.f24033f;
        Object obj4 = this.f24031b;
        switch (i2) {
            case 0:
                d5.a((d5) obj4, (com.applovin.impl.adview.a) obj2, (Activity) obj, (String) obj3);
                return;
            case 1:
                gc.b((AppLovinAdViewEventListener) obj4, (AppLovinAd) obj2, (AppLovinAdView) obj, (AppLovinAdViewDisplayErrorCode) obj3);
                return;
            case 2:
                ((ma) obj4).b((la) obj2, obj, (List) obj3);
                return;
            case 3:
                ImageViewUtils.a((com.applovin.impl.sdk.j) obj4, (String) obj3, (ImageView) obj2, (Uri) obj);
                return;
            case 4:
                ((tb) obj4).a((ViewGroup) obj2, (Context) obj, (AppLovinFullscreenAdViewObserver) obj3);
                return;
            case 5:
                v.a((v) obj4, (v.b) obj2, (String) obj3, (String) obj);
                return;
            case 6:
                ViewOnClickListener.m489predictAndProcess$lambda0((JSONObject) obj4, (String) obj3, (ViewOnClickListener) obj2, (String) obj);
                return;
            case 7:
                ((DefaultScheduler) obj4).lambda$schedule$1((TransportContext) obj2, (TransportScheduleCallback) obj, (EventInternal) obj3);
                return;
            default:
                ((UserMetadata) obj4).lambda$setNewSession$0((String) obj3, (Map) obj2, (List) obj);
                return;
        }
    }

    public /* synthetic */ ft(v vVar, v.b bVar, String str, String str2) {
        this.f24030a = 5;
        this.f24031b = vVar;
        this.f24032c = bVar;
        this.f24033f = str;
        this.d = str2;
    }

    public /* synthetic */ ft(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f24030a = i2;
        this.f24031b = obj;
        this.f24032c = obj2;
        this.d = obj3;
        this.f24033f = obj4;
    }
}
