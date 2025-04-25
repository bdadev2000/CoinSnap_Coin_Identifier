package com.glority.android.cmsui.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConditionItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/glority/android/cmsui/entity/ConditionSubItem;", "", "displayTagName", "", "value", "tagName", "iconUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayTagName", "()Ljava/lang/String;", "getIconUrl", "getTagName", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class ConditionSubItem {
    private final String displayTagName;
    private final String iconUrl;
    private final String tagName;
    private final String value;

    public static /* synthetic */ ConditionSubItem copy$default(ConditionSubItem conditionSubItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conditionSubItem.displayTagName;
        }
        if ((i & 2) != 0) {
            str2 = conditionSubItem.value;
        }
        if ((i & 4) != 0) {
            str3 = conditionSubItem.tagName;
        }
        if ((i & 8) != 0) {
            str4 = conditionSubItem.iconUrl;
        }
        return conditionSubItem.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayTagName() {
        return this.displayTagName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTagName() {
        return this.tagName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final ConditionSubItem copy(String displayTagName, String value, String tagName, String iconUrl) {
        return new ConditionSubItem(displayTagName, value, tagName, iconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConditionSubItem)) {
            return false;
        }
        ConditionSubItem conditionSubItem = (ConditionSubItem) other;
        return Intrinsics.areEqual(this.displayTagName, conditionSubItem.displayTagName) && Intrinsics.areEqual(this.value, conditionSubItem.value) && Intrinsics.areEqual(this.tagName, conditionSubItem.tagName) && Intrinsics.areEqual(this.iconUrl, conditionSubItem.iconUrl);
    }

    public int hashCode() {
        String str = this.displayTagName;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.tagName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.iconUrl;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ConditionSubItem(displayTagName=" + this.displayTagName + ", value=" + this.value + ", tagName=" + this.tagName + ", iconUrl=" + this.iconUrl + ")";
    }

    public ConditionSubItem(String str, String str2, String str3, String str4) {
        this.displayTagName = str;
        this.value = str2;
        this.tagName = str3;
        this.iconUrl = str4;
    }

    public final String getDisplayTagName() {
        return this.displayTagName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public final String getValue() {
        return this.value;
    }
}
