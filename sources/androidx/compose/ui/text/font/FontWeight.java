package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import b1.f0;
import com.safedk.android.internal.d;
import java.util.List;
import p0.a;

@Immutable
/* loaded from: classes3.dex */
public final class FontWeight implements Comparable<FontWeight> {

    /* renamed from: b, reason: collision with root package name */
    public static final FontWeight f17264b;

    /* renamed from: c, reason: collision with root package name */
    public static final FontWeight f17265c;
    public static final FontWeight d;

    /* renamed from: f, reason: collision with root package name */
    public static final FontWeight f17266f;

    /* renamed from: g, reason: collision with root package name */
    public static final FontWeight f17267g;

    /* renamed from: h, reason: collision with root package name */
    public static final FontWeight f17268h;

    /* renamed from: i, reason: collision with root package name */
    public static final FontWeight f17269i;

    /* renamed from: j, reason: collision with root package name */
    public static final FontWeight f17270j;

    /* renamed from: k, reason: collision with root package name */
    public static final FontWeight f17271k;

    /* renamed from: l, reason: collision with root package name */
    public static final FontWeight f17272l;

    /* renamed from: m, reason: collision with root package name */
    public static final List f17273m;

    /* renamed from: a, reason: collision with root package name */
    public final int f17274a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        FontWeight fontWeight2 = new FontWeight(200);
        FontWeight fontWeight3 = new FontWeight(300);
        FontWeight fontWeight4 = new FontWeight(400);
        f17264b = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(d.f29936c);
        f17265c = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        d = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        f17266f = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        FontWeight fontWeight9 = new FontWeight(900);
        f17267g = fontWeight;
        f17268h = fontWeight3;
        f17269i = fontWeight4;
        f17270j = fontWeight5;
        f17271k = fontWeight6;
        f17272l = fontWeight7;
        f17273m = f0.v(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i2) {
        this.f17274a = i2;
        if (1 > i2 || i2 >= 1001) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("Font weight can be in range [1, 1000]. Current value: ", i2).toString());
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(FontWeight fontWeight) {
        return a.E(this.f17274a, fontWeight.f17274a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FontWeight) {
            return this.f17274a == ((FontWeight) obj).f17274a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17274a;
    }

    public final String toString() {
        return android.support.v4.media.d.o(new StringBuilder("FontWeight(weight="), this.f17274a, ')');
    }
}
