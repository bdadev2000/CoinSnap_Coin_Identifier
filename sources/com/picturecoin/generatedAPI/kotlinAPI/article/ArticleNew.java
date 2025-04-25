package com.picturecoin.generatedAPI.kotlinAPI.article;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArticleNew.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00013B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0006\u0010'\u001a\u00020(J\u0016\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0016J\u0013\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020&H\u0016J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010&H\u0014J\t\u00100\u001a\u00020\u0005HÂ\u0003J\u0013\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u00102\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/article/ArticleNew;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.uid, "", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", Args.title, "getTitle", "setTitle", "mainImageUrl", "getMainImageUrl", "setMainImageUrl", "url", "getUrl", "setUrl", "darkUrl", "getDarkUrl", "setDarkUrl", "tags", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CoinTag;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class ArticleNew extends APIModelBase<ArticleNew> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String darkUrl;
    public String mainImageUrl;
    private List<CoinTag> tags;
    public String title;
    public String uid;
    private int unused;
    public String url;

    public ArticleNew() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final ArticleNew copy(int unused) {
        return new ArticleNew(unused);
    }

    public String toString() {
        return "ArticleNew(unused=" + this.unused + ")";
    }

    public ArticleNew(int i) {
        this.unused = i;
    }

    public /* synthetic */ ArticleNew(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ ArticleNew copy$default(ArticleNew articleNew, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = articleNew.unused;
        }
        return articleNew.copy(i);
    }

    public final String getUid() {
        String str = this.uid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.uid);
        return null;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.title);
        return null;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getMainImageUrl() {
        String str = this.mainImageUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainImageUrl");
        return null;
    }

    public final void setMainImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mainImageUrl = str;
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
        String str = this.darkUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("darkUrl");
        return null;
    }

    public final void setDarkUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.darkUrl = str;
    }

    public final List<CoinTag> getTags() {
        return this.tags;
    }

    public final void setTags(List<CoinTag> list) {
        this.tags = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ArticleNew(org.json.JSONObject r6) throws java.lang.Exception {
        /*
            r5 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            r5.<init>(r0, r1, r2)
            java.lang.String r3 = "uid"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Le8
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Le8
            java.lang.String r3 = r6.getString(r3)
            r5.setUid(r3)
            java.lang.String r3 = "title"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Le0
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Le0
            java.lang.String r3 = r6.getString(r3)
            r5.setTitle(r3)
            java.lang.String r3 = "main_image_url"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Ld8
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Ld8
            java.lang.String r3 = r6.getString(r3)
            r5.setMainImageUrl(r3)
            java.lang.String r3 = "url"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Ld0
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Ld0
            java.lang.String r3 = r6.getString(r3)
            r5.setUrl(r3)
            java.lang.String r3 = "dark_url"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Lc8
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Lc8
            java.lang.String r3 = r6.getString(r3)
            r5.setDarkUrl(r3)
            java.lang.String r3 = "tags"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Lc5
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Lc5
            org.json.JSONArray r6 = r6.getJSONArray(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r5.tags = r2
            int r2 = r6.length()
            int r2 = r2 - r1
            if (r2 < 0) goto Lc7
        L96:
            java.lang.Object r1 = r6.get(r0)
            boolean r3 = r1 instanceof org.json.JSONArray
            if (r3 == 0) goto Lac
            r3 = r1
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r3 = r3.length()
            if (r3 != 0) goto Lac
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        Lac:
            com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag r3 = new com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag
            java.lang.String r4 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r3.<init>(r1)
            java.util.List<com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag> r1 = r5.tags
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r1.add(r3)
            if (r0 == r2) goto Lc7
            int r0 = r0 + 1
            goto L96
        Lc5:
            r5.tags = r2
        Lc7:
            return
        Lc8:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "darkUrl is missing in model ArticleNew"
            r6.<init>(r0)
            throw r6
        Ld0:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "url is missing in model ArticleNew"
            r6.<init>(r0)
            throw r6
        Ld8:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "mainImageUrl is missing in model ArticleNew"
            r6.<init>(r0)
            throw r6
        Le0:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "title is missing in model ArticleNew"
            r6.<init>(r0)
            throw r6
        Le8:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "uid is missing in model ArticleNew"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.picturecoin.generatedAPI.kotlinAPI.article.ArticleNew.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.uid, getUid());
        hashMap.put(Args.title, getTitle());
        hashMap.put("main_image_url", getMainImageUrl());
        hashMap.put("url", getUrl());
        hashMap.put("dark_url", getDarkUrl());
        if (this.tags != null) {
            CoinTag.Companion companion = CoinTag.INSTANCE;
            List<CoinTag> list = this.tags;
            Intrinsics.checkNotNull(list);
            hashMap.put("tags", companion.getCoinTagJsonArrayMap(list));
        } else if (keepNull) {
            hashMap.put("tags", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof ArticleNew)) {
            return false;
        }
        ArticleNew articleNew = (ArticleNew) other;
        return Intrinsics.areEqual(getUid(), articleNew.getUid()) && Intrinsics.areEqual(getTitle(), articleNew.getTitle()) && Intrinsics.areEqual(getMainImageUrl(), articleNew.getMainImageUrl()) && Intrinsics.areEqual(getUrl(), articleNew.getUrl()) && Intrinsics.areEqual(getDarkUrl(), articleNew.getDarkUrl()) && Intrinsics.areEqual(this.tags, articleNew.tags);
    }

    public int hashCode() {
        int hashCode = ((((((((((getClass().hashCode() * 31) + getUid().hashCode()) * 31) + getTitle().hashCode()) * 31) + getMainImageUrl().hashCode()) * 31) + getUrl().hashCode()) * 31) + getDarkUrl().hashCode()) * 31;
        List<CoinTag> list = this.tags;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        ArticleNew articleNew = new ArticleNew(0, 1, null);
        cloneTo(articleNew);
        return articleNew;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.article.ArticleNew");
        ArticleNew articleNew = (ArticleNew) o;
        super.cloneTo(articleNew);
        articleNew.setUid(cloneField(getUid()));
        articleNew.setTitle(cloneField(getTitle()));
        articleNew.setMainImageUrl(cloneField(getMainImageUrl()));
        articleNew.setUrl(cloneField(getUrl()));
        articleNew.setDarkUrl(cloneField(getDarkUrl()));
        if (this.tags == null) {
            articleNew.tags = null;
            return;
        }
        articleNew.tags = new ArrayList();
        List<CoinTag> list = this.tags;
        Intrinsics.checkNotNull(list);
        for (APIModelBase aPIModelBase : list) {
            List<CoinTag> list2 = articleNew.tags;
            Intrinsics.checkNotNull(list2);
            APIModelBase cloneField = cloneField(aPIModelBase);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
            list2.add(cloneField);
        }
    }

    /* compiled from: ArticleNew.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/article/ArticleNew$Companion;", "", "<init>", "()V", "getArticleNewJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/ArticleNew;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getArticleNewJsonArrayMap(List<ArticleNew> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ArticleNew) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("tags", CoinTag.class);
            return hashMap;
        }
    }
}
