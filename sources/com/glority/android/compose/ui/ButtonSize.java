package com.glority.android.compose.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/glority/android/compose/ui/ButtonSize;", "", "(Ljava/lang/String;I)V", "LARGE", "MEDIUM", "SMALL", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ButtonSize {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ButtonSize[] $VALUES;
    public static final ButtonSize LARGE = new ButtonSize("LARGE", 0);
    public static final ButtonSize MEDIUM = new ButtonSize("MEDIUM", 1);
    public static final ButtonSize SMALL = new ButtonSize("SMALL", 2);

    private static final /* synthetic */ ButtonSize[] $values() {
        return new ButtonSize[]{LARGE, MEDIUM, SMALL};
    }

    public static EnumEntries<ButtonSize> getEntries() {
        return $ENTRIES;
    }

    public static ButtonSize valueOf(String str) {
        return (ButtonSize) Enum.valueOf(ButtonSize.class, str);
    }

    public static ButtonSize[] values() {
        return (ButtonSize[]) $VALUES.clone();
    }

    private ButtonSize(String str, int i) {
    }

    static {
        ButtonSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
