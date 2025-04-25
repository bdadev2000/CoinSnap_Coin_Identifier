package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
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

/* compiled from: PageInfo.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001(B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0014J\t\u0010\u001d\u001a\u00020\bHÂ\u0003J\u0013\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\u0016\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u00190#H\u0016J\u001c\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u00190#2\u0006\u0010%\u001a\u00020 J\b\u0010&\u001a\u00020\bH\u0016J\t\u0010'\u001a\u00020$HÖ\u0001R&\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\tR&\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\tR,\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/PageInfo;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "pageNo", "getPageNo", "()I", "setPageNo", "pageSize", "getPageSize", "setPageSize", "total", "getTotal", "()Ljava/lang/Integer;", "setTotal", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "", "keepNull", "hashCode", "toString", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class PageInfo extends APIModelBase<PageInfo> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int pageNo;
    private int pageSize;
    private Integer total;
    private int unused;

    public PageInfo() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ PageInfo copy$default(PageInfo pageInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pageInfo.unused;
        }
        return pageInfo.copy(i);
    }

    public final PageInfo copy(int unused) {
        return new PageInfo(unused);
    }

    public String toString() {
        return "PageInfo(unused=" + this.unused + ")";
    }

    public PageInfo(int i) {
        this.unused = i;
    }

    public /* synthetic */ PageInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final void setPageSize(int i) {
        this.pageSize = i;
    }

    public final int getPageNo() {
        return this.pageNo;
    }

    public final void setPageNo(int i) {
        this.pageNo = i;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public final void setTotal(Integer num) {
        this.total = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PageInfo(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("pageSize") && !obj.isNull("pageSize")) {
            this.pageSize = obj.getInt("pageSize");
            if (obj.has("pageNo") && !obj.isNull("pageNo")) {
                this.pageNo = obj.getInt("pageNo");
                if (obj.has("total") && !obj.isNull("total")) {
                    this.total = Integer.valueOf(obj.getInt("total"));
                    return;
                } else {
                    this.total = null;
                    return;
                }
            }
            throw new ParameterCheckFailException("pageNo is missing in model PageInfo");
        }
        throw new ParameterCheckFailException("pageSize is missing in model PageInfo");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("pageSize", Integer.valueOf(this.pageSize));
        hashMap.put("pageNo", Integer.valueOf(this.pageNo));
        Integer num = this.total;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            hashMap.put("total", num);
        } else if (keepNull) {
            hashMap.put("total", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof PageInfo)) {
            return false;
        }
        PageInfo pageInfo = (PageInfo) other;
        return this.pageSize == pageInfo.pageSize && this.pageNo == pageInfo.pageNo && !(Intrinsics.areEqual(this.total, pageInfo.total) ^ true);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31) + Integer.valueOf(this.pageNo).hashCode()) * 31;
        Integer num = this.total;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        PageInfo pageInfo = new PageInfo(0, 1, null);
        cloneTo(pageInfo);
        return pageInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            PageInfo pageInfo = (PageInfo) o;
            super.cloneTo(pageInfo);
            Integer cloneField = cloneField(Integer.valueOf(this.pageSize));
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.pageSize)");
            pageInfo.pageSize = cloneField.intValue();
            Integer cloneField2 = cloneField(Integer.valueOf(this.pageNo));
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.pageNo)");
            pageInfo.pageNo = cloneField2.intValue();
            Integer num = this.total;
            pageInfo.total = num != null ? cloneField(num) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.PageInfo");
    }

    /* compiled from: PageInfo.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/PageInfo$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getPageInfoJsonArrayMap", "", "array", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/PageInfo;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getPageInfoJsonArrayMap(List<PageInfo> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PageInfo) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
