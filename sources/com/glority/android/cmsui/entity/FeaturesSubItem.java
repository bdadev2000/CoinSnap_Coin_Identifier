package com.glority.android.cmsui.entity;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeaturesItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001c\u0010\u0004\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\r\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0018\u00010\u0005HÆ\u0003J5\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001e\b\u0002\u0010\u0004\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR'\u0010\u0004\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/glority/android/cmsui/entity/FeaturesSubItem;", "", "key", "", "value", "", "", "(Ljava/lang/String;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getValue", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class FeaturesSubItem {
    private final String key;
    private final List<Map<String, Object>> value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeaturesSubItem copy$default(FeaturesSubItem featuresSubItem, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featuresSubItem.key;
        }
        if ((i & 2) != 0) {
            list = featuresSubItem.value;
        }
        return featuresSubItem.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final List<Map<String, Object>> component2() {
        return this.value;
    }

    public final FeaturesSubItem copy(String key, List<Map<String, Object>> value) {
        return new FeaturesSubItem(key, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturesSubItem)) {
            return false;
        }
        FeaturesSubItem featuresSubItem = (FeaturesSubItem) other;
        return Intrinsics.areEqual(this.key, featuresSubItem.key) && Intrinsics.areEqual(this.value, featuresSubItem.value);
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Map<String, Object>> list = this.value;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "FeaturesSubItem(key=" + this.key + ", value=" + this.value + ")";
    }

    public FeaturesSubItem(String str, List<Map<String, Object>> list) {
        this.key = str;
        this.value = list;
    }

    public final String getKey() {
        return this.key;
    }

    public final List<Map<String, Object>> getValue() {
        return this.value;
    }
}
