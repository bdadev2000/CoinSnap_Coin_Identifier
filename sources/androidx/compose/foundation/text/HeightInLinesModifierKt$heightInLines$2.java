package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
final class HeightInLinesModifierKt$heightInLines$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextStyle f5972c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeightInLinesModifierKt$heightInLines$2(int i2, int i3, TextStyle textStyle) {
        super(3);
        this.f5970a = i2;
        this.f5971b = i3;
        this.f5972c = textStyle;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Density density;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(408240218);
        int i2 = this.f5970a;
        int i3 = this.f5971b;
        HeightInLinesModifierKt.a(i2, i3);
        Modifier.Companion companion = Modifier.Companion.f14687a;
        if (i2 == 1 && i3 == Integer.MAX_VALUE) {
            composer.D();
            return companion;
        }
        Density density2 = (Density) composer.K(CompositionLocalsKt.f16434f);
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.K(CompositionLocalsKt.f16437i);
        LayoutDirection layoutDirection = (LayoutDirection) composer.K(CompositionLocalsKt.f16440l);
        TextStyle textStyle = this.f5972c;
        boolean I = composer.I(textStyle) | composer.I(layoutDirection);
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (I || u2 == composer$Companion$Empty$1) {
            u2 = TextStyleKt.a(textStyle, layoutDirection);
            composer.o(u2);
        }
        TextStyle textStyle2 = (TextStyle) u2;
        boolean I2 = composer.I(resolver) | composer.I(textStyle2);
        Object u3 = composer.u();
        if (I2 || u3 == composer$Companion$Empty$1) {
            SpanStyle spanStyle = textStyle2.f17059a;
            FontFamily fontFamily = spanStyle.f17020f;
            FontWeight fontWeight = spanStyle.f17019c;
            if (fontWeight == null) {
                fontWeight = FontWeight.f17269i;
            }
            FontStyle fontStyle = spanStyle.d;
            int i4 = fontStyle != null ? fontStyle.f17260a : 0;
            FontSynthesis fontSynthesis = spanStyle.e;
            u3 = resolver.a(fontFamily, fontWeight, i4, fontSynthesis != null ? fontSynthesis.f17261a : 1);
            composer.o(u3);
        }
        State state = (State) u3;
        boolean I3 = composer.I(state.getValue()) | composer.I(density2) | composer.I(resolver) | composer.I(textStyle) | composer.I(layoutDirection);
        Object u4 = composer.u();
        if (I3 || u4 == composer$Companion$Empty$1) {
            density = density2;
            u4 = Integer.valueOf((int) (TextFieldDelegateKt.a(textStyle2, density2, resolver, TextFieldDelegateKt.f6131a, 1) & 4294967295L));
            composer.o(u4);
        } else {
            density = density2;
        }
        int intValue = ((Number) u4).intValue();
        Density density3 = density;
        boolean I4 = composer.I(state.getValue()) | composer.I(layoutDirection) | composer.I(textStyle) | composer.I(density3) | composer.I(resolver);
        Object u5 = composer.u();
        if (I4 || u5 == composer$Companion$Empty$1) {
            StringBuilder sb = new StringBuilder();
            String str = TextFieldDelegateKt.f6131a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            u5 = Integer.valueOf((int) (TextFieldDelegateKt.a(textStyle2, density3, resolver, sb.toString(), 2) & 4294967295L));
            composer.o(u5);
        }
        int intValue2 = ((Number) u5).intValue() - intValue;
        Integer valueOf = i2 == 1 ? null : Integer.valueOf(((i2 - 1) * intValue2) + intValue);
        Integer valueOf2 = i3 != Integer.MAX_VALUE ? Integer.valueOf(((i3 - 1) * intValue2) + intValue) : null;
        Modifier f2 = SizeKt.f(companion, valueOf != null ? density3.H(valueOf.intValue()) : Float.NaN, valueOf2 != null ? density3.H(valueOf2.intValue()) : Float.NaN);
        composer.D();
        return f2;
    }
}
