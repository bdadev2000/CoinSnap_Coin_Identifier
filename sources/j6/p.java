package j6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p {
    public static final /* synthetic */ p[] b = {new Enum("START", 0), new Enum("END", 1), new Enum("TOP", 2), new Enum("BOTTOM", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    p EF5;

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) b.clone();
    }
}
