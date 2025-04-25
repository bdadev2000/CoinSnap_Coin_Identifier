package com.glority.android.picturexx.ui.components.state;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: VisibleSate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/glority/android/picturexx/ui/components/state/VisibleSate;", "", "visible", "", "(Z)V", "<set-?>", "getVisible", "()Z", "setVisible", "visible$delegate", "Landroidx/compose/runtime/MutableState;", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class VisibleSate {
    public static final int $stable = 0;

    /* renamed from: visible$delegate, reason: from kotlin metadata */
    private final MutableState visible;

    public VisibleSate(boolean z) {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.visible = mutableStateOf$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getVisible() {
        return ((Boolean) this.visible.getValue()).booleanValue();
    }

    public final void setVisible(boolean z) {
        this.visible.setValue(Boolean.valueOf(z));
    }
}
