package com.applovin.impl.sdk;

import android.content.Intent;
import com.applovin.impl.jn;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tm;
import com.applovin.impl.v7;
import com.applovin.impl.vi;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.events.MaxEvent;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", SafeDKWebAppInterface.d, "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* renamed from: a, reason: collision with root package name */
    private final j f26518a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f26519b = new AtomicBoolean();

    public EventServiceImpl(j jVar) {
        this.f26518a = jVar;
    }

    private String b() {
        return android.support.v4.media.d.r(new StringBuilder(), (String) this.f26518a.a(sj.P0), "4.0/pix");
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f26519b.compareAndSet(false, true)) {
            this.f26518a.A().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put("transaction_id", str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f26518a.J();
        if (n.a()) {
            this.f26518a.J().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        v7 v7Var = new v7(str, new HashMap());
        Map a2 = a(v7Var, true);
        HashMap hashMap = new HashMap(v7Var.d());
        if (((Boolean) this.f26518a.a(sj.G5)).booleanValue() || ((Boolean) this.f26518a.a(sj.B5)).booleanValue()) {
            hashMap.putAll(a2);
            a2 = null;
        }
        this.f26518a.X().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(a2).c(hashMap).a(a(v7Var, (Map) null)).c(((Boolean) this.f26518a.a(sj.Q5)).booleanValue()).a(((Boolean) this.f26518a.a(sj.o5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            n.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f26518a.E().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE, map2);
    }

    private Map a(v7 v7Var, Map map) {
        Map map2 = CollectionUtils.map(map);
        boolean contains = this.f26518a.c(sj.U0).contains(v7Var.c());
        map2.put("AppLovin-Event", contains ? v7Var.c() : "postinstall");
        if (!contains) {
            map2.put("AppLovin-Sub-Event", v7Var.c());
        }
        return map2;
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, null);
    }

    public void trackEvent(String str, Map<String, String> map, Map<String, String> map2) {
        this.f26518a.J();
        if (n.a()) {
            this.f26518a.J().a("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        v7 v7Var = new v7(str, map);
        boolean contains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        try {
            this.f26518a.j0().a((yl) new jn(this.f26518a, contains, "submitTrackEventPostback", new androidx.fragment.app.a(this, v7Var, map2, contains, 7)), tm.b.OTHER);
        } catch (Throwable th) {
            this.f26518a.J();
            if (n.a()) {
                this.f26518a.J().a("AppLovinEventService", "Unable to track event: " + v7Var, th);
            }
            this.f26518a.E().a("AppLovinEventService", "trackEvent", th);
        }
    }

    private Map a(v7 v7Var, boolean z2) {
        boolean contains = this.f26518a.c(sj.U0).contains(v7Var.c());
        Map a2 = this.f26518a.y().a(null, z2, false);
        a2.put(MaxEvent.f29810a, contains ? v7Var.c() : "postinstall");
        a2.put("event_id", v7Var.b());
        a2.put(MaxEvent.f29811b, Long.toString(v7Var.a()));
        if (!contains) {
            a2.put("sub_event", v7Var.c());
        }
        return yp.a(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(v7 v7Var, Map map, boolean z2) {
        Map a2 = a(v7Var, false);
        HashMap hashMap = new HashMap(v7Var.d());
        if (((Boolean) this.f26518a.a(sj.G5)).booleanValue() || ((Boolean) this.f26518a.a(sj.B5)).booleanValue()) {
            hashMap.putAll(a2);
            a2 = null;
        }
        this.f26518a.X().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(a2).c(hashMap).a(a(v7Var, map)).c(((Boolean) this.f26518a.a(sj.Q5)).booleanValue()).a(((Boolean) this.f26518a.a(sj.o5)).booleanValue()).d(z2).a(vi.a.a(((Integer) this.f26518a.a(sj.y5)).intValue())).a());
    }

    private String a() {
        return android.support.v4.media.d.r(new StringBuilder(), (String) this.f26518a.a(sj.Q0), "4.0/pix");
    }
}
