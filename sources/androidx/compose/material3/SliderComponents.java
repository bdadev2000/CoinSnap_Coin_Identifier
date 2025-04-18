package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class SliderComponents {

    /* renamed from: a, reason: collision with root package name */
    public static final SliderComponents f11218a;

    /* renamed from: b, reason: collision with root package name */
    public static final SliderComponents f11219b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SliderComponents[] f11220c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.material3.SliderComponents] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.material3.SliderComponents] */
    static {
        ?? r02 = new Enum("THUMB", 0);
        f11218a = r02;
        ?? r1 = new Enum("TRACK", 1);
        f11219b = r1;
        f11220c = new SliderComponents[]{r02, r1};
    }

    public static SliderComponents valueOf(String str) {
        return (SliderComponents) Enum.valueOf(SliderComponents.class, str);
    }

    public static SliderComponents[] values() {
        return (SliderComponents[]) f11220c.clone();
    }
}
