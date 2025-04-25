package com.glority.android.core.route.surveyEvent;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.xx.constants.Args;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SurveyAddTagToItemRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nBY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012,\b\u0002\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\fj\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001`\r¢\u0006\u0002\u0010\u000eR>\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\fj\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/glority/android/core/route/surveyEvent/SurveyAddTagToItemRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "itemId", "", "list", "", "", "(J[Ljava/lang/String;)V", Args.itemType, "(J[Ljava/lang/String;Ljava/lang/String;)V", "fields", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "(J[Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)V", "getFields", "()Ljava/util/LinkedHashMap;", "setFields", "(Ljava/util/LinkedHashMap;)V", "getItemId", "()J", "getItemType", "()Ljava/lang/String;", "getList", "()[Ljava/lang/String;", "[Ljava/lang/String;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SurveyAddTagToItemRequest extends RouteRequest<Boolean> {
    private LinkedHashMap<String, String> fields;
    private final long itemId;
    private final String itemType;
    private final String[] list;

    public /* synthetic */ SurveyAddTagToItemRequest(long j, String[] strArr, String str, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : strArr, (i & 4) != 0 ? null : str, (LinkedHashMap<String, String>) ((i & 8) != 0 ? null : linkedHashMap));
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final String[] getList() {
        return this.list;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final LinkedHashMap<String, String> getFields() {
        return this.fields;
    }

    public final void setFields(LinkedHashMap<String, String> linkedHashMap) {
        this.fields = linkedHashMap;
    }

    public SurveyAddTagToItemRequest(long j, String[] strArr, String str, LinkedHashMap<String, String> linkedHashMap) {
        super(UrlSurveyEvent.INSTANCE.getURL_SURVEY_ADD_TAG_TO_ITEM(), null, null, 6, null);
        this.itemId = j;
        this.list = strArr;
        this.itemType = str;
        this.fields = linkedHashMap;
    }

    public SurveyAddTagToItemRequest(long j, String[] strArr) {
        this(j, strArr, (String) null, (LinkedHashMap<String, String>) null);
    }

    public /* synthetic */ SurveyAddTagToItemRequest(long j, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : strArr);
    }

    public SurveyAddTagToItemRequest(long j, String[] strArr, String str) {
        this(j, strArr, str, (LinkedHashMap<String, String>) null);
    }

    public /* synthetic */ SurveyAddTagToItemRequest(long j, String[] strArr, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : strArr, (i & 4) != 0 ? null : str);
    }
}
