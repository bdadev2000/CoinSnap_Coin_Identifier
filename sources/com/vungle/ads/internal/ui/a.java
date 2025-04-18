package com.vungle.ads.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bh.i0;
import bh.z;
import com.vungle.ads.internal.presenter.a0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String getEventId(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString(i.REQUEST_KEY_EVENT_ID_EXTRA);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getPlacement(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString(i.REQUEST_KEY_EXTRA);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
    }

    public final Intent createIntent(Context context, String placement, String str) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Bundle bundle = new Bundle();
        bundle.putString(i.REQUEST_KEY_EXTRA, placement);
        bundle.putString(i.REQUEST_KEY_EVENT_ID_EXTRA, str);
        intent.putExtras(bundle);
        return intent;
    }

    public final z getAdvertisement$vungle_ads_release() {
        z zVar;
        zVar = i.advertisement;
        return zVar;
    }

    public final i0 getBidPayload$vungle_ads_release() {
        i0 i0Var;
        i0Var = i.bidPayload;
        return i0Var;
    }

    public final com.vungle.ads.internal.presenter.b getEventListener$vungle_ads_release() {
        com.vungle.ads.internal.presenter.b bVar;
        bVar = i.eventListener;
        return bVar;
    }

    public final a0 getPresenterDelegate$vungle_ads_release() {
        a0 a0Var;
        a0Var = i.presenterDelegate;
        return a0Var;
    }

    public final void setAdvertisement$vungle_ads_release(z zVar) {
        i.advertisement = zVar;
    }

    public final void setBidPayload$vungle_ads_release(i0 i0Var) {
        i.bidPayload = i0Var;
    }

    public final void setEventListener$vungle_ads_release(com.vungle.ads.internal.presenter.b bVar) {
        i.eventListener = bVar;
    }

    public final void setPresenterDelegate$vungle_ads_release(a0 a0Var) {
        i.presenterDelegate = a0Var;
    }
}
