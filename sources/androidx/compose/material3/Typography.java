package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import org.objectweb.asm.Opcodes;

@Immutable
/* loaded from: classes4.dex */
public final class Typography {

    /* renamed from: a, reason: collision with root package name */
    public final TextStyle f12618a;

    /* renamed from: b, reason: collision with root package name */
    public final TextStyle f12619b;

    /* renamed from: c, reason: collision with root package name */
    public final TextStyle f12620c;
    public final TextStyle d;
    public final TextStyle e;

    /* renamed from: f, reason: collision with root package name */
    public final TextStyle f12621f;

    /* renamed from: g, reason: collision with root package name */
    public final TextStyle f12622g;

    /* renamed from: h, reason: collision with root package name */
    public final TextStyle f12623h;

    /* renamed from: i, reason: collision with root package name */
    public final TextStyle f12624i;

    /* renamed from: j, reason: collision with root package name */
    public final TextStyle f12625j;

    /* renamed from: k, reason: collision with root package name */
    public final TextStyle f12626k;

    /* renamed from: l, reason: collision with root package name */
    public final TextStyle f12627l;

    /* renamed from: m, reason: collision with root package name */
    public final TextStyle f12628m;

    /* renamed from: n, reason: collision with root package name */
    public final TextStyle f12629n;

    /* renamed from: o, reason: collision with root package name */
    public final TextStyle f12630o;

    public Typography(TextStyle textStyle, int i2) {
        TextStyle textStyle2 = (i2 & 1) != 0 ? TypographyTokens.d : null;
        TextStyle textStyle3 = (i2 & 2) != 0 ? TypographyTokens.e : null;
        TextStyle textStyle4 = (i2 & 4) != 0 ? TypographyTokens.f13658f : null;
        TextStyle textStyle5 = (i2 & 8) != 0 ? TypographyTokens.f13659g : null;
        TextStyle textStyle6 = (i2 & 16) != 0 ? TypographyTokens.f13660h : null;
        TextStyle textStyle7 = (i2 & 32) != 0 ? TypographyTokens.f13661i : null;
        TextStyle textStyle8 = (i2 & 64) != 0 ? TypographyTokens.f13665m : null;
        TextStyle textStyle9 = (i2 & 128) != 0 ? TypographyTokens.f13666n : null;
        TextStyle textStyle10 = (i2 & 256) != 0 ? TypographyTokens.f13667o : null;
        TextStyle textStyle11 = (i2 & 512) != 0 ? TypographyTokens.f13655a : textStyle;
        TextStyle textStyle12 = (i2 & 1024) != 0 ? TypographyTokens.f13656b : null;
        TextStyle textStyle13 = (i2 & Opcodes.ACC_STRICT) != 0 ? TypographyTokens.f13657c : null;
        TextStyle textStyle14 = (i2 & 4096) != 0 ? TypographyTokens.f13662j : null;
        TextStyle textStyle15 = (i2 & 8192) != 0 ? TypographyTokens.f13663k : null;
        TextStyle textStyle16 = (i2 & 16384) != 0 ? TypographyTokens.f13664l : null;
        this.f12618a = textStyle2;
        this.f12619b = textStyle3;
        this.f12620c = textStyle4;
        this.d = textStyle5;
        this.e = textStyle6;
        this.f12621f = textStyle7;
        this.f12622g = textStyle8;
        this.f12623h = textStyle9;
        this.f12624i = textStyle10;
        this.f12625j = textStyle11;
        this.f12626k = textStyle12;
        this.f12627l = textStyle13;
        this.f12628m = textStyle14;
        this.f12629n = textStyle15;
        this.f12630o = textStyle16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        return p0.a.g(this.f12618a, typography.f12618a) && p0.a.g(this.f12619b, typography.f12619b) && p0.a.g(this.f12620c, typography.f12620c) && p0.a.g(this.d, typography.d) && p0.a.g(this.e, typography.e) && p0.a.g(this.f12621f, typography.f12621f) && p0.a.g(this.f12622g, typography.f12622g) && p0.a.g(this.f12623h, typography.f12623h) && p0.a.g(this.f12624i, typography.f12624i) && p0.a.g(this.f12625j, typography.f12625j) && p0.a.g(this.f12626k, typography.f12626k) && p0.a.g(this.f12627l, typography.f12627l) && p0.a.g(this.f12628m, typography.f12628m) && p0.a.g(this.f12629n, typography.f12629n) && p0.a.g(this.f12630o, typography.f12630o);
    }

    public final int hashCode() {
        return this.f12630o.hashCode() + ((this.f12629n.hashCode() + ((this.f12628m.hashCode() + ((this.f12627l.hashCode() + ((this.f12626k.hashCode() + ((this.f12625j.hashCode() + ((this.f12624i.hashCode() + ((this.f12623h.hashCode() + ((this.f12622g.hashCode() + ((this.f12621f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f12620c.hashCode() + ((this.f12619b.hashCode() + (this.f12618a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.f12618a + ", displayMedium=" + this.f12619b + ",displaySmall=" + this.f12620c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f12621f + ", titleLarge=" + this.f12622g + ", titleMedium=" + this.f12623h + ", titleSmall=" + this.f12624i + ", bodyLarge=" + this.f12625j + ", bodyMedium=" + this.f12626k + ", bodySmall=" + this.f12627l + ", labelLarge=" + this.f12628m + ", labelMedium=" + this.f12629n + ", labelSmall=" + this.f12630o + ')';
    }
}
