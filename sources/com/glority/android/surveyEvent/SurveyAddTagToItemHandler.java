package com.glority.android.surveyEvent;

import androidx.core.os.BundleKt;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.surveyEvent.SurveyAddTagToItemRequest;
import com.glority.android.core.route.surveyEvent.UrlSurveyEvent;
import com.glority.android.xx.constants.Args;
import com.google.gson.Gson;
import io.reactivex.Observable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyAddTagToItemHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J`\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\n2*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J[\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052*\u0010\u0017\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\nH\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/glority/android/surveyEvent/SurveyAddTagToItemHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "addPrefixToMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "map", "prefix", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "sendSurveyEvent", "itemId", "", "list", "", Args.itemType, "fields", "(J[Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)V", "Companion", "base-surveyEvent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class SurveyAddTagToItemHandler implements RouteHandler<Boolean> {
    public static final String ADD_TAG_TO_ITEM = "add_tag_to_item";
    public static final String ITEM = "item";
    public static final String ITEM_PREFIX = "client_";

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
        return UrlSurveyEvent.INSTANCE.getURL_SURVEY_ADD_TAG_TO_ITEM();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof SurveyAddTagToItemRequest) {
            SurveyAddTagToItemRequest surveyAddTagToItemRequest = (SurveyAddTagToItemRequest) request;
            String itemType = surveyAddTagToItemRequest.getItemType();
            String str = itemType != null ? itemType : "item";
            if (Intrinsics.areEqual("item", str)) {
                LinkedHashMap<String, String> addPrefixToMap = addPrefixToMap(surveyAddTagToItemRequest.getFields(), ITEM_PREFIX);
                if (addPrefixToMap == null) {
                    addPrefixToMap = new LinkedHashMap<>();
                }
                surveyAddTagToItemRequest.setFields(addPrefixToMap);
            }
            sendSurveyEvent(surveyAddTagToItemRequest.getItemId(), surveyAddTagToItemRequest.getList(), str, surveyAddTagToItemRequest.getFields());
        }
    }

    private final void sendSurveyEvent(long itemId, String[] list, String itemType, LinkedHashMap<String, String> fields) {
        if (list == null) {
            list = new String[0];
        }
        new LogEventRequest(ADD_TAG_TO_ITEM, BundleKt.bundleOf(TuplesKt.to("content", new Gson().toJson(new SurveyAddToItemBean(itemId, list, itemType, fields))))).post();
    }

    private final LinkedHashMap<String, String> addPrefixToMap(LinkedHashMap<String, String> map, String prefix) {
        if (map == null) {
            return null;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
            String str = prefix + key;
            if (value == null) {
                value = "";
            }
            linkedHashMap2.put(str, value);
        }
        return linkedHashMap;
    }
}
