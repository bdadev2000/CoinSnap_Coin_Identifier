package com.glority.android.cmsui.entity;

import android.text.SpannableStringBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScientificItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/glority/android/cmsui/entity/ScientificSubItem;", "", "key", "", "value", "Landroid/text/SpannableStringBuilder;", "bg", "(ILandroid/text/SpannableStringBuilder;I)V", "getBg", "()I", "getKey", "getValue", "()Landroid/text/SpannableStringBuilder;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class ScientificSubItem {
    private final int bg;
    private final int key;
    private final SpannableStringBuilder value;

    public static /* synthetic */ ScientificSubItem copy$default(ScientificSubItem scientificSubItem, int i, SpannableStringBuilder spannableStringBuilder, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = scientificSubItem.key;
        }
        if ((i3 & 2) != 0) {
            spannableStringBuilder = scientificSubItem.value;
        }
        if ((i3 & 4) != 0) {
            i2 = scientificSubItem.bg;
        }
        return scientificSubItem.copy(i, spannableStringBuilder, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final SpannableStringBuilder getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBg() {
        return this.bg;
    }

    public final ScientificSubItem copy(int key, SpannableStringBuilder value, int bg) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new ScientificSubItem(key, value, bg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScientificSubItem)) {
            return false;
        }
        ScientificSubItem scientificSubItem = (ScientificSubItem) other;
        return this.key == scientificSubItem.key && Intrinsics.areEqual(this.value, scientificSubItem.value) && this.bg == scientificSubItem.bg;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.key) * 31;
        SpannableStringBuilder spannableStringBuilder = this.value;
        return ((hashCode + (spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0)) * 31) + Integer.hashCode(this.bg);
    }

    public String toString() {
        return "ScientificSubItem(key=" + this.key + ", value=" + ((Object) this.value) + ", bg=" + this.bg + ")";
    }

    public ScientificSubItem(int i, SpannableStringBuilder value, int i2) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.key = i;
        this.value = value;
        this.bg = i2;
    }

    public final int getBg() {
        return this.bg;
    }

    public final int getKey() {
        return this.key;
    }

    public final SpannableStringBuilder getValue() {
        return this.value;
    }
}
