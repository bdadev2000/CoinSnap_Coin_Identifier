package com.glority.android.cmsui.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ViewStateEntities.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/glority/android/cmsui/entity/CmsShrinkLayoutState;", "", "height", "", "shrink", "", "(IZ)V", "getHeight", "()I", "setHeight", "(I)V", "getShrink", "()Z", "setShrink", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class CmsShrinkLayoutState {
    private int height;
    private boolean shrink;

    public CmsShrinkLayoutState() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ CmsShrinkLayoutState copy$default(CmsShrinkLayoutState cmsShrinkLayoutState, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsShrinkLayoutState.height;
        }
        if ((i2 & 2) != 0) {
            z = cmsShrinkLayoutState.shrink;
        }
        return cmsShrinkLayoutState.copy(i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShrink() {
        return this.shrink;
    }

    public final CmsShrinkLayoutState copy(int height, boolean shrink) {
        return new CmsShrinkLayoutState(height, shrink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmsShrinkLayoutState)) {
            return false;
        }
        CmsShrinkLayoutState cmsShrinkLayoutState = (CmsShrinkLayoutState) other;
        return this.height == cmsShrinkLayoutState.height && this.shrink == cmsShrinkLayoutState.shrink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.height) * 31;
        boolean z = this.shrink;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "CmsShrinkLayoutState(height=" + this.height + ", shrink=" + this.shrink + ")";
    }

    public CmsShrinkLayoutState(int i, boolean z) {
        this.height = i;
        this.shrink = z;
    }

    public /* synthetic */ CmsShrinkLayoutState(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -2 : i, (i2 & 2) != 0 ? true : z);
    }

    public final int getHeight() {
        return this.height;
    }

    public final boolean getShrink() {
        return this.shrink;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setShrink(boolean z) {
        this.shrink = z;
    }
}
