package com.glority.android.cmsui.model;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CmsTag.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010.\u001a\u00020\u0007HÂ\u0003J\u0013\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u00100\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aJ\u001c\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u00103\u001a\u00020'J\b\u00104\u001a\u00020\u0007H\u0016J\u001e\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J!\u00106\u001a\u0004\u0018\u00010'2\u0006\u0010\u0003\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u00108J\t\u00109\u001a\u00020\u0010HÖ\u0001R*\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015RN\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u00192\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u00198F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R&\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020!8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\t\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006;"}, d2 = {"Lcom/glority/android/cmsui/model/CmsTag;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/android/cmsui/model/CmsTitle;", "cmsTitle", "getCmsTitle", "()Lcom/glority/android/cmsui/model/CmsTitle;", "setCmsTitle", "(Lcom/glority/android/cmsui/model/CmsTitle;)V", "", "sourceUrl", "getSourceUrl", "()Ljava/lang/String;", "setSourceUrl", "(Ljava/lang/String;)V", "tagName", "getTagName", "setTagName", "", "", "", "tagValues", "getTagValues", "()Ljava/util/List;", "setTagValues", "(Ljava/util/List;)V", "Lcom/glority/android/cmsui/model/CmsTagValueType;", "type", "getType", "()Lcom/glority/android/cmsui/model/CmsTagValueType;", "setType", "(Lcom/glority/android/cmsui/model/CmsTagValueType;)V", "", "withEdibleOrMedicalInfo", "getWithEdibleOrMedicalInfo", "()Ljava/lang/Boolean;", "setWithEdibleOrMedicalInfo", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "copy", "equals", "other", "getJsonMap", "keepNull", "hashCode", "jsonObjectToMap", "parseBoolean", "key", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class CmsTag implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private CmsTitle cmsTitle;
    private String sourceUrl;
    public String tagName;
    public List<Map<String, Object>> tagValues;
    public CmsTagValueType type;
    private int unused;
    private Boolean withEdibleOrMedicalInfo;

    public CmsTag() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsTag copy$default(CmsTag cmsTag, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsTag.unused;
        }
        return cmsTag.copy(i);
    }

    public final CmsTag copy(int unused) {
        return new CmsTag(unused);
    }

    public String toString() {
        return "CmsTag(unused=" + this.unused + ")";
    }

    public CmsTag(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsTag(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public Object clone() {
        return super.clone();
    }

    public final CmsTagValueType getType() {
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        return cmsTagValueType;
    }

    public final void setType(CmsTagValueType cmsTagValueType) {
        Intrinsics.checkNotNullParameter(cmsTagValueType, "<set-?>");
        this.type = cmsTagValueType;
    }

    public final String getTagName() {
        String str = this.tagName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagName");
        }
        return str;
    }

    public final void setTagName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tagName = str;
    }

    public final CmsTitle getCmsTitle() {
        return this.cmsTitle;
    }

    public final void setCmsTitle(CmsTitle cmsTitle) {
        this.cmsTitle = cmsTitle;
    }

    public final List<Map<String, Object>> getTagValues() {
        List<Map<String, Object>> list = this.tagValues;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagValues");
        }
        return list;
    }

    public final void setTagValues(List<Map<String, Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tagValues = list;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final void setSourceUrl(String str) {
        this.sourceUrl = str;
    }

    public final Boolean getWithEdibleOrMedicalInfo() {
        return this.withEdibleOrMedicalInfo;
    }

    public final void setWithEdibleOrMedicalInfo(Boolean bool) {
        this.withEdibleOrMedicalInfo = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CmsTag(org.json.JSONObject r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.model.CmsTag.<init>(org.json.JSONObject):void");
    }

    private final Boolean parseBoolean(JSONObject obj, String key) {
        try {
            try {
                return Boolean.valueOf(obj.getBoolean(key));
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
                return null;
            }
        } catch (JSONException unused) {
            return Boolean.valueOf(obj.getInt(key) > 0);
        }
    }

    private final Map<String, Object> jsonObjectToMap(JSONObject obj) {
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = obj.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Object obj2 = obj.get(key);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, obj2);
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        return hashMap;
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        hashMap.put("type", Integer.valueOf(cmsTagValueType.getValue()));
        String str = this.tagName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagName");
        }
        hashMap.put("tag_name", str);
        CmsTitle cmsTitle = this.cmsTitle;
        if (cmsTitle != null) {
            Intrinsics.checkNotNull(cmsTitle);
            hashMap.put("cms_title", cmsTitle.getJsonMap());
        } else if (keepNull) {
            hashMap.put("cms_title", null);
        }
        List<Map<String, Object>> list = this.tagValues;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagValues");
        }
        hashMap.put("tag_values", list);
        String str2 = this.sourceUrl;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("source_url", str2);
        } else if (keepNull) {
            hashMap.put("source_url", null);
        }
        Boolean bool = this.withEdibleOrMedicalInfo;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            if (bool == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            hashMap.put("with_edible_or_medical_info", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        } else if (keepNull) {
            hashMap.put("with_edible_or_medical_info", null);
        }
        return hashMap;
    }

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsTag)) {
            return false;
        }
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        CmsTag cmsTag = (CmsTag) other;
        CmsTagValueType cmsTagValueType2 = cmsTag.type;
        if (cmsTagValueType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        if (cmsTagValueType != cmsTagValueType2) {
            return false;
        }
        if (this.tagName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagName");
        }
        if (cmsTag.tagName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagName");
        }
        if ((!Intrinsics.areEqual(r1, r3)) || (!Intrinsics.areEqual(this.cmsTitle, cmsTag.cmsTitle))) {
            return false;
        }
        List<Map<String, Object>> list = this.tagValues;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagValues");
        }
        List<Map<String, Object>> list2 = cmsTag.tagValues;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagValues");
        }
        return ((Intrinsics.areEqual(list, list2) ^ true) || (Intrinsics.areEqual(this.sourceUrl, cmsTag.sourceUrl) ^ true) || (Intrinsics.areEqual(this.withEdibleOrMedicalInfo, cmsTag.withEdibleOrMedicalInfo) ^ true)) ? false : true;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        int hashCode2 = (hashCode + cmsTagValueType.hashCode()) * 31;
        String str = this.tagName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagName");
        }
        int hashCode3 = (hashCode2 + str.hashCode()) * 31;
        CmsTitle cmsTitle = this.cmsTitle;
        int hashCode4 = (hashCode3 + (cmsTitle != null ? cmsTitle.hashCode() : 0)) * 31;
        List<Map<String, Object>> list = this.tagValues;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagValues");
        }
        int hashCode5 = (hashCode4 + list.hashCode()) * 31;
        String str2 = this.sourceUrl;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.withEdibleOrMedicalInfo;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    /* compiled from: CmsTag.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/cmsui/model/CmsTag$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsTagJsonArrayMap", "", "array", "Lcom/glority/android/cmsui/model/CmsTag;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getCmsTagJsonArrayMap(List<CmsTag> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsTag) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("tagValues", Map.class);
            return hashMap;
        }
    }
}
