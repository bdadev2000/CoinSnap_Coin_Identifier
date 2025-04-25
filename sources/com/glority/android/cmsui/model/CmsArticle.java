package com.glority.android.cmsui.model;

import com.glority.android.cmsui.model.CmsTag;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsArticle.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010/\u001a\u00020\u0007HÂ\u0003J\u0013\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010406J\u001c\u00105\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u000104062\u0006\u00107\u001a\u000202J\b\u00108\u001a\u00020\u0007H\u0016J\t\u00109\u001a\u00020\nHÖ\u0001R*\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR*\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR*\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR*\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR2\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020#0\"8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R6\u0010)\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000f¨\u0006;"}, d2 = {"Lcom/glority/android/cmsui/model/CmsArticle;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "additionalSummary", "getAdditionalSummary", "()Ljava/lang/String;", "setAdditionalSummary", "(Ljava/lang/String;)V", "author", "getAuthor", "setAuthor", "Lcom/glority/android/cmsui/model/CmsImage;", "coverImage", "getCoverImage", "()Lcom/glority/android/cmsui/model/CmsImage;", "setCoverImage", "(Lcom/glority/android/cmsui/model/CmsImage;)V", "darkUrl", "getDarkUrl", "setDarkUrl", "shortTitle", "getShortTitle", "setShortTitle", "summary", "getSummary", "setSummary", "", "Lcom/glority/android/cmsui/model/CmsTag;", "tags", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "titles", "getTitles", "setTitles", "url", "getUrl", "setUrl", "component1", "copy", "equals", "", "other", "", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class CmsArticle implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String additionalSummary;
    private String author;
    private CmsImage coverImage;
    private String darkUrl;
    private String shortTitle;
    private String summary;
    public List<CmsTag> tags;
    private List<String> titles;
    private int unused;
    public String url;

    public CmsArticle() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsArticle copy$default(CmsArticle cmsArticle, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsArticle.unused;
        }
        return cmsArticle.copy(i);
    }

    public final CmsArticle copy(int unused) {
        return new CmsArticle(unused);
    }

    public String toString() {
        return "CmsArticle(unused=" + this.unused + ")";
    }

    public CmsArticle(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsArticle(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public Object clone() {
        return super.clone();
    }

    public final List<String> getTitles() {
        return this.titles;
    }

    public final void setTitles(List<String> list) {
        this.titles = list;
    }

    public final String getShortTitle() {
        return this.shortTitle;
    }

    public final void setShortTitle(String str) {
        this.shortTitle = str;
    }

    public final CmsImage getCoverImage() {
        return this.coverImage;
    }

    public final void setCoverImage(CmsImage cmsImage) {
        this.coverImage = cmsImage;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final void setSummary(String str) {
        this.summary = str;
    }

    public final String getAdditionalSummary() {
        return this.additionalSummary;
    }

    public final void setAdditionalSummary(String str) {
        this.additionalSummary = str;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final String getUrl() {
        String str = this.url;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        return str;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final String getDarkUrl() {
        return this.darkUrl;
    }

    public final void setDarkUrl(String str) {
        this.darkUrl = str;
    }

    public final List<CmsTag> getTags() {
        List<CmsTag> list = this.tags;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tags");
        }
        return list;
    }

    public final void setTags(List<CmsTag> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tags = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CmsArticle(org.json.JSONObject r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.model.CmsArticle.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        List<String> list = this.titles;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("titles", list);
        } else if (keepNull) {
            hashMap.put("titles", null);
        }
        String str = this.shortTitle;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("short_title", str);
        } else if (keepNull) {
            hashMap.put("short_title", null);
        }
        CmsImage cmsImage = this.coverImage;
        if (cmsImage != null) {
            Intrinsics.checkNotNull(cmsImage);
            hashMap.put("cover_image", cmsImage.getJsonMap());
        } else if (keepNull) {
            hashMap.put("cover_image", null);
        }
        String str2 = this.summary;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("summary", str2);
        } else if (keepNull) {
            hashMap.put("summary", null);
        }
        String str3 = this.additionalSummary;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("additional_summary", str3);
        } else if (keepNull) {
            hashMap.put("additional_summary", null);
        }
        String str4 = this.author;
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            hashMap.put("author", str4);
        } else if (keepNull) {
            hashMap.put("author", null);
        }
        String str5 = this.url;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        hashMap.put("url", str5);
        String str6 = this.darkUrl;
        if (str6 != null) {
            Intrinsics.checkNotNull(str6);
            hashMap.put("dark_url", str6);
        } else if (keepNull) {
            hashMap.put("dark_url", null);
        }
        CmsTag.Companion companion = CmsTag.INSTANCE;
        List<CmsTag> list2 = this.tags;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tags");
        }
        hashMap.put("tags", companion.getCmsTagJsonArrayMap(list2));
        return hashMap;
    }

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsArticle)) {
            return false;
        }
        CmsArticle cmsArticle = (CmsArticle) other;
        if ((!Intrinsics.areEqual(this.titles, cmsArticle.titles)) || (!Intrinsics.areEqual(this.shortTitle, cmsArticle.shortTitle)) || (!Intrinsics.areEqual(this.coverImage, cmsArticle.coverImage)) || (!Intrinsics.areEqual(this.summary, cmsArticle.summary)) || (!Intrinsics.areEqual(this.additionalSummary, cmsArticle.additionalSummary)) || (!Intrinsics.areEqual(this.author, cmsArticle.author))) {
            return false;
        }
        if (this.url == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        if (cmsArticle.url == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        if ((!Intrinsics.areEqual(r1, r4)) || (!Intrinsics.areEqual(this.darkUrl, cmsArticle.darkUrl))) {
            return false;
        }
        List<CmsTag> list = this.tags;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tags");
        }
        List<CmsTag> list2 = cmsArticle.tags;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tags");
        }
        return !(Intrinsics.areEqual(list, list2) ^ true);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        List<String> list = this.titles;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.shortTitle;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        CmsImage cmsImage = this.coverImage;
        int hashCode4 = (hashCode3 + (cmsImage != null ? cmsImage.hashCode() : 0)) * 31;
        String str2 = this.summary;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.additionalSummary;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.author;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.url;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        int hashCode8 = (hashCode7 + str5.hashCode()) * 31;
        String str6 = this.darkUrl;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<CmsTag> list2 = this.tags;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tags");
        }
        return hashCode9 + list2.hashCode();
    }

    /* compiled from: CmsArticle.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/cmsui/model/CmsArticle$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsArticleJsonArrayMap", "", "array", "Lcom/glority/android/cmsui/model/CmsArticle;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getCmsArticleJsonArrayMap(List<CmsArticle> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsArticle) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("titles", String.class);
            hashMap.put("tags", CmsTag.class);
            return hashMap;
        }
    }
}
