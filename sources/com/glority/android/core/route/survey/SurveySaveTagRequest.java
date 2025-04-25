package com.glority.android.core.route.survey;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveySaveTagRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/glority/android/core/route/survey/SurveySaveTagRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "tagsString", "(Ljava/lang/String;)V", "getTagsString", "()Ljava/lang/String;", "setTagsString", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SurveySaveTagRequest extends RouteRequest<String> {
    private String tagsString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveySaveTagRequest(String tagsString) {
        super(UrlSurvey.INSTANCE.getURL_SURVEY_SAVE_TAG(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(tagsString, "tagsString");
        this.tagsString = tagsString;
    }

    public final String getTagsString() {
        return this.tagsString;
    }

    public final void setTagsString(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tagsString = str;
    }
}
