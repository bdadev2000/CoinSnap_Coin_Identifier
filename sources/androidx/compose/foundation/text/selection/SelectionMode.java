package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class SelectionMode {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SelectionMode[] f7273a = {new SelectionMode() { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
    }, new SelectionMode() { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
    }};

    /* JADX INFO: Fake field, exist only in values array */
    SelectionMode EF2;

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) f7273a.clone();
    }
}
