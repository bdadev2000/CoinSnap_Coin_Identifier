package com.glority.android.compose.ui.popup;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Popup.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\n\u001a\u0004\b\u0002\u0010\u0007\"\u0004\b\u000b\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/glority/android/compose/ui/popup/PopupState;", "", "isVisible", "", "(Z)V", "<set-?>", "isShowTop", "()Z", "setShowTop", "isShowTop$delegate", "Landroidx/compose/runtime/MutableState;", "setVisible", "isVisible$delegate", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class PopupState {
    public static final int $stable = 0;

    /* renamed from: isShowTop$delegate, reason: from kotlin metadata */
    private final MutableState isShowTop;

    /* renamed from: isVisible$delegate, reason: from kotlin metadata */
    private final MutableState isVisible;

    public PopupState() {
        this(false, 1, null);
    }

    public PopupState(boolean z) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.isVisible = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isShowTop = mutableStateOf$default2;
    }

    public /* synthetic */ PopupState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    public final void setVisible(boolean z) {
        this.isVisible.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isShowTop() {
        return ((Boolean) this.isShowTop.getValue()).booleanValue();
    }

    public final void setShowTop(boolean z) {
        this.isShowTop.setValue(Boolean.valueOf(z));
    }
}
