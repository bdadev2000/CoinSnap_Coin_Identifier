package com.glority.android.compose.ui.popup;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Popup.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/glority/android/compose/ui/popup/VisiblePosition;", "", "(Ljava/lang/String;I)V", "top", LogEvents.bottom, "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
final class VisiblePosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VisiblePosition[] $VALUES;
    public static final VisiblePosition top = new VisiblePosition("top", 0);
    public static final VisiblePosition bottom = new VisiblePosition(LogEvents.bottom, 1);

    private static final /* synthetic */ VisiblePosition[] $values() {
        return new VisiblePosition[]{top, bottom};
    }

    public static EnumEntries<VisiblePosition> getEntries() {
        return $ENTRIES;
    }

    public static VisiblePosition valueOf(String str) {
        return (VisiblePosition) Enum.valueOf(VisiblePosition.class, str);
    }

    public static VisiblePosition[] values() {
        return (VisiblePosition[]) $VALUES.clone();
    }

    private VisiblePosition(String str, int i) {
    }

    static {
        VisiblePosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
