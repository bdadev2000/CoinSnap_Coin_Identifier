package com.glority.android.picturexx.handler;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.base.routers.UrlRouter;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetSurveyJsonHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/glority/android/picturexx/handler/GetSurveyJsonHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class GetSurveyJsonHandler implements RouteHandler<String> {
    public static final int $stable = 0;

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlRouter.INSTANCE.getURL_GET_SURVEY_JSON();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String execute(RouteRequest<String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return "{\n\"data\":[\n    {\n        \"title\":\"How proficient do you feel at using home appliances?\",\n        \"type\":\"single\",\n        \"questions\":[\n            \"I never read any instructions and use by my own understanding\",\n            \"I never read any instructions and use by my own understanding\",\n            \"I never read any instructions and use by my own understanding\"\n        ]\n    },\n    {\n        \"title\":\"How proficient do you feel at using home appliances22222?\",\n        \"type\":\"single\",\n        \"questions\":[\n            \"I never read any instructions and use by my own understanding\",\n            \"I never read any instructions and use by my own understanding\",\n            \"I never read any instructions and use by my own understanding\"\n        ]\n    },\n    {\n        \"title\":\"How do you expect to use our app?\",\n        \"type\":\"multi\",\n        \"questions\":[\n            \"I never read any instructions and use by my own understanding\",\n            \"I never read any instructions and use by my own understanding\",\n            \"I never read any instructions and use by my own understanding\"\n        ]\n    }\n],\n\"endText\":\"Find Manuals \\n for an easier life \"\n}";
    }
}
