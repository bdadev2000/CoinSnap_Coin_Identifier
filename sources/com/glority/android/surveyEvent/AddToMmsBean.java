package com.glority.android.surveyEvent;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddToMmsBean.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012,\b\u0002\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000bj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\f¢\u0006\u0002\u0010\rJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J-\u0010(\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000bj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\fHÆ\u0003Jv\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032,\b\u0002\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000bj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\fHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R>\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000bj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/glority/android/surveyEvent/AddToMmsBean;", "", "item_type", "", FirebaseAnalytics.Param.ITEM_ID, "", "image_url", "tags", "", "country_code", "fields", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "(Ljava/lang/String;JLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)V", "getCountry_code", "()Ljava/lang/String;", "setCountry_code", "(Ljava/lang/String;)V", "getFields", "()Ljava/util/LinkedHashMap;", "setFields", "(Ljava/util/LinkedHashMap;)V", "getImage_url", "setImage_url", "getItem_id", "()J", "setItem_id", "(J)V", "getItem_type", "setItem_type", "getTags", "()[Ljava/lang/String;", "setTags", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;JLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)Lcom/glority/android/surveyEvent/AddToMmsBean;", "equals", "", "other", "hashCode", "", "toString", "base-surveyEvent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final /* data */ class AddToMmsBean {
    private String country_code;
    private LinkedHashMap<String, String> fields;
    private String image_url;
    private long item_id;
    private String item_type;
    private String[] tags;

    public static /* synthetic */ AddToMmsBean copy$default(AddToMmsBean addToMmsBean, String str, long j, String str2, String[] strArr, String str3, LinkedHashMap linkedHashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addToMmsBean.item_type;
        }
        if ((i & 2) != 0) {
            j = addToMmsBean.item_id;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = addToMmsBean.image_url;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            strArr = addToMmsBean.tags;
        }
        String[] strArr2 = strArr;
        if ((i & 16) != 0) {
            str3 = addToMmsBean.country_code;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            linkedHashMap = addToMmsBean.fields;
        }
        return addToMmsBean.copy(str, j2, str4, strArr2, str5, linkedHashMap);
    }

    /* renamed from: component1, reason: from getter */
    public final String getItem_type() {
        return this.item_type;
    }

    /* renamed from: component2, reason: from getter */
    public final long getItem_id() {
        return this.item_id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage_url() {
        return this.image_url;
    }

    /* renamed from: component4, reason: from getter */
    public final String[] getTags() {
        return this.tags;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCountry_code() {
        return this.country_code;
    }

    public final LinkedHashMap<String, String> component6() {
        return this.fields;
    }

    public final AddToMmsBean copy(String item_type, long item_id, String image_url, String[] tags, String country_code, LinkedHashMap<String, String> fields) {
        Intrinsics.checkNotNullParameter(item_type, "item_type");
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(country_code, "country_code");
        return new AddToMmsBean(item_type, item_id, image_url, tags, country_code, fields);
    }

    public String toString() {
        return "AddToMmsBean(item_type=" + this.item_type + ", item_id=" + this.item_id + ", image_url=" + this.image_url + ", tags=" + Arrays.toString(this.tags) + ", country_code=" + this.country_code + ", fields=" + this.fields + ")";
    }

    public AddToMmsBean(String item_type, long j, String image_url, String[] strArr, String country_code, LinkedHashMap<String, String> linkedHashMap) {
        Intrinsics.checkNotNullParameter(item_type, "item_type");
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(country_code, "country_code");
        this.item_type = item_type;
        this.item_id = j;
        this.image_url = image_url;
        this.tags = strArr;
        this.country_code = country_code;
        this.fields = linkedHashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ AddToMmsBean(java.lang.String r11, long r12, java.lang.String r14, java.lang.String[] r15, java.lang.String r16, java.util.LinkedHashMap r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 32
            if (r0 == 0) goto La
            r0 = 0
            r1 = r0
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            r9 = r0
            goto Lc
        La:
            r9 = r17
        Lc:
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.surveyEvent.AddToMmsBean.<init>(java.lang.String, long, java.lang.String, java.lang.String[], java.lang.String, java.util.LinkedHashMap, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getCountry_code() {
        return this.country_code;
    }

    public final LinkedHashMap<String, String> getFields() {
        return this.fields;
    }

    public final String getImage_url() {
        return this.image_url;
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

    public final void setCountry_code(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.country_code = str;
    }

    public final void setFields(LinkedHashMap<String, String> linkedHashMap) {
        this.fields = linkedHashMap;
    }

    public final void setImage_url(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.image_url = str;
    }

    public final void setItem_id(long j) {
        this.item_id = j;
    }

    public final void setItem_type(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.item_type = str;
    }

    public final void setTags(String[] strArr) {
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
            AddToMmsBean addToMmsBean = (AddToMmsBean) other;
            if ((!Intrinsics.areEqual(this.item_type, addToMmsBean.item_type)) || this.item_id != addToMmsBean.item_id || (!Intrinsics.areEqual(this.image_url, addToMmsBean.image_url))) {
                return false;
            }
            String[] strArr = this.tags;
            if (strArr != null) {
                if (addToMmsBean.tags == null) {
                    return false;
                }
                Intrinsics.checkNotNull(strArr);
                String[] strArr2 = addToMmsBean.tags;
                Intrinsics.checkNotNull(strArr2);
                if (!Arrays.equals(strArr, strArr2)) {
                    return false;
                }
            } else if (addToMmsBean.tags != null) {
                return false;
            }
            return ((Intrinsics.areEqual(this.country_code, addToMmsBean.country_code) ^ true) || (Intrinsics.areEqual(this.fields, addToMmsBean.fields) ^ true)) ? false : true;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.android.surveyEvent.AddToMmsBean");
    }

    public int hashCode() {
        int hashCode = ((((this.item_type.hashCode() * 31) + Long.valueOf(this.item_id).hashCode()) * 31) + this.image_url.hashCode()) * 31;
        String[] strArr = this.tags;
        int hashCode2 = (((hashCode + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31) + this.country_code.hashCode()) * 31;
        LinkedHashMap<String, String> linkedHashMap = this.fields;
        return hashCode2 + (linkedHashMap != null ? linkedHashMap.hashCode() : 0);
    }
}
