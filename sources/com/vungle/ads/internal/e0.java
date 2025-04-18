package com.vungle.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.e3;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class e0 {
    private static final String TAG = "ClickCoordinateTracker";
    private final bh.z advertisement;
    private final Context context;
    private final w currentClick;
    private final Executor executor;
    private final Lazy executors$delegate;
    private final Lazy vungleApiClient$delegate;
    public static final x Companion = new x(null);
    private static final String MACRO_REQ_WIDTH = Pattern.quote("{{{req_width}}}");
    private static final String MACRO_REQ_HEIGHT = Pattern.quote("{{{req_height}}}");
    private static final String MACRO_WIDTH = Pattern.quote("{{{width}}}");
    private static final String MACRO_HEIGHT = Pattern.quote("{{{height}}}");
    private static final String MACRO_DOWN_X = Pattern.quote("{{{down_x}}}");
    private static final String MACRO_DOWN_Y = Pattern.quote("{{{down_y}}}");
    private static final String MACRO_UP_X = Pattern.quote("{{{up_x}}}");
    private static final String MACRO_UP_Y = Pattern.quote("{{{up_y}}}");

    public e0(Context context, bh.z advertisement, Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.context = context;
        this.advertisement = advertisement;
        this.executor = executor;
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.vungleApiClient$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new c0(context));
        this.executors$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new d0(context));
        this.currentClick = new w(new y(Integer.MIN_VALUE, Integer.MIN_VALUE), new y(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    public static /* synthetic */ void getCurrentClick$vungle_ads_release$annotations() {
    }

    private final int getDeviceHeight() {
        return new z(this.context).getDeviceHeight();
    }

    private final int getDeviceWidth() {
        return new z(this.context).getDeviceWidth();
    }

    private final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    private final int getRequestedHeight() {
        com.vungle.ads.c0 adSize = this.advertisement.getAdSize();
        if (adSize == null) {
            return getDeviceHeight();
        }
        return com.vungle.ads.internal.util.g0.INSTANCE.dpToPixels(this.context, adSize.getHeight());
    }

    private final int getRequestedWidth() {
        com.vungle.ads.c0 adSize = this.advertisement.getAdSize();
        if (adSize == null) {
            return getDeviceWidth();
        }
        return com.vungle.ads.internal.util.g0.INSTANCE.dpToPixels(this.context, adSize.getWidth());
    }

    private final com.vungle.ads.internal.network.y getVungleApiClient() {
        return (com.vungle.ads.internal.network.y) this.vungleApiClient$delegate.getValue();
    }

    private final void sendClickCoordinates() {
        boolean z10;
        List<String> tpatUrls$default = bh.z.getTpatUrls$default(this.advertisement, bh.z.TPAT_CLICK_COORDINATES_URLS, null, null, 6, null);
        List list = tpatUrls$default;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(129, "Empty tpat key: click_coordinate", this.advertisement.placementId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
            return;
        }
        int requestedWidth = getRequestedWidth();
        int requestedHeight = getRequestedHeight();
        int requestedWidth2 = getRequestedWidth();
        int requestedHeight2 = getRequestedHeight();
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        Context context = this.context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(getVungleApiClient(), this.advertisement.placementId(), this.advertisement.getCreativeId(), this.advertisement.eventId(), ((com.vungle.ads.internal.executor.f) getExecutors()).getIoExecutor(), m21sendClickCoordinates$lambda0(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new a0(context))), m22sendClickCoordinates$lambda1(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new b0(this.context))));
        for (String str : tpatUrls$default) {
            String MACRO_REQ_WIDTH2 = MACRO_REQ_WIDTH;
            Intrinsics.checkNotNullExpressionValue(MACRO_REQ_WIDTH2, "MACRO_REQ_WIDTH");
            String replace = new Regex(MACRO_REQ_WIDTH2).replace(str, String.valueOf(requestedWidth));
            String MACRO_REQ_HEIGHT2 = MACRO_REQ_HEIGHT;
            Intrinsics.checkNotNullExpressionValue(MACRO_REQ_HEIGHT2, "MACRO_REQ_HEIGHT");
            String replace2 = new Regex(MACRO_REQ_HEIGHT2).replace(replace, String.valueOf(requestedHeight));
            String MACRO_WIDTH2 = MACRO_WIDTH;
            Intrinsics.checkNotNullExpressionValue(MACRO_WIDTH2, "MACRO_WIDTH");
            String replace3 = new Regex(MACRO_WIDTH2).replace(replace2, String.valueOf(requestedWidth2));
            String MACRO_HEIGHT2 = MACRO_HEIGHT;
            Intrinsics.checkNotNullExpressionValue(MACRO_HEIGHT2, "MACRO_HEIGHT");
            String replace4 = new Regex(MACRO_HEIGHT2).replace(replace3, String.valueOf(requestedHeight2));
            String MACRO_DOWN_X2 = MACRO_DOWN_X;
            Intrinsics.checkNotNullExpressionValue(MACRO_DOWN_X2, "MACRO_DOWN_X");
            String replace5 = new Regex(MACRO_DOWN_X2).replace(replace4, String.valueOf(this.currentClick.getDownCoordinate().getX()));
            String MACRO_DOWN_Y2 = MACRO_DOWN_Y;
            Intrinsics.checkNotNullExpressionValue(MACRO_DOWN_Y2, "MACRO_DOWN_Y");
            String replace6 = new Regex(MACRO_DOWN_Y2).replace(replace5, String.valueOf(this.currentClick.getDownCoordinate().getY()));
            String MACRO_UP_X2 = MACRO_UP_X;
            Intrinsics.checkNotNullExpressionValue(MACRO_UP_X2, "MACRO_UP_X");
            String replace7 = new Regex(MACRO_UP_X2).replace(replace6, String.valueOf(this.currentClick.getUpCoordinate().getX()));
            String MACRO_UP_Y2 = MACRO_UP_Y;
            Intrinsics.checkNotNullExpressionValue(MACRO_UP_Y2, "MACRO_UP_Y");
            lVar.sendTpat(new Regex(MACRO_UP_Y2).replace(replace7, String.valueOf(this.currentClick.getUpCoordinate().getY())), this.executor);
        }
    }

    /* renamed from: sendClickCoordinates$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.util.x m21sendClickCoordinates$lambda0(Lazy<com.vungle.ads.internal.util.x> lazy) {
        return lazy.getValue();
    }

    /* renamed from: sendClickCoordinates$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.signals.j m22sendClickCoordinates$lambda1(Lazy<com.vungle.ads.internal.signals.j> lazy) {
        return lazy.getValue();
    }

    public final w getCurrentClick$vungle_ads_release() {
        return this.currentClick;
    }

    public final void trackCoordinate(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.advertisement.isClickCoordinatesTrackingEnabled()) {
            return;
        }
        int action = event.getAction();
        if (action != 0) {
            if (action == 1) {
                this.currentClick.setUpCoordinate(new y((int) event.getX(), (int) event.getY()));
                if (this.currentClick.ready()) {
                    sendClickCoordinates();
                    return;
                }
                return;
            }
            return;
        }
        this.currentClick.setDownCoordinate(new y((int) event.getX(), (int) event.getY()));
    }
}
