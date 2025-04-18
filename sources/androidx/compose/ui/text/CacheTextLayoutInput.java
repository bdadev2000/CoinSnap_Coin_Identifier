package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import p0.a;

@Immutable
/* loaded from: classes2.dex */
public final class CacheTextLayoutInput {

    /* renamed from: a, reason: collision with root package name */
    public final TextLayoutInput f16903a;

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput) {
        this.f16903a = textLayoutInput;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.f16903a;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) obj;
        if (!a.g(textLayoutInput.f17038a, cacheTextLayoutInput.f16903a.f17038a)) {
            return false;
        }
        if (!textLayoutInput.f17039b.d(cacheTextLayoutInput.f16903a.f17039b)) {
            return false;
        }
        if (!a.g(textLayoutInput.f17040c, cacheTextLayoutInput.f16903a.f17040c)) {
            return false;
        }
        TextLayoutInput textLayoutInput2 = cacheTextLayoutInput.f16903a;
        if (textLayoutInput.d != textLayoutInput2.d) {
            return false;
        }
        if (textLayoutInput.e != textLayoutInput2.e) {
            return false;
        }
        if (!TextOverflow.a(textLayoutInput.f17041f, textLayoutInput2.f17041f)) {
            return false;
        }
        if (!a.g(textLayoutInput.f17042g, cacheTextLayoutInput.f16903a.f17042g)) {
            return false;
        }
        TextLayoutInput textLayoutInput3 = cacheTextLayoutInput.f16903a;
        if (textLayoutInput.f17043h != textLayoutInput3.f17043h) {
            return false;
        }
        if (textLayoutInput.f17044i != textLayoutInput3.f17044i) {
            return false;
        }
        long j2 = textLayoutInput.f17045j;
        return Constraints.i(j2) == Constraints.i(cacheTextLayoutInput.f16903a.f17045j) && Constraints.h(j2) == Constraints.h(cacheTextLayoutInput.f16903a.f17045j);
    }

    public final int hashCode() {
        TextLayoutInput textLayoutInput = this.f16903a;
        int hashCode = textLayoutInput.f17038a.hashCode() * 31;
        TextStyle textStyle = textLayoutInput.f17039b;
        SpanStyle spanStyle = textStyle.f17059a;
        spanStyle.getClass();
        TextUnitType[] textUnitTypeArr = TextUnit.f17498b;
        int hashCode2 = Long.hashCode(spanStyle.f17018b) * 31;
        FontWeight fontWeight = spanStyle.f17019c;
        int i2 = (hashCode2 + (fontWeight != null ? fontWeight.f17274a : 0)) * 31;
        FontStyle fontStyle = spanStyle.d;
        int hashCode3 = (i2 + (fontStyle != null ? Integer.hashCode(fontStyle.f17260a) : 0)) * 31;
        FontSynthesis fontSynthesis = spanStyle.e;
        int hashCode4 = (hashCode3 + (fontSynthesis != null ? Integer.hashCode(fontSynthesis.f17261a) : 0)) * 31;
        FontFamily fontFamily = spanStyle.f17020f;
        int hashCode5 = (hashCode4 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = spanStyle.f17021g;
        int d = d.d(spanStyle.f17022h, (hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        BaselineShift baselineShift = spanStyle.f17023i;
        int hashCode6 = (d + (baselineShift != null ? Float.hashCode(baselineShift.f17447a) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = spanStyle.f17024j;
        int hashCode7 = (hashCode6 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = spanStyle.f17025k;
        int hashCode8 = (hashCode7 + (localeList != null ? localeList.f17402a.hashCode() : 0)) * 31;
        int i3 = Color.f14963j;
        int d2 = d.d(spanStyle.f17026l, hashCode8, 31);
        PlatformSpanStyle platformSpanStyle = spanStyle.f17029o;
        int hashCode9 = (textStyle.f17060b.hashCode() + ((d2 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31)) * 31;
        PlatformTextStyle platformTextStyle = textStyle.f17061c;
        int hashCode10 = (textLayoutInput.f17044i.hashCode() + ((textLayoutInput.f17043h.hashCode() + ((textLayoutInput.f17042g.hashCode() + d.c(textLayoutInput.f17041f, d.g(textLayoutInput.e, (d.f(textLayoutInput.f17040c, (hashCode9 + (platformTextStyle != null ? platformTextStyle.hashCode() : 0) + hashCode) * 31, 31) + textLayoutInput.d) * 31, 31), 31)) * 31)) * 31)) * 31;
        long j2 = textLayoutInput.f17045j;
        return Integer.hashCode(Constraints.h(j2)) + ((Integer.hashCode(Constraints.i(j2)) + hashCode10) * 31);
    }
}
