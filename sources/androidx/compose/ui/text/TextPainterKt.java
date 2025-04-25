package androidx.compose.ui.text;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TextPainter.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001af\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001ah\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0080\u0001\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aj\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020/2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a&\u00102\u001a\u000203*\u00020\u00062\u0006\u0010+\u001a\u00020,2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"clip", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawText", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "text", "Landroidx/compose/ui/text/AnnotatedString;", TtmlNode.TAG_STYLE, "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", LogEventArguments.ARG_SIZE, "Landroidx/compose/ui/geometry/Size;", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "textLayoutConstraints", "Landroidx/compose/ui/unit/Constraints;", "textLayoutConstraints-v_w8tDc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class TextPainterKt {
    /* renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m6439drawTextJFhB2K4(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j, TextStyle textStyle, int i, boolean z, int i2, List<AnnotatedString.Range<Placeholder>> list, long j2, int i3) {
        TextLayoutResult m6436measurexDpz5zY$default = TextMeasurer.m6436measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i, z, i2, list, m6447textLayoutConstraintsv_w8tDc(drawScope, j2, j), drawScope.getLayoutDirection(), drawScope, null, false, 1536, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4992getSizeNHjbRc = drawContext.mo4992getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m4274getXimpl(j), Offset.m4275getYimpl(j));
            clip(transform, m6436measurexDpz5zY$default);
            m6436measurexDpz5zY$default.getMultiParagraph().m6329paintLG529CI(drawScope.getDrawContext().getCanvas(), (r14 & 2) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : 0L, (r14 & 4) != 0 ? null : null, (r14 & 8) != 0 ? null : null, (r14 & 16) == 0 ? null : null, (r14 & 32) != 0 ? DrawScope.INSTANCE.m5073getDefaultBlendMode0nO6VwU() : i3);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4993setSizeuvyYCjk(mo4992getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m6443drawTextTPWCCtM(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j, TextStyle textStyle, int i, boolean z, int i2, long j2, int i3) {
        TextLayoutResult m6436measurexDpz5zY$default = TextMeasurer.m6436measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, null, 6, null), textStyle, i, z, i2, null, m6447textLayoutConstraintsv_w8tDc(drawScope, j2, j), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4992getSizeNHjbRc = drawContext.mo4992getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m4274getXimpl(j), Offset.m4275getYimpl(j));
            clip(transform, m6436measurexDpz5zY$default);
            m6436measurexDpz5zY$default.getMultiParagraph().m6329paintLG529CI(drawScope.getDrawContext().getCanvas(), (r14 & 2) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : 0L, (r14 & 4) != 0 ? null : null, (r14 & 8) != 0 ? null : null, (r14 & 16) == 0 ? null : null, (r14 & 32) != 0 ? DrawScope.INSTANCE.m5073getDefaultBlendMode0nO6VwU() : i3);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4993setSizeuvyYCjk(mo4992getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m6445drawTextd8rzKo(DrawScope drawScope, TextLayoutResult textLayoutResult, long j, long j2, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4992getSizeNHjbRc = drawContext.mo4992getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m4274getXimpl(j2), Offset.m4275getYimpl(j2));
            clip(transform, textLayoutResult);
            Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
            if (brush != null && j == 16) {
                textLayoutResult.getMultiParagraph().m6331painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i);
            } else {
                textLayoutResult.getMultiParagraph().m6329paintLG529CI(drawScope.getDrawContext().getCanvas(), TextDrawStyleKt.m6884modulateDxMtmZc(j != 16 ? j : textLayoutResult.getLayoutInput().getStyle().m6490getColor0d7_KjU(), f), shadow2, textDecoration2, drawStyle2, i);
            }
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4993setSizeuvyYCjk(mo4992getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m6441drawTextLVfH_YU(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4992getSizeNHjbRc = drawContext.mo4992getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m4274getXimpl(j), Offset.m4275getYimpl(j));
            clip(transform, textLayoutResult);
            textLayoutResult.getMultiParagraph().m6331painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4993setSizeuvyYCjk(mo4992getSizeNHjbRc);
        }
    }

    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m6906equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m6915getVisiblegIe3tQ8())) {
            return;
        }
        DrawTransform.m5128clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, IntSize.m7167getWidthimpl(textLayoutResult.getSize()), IntSize.m7166getHeightimpl(textLayoutResult.getSize()), 0, 16, null);
    }

    /* renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m6447textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j, long j2) {
        int round;
        int i;
        int round2;
        int i2 = 0;
        if (j == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Size.m4343getWidthimpl(j))) {
            round = Math.round((float) Math.ceil(Size.m4343getWidthimpl(drawScope.mo5071getSizeNHjbRc()) - Offset.m4274getXimpl(j2)));
            i = 0;
        } else {
            i = Math.round((float) Math.ceil(Size.m4343getWidthimpl(j)));
            round = i;
        }
        if (j == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Size.m4340getHeightimpl(j))) {
            round2 = Math.round((float) Math.ceil(Size.m4340getHeightimpl(drawScope.mo5071getSizeNHjbRc()) - Offset.m4275getYimpl(j2)));
        } else {
            i2 = Math.round((float) Math.ceil(Size.m4340getHeightimpl(j)));
            round2 = i2;
        }
        return ConstraintsKt.Constraints(i, round, i2, round2);
    }
}
