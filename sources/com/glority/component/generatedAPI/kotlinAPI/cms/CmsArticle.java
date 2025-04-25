package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001?B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u00100\u001a\u000201H\u0016J\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000101H\u0014J\t\u00105\u001a\u00020\bHÂ\u0003J\u0013\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u000101H\u0096\u0002J\u0016\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001010;H\u0016J\u001c\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001010;2\u0006\u0010<\u001a\u000208J\b\u0010=\u001a\u00020\bH\u0016J\t\u0010>\u001a\u00020\u000bHÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R*\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R*\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R*\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R2\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020$0#8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R6\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010#2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010#8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010-\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010¨\u0006@"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsArticle;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "additionalSummary", "getAdditionalSummary", "()Ljava/lang/String;", "setAdditionalSummary", "(Ljava/lang/String;)V", "author", "getAuthor", "setAuthor", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage;", "coverImage", "getCoverImage", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage;", "setCoverImage", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage;)V", "darkUrl", "getDarkUrl", "setDarkUrl", "shortTitle", "getShortTitle", "setShortTitle", "summary", "getSummary", "setSummary", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTag;", "tags", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "titles", "getTitles", "setTitles", "url", "getUrl", "setUrl", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsArticle extends APIModelBase<CmsArticle> implements Serializable, Cloneable {

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
        return "CmsArticle(unused=" + this.unused + ')';
    }

    public CmsArticle(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsArticle(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
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
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("url");
        return null;
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
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tags");
        return null;
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
    public CmsArticle(org.json.JSONObject r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.component.generatedAPI.kotlinAPI.cms.CmsArticle.<init>(org.json.JSONObject):void");
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
        hashMap.put("url", getUrl());
        String str5 = this.darkUrl;
        if (str5 != null) {
            Intrinsics.checkNotNull(str5);
            hashMap.put("dark_url", str5);
        } else if (keepNull) {
            hashMap.put("dark_url", null);
        }
        hashMap.put("tags", CmsTag.INSTANCE.getCmsTagJsonArrayMap(getTags()));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsArticle)) {
            return false;
        }
        CmsArticle cmsArticle = (CmsArticle) other;
        return Intrinsics.areEqual(this.titles, cmsArticle.titles) && Intrinsics.areEqual(this.shortTitle, cmsArticle.shortTitle) && Intrinsics.areEqual(this.coverImage, cmsArticle.coverImage) && Intrinsics.areEqual(this.summary, cmsArticle.summary) && Intrinsics.areEqual(this.additionalSummary, cmsArticle.additionalSummary) && Intrinsics.areEqual(this.author, cmsArticle.author) && Intrinsics.areEqual(getUrl(), cmsArticle.getUrl()) && Intrinsics.areEqual(this.darkUrl, cmsArticle.darkUrl) && Intrinsics.areEqual(getTags(), cmsArticle.getTags());
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
        int hashCode7 = (((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + getUrl().hashCode()) * 31;
        String str5 = this.darkUrl;
        return ((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + getTags().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsArticle cmsArticle = new CmsArticle(0, 1, null);
        cloneTo(cmsArticle);
        return cmsArticle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsArticle cmsArticle = (CmsArticle) o;
            super.cloneTo(cmsArticle);
            if (this.titles == null) {
                cmsArticle.titles = null;
            } else {
                cmsArticle.titles = new ArrayList();
                List<String> list = this.titles;
                Intrinsics.checkNotNull(list);
                for (String str : list) {
                    List<String> list2 = cmsArticle.titles;
                    Intrinsics.checkNotNull(list2);
                    String cloneField = cloneField(str);
                    Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(item)");
                    list2.add(cloneField);
                }
            }
            String str2 = this.shortTitle;
            cmsArticle.shortTitle = str2 != null ? cloneField(str2) : null;
            APIModelBase aPIModelBase = this.coverImage;
            cmsArticle.coverImage = aPIModelBase != null ? (CmsImage) cloneField(aPIModelBase) : null;
            String str3 = this.summary;
            cmsArticle.summary = str3 != null ? cloneField(str3) : null;
            String str4 = this.additionalSummary;
            cmsArticle.additionalSummary = str4 != null ? cloneField(str4) : null;
            String str5 = this.author;
            cmsArticle.author = str5 != null ? cloneField(str5) : null;
            String cloneField2 = cloneField(getUrl());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.url)");
            cmsArticle.setUrl(cloneField2);
            String str6 = this.darkUrl;
            cmsArticle.darkUrl = str6 != null ? cloneField(str6) : null;
            cmsArticle.setTags(new ArrayList());
            List<CmsTag> tags = getTags();
            Intrinsics.checkNotNull(tags);
            for (CmsTag cmsTag : tags) {
                List<CmsTag> tags2 = cmsArticle.getTags();
                Intrinsics.checkNotNull(tags2);
                APIModelBase cloneField3 = cloneField(cmsTag);
                Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(item)");
                tags2.add(cloneField3);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsArticle");
    }

    /* compiled from: CmsArticle.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsArticle$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsArticleJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsArticle;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
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
