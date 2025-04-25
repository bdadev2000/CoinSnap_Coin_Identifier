package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* compiled from: TextMeasurer.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u008a\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#Jt\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020$2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "defaultFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "defaultDensity", "Landroidx/compose/ui/unit/Density;", "defaultLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "cacheSize", "", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "textLayoutCache", "Landroidx/compose/ui/text/TextLayoutCache;", "measure", "Landroidx/compose/ui/text/TextLayoutResult;", "text", "Landroidx/compose/ui/text/AnnotatedString;", TtmlNode.TAG_STYLE, "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "measure-xDpz5zY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "", "measure-wNUYSr0", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class TextMeasurer {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int cacheSize;
    private final Density defaultDensity;
    private final FontFamily.Resolver defaultFontFamilyResolver;
    private final LayoutDirection defaultLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i) {
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i;
        this.textLayoutCache = i > 0 ? new TextLayoutCache(i) : null;
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver, density, layoutDirection, (i2 & 8) != 0 ? TextMeasurerKt.DefaultCacheSize : i);
    }

    /* renamed from: measure-xDpz5zY$default */
    public static /* synthetic */ TextLayoutResult m6436measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, List list, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2, int i3, Object obj) {
        return textMeasurer.m6438measurexDpz5zY(annotatedString, (i3 & 2) != 0 ? TextStyle.INSTANCE.getDefault() : textStyle, (i3 & 4) != 0 ? TextOverflow.INSTANCE.m6913getClipgIe3tQ8() : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j, (i3 & 128) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i3 & 256) != 0 ? textMeasurer.defaultDensity : density, (i3 & 512) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i3 & 1024) != 0 ? false : z2);
    }

    /* renamed from: measure-xDpz5zY */
    public final TextLayoutResult m6438measurexDpz5zY(AnnotatedString text, TextStyle r17, int overflow, boolean softWrap, int maxLines, List<AnnotatedString.Range<Placeholder>> placeholders, long constraints, LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(text, r17, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints, (DefaultConstructorMarker) null);
        TextLayoutResult textLayoutResult = (skipCache || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m6431copyO0kMr_c(textLayoutInput, ConstraintsKt.m6964constrain4WqzIAM(constraints, IntSizeKt.IntSize(ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()), ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        TextLayoutResult layout = INSTANCE.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 == null) {
            return layout;
        }
        textLayoutCache2.put(textLayoutInput, layout);
        return layout;
    }

    /* renamed from: measure-wNUYSr0 */
    public final TextLayoutResult m6437measurewNUYSr0(String text, TextStyle r17, int overflow, boolean softWrap, int maxLines, long constraints, LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
        return m6436measurexDpz5zY$default(this, new AnnotatedString(text, null, null, 6, null), r17, overflow, softWrap, maxLines, null, constraints, layoutDirection, density, fontFamilyResolver, skipCache, 32, null);
    }

    /* compiled from: TextMeasurer.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "()V", TtmlNode.TAG_LAYOUT, "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int m6952getMinWidthimpl = Constraints.m6952getMinWidthimpl(textLayoutInput.getConstraints());
            int m6950getMaxWidthimpl = ((textLayoutInput.getSoftWrap() || TextOverflow.m6906equalsimpl0(textLayoutInput.getOverflow(), TextOverflow.INSTANCE.m6914getEllipsisgIe3tQ8())) && Constraints.m6946getHasBoundedWidthimpl(textLayoutInput.getConstraints())) ? Constraints.m6950getMaxWidthimpl(textLayoutInput.getConstraints()) : Integer.MAX_VALUE;
            int maxLines = (textLayoutInput.getSoftWrap() || !TextOverflow.m6906equalsimpl0(textLayoutInput.getOverflow(), TextOverflow.INSTANCE.m6914getEllipsisgIe3tQ8())) ? textLayoutInput.getMaxLines() : 1;
            if (m6952getMinWidthimpl != m6950getMaxWidthimpl) {
                m6950getMaxWidthimpl = RangesKt.coerceIn(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), m6952getMinWidthimpl, m6950getMaxWidthimpl);
            }
            return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, Constraints.INSTANCE.m6959fitPrioritizingWidthZbe2FdA(0, m6950getMaxWidthimpl, 0, Constraints.m6949getMaxHeightimpl(textLayoutInput.getConstraints())), maxLines, TextOverflow.m6906equalsimpl0(textLayoutInput.getOverflow(), TextOverflow.INSTANCE.m6914getEllipsisgIe3tQ8()), null), ConstraintsKt.m6964constrain4WqzIAM(textLayoutInput.getConstraints(), IntSizeKt.IntSize((int) Math.ceil(r13.getWidth()), (int) Math.ceil(r13.getHeight()))), null);
        }
    }
}
