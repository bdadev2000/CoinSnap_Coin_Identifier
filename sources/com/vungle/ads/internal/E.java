package com.vungle.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import c7.C0665z;
import com.vungle.ads.C2137s;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class E {
    private static final String TAG = "ClickCoordinateTracker";
    private final C0665z advertisement;
    private final Context context;
    private final C2116w currentClick;
    private final Executor executor;
    private final InterfaceC2717f executors$delegate;
    private final InterfaceC2717f vungleApiClient$delegate;
    public static final C2117x Companion = new C2117x(null);
    private static final String MACRO_REQ_WIDTH = Pattern.quote("{{{req_width}}}");
    private static final String MACRO_REQ_HEIGHT = Pattern.quote("{{{req_height}}}");
    private static final String MACRO_WIDTH = Pattern.quote("{{{width}}}");
    private static final String MACRO_HEIGHT = Pattern.quote("{{{height}}}");
    private static final String MACRO_DOWN_X = Pattern.quote("{{{down_x}}}");
    private static final String MACRO_DOWN_Y = Pattern.quote("{{{down_y}}}");
    private static final String MACRO_UP_X = Pattern.quote("{{{up_x}}}");
    private static final String MACRO_UP_Y = Pattern.quote("{{{up_y}}}");

    public E(Context context, C0665z c0665z, Executor executor) {
        G7.j.e(context, "context");
        G7.j.e(c0665z, "advertisement");
        G7.j.e(executor, "executor");
        this.context = context;
        this.advertisement = c0665z;
        this.executor = executor;
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        EnumC2718g enumC2718g = EnumC2718g.b;
        this.vungleApiClient$delegate = AbstractC2712a.c(enumC2718g, new C(context));
        this.executors$delegate = AbstractC2712a.c(enumC2718g, new D(context));
        this.currentClick = new C2116w(new C2118y(Integer.MIN_VALUE, Integer.MIN_VALUE), new C2118y(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    public static /* synthetic */ void getCurrentClick$vungle_ads_release$annotations() {
    }

    private final int getDeviceHeight() {
        return new C2119z(this.context).getDeviceHeight();
    }

    private final int getDeviceWidth() {
        return new C2119z(this.context).getDeviceWidth();
    }

    private final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    private final int getRequestedHeight() {
        com.vungle.ads.C adSize = this.advertisement.getAdSize();
        if (adSize == null) {
            return getDeviceHeight();
        }
        return com.vungle.ads.internal.util.G.INSTANCE.dpToPixels(this.context, adSize.getHeight());
    }

    private final int getRequestedWidth() {
        com.vungle.ads.C adSize = this.advertisement.getAdSize();
        if (adSize == null) {
            return getDeviceWidth();
        }
        return com.vungle.ads.internal.util.G.INSTANCE.dpToPixels(this.context, adSize.getWidth());
    }

    private final com.vungle.ads.internal.network.y getVungleApiClient() {
        return (com.vungle.ads.internal.network.y) this.vungleApiClient$delegate.getValue();
    }

    private final void sendClickCoordinates() {
        List<String> tpatUrls$default = C0665z.getTpatUrls$default(this.advertisement, C0665z.TPAT_CLICK_COORDINATES_URLS, null, null, 6, null);
        List list = tpatUrls$default;
        if (list != null && !list.isEmpty()) {
            int requestedWidth = getRequestedWidth();
            int requestedHeight = getRequestedHeight();
            int requestedWidth2 = getRequestedWidth();
            int requestedHeight2 = getRequestedHeight();
            ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
            Context context = this.context;
            EnumC2718g enumC2718g = EnumC2718g.b;
            com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(getVungleApiClient(), this.advertisement.placementId(), this.advertisement.getCreativeId(), this.advertisement.eventId(), ((com.vungle.ads.internal.executor.f) getExecutors()).getIoExecutor(), m19sendClickCoordinates$lambda0(AbstractC2712a.c(enumC2718g, new A(context))), m20sendClickCoordinates$lambda1(AbstractC2712a.c(enumC2718g, new B(this.context))));
            for (String str : tpatUrls$default) {
                String str2 = MACRO_REQ_WIDTH;
                G7.j.d(str2, "MACRO_REQ_WIDTH");
                Pattern compile = Pattern.compile(str2);
                G7.j.d(compile, "compile(...)");
                String valueOf = String.valueOf(requestedWidth);
                G7.j.e(str, "input");
                G7.j.e(valueOf, "replacement");
                String replaceAll = compile.matcher(str).replaceAll(valueOf);
                G7.j.d(replaceAll, "replaceAll(...)");
                String str3 = MACRO_REQ_HEIGHT;
                G7.j.d(str3, "MACRO_REQ_HEIGHT");
                Pattern compile2 = Pattern.compile(str3);
                G7.j.d(compile2, "compile(...)");
                String valueOf2 = String.valueOf(requestedHeight);
                G7.j.e(valueOf2, "replacement");
                String replaceAll2 = compile2.matcher(replaceAll).replaceAll(valueOf2);
                G7.j.d(replaceAll2, "replaceAll(...)");
                String str4 = MACRO_WIDTH;
                G7.j.d(str4, "MACRO_WIDTH");
                Pattern compile3 = Pattern.compile(str4);
                G7.j.d(compile3, "compile(...)");
                String valueOf3 = String.valueOf(requestedWidth2);
                G7.j.e(valueOf3, "replacement");
                String replaceAll3 = compile3.matcher(replaceAll2).replaceAll(valueOf3);
                G7.j.d(replaceAll3, "replaceAll(...)");
                String str5 = MACRO_HEIGHT;
                G7.j.d(str5, "MACRO_HEIGHT");
                Pattern compile4 = Pattern.compile(str5);
                G7.j.d(compile4, "compile(...)");
                String valueOf4 = String.valueOf(requestedHeight2);
                G7.j.e(valueOf4, "replacement");
                String replaceAll4 = compile4.matcher(replaceAll3).replaceAll(valueOf4);
                G7.j.d(replaceAll4, "replaceAll(...)");
                String str6 = MACRO_DOWN_X;
                G7.j.d(str6, "MACRO_DOWN_X");
                Pattern compile5 = Pattern.compile(str6);
                G7.j.d(compile5, "compile(...)");
                String valueOf5 = String.valueOf(this.currentClick.getDownCoordinate().getX());
                G7.j.e(valueOf5, "replacement");
                String replaceAll5 = compile5.matcher(replaceAll4).replaceAll(valueOf5);
                G7.j.d(replaceAll5, "replaceAll(...)");
                String str7 = MACRO_DOWN_Y;
                G7.j.d(str7, "MACRO_DOWN_Y");
                Pattern compile6 = Pattern.compile(str7);
                G7.j.d(compile6, "compile(...)");
                String valueOf6 = String.valueOf(this.currentClick.getDownCoordinate().getY());
                G7.j.e(valueOf6, "replacement");
                String replaceAll6 = compile6.matcher(replaceAll5).replaceAll(valueOf6);
                G7.j.d(replaceAll6, "replaceAll(...)");
                String str8 = MACRO_UP_X;
                G7.j.d(str8, "MACRO_UP_X");
                Pattern compile7 = Pattern.compile(str8);
                G7.j.d(compile7, "compile(...)");
                String valueOf7 = String.valueOf(this.currentClick.getUpCoordinate().getX());
                G7.j.e(valueOf7, "replacement");
                String replaceAll7 = compile7.matcher(replaceAll6).replaceAll(valueOf7);
                G7.j.d(replaceAll7, "replaceAll(...)");
                String str9 = MACRO_UP_Y;
                G7.j.d(str9, "MACRO_UP_Y");
                Pattern compile8 = Pattern.compile(str9);
                G7.j.d(compile8, "compile(...)");
                String valueOf8 = String.valueOf(this.currentClick.getUpCoordinate().getY());
                G7.j.e(valueOf8, "replacement");
                String replaceAll8 = compile8.matcher(replaceAll7).replaceAll(valueOf8);
                G7.j.d(replaceAll8, "replaceAll(...)");
                lVar.sendTpat(replaceAll8, this.executor);
            }
            return;
        }
        C2137s.INSTANCE.logError$vungle_ads_release(129, "Empty tpat key: click_coordinate", this.advertisement.placementId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
    }

    /* renamed from: sendClickCoordinates$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.util.x m19sendClickCoordinates$lambda0(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.util.x) interfaceC2717f.getValue();
    }

    /* renamed from: sendClickCoordinates$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.signals.j m20sendClickCoordinates$lambda1(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.signals.j) interfaceC2717f.getValue();
    }

    public final C2116w getCurrentClick$vungle_ads_release() {
        return this.currentClick;
    }

    public final void trackCoordinate(MotionEvent motionEvent) {
        G7.j.e(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (!this.advertisement.isClickCoordinatesTrackingEnabled()) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.currentClick.setUpCoordinate(new C2118y((int) motionEvent.getX(), (int) motionEvent.getY()));
                if (this.currentClick.ready()) {
                    sendClickCoordinates();
                    return;
                }
                return;
            }
            return;
        }
        this.currentClick.setDownCoordinate(new C2118y((int) motionEvent.getX(), (int) motionEvent.getY()));
    }
}
