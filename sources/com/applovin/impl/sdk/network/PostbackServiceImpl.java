package com.applovin.impl.sdk.network;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.fm;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

/* loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {
    private final k a;

    public PostbackServiceImpl(k kVar) {
        this.a = kVar;
    }

    private boolean a(e eVar) {
        Map i10 = eVar.i();
        if (i10 == null) {
            return false;
        }
        Object obj = i10.get(NotificationCompat.CATEGORY_EVENT);
        if ("postinstall".equals(obj)) {
            obj = i10.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(e.b(this.a).b(str).a(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(e eVar, sm.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        fm fmVar = new fm(eVar, bVar, this.a, appLovinPostbackListener);
        fmVar.a(a(eVar));
        this.a.l0().a((xl) fmVar, bVar);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, sm.b.OTHER, appLovinPostbackListener);
    }
}
