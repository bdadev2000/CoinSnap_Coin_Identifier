package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
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

/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", "paused", "resumed", "cf_start", "tos_ok", "gdpr_ok");
    private final k a;

    /* renamed from: b */
    private final Map f7566b;

    /* renamed from: c */
    private final AtomicBoolean f7567c = new AtomicBoolean();

    public EventServiceImpl(k kVar) {
        this.a = kVar;
        if (((Boolean) kVar.a(oj.S0)).booleanValue()) {
            this.f7566b = JsonUtils.toStringObjectMap((String) kVar.a(qj.C, JsonUtils.EMPTY_JSON));
        } else {
            this.f7566b = new HashMap();
            kVar.b(qj.C, JsonUtils.EMPTY_JSON);
        }
    }

    public static /* synthetic */ void a(EventServiceImpl eventServiceImpl, t7 t7Var, Map map, boolean z10) {
        eventServiceImpl.a(t7Var, map, z10);
    }

    private String b() {
        return vd.e.h(new StringBuilder(), (String) this.a.a(oj.M0), "4.0/pix");
    }

    private void c() {
        if (((Boolean) this.a.a(oj.S0)).booleanValue()) {
            this.a.b(qj.C, CollectionUtils.toJsonString(this.f7566b, JsonUtils.EMPTY_JSON));
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public Map<String, Object> getSuperProperties() {
        return CollectionUtils.map(this.f7566b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f7567c.compareAndSet(false, true)) {
            this.a.C().trackEvent("landing");
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            t.h("AppLovinEventService", "Super property key cannot be null or empty");
            return;
        }
        if (obj == null) {
            this.f7566b.remove(str);
            c();
            return;
        }
        List c10 = this.a.c(oj.R0);
        if (!zp.a(obj, c10, this.a)) {
            t.h("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + c10);
            return;
        }
        this.f7566b.put(str, zp.a(obj, this.a));
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
        this.a.L();
        if (t.a()) {
            a4.j.x("Tracking event: \"", str, "\" synchronously", this.a.L(), "AppLovinEventService");
        }
        t7 t7Var = new t7(str, new HashMap(), this.f7566b);
        Map a = a(t7Var, true);
        Map d10 = t7Var.d();
        if (((Boolean) this.a.a(oj.B5)).booleanValue() || ((Boolean) this.a.a(oj.f6784w5)).booleanValue()) {
            d10.putAll(a);
            a = null;
        }
        this.a.Z().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(a).c(d10).a(a(t7Var, (Map) null)).c(((Boolean) this.a.a(oj.L5)).booleanValue()).a(((Boolean) this.a.a(oj.f6685j5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th2) {
            t.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th2);
            this.a.B().a("AppLovinEventService", "trackIAP", th2);
        }
        trackEvent(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE, map2);
    }

    private Map a(t7 t7Var, Map map) {
        Map map2 = CollectionUtils.map(map);
        boolean contains = this.a.c(oj.Q0).contains(t7Var.c());
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
        this.a.L();
        if (t.a()) {
            this.a.L().a("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        t7 t7Var = new t7(str, map, this.f7566b);
        boolean contains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        try {
            this.a.l0().a((xl) new kn(this.a, contains, "submitTrackEventPostback", new androidx.fragment.app.d(this, t7Var, map2, contains, 7)), sm.b.OTHER);
        } catch (Throwable th2) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("AppLovinEventService", "Unable to track event: " + t7Var, th2);
            }
            this.a.B().a("AppLovinEventService", "trackEvent", th2);
        }
    }

    private Map a(t7 t7Var, boolean z10) {
        Map a;
        boolean contains = this.a.c(oj.Q0).contains(t7Var.c());
        if (this.a.y() != null) {
            a = this.a.y().a(null, z10, false);
        } else {
            a = this.a.x().a(null, z10, false);
        }
        a.put(NotificationCompat.CATEGORY_EVENT, contains ? t7Var.c() : "postinstall");
        a.put("event_id", t7Var.b());
        a.put(CampaignEx.JSON_KEY_ST_TS, Long.toString(t7Var.a()));
        if (!contains) {
            a.put("sub_event", t7Var.c());
        }
        return zp.a(a);
    }

    public /* synthetic */ void a(t7 t7Var, Map map, boolean z10) {
        Map a = a(t7Var, false);
        Map d10 = t7Var.d();
        if (((Boolean) this.a.a(oj.B5)).booleanValue() || ((Boolean) this.a.a(oj.f6784w5)).booleanValue()) {
            d10.putAll(a);
            a = null;
        }
        this.a.Z().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(a).c(d10).a(a(t7Var, map)).c(((Boolean) this.a.a(oj.L5)).booleanValue()).a(((Boolean) this.a.a(oj.f6685j5)).booleanValue()).d(z10).a(qi.a.a(((Integer) this.a.a(oj.t5)).intValue())).a());
    }

    private String a() {
        return vd.e.h(new StringBuilder(), (String) this.a.a(oj.N0), "4.0/pix");
    }
}
