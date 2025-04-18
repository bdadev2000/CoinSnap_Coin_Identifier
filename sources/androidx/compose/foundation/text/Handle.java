package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Handle {

    /* renamed from: a, reason: collision with root package name */
    public static final Handle f5964a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handle f5965b;

    /* renamed from: c, reason: collision with root package name */
    public static final Handle f5966c;
    public static final /* synthetic */ Handle[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.Handle] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.Handle] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.Handle] */
    static {
        ?? r02 = new Enum("Cursor", 0);
        f5964a = r02;
        ?? r1 = new Enum("SelectionStart", 1);
        f5965b = r1;
        ?? r2 = new Enum("SelectionEnd", 2);
        f5966c = r2;
        d = new Handle[]{r02, r1, r2};
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) d.clone();
    }
}
