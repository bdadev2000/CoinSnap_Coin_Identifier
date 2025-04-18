package androidx.compose.foundation.text.input.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class WedgeAffinity {

    /* renamed from: a, reason: collision with root package name */
    public static final WedgeAffinity f6668a;

    /* renamed from: b, reason: collision with root package name */
    public static final WedgeAffinity f6669b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ WedgeAffinity[] f6670c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.WedgeAffinity] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.WedgeAffinity] */
    static {
        ?? r02 = new Enum("Start", 0);
        f6668a = r02;
        ?? r1 = new Enum("End", 1);
        f6669b = r1;
        f6670c = new WedgeAffinity[]{r02, r1};
    }

    public static WedgeAffinity valueOf(String str) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, str);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) f6670c.clone();
    }
}
