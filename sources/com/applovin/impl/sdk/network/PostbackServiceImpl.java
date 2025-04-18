package com.applovin.impl.sdk.network;

import com.applovin.impl.gm;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.j;
import com.applovin.impl.tm;
import com.applovin.impl.yl;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import com.safedk.android.analytics.events.MaxEvent;
import java.util.Map;

/* loaded from: classes4.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a, reason: collision with root package name */
    private final j f26755a;

    public PostbackServiceImpl(j jVar) {
        this.f26755a = jVar;
    }

    private boolean a(e eVar) {
        Map i2 = eVar.i();
        if (i2 == null) {
            return false;
        }
        Object obj = i2.get(MaxEvent.f29810a);
        if ("postinstall".equals(obj)) {
            obj = i2.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(e.b(this.f26755a).b(str).a(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(e eVar, tm.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        gm gmVar = new gm(eVar, bVar, this.f26755a, appLovinPostbackListener);
        gmVar.a(a(eVar));
        this.f26755a.j0().a((yl) gmVar, bVar);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, tm.b.OTHER, appLovinPostbackListener);
    }
}
