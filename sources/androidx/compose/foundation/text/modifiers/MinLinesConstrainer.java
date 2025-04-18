package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class MinLinesConstrainer {

    /* renamed from: h, reason: collision with root package name */
    public static MinLinesConstrainer f6888h;

    /* renamed from: a, reason: collision with root package name */
    public final LayoutDirection f6889a;

    /* renamed from: b, reason: collision with root package name */
    public final TextStyle f6890b;

    /* renamed from: c, reason: collision with root package name */
    public final Density f6891c;
    public final FontFamily.Resolver d;
    public final TextStyle e;

    /* renamed from: f, reason: collision with root package name */
    public float f6892f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f6893g = Float.NaN;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static MinLinesConstrainer a(MinLinesConstrainer minLinesConstrainer, LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.f6889a && a.g(textStyle, minLinesConstrainer.f6890b) && density.getDensity() == minLinesConstrainer.f6891c.getDensity() && resolver == minLinesConstrainer.d) {
                return minLinesConstrainer;
            }
            MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.f6888h;
            if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.f6889a && a.g(textStyle, minLinesConstrainer2.f6890b) && density.getDensity() == minLinesConstrainer2.f6891c.getDensity() && resolver == minLinesConstrainer2.d) {
                return minLinesConstrainer2;
            }
            MinLinesConstrainer minLinesConstrainer3 = new MinLinesConstrainer(layoutDirection, TextStyleKt.a(textStyle, layoutDirection), density, resolver);
            MinLinesConstrainer.f6888h = minLinesConstrainer3;
            return minLinesConstrainer3;
        }
    }

    public MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
        this.f6889a = layoutDirection;
        this.f6890b = textStyle;
        this.f6891c = density;
        this.d = resolver;
        this.e = TextStyleKt.a(textStyle, layoutDirection);
    }

    public final long a(int i2, long j2) {
        int j3;
        float f2 = this.f6893g;
        float f3 = this.f6892f;
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            float height = ParagraphKt.a(MinLinesConstrainerKt.f6894a, this.e, ConstraintsKt.b(0, 0, 15), this.f6891c, this.d, null, 1, 96).getHeight();
            float height2 = ParagraphKt.a(MinLinesConstrainerKt.f6895b, this.e, ConstraintsKt.b(0, 0, 15), this.f6891c, this.d, null, 2, 96).getHeight() - height;
            this.f6893g = height;
            this.f6892f = height2;
            f3 = height2;
            f2 = height;
        }
        if (i2 != 1) {
            int round = Math.round((f3 * (i2 - 1)) + f2);
            j3 = round >= 0 ? round : 0;
            int h2 = Constraints.h(j2);
            if (j3 > h2) {
                j3 = h2;
            }
        } else {
            j3 = Constraints.j(j2);
        }
        return ConstraintsKt.a(Constraints.k(j2), Constraints.i(j2), j3, Constraints.h(j2));
    }
}
