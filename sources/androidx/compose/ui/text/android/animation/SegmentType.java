package androidx.compose.ui.text.android.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SegmentType {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SegmentType[] f17131a = {new Enum("Document", 0), new Enum("Paragraph", 1), new Enum("Line", 2), new Enum("Word", 3), new Enum("Character", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    SegmentType EF5;

    public static SegmentType valueOf(String str) {
        return (SegmentType) Enum.valueOf(SegmentType.class, str);
    }

    public static SegmentType[] values() {
        return (SegmentType[]) f17131a.clone();
    }
}
