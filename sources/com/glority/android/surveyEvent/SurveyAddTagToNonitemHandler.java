package com.glority.android.surveyEvent;

import androidx.core.os.BundleKt;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.surveyEvent.SurveyAddTagToNonItemRequest;
import com.glority.android.core.route.surveyEvent.UrlSurveyEvent;
import com.google.gson.Gson;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyAddTagToNonitemHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J-\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/glority/android/surveyEvent/SurveyAddTagToNonitemHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "sendNonitemEvent", "businessType", "itemId", "", "list", "", "(Ljava/lang/String;J[Ljava/lang/String;)V", "Companion", "base-surveyEvent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class SurveyAddTagToNonitemHandler implements RouteHandler<Boolean> {
    public static final String ADD_TAG_TO_NONITEM = "add_tag_to_nonitem";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (Boolean) RouteHandler.DefaultImpls.execute(this, request);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlSurveyEvent.INSTANCE.getURL_SURVEY_ADD_TAG_TO_NONITEM();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof SurveyAddTagToNonItemRequest) {
            SurveyAddTagToNonItemRequest surveyAddTagToNonItemRequest = (SurveyAddTagToNonItemRequest) request;
            sendNonitemEvent(surveyAddTagToNonItemRequest.getItem_business_type(), surveyAddTagToNonItemRequest.getItem_business_id(), surveyAddTagToNonItemRequest.getList());
        }
    }

    private final void sendNonitemEvent(String businessType, long itemId, String[] list) {
        if (list == null) {
            list = new String[0];
        }
        new LogEventRequest(ADD_TAG_TO_NONITEM, BundleKt.bundleOf(TuplesKt.to("content", new Gson().toJson(new SurveyAddToNonitemBean(businessType, itemId, list))))).post();
    }
}
