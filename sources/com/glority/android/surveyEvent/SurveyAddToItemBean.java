package com.glority.android.surveyEvent;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyAddToItemBean.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010 \u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\nHÆ\u0003Jb\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062,\b\u0002\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\nHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\t\u0010(\u001a\u00020\u0006HÖ\u0001R>\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/glority/android/surveyEvent/SurveyAddToItemBean;", "", FirebaseAnalytics.Param.ITEM_ID, "", "tags", "", "", "item_type", "fields", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "(J[Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)V", "getFields", "()Ljava/util/LinkedHashMap;", "setFields", "(Ljava/util/LinkedHashMap;)V", "getItem_id", "()J", "setItem_id", "(J)V", "getItem_type", "()Ljava/lang/String;", "setItem_type", "(Ljava/lang/String;)V", "getTags", "()[Ljava/lang/String;", "setTags", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(J[Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)Lcom/glority/android/surveyEvent/SurveyAddToItemBean;", "equals", "", "other", "hashCode", "", "toString", "base-surveyEvent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final /* data */ class SurveyAddToItemBean {
    private LinkedHashMap<String, String> fields;
    private long item_id;
    private String item_type;
    private String[] tags;

    public static /* synthetic */ SurveyAddToItemBean copy$default(SurveyAddToItemBean surveyAddToItemBean, long j, String[] strArr, String str, LinkedHashMap linkedHashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            j = surveyAddToItemBean.item_id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            strArr = surveyAddToItemBean.tags;
        }
        String[] strArr2 = strArr;
        if ((i & 4) != 0) {
            str = surveyAddToItemBean.item_type;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            linkedHashMap = surveyAddToItemBean.fields;
        }
        return surveyAddToItemBean.copy(j2, strArr2, str2, linkedHashMap);
    }

    /* renamed from: component1, reason: from getter */
    public final long getItem_id() {
        return this.item_id;
    }

    /* renamed from: component2, reason: from getter */
    public final String[] getTags() {
        return this.tags;
    }

    /* renamed from: component3, reason: from getter */
    public final String getItem_type() {
        return this.item_type;
    }

    public final LinkedHashMap<String, String> component4() {
        return this.fields;
    }

    public final SurveyAddToItemBean copy(long item_id, String[] tags, String item_type, LinkedHashMap<String, String> fields) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new SurveyAddToItemBean(item_id, tags, item_type, fields);
    }

    public String toString() {
        return "SurveyAddToItemBean(item_id=" + this.item_id + ", tags=" + Arrays.toString(this.tags) + ", item_type=" + this.item_type + ", fields=" + this.fields + ")";
    }

    public SurveyAddToItemBean(long j, String[] tags, String str, LinkedHashMap<String, String> linkedHashMap) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.item_id = j;
        this.tags = tags;
        this.item_type = str;
        this.fields = linkedHashMap;
    }

    public final LinkedHashMap<String, String> getFields() {
        return this.fields;
    }

    public final long getItem_id() {
        return this.item_id;
    }

    public final String getItem_type() {
        return this.item_type;
    }

    public final String[] getTags() {
        return this.tags;
    }

    public final void setFields(LinkedHashMap<String, String> linkedHashMap) {
        this.fields = linkedHashMap;
    }

    public final void setItem_id(long j) {
        this.item_id = j;
    }

    public final void setItem_type(String str) {
        this.item_type = str;
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
            SurveyAddToItemBean surveyAddToItemBean = (SurveyAddToItemBean) other;
            return this.item_id == surveyAddToItemBean.item_id && Arrays.equals(this.tags, surveyAddToItemBean.tags) && !(Intrinsics.areEqual(this.item_type, surveyAddToItemBean.item_type) ^ true) && !(Intrinsics.areEqual(this.fields, surveyAddToItemBean.fields) ^ true);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.android.surveyEvent.SurveyAddToItemBean");
    }

    public int hashCode() {
        int hashCode = ((Long.valueOf(this.item_id).hashCode() * 31) + Arrays.hashCode(this.tags)) * 31;
        String str = this.item_type;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
