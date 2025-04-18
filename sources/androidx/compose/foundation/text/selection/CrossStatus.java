package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CrossStatus {

    /* renamed from: a, reason: collision with root package name */
    public static final CrossStatus f7053a;

    /* renamed from: b, reason: collision with root package name */
    public static final CrossStatus f7054b;

    /* renamed from: c, reason: collision with root package name */
    public static final CrossStatus f7055c;
    public static final /* synthetic */ CrossStatus[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.selection.CrossStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.selection.CrossStatus] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.selection.CrossStatus] */
    static {
        ?? r02 = new Enum("CROSSED", 0);
        f7053a = r02;
        ?? r1 = new Enum("NOT_CROSSED", 1);
        f7054b = r1;
        ?? r2 = new Enum("COLLAPSED", 2);
        f7055c = r2;
        d = new CrossStatus[]{r02, r1, r2};
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) d.clone();
    }
}
