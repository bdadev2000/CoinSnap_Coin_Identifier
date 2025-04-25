package com.glority.android.picturexx.definition;

import com.glority.android.database.entities.UserCustomSeriesItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectableItem.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/glority/android/picturexx/definition/SelectableItem;", "", "userCustomSeriesItem", "Lcom/glority/android/database/entities/UserCustomSeriesItem;", "selected", "", "<init>", "(Lcom/glority/android/database/entities/UserCustomSeriesItem;Z)V", "getUserCustomSeriesItem", "()Lcom/glority/android/database/entities/UserCustomSeriesItem;", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final /* data */ class SelectableItem {
    public static final int $stable = 8;
    private boolean selected;
    private final UserCustomSeriesItem userCustomSeriesItem;

    /* renamed from: component1, reason: from getter */
    public final UserCustomSeriesItem getUserCustomSeriesItem() {
        return this.userCustomSeriesItem;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final SelectableItem copy(UserCustomSeriesItem userCustomSeriesItem, boolean selected) {
        Intrinsics.checkNotNullParameter(userCustomSeriesItem, "userCustomSeriesItem");
        return new SelectableItem(userCustomSeriesItem, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableItem)) {
            return false;
        }
        SelectableItem selectableItem = (SelectableItem) other;
        return Intrinsics.areEqual(this.userCustomSeriesItem, selectableItem.userCustomSeriesItem) && this.selected == selectableItem.selected;
    }

    public int hashCode() {
        return (this.userCustomSeriesItem.hashCode() * 31) + Boolean.hashCode(this.selected);
    }

    public String toString() {
        return "SelectableItem(userCustomSeriesItem=" + this.userCustomSeriesItem + ", selected=" + this.selected + ")";
    }

    public SelectableItem(UserCustomSeriesItem userCustomSeriesItem, boolean z) {
        Intrinsics.checkNotNullParameter(userCustomSeriesItem, "userCustomSeriesItem");
        this.userCustomSeriesItem = userCustomSeriesItem;
        this.selected = z;
    }

    public /* synthetic */ SelectableItem(UserCustomSeriesItem userCustomSeriesItem, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userCustomSeriesItem, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ SelectableItem copy$default(SelectableItem selectableItem, UserCustomSeriesItem userCustomSeriesItem, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            userCustomSeriesItem = selectableItem.userCustomSeriesItem;
        }
        if ((i & 2) != 0) {
            z = selectableItem.selected;
        }
        return selectableItem.copy(userCustomSeriesItem, z);
    }

    public final UserCustomSeriesItem getUserCustomSeriesItem() {
        return this.userCustomSeriesItem;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }
}
