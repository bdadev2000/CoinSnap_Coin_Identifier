package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: Image.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ab\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0017\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Image", "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "Image-5h-nEew", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ImageKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    public static final /* synthetic */ void Image(ImageBitmap imageBitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2123228673, "C(Image)P(2,4,6!1,5)96@4585L177:Image.kt#71ulvw");
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i2 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i2 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123228673, i, -1, "androidx.compose.foundation.Image (Image.kt:95)");
        }
        m596Image5hnEew(imageBitmap, str, modifier2, center, fit, f2, colorFilter2, FilterQuality.INSTANCE.m4615getLowfv9h1I(), composer, (i & 14) | (i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (i & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* renamed from: Image-5h-nEew, reason: not valid java name */
    public static final void m596Image5hnEew(ImageBitmap imageBitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1396260732, "C(Image)P(2,4,7!1,5!,6:c#ui.graphics.FilterQuality)153@7224L73,154@7302L248:Image.kt#71ulvw");
        Modifier.Companion companion = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i3 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i3 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i3 & 64) != 0 ? null : colorFilter;
        int m5074getDefaultFilterQualityfv9h1I = (i3 & 128) != 0 ? DrawScope.INSTANCE.m5074getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1396260732, i2, -1, "androidx.compose.foundation.Image (Image.kt:152)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 449057418, "CC(remember):Image.kt#9igjgp");
        boolean changed = composer.changed(imageBitmap);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = BitmapPainterKt.m5195BitmapPainterQZhYCtY$default(imageBitmap, 0L, 0L, m5074getDefaultFilterQualityfv9h1I, 6, null);
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Image((BitmapPainter) rememberedValue, str, companion, center, fit, f2, colorFilter2, composer, (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (i2 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final void Image(ImageVector imageVector, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1595907091, "C(Image)P(5,3,6!1,4)198@9330L34,197@9309L237:Image.kt#71ulvw");
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i2 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i2 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1595907091, i, -1, "androidx.compose.foundation.Image (Image.kt:197)");
        }
        Image(VectorPainterKt.rememberVectorPainter(imageVector, composer, i & 14), str, modifier2, center, fit, f2, colorFilter2, composer, VectorPainter.$stable | (i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (i & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Image(final androidx.compose.ui.graphics.painter.Painter r19, final java.lang.String r20, androidx.compose.ui.Modifier r21, androidx.compose.ui.Alignment r22, androidx.compose.ui.layout.ContentScale r23, float r24, androidx.compose.ui.graphics.ColorFilter r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter, androidx.compose.runtime.Composer, int, int):void");
    }
}
