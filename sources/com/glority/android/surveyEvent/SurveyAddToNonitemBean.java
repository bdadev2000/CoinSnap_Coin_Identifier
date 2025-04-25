package com.glority.android.surveyEvent;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyAddToNonitemBean.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J2\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/glority/android/surveyEvent/SurveyAddToNonitemBean;", "", "item_business_type", "", "item_business_id", "", "tags", "", "(Ljava/lang/String;J[Ljava/lang/String;)V", "getItem_business_id", "()J", "setItem_business_id", "(J)V", "getItem_business_type", "()Ljava/lang/String;", "setItem_business_type", "(Ljava/lang/String;)V", "getTags", "()[Ljava/lang/String;", "setTags", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;J[Ljava/lang/String;)Lcom/glority/android/surveyEvent/SurveyAddToNonitemBean;", "equals", "", "other", "hashCode", "", "toString", "base-surveyEvent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final /* data */ class SurveyAddToNonitemBean {
    private long item_business_id;
    private String item_business_type;
    private String[] tags;

    public static /* synthetic */ SurveyAddToNonitemBean copy$default(SurveyAddToNonitemBean surveyAddToNonitemBean, String str, long j, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveyAddToNonitemBean.item_business_type;
        }
        if ((i & 2) != 0) {
            j = surveyAddToNonitemBean.item_business_id;
        }
        if ((i & 4) != 0) {
            strArr = surveyAddToNonitemBean.tags;
        }
        return surveyAddToNonitemBean.copy(str, j, strArr);
    }

    /* renamed from: component1, reason: from getter */
    public final String getItem_business_type() {
        return this.item_business_type;
    }

    /* renamed from: component2, reason: from getter */
    public final long getItem_business_id() {
        return this.item_business_id;
    }

    /* renamed from: component3, reason: from getter */
    public final String[] getTags() {
        return this.tags;
    }

    public final SurveyAddToNonitemBean copy(String item_business_type, long item_business_id, String[] tags) {
        Intrinsics.checkNotNullParameter(item_business_type, "item_business_type");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new SurveyAddToNonitemBean(item_business_type, item_business_id, tags);
    }

    public String toString() {
        return "SurveyAddToNonitemBean(item_business_type=" + this.item_business_type + ", item_business_id=" + this.item_business_id + ", tags=" + Arrays.toString(this.tags) + ")";
    }

    public SurveyAddToNonitemBean(String item_business_type, long j, String[] tags) {
        Intrinsics.checkNotNullParameter(item_business_type, "item_business_type");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.item_business_type = item_business_type;
        this.item_business_id = j;
        this.tags = tags;
    }

    public final long getItem_business_id() {
        return this.item_business_id;
    }

    public final String getItem_business_type() {
        return this.item_business_type;
    }

    public final String[] getTags() {
        return this.tags;
    }

    public final void setItem_business_id(long j) {
        this.item_business_id = j;
    }

    public final void setItem_business_type(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.item_business_type = str;
    }

    public final void setTags(String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.tags = strArr;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other != null) {
            SurveyAddToNonitemBean surveyAddToNonitemBean = (SurveyAddToNonitemBean) other;
            return !(Intrinsics.areEqual(this.item_business_type, surveyAddToNonitemBean.item_business_type) ^ true) && this.item_business_id == surveyAddToNonitemBean.item_business_id && Arrays.equals(this.tags, surveyAddToNonitemBean.tags);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.android.surveyEvent.SurveyAddToNonitemBean");
    }

    public int hashCode() {
        return (((this.item_business_type.hashCode() * 31) + Long.valueOf(this.item_business_id).hashCode()) * 31) + Arrays.hashCode(this.tags);
    }
}
