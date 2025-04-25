package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: Tooltip.android.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0093\u0001\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u00112\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"PlainTooltip", "", "Landroidx/compose/material3/TooltipScope;", "modifier", "Landroidx/compose/ui/Modifier;", "caretSize", "Landroidx/compose/ui/unit/DpSize;", "shape", "Landroidx/compose/ui/graphics/Shape;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "containerColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "PlainTooltip-7QI4Sbk", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "RichTooltip", Args.title, "action", "colors", "Landroidx/compose/material3/RichTooltipColors;", "text", "RichTooltip-yDvdmqw", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "drawCaretWithPath", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "caretType", "Landroidx/compose/material3/CaretType;", "density", "Landroidx/compose/ui/unit/Density;", "configuration", "Landroid/content/res/Configuration;", "anchorLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "drawCaretWithPath-JKu-mZY", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/material3/CaretType;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JJLandroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class Tooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ea  */
    /* renamed from: PlainTooltip-7QI4Sbk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m3165PlainTooltip7QI4Sbk(final androidx.compose.material3.TooltipScope r33, androidx.compose.ui.Modifier r34, long r35, androidx.compose.ui.graphics.Shape r37, long r38, long r40, float r42, float r43, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Tooltip_androidKt.m3165PlainTooltip7QI4Sbk(androidx.compose.material3.TooltipScope, androidx.compose.ui.Modifier, long, androidx.compose.ui.graphics.Shape, long, long, float, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018e  */
    /* renamed from: RichTooltip-yDvdmqw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m3166RichTooltipyDvdmqw(final androidx.compose.material3.TooltipScope r31, androidx.compose.ui.Modifier r32, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, long r35, androidx.compose.ui.graphics.Shape r37, androidx.compose.material3.RichTooltipColors r38, float r39, float r40, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Tooltip_androidKt.m3166RichTooltipyDvdmqw(androidx.compose.material3.TooltipScope, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, long, androidx.compose.ui.graphics.Shape, androidx.compose.material3.RichTooltipColors, float, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCaretWithPath-JKu-mZY, reason: not valid java name */
    public static final DrawResult m3168drawCaretWithPathJKumZY(CacheDrawScope cacheDrawScope, CaretType caretType, Density density, Configuration configuration, final long j, long j2, final LayoutCoordinates layoutCoordinates) {
        long j3;
        final Path Path = AndroidPath_androidKt.Path();
        if (layoutCoordinates != null) {
            int mo671roundToPx0680j_4 = density.mo671roundToPx0680j_4(DpSize.m7093getHeightD9Ej5fM(j2));
            int mo671roundToPx0680j_42 = density.mo671roundToPx0680j_4(DpSize.m7095getWidthD9Ej5fM(j2));
            int mo671roundToPx0680j_43 = density.mo671roundToPx0680j_4(Dp.m6997constructorimpl(configuration.screenWidthDp));
            int mo671roundToPx0680j_44 = density.mo671roundToPx0680j_4(TooltipKt.getSpacingBetweenTooltipAndAnchor());
            Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
            float left = boundsInWindow.getLeft();
            float right = boundsInWindow.getRight();
            float top = boundsInWindow.getTop();
            float f = 2;
            float f2 = (right + left) / f;
            float f3 = right - left;
            float m4343getWidthimpl = Size.m4343getWidthimpl(cacheDrawScope.m4164getSizeNHjbRc());
            float m4340getHeightimpl = Size.m4340getHeightimpl(cacheDrawScope.m4164getSizeNHjbRc());
            boolean z = (top - m4340getHeightimpl) - ((float) mo671roundToPx0680j_44) < 0.0f;
            if (z) {
                m4340getHeightimpl = 0.0f;
            }
            if (caretType == CaretType.Plain) {
                float f4 = mo671roundToPx0680j_43;
                if ((m4343getWidthimpl / f) + f2 > f4) {
                    j3 = OffsetKt.Offset(m4343getWidthimpl - (f4 - f2), m4340getHeightimpl);
                } else {
                    j3 = OffsetKt.Offset(f2 - Math.max(left - ((Size.m4343getWidthimpl(cacheDrawScope.m4164getSizeNHjbRc()) / f) - (f3 / f)), 0.0f), m4340getHeightimpl);
                }
            } else {
                long Offset = OffsetKt.Offset(f2 - left, m4340getHeightimpl);
                float f5 = mo671roundToPx0680j_43;
                if (left + m4343getWidthimpl > f5) {
                    float f6 = right - m4343getWidthimpl;
                    Offset = OffsetKt.Offset(f2 - f6, m4340getHeightimpl);
                    if (f6 < 0.0f) {
                        float f7 = m4343getWidthimpl / f;
                        float f8 = f3 / f;
                        if ((left - f7) + f8 <= 0.0f) {
                            j3 = OffsetKt.Offset(f2, m4340getHeightimpl);
                        } else if ((right + f7) - f8 >= f5) {
                            j3 = OffsetKt.Offset(m4343getWidthimpl - (f5 - f2), m4340getHeightimpl);
                        } else {
                            j3 = OffsetKt.Offset(f7, m4340getHeightimpl);
                        }
                    }
                }
                j3 = Offset;
            }
            if (z) {
                Path.moveTo(Offset.m4274getXimpl(j3), Offset.m4275getYimpl(j3));
                float f9 = mo671roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m4274getXimpl(j3) + f9, Offset.m4275getYimpl(j3));
                Path.lineTo(Offset.m4274getXimpl(j3), Offset.m4275getYimpl(j3) - mo671roundToPx0680j_4);
                Path.lineTo(Offset.m4274getXimpl(j3) - f9, Offset.m4275getYimpl(j3));
                Path.close();
            } else {
                Path.moveTo(Offset.m4274getXimpl(j3), Offset.m4275getYimpl(j3));
                float f10 = mo671roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m4274getXimpl(j3) + f10, Offset.m4275getYimpl(j3));
                Path.lineTo(Offset.m4274getXimpl(j3), Offset.m4275getYimpl(j3) + mo671roundToPx0680j_4);
                Path.lineTo(Offset.m4274getXimpl(j3) - f10, Offset.m4275getYimpl(j3));
                Path.close();
            }
        }
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$drawCaretWithPath$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                if (LayoutCoordinates.this != null) {
                    contentDrawScope.drawContent();
                    DrawScope.m5061drawPathLG529CI$default(contentDrawScope, Path, j, 0.0f, null, null, 0, 60, null);
                }
            }
        });
    }
}
