package com.picturecoin.generatedAPI.kotlinAPI.article;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpertPick.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00010B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010#0\"2\u0006\u0010$\u001a\u00020%J\u0016\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010#0\"H\u0016J\u0013\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020#H\u0016J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010#H\u0014J\t\u0010-\u001a\u00020\u0005HÂ\u0003J\u0013\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010/\u001a\u00020\rHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/article/ExpertPick;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.imageUrls, "", "", "getImageUrls", "()Ljava/util/List;", "setImageUrls", "(Ljava/util/List;)V", "errorCoinTypes", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/ErrorCoinType;", "getErrorCoinTypes", "setErrorCoinTypes", "content", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "publishedAt", "Ljava/util/Date;", "getPublishedAt", "()Ljava/util/Date;", "setPublishedAt", "(Ljava/util/Date;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class ExpertPick extends APIModelBase<ExpertPick> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String content;
    public List<ErrorCoinType> errorCoinTypes;
    public List<String> imageUrls;
    public Date publishedAt;
    private int unused;

    public ExpertPick() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final ExpertPick copy(int unused) {
        return new ExpertPick(unused);
    }

    public String toString() {
        return "ExpertPick(unused=" + this.unused + ")";
    }

    public ExpertPick(int i) {
        this.unused = i;
    }

    public /* synthetic */ ExpertPick(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ ExpertPick copy$default(ExpertPick expertPick, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = expertPick.unused;
        }
        return expertPick.copy(i);
    }

    public final List<String> getImageUrls() {
        List<String> list = this.imageUrls;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.imageUrls);
        return null;
    }

    public final void setImageUrls(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.imageUrls = list;
    }

    public final List<ErrorCoinType> getErrorCoinTypes() {
        List<ErrorCoinType> list = this.errorCoinTypes;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("errorCoinTypes");
        return null;
    }

    public final void setErrorCoinTypes(List<ErrorCoinType> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.errorCoinTypes = list;
    }

    public final String getContent() {
        String str = this.content;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("content");
        return null;
    }

    public final void setContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final Date getPublishedAt() {
        Date date = this.publishedAt;
        if (date != null) {
            return date;
        }
        Intrinsics.throwUninitializedPropertyAccessException("publishedAt");
        return null;
    }

    public final void setPublishedAt(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.publishedAt = date;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExpertPick(org.json.JSONObject r8) throws java.lang.Exception {
        /*
            r7 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 0
            r2 = 1
            r7.<init>(r1, r2, r0)
            java.lang.String r0 = "image_urls"
            boolean r3 = r8.has(r0)
            if (r3 == 0) goto Le1
            boolean r3 = r8.isNull(r0)
            if (r3 != 0) goto Le1
            org.json.JSONArray r0 = r8.getJSONArray(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            r7.setImageUrls(r3)
            int r3 = r0.length()
            int r3 = r3 - r2
            if (r3 < 0) goto L42
            r4 = r1
        L2f:
            java.lang.String r5 = r0.getString(r4)
            java.util.List r6 = r7.getImageUrls()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r6.add(r5)
            if (r4 == r3) goto L42
            int r4 = r4 + 1
            goto L2f
        L42:
            java.lang.String r0 = "error_coin_types"
            boolean r3 = r8.has(r0)
            if (r3 == 0) goto Ld9
            boolean r3 = r8.isNull(r0)
            if (r3 != 0) goto Ld9
            org.json.JSONArray r0 = r8.getJSONArray(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            r7.setErrorCoinTypes(r3)
            int r3 = r0.length()
            int r3 = r3 - r2
            if (r3 < 0) goto L96
        L65:
            java.lang.Object r2 = r0.get(r1)
            boolean r4 = r2 instanceof org.json.JSONArray
            if (r4 == 0) goto L7b
            r4 = r2
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            int r4 = r4.length()
            if (r4 != 0) goto L7b
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L7b:
            com.picturecoin.generatedAPI.kotlinAPI.article.ErrorCoinType r4 = new com.picturecoin.generatedAPI.kotlinAPI.article.ErrorCoinType
            java.lang.String r5 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r5)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r4.<init>(r2)
            java.util.List r2 = r7.getErrorCoinTypes()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            if (r1 == r3) goto L96
            int r1 = r1 + 1
            goto L65
        L96:
            java.lang.String r0 = "content"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto Ld1
            boolean r1 = r8.isNull(r0)
            if (r1 != 0) goto Ld1
            java.lang.String r0 = r8.getString(r0)
            r7.setContent(r0)
            java.lang.String r0 = "published_at"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto Lc9
            boolean r1 = r8.isNull(r0)
            if (r1 != 0) goto Lc9
            java.util.Date r1 = new java.util.Date
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r8.getLong(r0)
            long r4 = r4 * r2
            r1.<init>(r4)
            r7.setPublishedAt(r1)
            return
        Lc9:
            com.glority.android.core.definition.ParameterCheckFailException r8 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "publishedAt is missing in model ExpertPick"
            r8.<init>(r0)
            throw r8
        Ld1:
            com.glority.android.core.definition.ParameterCheckFailException r8 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "content is missing in model ExpertPick"
            r8.<init>(r0)
            throw r8
        Ld9:
            com.glority.android.core.definition.ParameterCheckFailException r8 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "errorCoinTypes is missing in model ExpertPick"
            r8.<init>(r0)
            throw r8
        Le1:
            com.glority.android.core.definition.ParameterCheckFailException r8 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "imageUrls is missing in model ExpertPick"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.picturecoin.generatedAPI.kotlinAPI.article.ExpertPick.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("image_urls", getImageUrls());
        hashMap.put("error_coin_types", ErrorCoinType.INSTANCE.getErrorCoinTypeJsonArrayMap(getErrorCoinTypes()));
        hashMap.put("content", getContent());
        hashMap.put("published_at", Long.valueOf(getPublishedAt().getTime() / 1000));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof ExpertPick)) {
            return false;
        }
        ExpertPick expertPick = (ExpertPick) other;
        return Intrinsics.areEqual(getImageUrls(), expertPick.getImageUrls()) && Intrinsics.areEqual(getErrorCoinTypes(), expertPick.getErrorCoinTypes()) && Intrinsics.areEqual(getContent(), expertPick.getContent()) && Intrinsics.areEqual(getPublishedAt(), expertPick.getPublishedAt());
    }

    public int hashCode() {
        return (((((((getClass().hashCode() * 31) + getImageUrls().hashCode()) * 31) + getErrorCoinTypes().hashCode()) * 31) + getContent().hashCode()) * 31) + getPublishedAt().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        ExpertPick expertPick = new ExpertPick(0, 1, null);
        cloneTo(expertPick);
        return expertPick;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.article.ExpertPick");
        ExpertPick expertPick = (ExpertPick) o;
        super.cloneTo(expertPick);
        expertPick.setImageUrls(new ArrayList());
        List<String> imageUrls = getImageUrls();
        Intrinsics.checkNotNull(imageUrls);
        for (String str : imageUrls) {
            List<String> imageUrls2 = expertPick.getImageUrls();
            Intrinsics.checkNotNull(imageUrls2);
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
            imageUrls2.add(cloneField);
        }
        expertPick.setErrorCoinTypes(new ArrayList());
        List<ErrorCoinType> errorCoinTypes = getErrorCoinTypes();
        Intrinsics.checkNotNull(errorCoinTypes);
        for (ErrorCoinType errorCoinType : errorCoinTypes) {
            List<ErrorCoinType> errorCoinTypes2 = expertPick.getErrorCoinTypes();
            Intrinsics.checkNotNull(errorCoinTypes2);
            APIModelBase cloneField2 = cloneField(errorCoinType);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(...)");
            errorCoinTypes2.add(cloneField2);
        }
        expertPick.setContent(cloneField(getContent()));
        expertPick.setPublishedAt(cloneField(getPublishedAt()));
    }

    /* compiled from: ExpertPick.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/article/ExpertPick$Companion;", "", "<init>", "()V", "getExpertPickJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/ExpertPick;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getExpertPickJsonArrayMap(List<ExpertPick> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ExpertPick) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(Args.imageUrls, String.class);
            hashMap.put("errorCoinTypes", ErrorCoinType.class);
            return hashMap;
        }
    }
}
