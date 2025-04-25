package com.picturecoin.generatedAPI.kotlinAPI.series;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
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

/* compiled from: UserCustomSeries.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001<B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00100\u001a\u000201J\u0016\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010/0.H\u0016J\u0013\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00104\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u00020/H\u0016J\u0012\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010/H\u0014J\t\u00109\u001a\u00020\u0005HÂ\u0003J\u0013\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010;\u001a\u00020\u0010HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0007R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u0007R\u001a\u0010!\u001a\u00020\"X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100(X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006="}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserCustomSeries;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.customSeriesId, "getCustomSeriesId", "()I", "setCustomSeriesId", Args.title, "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "updatedAt", "getUpdatedAt", "setUpdatedAt", "collectionCount", "getCollectionCount", "setCollectionCount", "totalPrice", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "getTotalPrice", "()Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "setTotalPrice", "(Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;)V", "latestCollectionUrlList", "", "getLatestCollectionUrlList", "()Ljava/util/List;", "setLatestCollectionUrlList", "(Ljava/util/List;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class UserCustomSeries extends APIModelBase<UserCustomSeries> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int collectionCount;
    public Date createdAt;
    private int customSeriesId;
    public List<String> latestCollectionUrlList;
    public String title;
    public PriceValue totalPrice;
    private int unused;
    public Date updatedAt;

    public UserCustomSeries() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final UserCustomSeries copy(int unused) {
        return new UserCustomSeries(unused);
    }

    public String toString() {
        return "UserCustomSeries(unused=" + this.unused + ")";
    }

    public UserCustomSeries(int i) {
        this.unused = i;
    }

    public /* synthetic */ UserCustomSeries(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ UserCustomSeries copy$default(UserCustomSeries userCustomSeries, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userCustomSeries.unused;
        }
        return userCustomSeries.copy(i);
    }

    public final int getCustomSeriesId() {
        return this.customSeriesId;
    }

    public final void setCustomSeriesId(int i) {
        this.customSeriesId = i;
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

    public final Date getCreatedAt() {
        Date date = this.createdAt;
        if (date != null) {
            return date;
        }
        Intrinsics.throwUninitializedPropertyAccessException("createdAt");
        return null;
    }

    public final void setCreatedAt(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.createdAt = date;
    }

    public final Date getUpdatedAt() {
        Date date = this.updatedAt;
        if (date != null) {
            return date;
        }
        Intrinsics.throwUninitializedPropertyAccessException("updatedAt");
        return null;
    }

    public final void setUpdatedAt(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.updatedAt = date;
    }

    public final int getCollectionCount() {
        return this.collectionCount;
    }

    public final void setCollectionCount(int i) {
        this.collectionCount = i;
    }

    public final PriceValue getTotalPrice() {
        PriceValue priceValue = this.totalPrice;
        if (priceValue != null) {
            return priceValue;
        }
        Intrinsics.throwUninitializedPropertyAccessException("totalPrice");
        return null;
    }

    public final void setTotalPrice(PriceValue priceValue) {
        Intrinsics.checkNotNullParameter(priceValue, "<set-?>");
        this.totalPrice = priceValue;
    }

    public final List<String> getLatestCollectionUrlList() {
        List<String> list = this.latestCollectionUrlList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("latestCollectionUrlList");
        return null;
    }

    public final void setLatestCollectionUrlList(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.latestCollectionUrlList = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UserCustomSeries(org.json.JSONObject r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.picturecoin.generatedAPI.kotlinAPI.series.UserCustomSeries.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("custom_series_id", Integer.valueOf(this.customSeriesId));
        hashMap.put(Args.title, getTitle());
        long j = 1000;
        hashMap.put("created_at", Long.valueOf(getCreatedAt().getTime() / j));
        hashMap.put("updated_at", Long.valueOf(getUpdatedAt().getTime() / j));
        hashMap.put("collection_count", Integer.valueOf(this.collectionCount));
        hashMap.put("total_price", getTotalPrice().getJsonMap());
        hashMap.put("latest_collection_url_list", getLatestCollectionUrlList());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof UserCustomSeries)) {
            return false;
        }
        UserCustomSeries userCustomSeries = (UserCustomSeries) other;
        return this.customSeriesId == userCustomSeries.customSeriesId && Intrinsics.areEqual(getTitle(), userCustomSeries.getTitle()) && Intrinsics.areEqual(getCreatedAt(), userCustomSeries.getCreatedAt()) && Intrinsics.areEqual(getUpdatedAt(), userCustomSeries.getUpdatedAt()) && this.collectionCount == userCustomSeries.collectionCount && Intrinsics.areEqual(getTotalPrice(), userCustomSeries.getTotalPrice()) && Intrinsics.areEqual(getLatestCollectionUrlList(), userCustomSeries.getLatestCollectionUrlList());
    }

    public int hashCode() {
        return (((((((((((((getClass().hashCode() * 31) + Integer.hashCode(this.customSeriesId)) * 31) + getTitle().hashCode()) * 31) + getCreatedAt().hashCode()) * 31) + getUpdatedAt().hashCode()) * 31) + Integer.hashCode(this.collectionCount)) * 31) + getTotalPrice().hashCode()) * 31) + getLatestCollectionUrlList().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        UserCustomSeries userCustomSeries = new UserCustomSeries(0, 1, null);
        cloneTo(userCustomSeries);
        return userCustomSeries;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.series.UserCustomSeries");
        UserCustomSeries userCustomSeries = (UserCustomSeries) o;
        super.cloneTo(userCustomSeries);
        userCustomSeries.customSeriesId = cloneField(Integer.valueOf(this.customSeriesId)).intValue();
        userCustomSeries.setTitle(cloneField(getTitle()));
        userCustomSeries.setCreatedAt(cloneField(getCreatedAt()));
        userCustomSeries.setUpdatedAt(cloneField(getUpdatedAt()));
        userCustomSeries.collectionCount = cloneField(Integer.valueOf(this.collectionCount)).intValue();
        userCustomSeries.setTotalPrice((PriceValue) cloneField(getTotalPrice()));
        userCustomSeries.setLatestCollectionUrlList(new ArrayList());
        List<String> latestCollectionUrlList = getLatestCollectionUrlList();
        Intrinsics.checkNotNull(latestCollectionUrlList);
        for (String str : latestCollectionUrlList) {
            List<String> latestCollectionUrlList2 = userCustomSeries.getLatestCollectionUrlList();
            Intrinsics.checkNotNull(latestCollectionUrlList2);
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
            latestCollectionUrlList2.add(cloneField);
        }
    }

    /* compiled from: UserCustomSeries.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserCustomSeries$Companion;", "", "<init>", "()V", "getUserCustomSeriesJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserCustomSeries;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getUserCustomSeriesJsonArrayMap(List<UserCustomSeries> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UserCustomSeries) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("latestCollectionUrlList", String.class);
            return hashMap;
        }
    }
}
