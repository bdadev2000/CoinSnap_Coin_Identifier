package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
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

/* loaded from: classes3.dex */
final class TextFieldSizeKt$textFieldMinSize$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextStyle f6207a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSizeKt$textFieldMinSize$1(TextStyle textStyle) {
        super(3);
        this.f6207a = textStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, androidx.compose.foundation.text.TextFieldSize] */
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long a2;
        long a3;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(1582736677);
        Density density = (Density) composer.K(CompositionLocalsKt.f16434f);
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.K(CompositionLocalsKt.f16437i);
        LayoutDirection layoutDirection = (LayoutDirection) composer.K(CompositionLocalsKt.f16440l);
        TextStyle textStyle = this.f6207a;
        boolean I = composer.I(textStyle) | composer.I(layoutDirection);
        Object u2 = composer.u();
        Object obj4 = Composer.Companion.f13690a;
        if (I || u2 == obj4) {
            u2 = TextStyleKt.a(textStyle, layoutDirection);
            composer.o(u2);
        }
        TextStyle textStyle2 = (TextStyle) u2;
        boolean I2 = composer.I(resolver) | composer.I(textStyle2);
        Object u3 = composer.u();
        if (I2 || u3 == obj4) {
            SpanStyle spanStyle = textStyle2.f17059a;
            FontFamily fontFamily = spanStyle.f17020f;
            FontWeight fontWeight = spanStyle.f17019c;
            if (fontWeight == null) {
                fontWeight = FontWeight.f17269i;
            }
            FontStyle fontStyle = spanStyle.d;
            int i2 = fontStyle != null ? fontStyle.f17260a : 0;
            FontSynthesis fontSynthesis = spanStyle.e;
            u3 = resolver.a(fontFamily, fontWeight, i2, fontSynthesis != null ? fontSynthesis.f17261a : 1);
            composer.o(u3);
        }
        State state = (State) u3;
        Object u4 = composer.u();
        Object obj5 = u4;
        if (u4 == obj4) {
            Object value = state.getValue();
            ?? obj6 = new Object();
            obj6.f6203a = layoutDirection;
            obj6.f6204b = density;
            obj6.f6205c = resolver;
            obj6.d = textStyle;
            obj6.e = value;
            a3 = TextFieldDelegateKt.a(textStyle, density, resolver, TextFieldDelegateKt.f6131a, 1);
            obj6.f6206f = a3;
            composer.o(obj6);
            obj5 = obj6;
        }
        TextFieldSize textFieldSize = (TextFieldSize) obj5;
        Object value2 = state.getValue();
        if (layoutDirection != textFieldSize.f6203a || !p0.a.g(density, textFieldSize.f6204b) || !p0.a.g(resolver, textFieldSize.f6205c) || !p0.a.g(textStyle2, textFieldSize.d) || !p0.a.g(value2, textFieldSize.e)) {
            textFieldSize.f6203a = layoutDirection;
            textFieldSize.f6204b = density;
            textFieldSize.f6205c = resolver;
            textFieldSize.d = textStyle2;
            textFieldSize.e = value2;
            a2 = TextFieldDelegateKt.a(textStyle2, density, resolver, TextFieldDelegateKt.f6131a, 1);
            textFieldSize.f6206f = a2;
        }
        Modifier.Companion companion = Modifier.Companion.f14687a;
        boolean w = composer.w(textFieldSize);
        Object u5 = composer.u();
        if (w || u5 == obj4) {
            u5 = new TextFieldSizeKt$textFieldMinSize$1$1$1(textFieldSize);
            composer.o(u5);
        }
        Modifier a4 = LayoutModifierKt.a(companion, (q) u5);
        composer.D();
        return a4;
    }
}
