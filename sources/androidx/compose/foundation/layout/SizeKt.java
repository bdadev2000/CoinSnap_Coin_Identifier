package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes2.dex */
public final class SizeKt {

    /* renamed from: a */
    public static final FillElement f4105a;

    /* renamed from: b */
    public static final FillElement f4106b;

    /* renamed from: c */
    public static final FillElement f4107c;
    public static final WrapContentElement d;
    public static final WrapContentElement e;

    /* renamed from: f */
    public static final WrapContentElement f4108f;

    /* renamed from: g */
    public static final WrapContentElement f4109g;

    /* renamed from: h */
    public static final WrapContentElement f4110h;

    /* renamed from: i */
    public static final WrapContentElement f4111i;

    static {
        Direction direction = Direction.f3880b;
        f4105a = new FillElement(direction, 1.0f);
        Direction direction2 = Direction.f3879a;
        f4106b = new FillElement(direction2, 1.0f);
        Direction direction3 = Direction.f3881c;
        f4107c = new FillElement(direction3, 1.0f);
        BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
        d = new WrapContentElement(direction, false, new WrapContentElement$Companion$width$1(horizontal), horizontal);
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.f14669m;
        e = new WrapContentElement(direction, false, new WrapContentElement$Companion$width$1(horizontal2), horizontal2);
        BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
        f4108f = new WrapContentElement(direction2, false, new WrapContentElement$Companion$height$1(vertical), vertical);
        BiasAlignment.Vertical vertical2 = Alignment.Companion.f14666j;
        f4109g = new WrapContentElement(direction2, false, new WrapContentElement$Companion$height$1(vertical2), vertical2);
        BiasAlignment biasAlignment = Alignment.Companion.e;
        f4110h = new WrapContentElement(direction3, false, new WrapContentElement$Companion$size$1(biasAlignment), biasAlignment);
        BiasAlignment biasAlignment2 = Alignment.Companion.f14659a;
        f4111i = new WrapContentElement(direction3, false, new WrapContentElement$Companion$size$1(biasAlignment2), biasAlignment2);
    }

    public static final Modifier a(Modifier modifier, float f2, float f3) {
        return modifier.T0(new UnspecifiedConstraintsElement(f2, f3));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(modifier, f2, f3);
    }

    public static final Modifier c(Modifier modifier, float f2) {
        return modifier.T0(f2 == 1.0f ? f4106b : new FillElement(Direction.f3879a, f2));
    }

    public static final Modifier d(Modifier modifier, float f2) {
        return modifier.T0(f2 == 1.0f ? f4105a : new FillElement(Direction.f3880b, f2));
    }

    public static final Modifier e(Modifier modifier, float f2) {
        return modifier.T0(new SizeElement(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final Modifier f(Modifier modifier, float f2, float f3) {
        return modifier.T0(new SizeElement(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static /* synthetic */ Modifier g(Modifier modifier, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return f(modifier, f2, f3);
    }

    public static final Modifier h(Modifier modifier, float f2) {
        return modifier.T0(new SizeElement(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static Modifier i(Modifier modifier, float f2) {
        return modifier.T0(new SizeElement(0.0f, f2, 0.0f, Float.NaN, false, 5));
    }

    public static final Modifier j(Modifier modifier, float f2) {
        return modifier.T0(new SizeElement(f2, f2, f2, f2, false));
    }

    public static final Modifier k(Modifier modifier, float f2, float f3) {
        return modifier.T0(new SizeElement(f2, f3, f2, f3, false));
    }

    public static Modifier l(Modifier modifier, float f2, float f3, float f4, float f5, int i2) {
        return modifier.T0(new SizeElement((i2 & 1) != 0 ? Float.NaN : f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final Modifier m(Modifier modifier, float f2) {
        return modifier.T0(new SizeElement(f2, 0.0f, f2, 0.0f, false, 10));
    }

    public static final Modifier n(Modifier modifier, float f2) {
        return modifier.T0(new SizeElement(f2, f2, f2, f2, true));
    }

    public static final Modifier o(Modifier modifier, float f2, float f3) {
        return modifier.T0(new SizeElement(f2, f3, f2, f3, true));
    }

    public static final Modifier p(Modifier modifier, float f2, float f3, float f4, float f5) {
        return modifier.T0(new SizeElement(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ Modifier q(Modifier modifier, float f2, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        return p(modifier, f2, f3, f4, (i2 & 8) == 0 ? 0.0f : Float.NaN);
    }

    public static final Modifier r(Modifier modifier, float f2) {
        return modifier.T0(new SizeElement(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static Modifier s(Modifier modifier, float f2, float f3, int i2) {
        return modifier.T0(new SizeElement((i2 & 1) != 0 ? Float.NaN : f2, 0.0f, (i2 & 2) != 0 ? Float.NaN : f3, 0.0f, true, 10));
    }

    public static Modifier t(Modifier modifier) {
        BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
        return modifier.T0(p0.a.g(vertical, vertical) ? f4108f : p0.a.g(vertical, Alignment.Companion.f14666j) ? f4109g : new WrapContentElement(Direction.f3879a, false, new WrapContentElement$Companion$height$1(vertical), vertical));
    }

    public static Modifier u(Modifier modifier, BiasAlignment biasAlignment, int i2) {
        int i3 = i2 & 1;
        BiasAlignment biasAlignment2 = Alignment.Companion.e;
        if (i3 != 0) {
            biasAlignment = biasAlignment2;
        }
        return modifier.T0(p0.a.g(biasAlignment, biasAlignment2) ? f4110h : p0.a.g(biasAlignment, Alignment.Companion.f14659a) ? f4111i : new WrapContentElement(Direction.f3881c, false, new WrapContentElement$Companion$size$1(biasAlignment), biasAlignment));
    }

    public static Modifier v(Modifier modifier) {
        BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
        return modifier.T0(p0.a.g(horizontal, horizontal) ? d : p0.a.g(horizontal, Alignment.Companion.f14669m) ? e : new WrapContentElement(Direction.f3880b, false, new WrapContentElement$Companion$width$1(horizontal), horizontal));
    }
}
