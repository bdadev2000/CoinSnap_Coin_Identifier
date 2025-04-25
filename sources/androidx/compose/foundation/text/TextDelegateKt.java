package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextDelegate.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001av\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\f\u0010\u0018\u001a\u00020\u0010*\u00020\u0019H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"updateTextDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "current", "text", "Landroidx/compose/ui/text/AnnotatedString;", TtmlNode.TAG_STYLE, "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "updateTextDelegate-rm0N8CA", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "ceilToIntPx", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f) {
        return Math.round((float) Math.ceil(f));
    }

    /* renamed from: updateTextDelegate-rm0N8CA$default */
    public static /* synthetic */ TextDelegate m1361updateTextDelegaterm0N8CA$default(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, List list, int i4, Object obj) {
        return m1360updateTextDelegaterm0N8CA(textDelegate, annotatedString, textStyle, density, resolver, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? TextOverflow.INSTANCE.m6913getClipgIe3tQ8() : i, (i4 & 128) != 0 ? Integer.MAX_VALUE : i2, (i4 & 256) != 0 ? 1 : i3, list);
    }

    /* renamed from: updateTextDelegate-rm0N8CA */
    public static final TextDelegate m1360updateTextDelegaterm0N8CA(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list) {
        if (Intrinsics.areEqual(textDelegate.getText(), annotatedString) && Intrinsics.areEqual(textDelegate.getStyle(), textStyle)) {
            if (textDelegate.getSoftWrap() == z) {
                if (TextOverflow.m6906equalsimpl0(textDelegate.getOverflow(), i)) {
                    if (textDelegate.getMaxLines() == i2) {
                        if (textDelegate.getMinLines() == i3 && Intrinsics.areEqual(textDelegate.getDensity(), density)) {
                            if (Intrinsics.areEqual(textDelegate.getPlaceholders(), list) && textDelegate.getFontFamilyResolver() == resolver) {
                                return textDelegate;
                            }
                            return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
                        }
                        return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
                    }
                    return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
                }
                return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
            }
            return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
        }
        return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
    }
}
