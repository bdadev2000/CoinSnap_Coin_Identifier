package com.picturecoin.generatedAPI.kotlinAPI.series;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
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
import org.json.JSONObject;

/* compiled from: RecommendSeriesDetail.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bH\u0016J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001cH\u0014J\t\u0010&\u001a\u00020\u0005HÂ\u0003J\u0013\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010(\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeriesDetail;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.uid, "", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", Args.genusUid, "getGenusUid", "setGenusUid", Args.title, "getTitle", "setTitle", "imageUrl", "getImageUrl", "setImageUrl", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class RecommendSeriesDetail extends APIModelBase<RecommendSeriesDetail> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String genusUid;
    public String imageUrl;
    public String title;
    public String uid;
    private int unused;

    public RecommendSeriesDetail() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final RecommendSeriesDetail copy(int unused) {
        return new RecommendSeriesDetail(unused);
    }

    public String toString() {
        return "RecommendSeriesDetail(unused=" + this.unused + ")";
    }

    public RecommendSeriesDetail(int i) {
        this.unused = i;
    }

    public /* synthetic */ RecommendSeriesDetail(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ RecommendSeriesDetail copy$default(RecommendSeriesDetail recommendSeriesDetail, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recommendSeriesDetail.unused;
        }
        return recommendSeriesDetail.copy(i);
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

    public final String getGenusUid() {
        String str = this.genusUid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.genusUid);
        return null;
    }

    public final void setGenusUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.genusUid = str;
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

    public final String getImageUrl() {
        String str = this.imageUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageUrl");
        return null;
    }

    public final void setImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecommendSeriesDetail(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(Args.uid) && !obj.isNull(Args.uid)) {
            setUid(obj.getString(Args.uid));
            if (obj.has("genus_uid") && !obj.isNull("genus_uid")) {
                setGenusUid(obj.getString("genus_uid"));
                if (obj.has(Args.title) && !obj.isNull(Args.title)) {
                    setTitle(obj.getString(Args.title));
                    if (obj.has("image_url") && !obj.isNull("image_url")) {
                        setImageUrl(obj.getString("image_url"));
                        return;
                    }
                    throw new ParameterCheckFailException("imageUrl is missing in model RecommendSeriesDetail");
                }
                throw new ParameterCheckFailException("title is missing in model RecommendSeriesDetail");
            }
            throw new ParameterCheckFailException("genusUid is missing in model RecommendSeriesDetail");
        }
        throw new ParameterCheckFailException("uid is missing in model RecommendSeriesDetail");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.uid, getUid());
        hashMap.put("genus_uid", getGenusUid());
        hashMap.put(Args.title, getTitle());
        hashMap.put("image_url", getImageUrl());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof RecommendSeriesDetail)) {
            return false;
        }
        RecommendSeriesDetail recommendSeriesDetail = (RecommendSeriesDetail) other;
        return Intrinsics.areEqual(getUid(), recommendSeriesDetail.getUid()) && Intrinsics.areEqual(getGenusUid(), recommendSeriesDetail.getGenusUid()) && Intrinsics.areEqual(getTitle(), recommendSeriesDetail.getTitle()) && Intrinsics.areEqual(getImageUrl(), recommendSeriesDetail.getImageUrl());
    }

    public int hashCode() {
        return (((((((getClass().hashCode() * 31) + getUid().hashCode()) * 31) + getGenusUid().hashCode()) * 31) + getTitle().hashCode()) * 31) + getImageUrl().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        RecommendSeriesDetail recommendSeriesDetail = new RecommendSeriesDetail(0, 1, null);
        cloneTo(recommendSeriesDetail);
        return recommendSeriesDetail;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesDetail");
        RecommendSeriesDetail recommendSeriesDetail = (RecommendSeriesDetail) o;
        super.cloneTo(recommendSeriesDetail);
        recommendSeriesDetail.setUid(cloneField(getUid()));
        recommendSeriesDetail.setGenusUid(cloneField(getGenusUid()));
        recommendSeriesDetail.setTitle(cloneField(getTitle()));
        recommendSeriesDetail.setImageUrl(cloneField(getImageUrl()));
    }

    /* compiled from: RecommendSeriesDetail.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeriesDetail$Companion;", "", "<init>", "()V", "getRecommendSeriesDetailJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeriesDetail;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getRecommendSeriesDetailJsonArrayMap(List<RecommendSeriesDetail> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RecommendSeriesDetail) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
