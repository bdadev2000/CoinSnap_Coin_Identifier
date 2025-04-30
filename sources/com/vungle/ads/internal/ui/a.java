package com.vungle.ads.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c7.C0665z;
import c7.I;
import com.vungle.ads.internal.presenter.A;

/* loaded from: classes3.dex */
public final class a {
    public /* synthetic */ a(G7.f fVar) {
        this();
    }

    public final String getEventId(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
            return extras.getString(i.REQUEST_KEY_EVENT_ID_EXTRA);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getPlacement(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
            return extras.getString(i.REQUEST_KEY_EXTRA);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
    }

    public final Intent createIntent(Context context, String str, String str2) {
        G7.j.e(str, "placement");
        Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Bundle bundle = new Bundle();
        bundle.putString(i.REQUEST_KEY_EXTRA, str);
        bundle.putString(i.REQUEST_KEY_EVENT_ID_EXTRA, str2);
        intent.putExtras(bundle);
        return intent;
    }

    public final C0665z getAdvertisement$vungle_ads_release() {
        C0665z c0665z;
        c0665z = i.advertisement;
        return c0665z;
    }

    public final I getBidPayload$vungle_ads_release() {
        I i9;
        i9 = i.bidPayload;
        return i9;
    }

    public final com.vungle.ads.internal.presenter.b getEventListener$vungle_ads_release() {
        com.vungle.ads.internal.presenter.b bVar;
        bVar = i.eventListener;
        return bVar;
    }

    public final A getPresenterDelegate$vungle_ads_release() {
        A a6;
        a6 = i.presenterDelegate;
        return a6;
    }

    public final void setAdvertisement$vungle_ads_release(C0665z c0665z) {
        i.advertisement = c0665z;
    }

    public final void setBidPayload$vungle_ads_release(I i9) {
        i.bidPayload = i9;
    }

    public final void setEventListener$vungle_ads_release(com.vungle.ads.internal.presenter.b bVar) {
        i.eventListener = bVar;
    }

    public final void setPresenterDelegate$vungle_ads_release(A a6) {
        i.presenterDelegate = a6;
    }

    private a() {
    }
}
