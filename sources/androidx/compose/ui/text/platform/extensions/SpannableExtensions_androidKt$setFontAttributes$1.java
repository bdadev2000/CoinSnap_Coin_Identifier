package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
final class SpannableExtensions_androidKt$setFontAttributes$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spannable f17440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.r f17441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, q0.r rVar) {
        super(3);
        this.f17440a = spannable;
        this.f17441b = rVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SpanStyle spanStyle = (SpanStyle) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        FontFamily fontFamily = spanStyle.f17020f;
        FontWeight fontWeight = spanStyle.f17019c;
        if (fontWeight == null) {
            fontWeight = FontWeight.f17269i;
        }
        FontStyle fontStyle = spanStyle.d;
        FontStyle fontStyle2 = new FontStyle(fontStyle != null ? fontStyle.f17260a : 0);
        FontSynthesis fontSynthesis = spanStyle.e;
        this.f17440a.setSpan(new TypefaceSpan((Typeface) this.f17441b.invoke(fontFamily, fontWeight, fontStyle2, new FontSynthesis(fontSynthesis != null ? fontSynthesis.f17261a : 1))), intValue, intValue2, 33);
        return b0.f30125a;
    }
}
