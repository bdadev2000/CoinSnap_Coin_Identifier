package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.L;
import com.applovin.impl.P;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.t7;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", "paused", "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* renamed from: a, reason: collision with root package name */
    private final k f10711a;
    private final Map b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10712c = new AtomicBoolean();

    public EventServiceImpl(k kVar) {
        this.f10711a = kVar;
        if (((Boolean) kVar.a(oj.f9669S0)).booleanValue()) {
            this.b = JsonUtils.toStringObjectMap((String) kVar.a(qj.f10354C, JsonUtils.EMPTY_JSON));
        } else {
            this.b = new HashMap();
            kVar.b(qj.f10354C, JsonUtils.EMPTY_JSON);
        }
    }

    private String b() {
        return AbstractC2914a.h(new StringBuilder(), (String) this.f10711a.a(oj.f9630M0), "4.0/pix");
    }

    private void c() {
        if (((Boolean) this.f10711a.a(oj.f9669S0)).booleanValue()) {
            this.f10711a.b(qj.f10354C, CollectionUtils.toJsonString(this.b, JsonUtils.EMPTY_JSON));
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public Map<String, Object> getSuperProperties() {
        return CollectionUtils.map(this.b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f10712c.compareAndSet(false, true)) {
            this.f10711a.C().trackEvent("landing");
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            t.h("AppLovinEventService", "Super property key cannot be null or empty");
            return;
        }
        if (obj == null) {
            this.b.remove(str);
            c();
            return;
        }
        List c9 = this.f10711a.c(oj.f9663R0);
        if (!zp.a(obj, c9, this.f10711a)) {
            t.h("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + c9);
            return;
        }
        this.b.put(str, zp.a(obj, this.f10711a));
        c();
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f10711a.L();
        if (t.a()) {
            L.v("Tracking event: \"", str, "\" synchronously", this.f10711a.L(), "AppLovinEventService");
        }
        t7 t7Var = new t7(str, new HashMap(), this.b);
        Map a6 = a(t7Var, true);
        Map d2 = t7Var.d();
        if (((Boolean) this.f10711a.a(oj.B5)).booleanValue() || ((Boolean) this.f10711a.a(oj.f9877w5)).booleanValue()) {
            d2.putAll(a6);
            a6 = null;
        }
        this.f10711a.Z().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(a6).c(d2).a(a(t7Var, (Map) null)).c(((Boolean) this.f10711a.a(oj.f9628L5)).booleanValue()).a(((Boolean) this.f10711a.a(oj.f9790j5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            t.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f10711a.B().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE, map2);
    }

    private Map a(t7 t7Var, Map map) {
        Map map2 = CollectionUtils.map(map);
        boolean contains = this.f10711a.c(oj.f9656Q0).contains(t7Var.c());
        map2.put("AppLovin-Event", contains ? t7Var.c() : "postinstall");
        if (!contains) {
            map2.put("AppLovin-Sub-Event", t7Var.c());
        }
        return map2;
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, null);
    }

    public void trackEvent(String str, Map<String, String> map, Map<String, String> map2) {
        this.f10711a.L();
        if (t.a()) {
            this.f10711a.L().a("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        t7 t7Var = new t7(str, map, this.b);
        boolean contains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        try {
            this.f10711a.l0().a((xl) new kn(this.f10711a, contains, "submitTrackEventPostback", new P(this, t7Var, map2, contains)), sm.b.OTHER);
        } catch (Throwable th) {
            this.f10711a.L();
            if (t.a()) {
                this.f10711a.L().a("AppLovinEventService", "Unable to track event: " + t7Var, th);
            }
            this.f10711a.B().a("AppLovinEventService", "trackEvent", th);
        }
    }

    private Map a(t7 t7Var, boolean z8) {
        Map a6;
        boolean contains = this.f10711a.c(oj.f9656Q0).contains(t7Var.c());
        if (this.f10711a.y() != null) {
            a6 = this.f10711a.y().a(null, z8, false);
        } else {
            a6 = this.f10711a.x().a(null, z8, false);
        }
        a6.put(NotificationCompat.CATEGORY_EVENT, contains ? t7Var.c() : "postinstall");
        a6.put("event_id", t7Var.b());
        a6.put(CampaignEx.JSON_KEY_ST_TS, Long.toString(t7Var.a()));
        if (!contains) {
            a6.put("sub_event", t7Var.c());
        }
        return zp.a(a6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(t7 t7Var, Map map, boolean z8) {
        Map a6 = a(t7Var, false);
        Map d2 = t7Var.d();
        if (((Boolean) this.f10711a.a(oj.B5)).booleanValue() || ((Boolean) this.f10711a.a(oj.f9877w5)).booleanValue()) {
            d2.putAll(a6);
            a6 = null;
        }
        this.f10711a.Z().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(a6).c(d2).a(a(t7Var, map)).c(((Boolean) this.f10711a.a(oj.f9628L5)).booleanValue()).a(((Boolean) this.f10711a.a(oj.f9790j5)).booleanValue()).d(z8).a(qi.a.a(((Integer) this.f10711a.a(oj.f9856t5)).intValue())).a());
    }

    private String a() {
        return AbstractC2914a.h(new StringBuilder(), (String) this.f10711a.a(oj.f9637N0), "4.0/pix");
    }
}
