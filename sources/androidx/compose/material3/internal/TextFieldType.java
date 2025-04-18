package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TextFieldType {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldType f13111a;

    /* renamed from: b, reason: collision with root package name */
    public static final TextFieldType f13112b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ TextFieldType[] f13113c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.material3.internal.TextFieldType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.material3.internal.TextFieldType] */
    static {
        ?? r02 = new Enum("Filled", 0);
        f13111a = r02;
        ?? r1 = new Enum("Outlined", 1);
        f13112b = r1;
        f13113c = new TextFieldType[]{r02, r1};
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) f13113c.clone();
    }
}
