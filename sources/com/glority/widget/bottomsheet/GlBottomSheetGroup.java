package com.glority.widget.bottomsheet;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlBottomSheetGroup.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/glority/widget/bottomsheet/GlBottomSheetGroup;", "", "name", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/glority/widget/bottomsheet/GlBottomSheetItem;", "(Ljava/lang/CharSequence;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getName", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final /* data */ class GlBottomSheetGroup {
    private final List<GlBottomSheetItem> items;
    private final CharSequence name;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlBottomSheetGroup copy$default(GlBottomSheetGroup glBottomSheetGroup, CharSequence charSequence, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = glBottomSheetGroup.name;
        }
        if ((i & 2) != 0) {
            list = glBottomSheetGroup.items;
        }
        return glBottomSheetGroup.copy(charSequence, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CharSequence getName() {
        return this.name;
    }

    public final List<GlBottomSheetItem> component2() {
        return this.items;
    }

    public final GlBottomSheetGroup copy(CharSequence name, List<GlBottomSheetItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new GlBottomSheetGroup(name, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlBottomSheetGroup)) {
            return false;
        }
        GlBottomSheetGroup glBottomSheetGroup = (GlBottomSheetGroup) other;
        return Intrinsics.areEqual(this.name, glBottomSheetGroup.name) && Intrinsics.areEqual(this.items, glBottomSheetGroup.items);
    }

    public int hashCode() {
        CharSequence charSequence = this.name;
        int hashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        List<GlBottomSheetItem> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "GlBottomSheetGroup(name=" + this.name + ", items=" + this.items + ")";
    }

    public GlBottomSheetGroup(CharSequence charSequence, List<GlBottomSheetItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.name = charSequence;
        this.items = items;
    }

    public final CharSequence getName() {
        return this.name;
    }

    public final List<GlBottomSheetItem> getItems() {
        return this.items;
    }
}
