package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class RangeSliderComponents {

    /* renamed from: a, reason: collision with root package name */
    public static final RangeSliderComponents f10752a;

    /* renamed from: b, reason: collision with root package name */
    public static final RangeSliderComponents f10753b;

    /* renamed from: c, reason: collision with root package name */
    public static final RangeSliderComponents f10754c;
    public static final /* synthetic */ RangeSliderComponents[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.RangeSliderComponents, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.material3.RangeSliderComponents, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.material3.RangeSliderComponents, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ENDTHUMB", 0);
        f10752a = r02;
        ?? r1 = new Enum("STARTTHUMB", 1);
        f10753b = r1;
        ?? r2 = new Enum("TRACK", 2);
        f10754c = r2;
        d = new RangeSliderComponents[]{r02, r1, r2};
    }

    public static RangeSliderComponents valueOf(String str) {
        return (RangeSliderComponents) Enum.valueOf(RangeSliderComponents.class, str);
    }

    public static RangeSliderComponents[] values() {
        return (RangeSliderComponents[]) d.clone();
    }
}
