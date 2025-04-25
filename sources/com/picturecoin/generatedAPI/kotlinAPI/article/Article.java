package com.picturecoin.generatedAPI.kotlinAPI.article;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Article.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00012B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010&\u001a\u00020'J\u0016\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0016J\u0013\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020%H\u0016J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010%H\u0014J\t\u0010/\u001a\u00020\u0005HÂ\u0003J\u0013\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/article/Article;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "feedsId", "", "getFeedsId", "()Ljava/lang/String;", "setFeedsId", "(Ljava/lang/String;)V", Args.title, "getTitle", "setTitle", "mainImageUrl", "getMainImageUrl", "setMainImageUrl", "linkUrl", "getLinkUrl", "setLinkUrl", "type", "getType", "setType", "types", "", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class Article extends APIModelBase<Article> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String feedsId;
    public String linkUrl;
    public String mainImageUrl;
    public String title;
    private String type;
    private List<String> types;
    private int unused;

    public Article() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final Article copy(int unused) {
        return new Article(unused);
    }

    public String toString() {
        return "Article(unused=" + this.unused + ")";
    }

    public Article(int i) {
        this.unused = i;
    }

    public /* synthetic */ Article(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ Article copy$default(Article article, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = article.unused;
        }
        return article.copy(i);
    }

    public final String getFeedsId() {
        String str = this.feedsId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("feedsId");
        return null;
    }

    public final void setFeedsId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.feedsId = str;
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

    public final String getLinkUrl() {
        String str = this.linkUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linkUrl");
        return null;
    }

    public final void setLinkUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.linkUrl = str;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Article(org.json.JSONObject r6) throws java.lang.Exception {
        /*
            r5 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            r5.<init>(r0, r1, r2)
            java.lang.String r3 = "feeds_id"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Lc4
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Lc4
            java.lang.String r3 = r6.getString(r3)
            r5.setFeedsId(r3)
            java.lang.String r3 = "title"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Lbc
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Lbc
            java.lang.String r3 = r6.getString(r3)
            r5.setTitle(r3)
            java.lang.String r3 = "main_image_url"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Lb4
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Lb4
            java.lang.String r3 = r6.getString(r3)
            r5.setMainImageUrl(r3)
            java.lang.String r3 = "link_url"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Lac
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Lac
            java.lang.String r3 = r6.getString(r3)
            r5.setLinkUrl(r3)
            java.lang.String r3 = "type"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto L74
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto L74
            java.lang.String r3 = r6.getString(r3)
            r5.type = r3
            goto L76
        L74:
            r5.type = r2
        L76:
            java.lang.String r3 = "types"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto La9
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto La9
            org.json.JSONArray r6 = r6.getJSONArray(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r5.types = r2
            int r2 = r6.length()
            int r2 = r2 - r1
            if (r2 < 0) goto Lab
        L98:
            java.lang.String r1 = r6.getString(r0)
            java.util.List<java.lang.String> r3 = r5.types
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r3.add(r1)
            if (r0 == r2) goto Lab
            int r0 = r0 + 1
            goto L98
        La9:
            r5.types = r2
        Lab:
            return
        Lac:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "linkUrl is missing in model Article"
            r6.<init>(r0)
            throw r6
        Lb4:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "mainImageUrl is missing in model Article"
            r6.<init>(r0)
            throw r6
        Lbc:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "title is missing in model Article"
            r6.<init>(r0)
            throw r6
        Lc4:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "feedsId is missing in model Article"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.picturecoin.generatedAPI.kotlinAPI.article.Article.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("feeds_id", getFeedsId());
        hashMap.put(Args.title, getTitle());
        hashMap.put("main_image_url", getMainImageUrl());
        hashMap.put("link_url", getLinkUrl());
        String str = this.type;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("type", str);
        } else if (keepNull) {
            hashMap.put("type", null);
        }
        List<String> list = this.types;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("types", list);
        } else if (keepNull) {
            hashMap.put("types", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Article)) {
            return false;
        }
        Article article = (Article) other;
        return Intrinsics.areEqual(getFeedsId(), article.getFeedsId()) && Intrinsics.areEqual(getTitle(), article.getTitle()) && Intrinsics.areEqual(getMainImageUrl(), article.getMainImageUrl()) && Intrinsics.areEqual(getLinkUrl(), article.getLinkUrl()) && Intrinsics.areEqual(this.type, article.type) && Intrinsics.areEqual(this.types, article.types);
    }

    public int hashCode() {
        int hashCode = ((((((((getClass().hashCode() * 31) + getFeedsId().hashCode()) * 31) + getTitle().hashCode()) * 31) + getMainImageUrl().hashCode()) * 31) + getLinkUrl().hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.types;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Article article = new Article(0, 1, null);
        cloneTo(article);
        return article;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.article.Article");
        Article article = (Article) o;
        super.cloneTo(article);
        article.setFeedsId(cloneField(getFeedsId()));
        article.setTitle(cloneField(getTitle()));
        article.setMainImageUrl(cloneField(getMainImageUrl()));
        article.setLinkUrl(cloneField(getLinkUrl()));
        String str = this.type;
        article.type = str != null ? cloneField(str) : null;
        if (this.types == null) {
            article.types = null;
            return;
        }
        article.types = new ArrayList();
        List<String> list = this.types;
        Intrinsics.checkNotNull(list);
        for (String str2 : list) {
            List<String> list2 = article.types;
            Intrinsics.checkNotNull(list2);
            String cloneField = cloneField(str2);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
            list2.add(cloneField);
        }
    }

    /* compiled from: Article.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/article/Article$Companion;", "", "<init>", "()V", "getArticleJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/Article;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getArticleJsonArrayMap(List<Article> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Article) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("types", String.class);
            return hashMap;
        }
    }
}
