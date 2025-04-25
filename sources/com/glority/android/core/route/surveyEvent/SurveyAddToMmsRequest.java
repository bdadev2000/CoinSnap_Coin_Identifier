package com.glority.android.core.route.surveyEvent;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyAddToMmsRequest.kt */
@NotProguard
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012,\b\u0002\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\fj\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\r¢\u0006\u0002\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R>\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\fj\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001b\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/glority/android/core/route/surveyEvent/SurveyAddToMmsRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "item_type", "", "image_url", "list", "", "country_code", "photoFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "fields", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;Ljava/util/LinkedHashMap;)V", "getCountry_code", "()Ljava/lang/String;", "setCountry_code", "(Ljava/lang/String;)V", "getFields", "()Ljava/util/LinkedHashMap;", "setFields", "(Ljava/util/LinkedHashMap;)V", "getImage_url", "setImage_url", "getItem_type", "setItem_type", "getList", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getPhotoFrom", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SurveyAddToMmsRequest extends RouteRequest<Long> {
    private String country_code;
    private LinkedHashMap<String, String> fields;
    private String image_url;
    private String item_type;
    private final String[] list;
    private final PhotoFrom photoFrom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyAddToMmsRequest(String item_type, String image_url, String[] strArr, String country_code, PhotoFrom photoFrom, LinkedHashMap<String, String> linkedHashMap) {
        super(UrlSurveyEvent.INSTANCE.getURL_SURVEY_ADD_TO_MMS(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(item_type, "item_type");
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(country_code, "country_code");
        Intrinsics.checkNotNullParameter(photoFrom, "photoFrom");
        this.item_type = item_type;
        this.image_url = image_url;
        this.list = strArr;
        this.country_code = country_code;
        this.photoFrom = photoFrom;
        this.fields = linkedHashMap;
    }

    public /* synthetic */ SurveyAddToMmsRequest(String str, String str2, String[] strArr, String str3, PhotoFrom photoFrom, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, strArr, str3, photoFrom, (i & 32) != 0 ? null : linkedHashMap);
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

    public final String getItem_type() {
        return this.item_type;
    }

    public final String[] getList() {
        return this.list;
    }

    public final PhotoFrom getPhotoFrom() {
        return this.photoFrom;
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

    public final void setItem_type(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.item_type = str;
    }
}
