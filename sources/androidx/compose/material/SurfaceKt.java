package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a©\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001ac\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010'\u001a,\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000eH\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a8\u0010.\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "content", "Landroidx/compose/runtime/Composable;", "Surface-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "surface", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0085  */
    /* renamed from: Surface-F-jzlyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1978SurfaceFjzlyU(androidx.compose.ui.Modifier r26, androidx.compose.ui.graphics.Shape r27, long r28, long r30, androidx.compose.foundation.BorderStroke r32, float r33, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1978SurfaceFjzlyU(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b3  */
    /* renamed from: Surface-LPr_se0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1979SurfaceLPr_se0(final kotlin.jvm.functions.Function0<kotlin.Unit> r27, androidx.compose.ui.Modifier r28, boolean r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, androidx.compose.foundation.BorderStroke r35, float r36, androidx.compose.foundation.interaction.MutableInteractionSource r37, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1979SurfaceLPr_se0(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ff  */
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1980SurfaceNy5ogXk(final boolean r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, androidx.compose.ui.Modifier r32, boolean r33, androidx.compose.ui.graphics.Shape r34, long r35, long r37, androidx.compose.foundation.BorderStroke r39, float r40, androidx.compose.foundation.interaction.MutableInteractionSource r41, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1980SurfaceNy5ogXk(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ff  */
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1981SurfaceNy5ogXk(final boolean r30, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r31, androidx.compose.ui.Modifier r32, boolean r33, androidx.compose.ui.graphics.Shape r34, long r35, long r37, androidx.compose.foundation.BorderStroke r39, float r40, androidx.compose.foundation.interaction.MutableInteractionSource r41, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1981SurfaceNy5ogXk(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0221  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This API is deprecated with the introduction a newer Surface function overload that accepts an onClick().", replaceWith = @kotlin.ReplaceWith(expression = "Surface(onClick, modifier, enabled, shape, color, contentColor, border, elevation, interactionSource, content)", imports = {}))
    /* renamed from: Surface-9VG74zQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1977Surface9VG74zQ(final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.ui.Modifier r39, androidx.compose.ui.graphics.Shape r40, long r41, long r43, androidx.compose.foundation.BorderStroke r45, float r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.foundation.Indication r48, boolean r49, java.lang.String r50, androidx.compose.ui.semantics.Role r51, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1977Surface9VG74zQ(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m1984surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        return ClipKt.clip(BackgroundKt.m539backgroundbw27NRU(ShadowKt.m4179shadows4CzXII$default(modifier, f, shape, false, 0L, 0L, 24, null).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape) : Modifier.INSTANCE), j, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final long m1985surfaceColorAtElevationcq6XJ1M(long j, ElevationOverlay elevationOverlay, float f, Composer composer, int i) {
        composer.startReplaceableGroup(1561611256);
        ComposerKt.sourceInformation(composer, "C(surfaceColorAtElevation)P(1:c#ui.graphics.Color,2,0:c#ui.unit.Dp)635@31093L6,636@31164L31:Surface.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561611256, i, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:634)");
        }
        if (Color.m4516equalsimpl0(j, MaterialTheme.INSTANCE.getColors(composer, 6).m1803getSurface0d7_KjU()) && elevationOverlay != null) {
            j = elevationOverlay.mo1839apply7g2Lkgo(j, f, composer, (i & 14) | ((i >> 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | ((i << 3) & 896));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }
}
