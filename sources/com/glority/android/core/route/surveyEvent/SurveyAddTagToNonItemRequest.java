package com.glority.android.core.route.surveyEvent;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyAddTagToNonItemRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/glority/android/core/route/surveyEvent/SurveyAddTagToNonItemRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "item_business_type", "", "item_business_id", "", "list", "", "(Ljava/lang/String;J[Ljava/lang/String;)V", "getItem_business_id", "()J", "getItem_business_type", "()Ljava/lang/String;", "setItem_business_type", "(Ljava/lang/String;)V", "getList", "()[Ljava/lang/String;", "[Ljava/lang/String;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SurveyAddTagToNonItemRequest extends RouteRequest<Boolean> {
    private final long item_business_id;
    private String item_business_type;
    private final String[] list;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyAddTagToNonItemRequest(String item_business_type, long j, String[] strArr) {
        super(UrlSurveyEvent.INSTANCE.getURL_SURVEY_ADD_TAG_TO_NONITEM(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(item_business_type, "item_business_type");
        this.item_business_type = item_business_type;
        this.item_business_id = j;
        this.list = strArr;
    }

    public /* synthetic */ SurveyAddTagToNonItemRequest(String str, long j, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? null : strArr);
    }

    public final long getItem_business_id() {
        return this.item_business_id;
    }

    public final String getItem_business_type() {
        return this.item_business_type;
    }

    public final String[] getList() {
        return this.list;
    }

    public final void setItem_business_type(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.item_business_type = str;
    }
}
