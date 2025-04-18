package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import d0.b0;
import e0.x;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
public final class AppBarKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7649a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f7650b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f7651c;
    public static final float d;
    public static final CubicBezierEasing e = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);

    /* renamed from: f, reason: collision with root package name */
    public static final float f7652f = 24;

    /* renamed from: g, reason: collision with root package name */
    public static final float f7653g = 28;

    /* renamed from: h, reason: collision with root package name */
    public static final float f7654h;

    /* renamed from: i, reason: collision with root package name */
    public static final float f7655i;

    static {
        float f2 = 16;
        float f3 = 12;
        float f4 = f2 - f3;
        f7649a = f4;
        f7650b = f4;
        f7651c = f2 - f4;
        d = f3 - f4;
        float f5 = 4;
        f7654h = f5;
        f7655i = f2 - f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r28, long r29, long r31, float r33, androidx.compose.foundation.layout.PaddingValues r34, androidx.compose.foundation.layout.WindowInsets r35, androidx.compose.material3.BottomAppBarScrollBehavior r36, q0.q r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.a(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, q0.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(q0.q r29, androidx.compose.ui.Modifier r30, q0.p r31, long r32, long r34, float r36, androidx.compose.foundation.layout.PaddingValues r37, androidx.compose.foundation.layout.WindowInsets r38, androidx.compose.material3.BottomAppBarScrollBehavior r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.b(q0.q, androidx.compose.ui.Modifier, q0.p, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(q0.p r25, androidx.compose.ui.Modifier r26, q0.p r27, q0.q r28, float r29, androidx.compose.foundation.layout.WindowInsets r30, androidx.compose.material3.TopAppBarColors r31, androidx.compose.material3.TopAppBarScrollBehavior r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.c(q0.p, androidx.compose.ui.Modifier, q0.p, q0.q, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(q0.p r30, androidx.compose.ui.Modifier r31, q0.p r32, q0.q r33, float r34, float r35, androidx.compose.foundation.layout.WindowInsets r36, androidx.compose.material3.TopAppBarColors r37, androidx.compose.material3.TopAppBarScrollBehavior r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.d(q0.p, androidx.compose.ui.Modifier, q0.p, q0.q, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(q0.p r30, androidx.compose.ui.Modifier r31, q0.p r32, q0.q r33, float r34, float r35, androidx.compose.foundation.layout.WindowInsets r36, androidx.compose.material3.TopAppBarColors r37, androidx.compose.material3.TopAppBarScrollBehavior r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.e(q0.p, androidx.compose.ui.Modifier, q0.p, q0.q, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void f(Modifier modifier, p pVar, TextStyle textStyle, boolean z2, p pVar2, q qVar, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        ComposerImpl g2 = composer.g(-342194911);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (g2.I(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= g2.I(textStyle) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= g2.a(z2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= g2.w(pVar2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= g2.w(qVar) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= g2.b(f2) ? 1048576 : Opcodes.ASM8;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 |= g2.I(windowInsets) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i4 |= g2.I(topAppBarColors) ? 67108864 : 33554432;
        }
        if ((i3 & 512) != 0) {
            i4 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i4 |= g2.I(topAppBarScrollBehavior) ? 536870912 : 268435456;
        }
        if ((306783379 & i4) != 306783378 || !g2.i()) {
            Modifier modifier4 = Modifier.Companion.f14687a;
            Modifier modifier5 = i5 != 0 ? modifier4 : modifier2;
            if (!Float.isNaN(f2)) {
                if (!(f2 == Float.POSITIVE_INFINITY)) {
                    float v2 = p0.a.v(((Density) g2.K(CompositionLocalsKt.f16434f)).y1(f2), 0.0f);
                    int i6 = i4 & 1879048192;
                    boolean b2 = (i6 == 536870912) | g2.b(v2);
                    Object u2 = g2.u();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
                    if (b2 || u2 == composer$Companion$Empty$1) {
                        u2 = new AppBarKt$SingleRowTopAppBar$2$1(topAppBarScrollBehavior, v2);
                        g2.o(u2);
                    }
                    g2.L((q0.a) u2);
                    boolean z3 = i6 == 536870912;
                    Object u3 = g2.u();
                    if (z3 || u3 == composer$Companion$Empty$1) {
                        u3 = SnapshotStateKt.e(new AppBarKt$SingleRowTopAppBar$colorTransitionFraction$2$1(topAppBarScrollBehavior));
                        g2.o(u3);
                    }
                    float floatValue = ((Number) ((State) u3).getValue()).floatValue();
                    topAppBarColors.getClass();
                    State a2 = SingleValueAnimationKt.a(ColorKt.h(topAppBarColors.f12603a, topAppBarColors.f12604b, EasingKt.f2085c.b(floatValue)), AnimationSpecKt.c(0.0f, 400.0f, null, 5), g2, 48);
                    ComposableLambdaImpl c2 = ComposableLambdaKt.c(1370231018, new AppBarKt$SingleRowTopAppBar$actionsRow$1(qVar), g2);
                    g2.J(-1193605157);
                    if (topAppBarScrollBehavior != null) {
                        topAppBarScrollBehavior.a();
                        Orientation orientation = Orientation.f3394a;
                        boolean z4 = i6 == 536870912;
                        Object u4 = g2.u();
                        if (z4 || u4 == composer$Companion$Empty$1) {
                            u4 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1(topAppBarScrollBehavior);
                            g2.o(u4);
                        }
                        DraggableState b3 = DraggableKt.b((l) u4, g2);
                        boolean z5 = i6 == 536870912;
                        Object u5 = g2.u();
                        if (z5 || u5 == composer$Companion$Empty$1) {
                            u5 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                            g2.o(u5);
                        }
                        modifier4 = DraggableKt.a(modifier4, b3, orientation, false, null, false, (q) u5, false, Opcodes.NEWARRAY);
                    }
                    g2.V(false);
                    SurfaceKt.a(modifier5.T0(modifier4), null, ((Color) a2.getValue()).f14964a, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.c(-1943739546, new AppBarKt$SingleRowTopAppBar$3(windowInsets, f2, topAppBarScrollBehavior, topAppBarColors, pVar, textStyle, z2, pVar2, c2), g2), g2, 12582912, 122);
                    modifier3 = modifier5;
                }
            }
            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
        }
        g2.A();
        modifier3 = modifier2;
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AppBarKt$SingleRowTopAppBar$4(modifier3, pVar, textStyle, z2, pVar2, qVar, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(q0.p r25, androidx.compose.ui.Modifier r26, q0.p r27, q0.q r28, float r29, androidx.compose.foundation.layout.WindowInsets r30, androidx.compose.material3.TopAppBarColors r31, androidx.compose.material3.TopAppBarScrollBehavior r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.g(q0.p, androidx.compose.ui.Modifier, q0.p, q0.q, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af  */
    /* JADX WARN: Type inference failed for: r10v37, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r9v5, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(androidx.compose.ui.Modifier r36, q0.p r37, androidx.compose.ui.text.TextStyle r38, float r39, q0.p r40, androidx.compose.ui.text.TextStyle r41, q0.p r42, q0.q r43, float r44, float r45, androidx.compose.foundation.layout.WindowInsets r46, androidx.compose.material3.TopAppBarColors r47, androidx.compose.material3.TopAppBarScrollBehavior r48, androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.h(androidx.compose.ui.Modifier, q0.p, androidx.compose.ui.text.TextStyle, float, q0.p, androidx.compose.ui.text.TextStyle, q0.p, q0.q, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void i(Modifier modifier, final ScrolledOffset scrolledOffset, long j2, long j3, long j4, p pVar, TextStyle textStyle, float f2, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i2, boolean z2, p pVar2, p pVar3, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        ComposerImpl g2 = composer.g(-742442296);
        if ((i3 & 6) == 0) {
            i5 = (g2.I(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= (i3 & 64) == 0 ? g2.I(scrolledOffset) : g2.w(scrolledOffset) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= g2.d(j2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= g2.d(j3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= g2.d(j4) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= g2.w(pVar) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= g2.I(textStyle) ? 1048576 : Opcodes.ASM8;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= g2.b(f2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= g2.I(vertical) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i5 |= g2.I(horizontal) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = (g2.c(i2) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= g2.a(z2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= g2.w(pVar2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= g2.w(pVar3) ? 2048 : 1024;
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170 && g2.i()) {
            g2.A();
        } else {
            boolean z3 = ((i5 & 112) == 32 || ((i5 & 64) != 0 && g2.w(scrolledOffset))) | ((1879048192 & i5) == 536870912) | ((234881024 & i5) == 67108864) | ((i6 & 14) == 4);
            Object u2 = g2.u();
            if (z3 || u2 == Composer.Companion.f13690a) {
                u2 = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1

                    /* renamed from: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    final class AnonymousClass1 extends r implements l {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Placeable f7804a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ int f7805b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Placeable f7806c;
                        public final /* synthetic */ Arrangement.Horizontal d;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ long f7807f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ Placeable f7808g;

                        /* renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ MeasureScope f7809h;

                        /* renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ Arrangement.Vertical f7810i;

                        /* renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ int f7811j;

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f7812k;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(Placeable placeable, int i2, Placeable placeable2, Arrangement.Horizontal horizontal, long j2, Placeable placeable3, MeasureScope measureScope, Arrangement.Vertical vertical, int i3, int i4) {
                            super(1);
                            this.f7804a = placeable;
                            this.f7805b = i2;
                            this.f7806c = placeable2;
                            this.d = horizontal;
                            this.f7807f = j2;
                            this.f7808g = placeable3;
                            this.f7809h = measureScope;
                            this.f7810i = vertical;
                            this.f7811j = i3;
                            this.f7812k = i4;
                        }

                        @Override // q0.l
                        public final Object invoke(Object obj) {
                            int max;
                            int i2;
                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                            Placeable placeable = this.f7804a;
                            int i3 = placeable.f15826b;
                            int i4 = this.f7805b;
                            int i5 = 0;
                            Placeable.PlacementScope.h(placementScope, placeable, 0, (i4 - i3) / 2);
                            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
                            Arrangement.Horizontal horizontal = this.d;
                            boolean g2 = p0.a.g(horizontal, arrangement$Center$1);
                            Placeable placeable2 = this.f7808g;
                            Placeable placeable3 = this.f7806c;
                            long j2 = this.f7807f;
                            if (g2) {
                                int i6 = Constraints.i(j2);
                                int i7 = placeable3.f15825a;
                                max = (i6 - i7) / 2;
                                int i8 = placeable.f15825a;
                                if (max < i8) {
                                    i2 = i8 - max;
                                } else if (i7 + max > Constraints.i(j2) - placeable2.f15825a) {
                                    i2 = (Constraints.i(j2) - placeable2.f15825a) - (placeable3.f15825a + max);
                                }
                                max += i2;
                            } else if (p0.a.g(horizontal, Arrangement.f3773b)) {
                                max = (Constraints.i(j2) - placeable3.f15825a) - placeable2.f15825a;
                            } else {
                                max = Math.max(this.f7809h.F0(AppBarKt.f7655i), placeable.f15825a);
                            }
                            Arrangement.Vertical vertical = this.f7810i;
                            if (p0.a.g(vertical, arrangement$Center$1)) {
                                i5 = (i4 - placeable3.f15826b) / 2;
                            } else if (p0.a.g(vertical, Arrangement.d)) {
                                int i9 = this.f7811j;
                                if (i9 == 0) {
                                    i5 = i4 - placeable3.f15826b;
                                } else {
                                    int i10 = placeable3.f15826b;
                                    int i11 = i9 - (i10 - this.f7812k);
                                    int i12 = i10 + i11;
                                    if (i12 > Constraints.h(j2)) {
                                        i11 -= i12 - Constraints.h(j2);
                                    }
                                    i5 = (i4 - placeable3.f15826b) - Math.max(0, i11);
                                }
                            }
                            Placeable.PlacementScope.h(placementScope, placeable3, max, i5);
                            Placeable.PlacementScope.h(placementScope, placeable2, Constraints.i(j2) - placeable2.f15825a, (i4 - placeable2.f15826b) / 2);
                            return b0.f30125a;
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j5) {
                        int i7;
                        int size = list.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            Measurable measurable = (Measurable) list.get(i8);
                            if (p0.a.g(LayoutIdKt.a(measurable), "navigationIcon")) {
                                Placeable V = measurable.V(Constraints.b(j5, 0, 0, 0, 0, 14));
                                int size2 = list.size();
                                for (int i9 = 0; i9 < size2; i9++) {
                                    Measurable measurable2 = (Measurable) list.get(i9);
                                    if (p0.a.g(LayoutIdKt.a(measurable2), "actionIcons")) {
                                        Placeable V2 = measurable2.V(Constraints.b(j5, 0, 0, 0, 0, 14));
                                        if (Constraints.i(j5) == Integer.MAX_VALUE) {
                                            i7 = Constraints.i(j5);
                                        } else {
                                            i7 = (Constraints.i(j5) - V.f15825a) - V2.f15825a;
                                            if (i7 < 0) {
                                                i7 = 0;
                                            }
                                        }
                                        int i10 = i7;
                                        int size3 = list.size();
                                        for (int i11 = 0; i11 < size3; i11++) {
                                            Measurable measurable3 = (Measurable) list.get(i11);
                                            if (p0.a.g(LayoutIdKt.a(measurable3), "title")) {
                                                Placeable V3 = measurable3.V(Constraints.b(j5, 0, i10, 0, 0, 12));
                                                HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLineKt.f15693b;
                                                int Z = V3.Z(horizontalAlignmentLine) != Integer.MIN_VALUE ? V3.Z(horizontalAlignmentLine) : 0;
                                                float offset = ScrolledOffset.this.offset();
                                                int h2 = Constraints.h(j5) == Integer.MAX_VALUE ? Constraints.h(j5) : Constraints.h(j5) + (Float.isNaN(offset) ? 0 : p0.a.t0(offset));
                                                return measureScope.T(Constraints.i(j5), h2, x.f30219a, new AnonymousClass1(V, h2, V3, horizontal, j5, V2, measureScope, vertical, i2, Z));
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                g2.o(u2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u2;
            int i7 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, modifier);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            Applier applier = g2.f13691a;
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            p pVar4 = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, measurePolicy, pVar4);
            p pVar5 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar5);
            p pVar6 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                d.x(i7, g2, i7, pVar6);
            }
            p pVar7 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar7);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier b2 = LayoutIdKt.b(companion, "navigationIcon");
            float f3 = f7654h;
            Modifier j5 = PaddingKt.j(b2, f3, 0.0f, 0.0f, 0.0f, 14);
            BiasAlignment biasAlignment = Alignment.Companion.f14659a;
            int i8 = i5;
            MeasurePolicy e2 = BoxKt.e(biasAlignment, false);
            int i9 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, j5);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, e2, pVar4);
            Updater.b(g2, Q2, pVar5);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i9))) {
                d.x(i9, g2, i9, pVar6);
            }
            Updater.b(g2, c3, pVar7);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.f8654a;
            CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(j2, dynamicProvidableCompositionLocal), pVar2, g2, 8 | ((i6 >> 3) & 112));
            g2.V(true);
            Modifier b3 = GraphicsLayerModifierKt.b(PaddingKt.h(LayoutIdKt.b(companion, "title"), f3, 0.0f, 2).T0(z2 ? SemanticsModifierKt.a(companion, AppBarKt$TopAppBarLayout$1$2.f7800a) : companion), 0.0f, 0.0f, f2, 0.0f, 0.0f, null, false, 131067);
            MeasurePolicy e3 = BoxKt.e(biasAlignment, false);
            int i10 = g2.P;
            PersistentCompositionLocalMap Q3 = g2.Q();
            Modifier c4 = ComposedModifierKt.c(g2, b3);
            int i11 = i6;
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, e3, pVar4);
            Updater.b(g2, Q3, pVar5);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i10))) {
                d.x(i10, g2, i10, pVar6);
            }
            Updater.b(g2, c4, pVar7);
            int i12 = i8 >> 9;
            ProvideContentColorTextStyleKt.a(j3, textStyle, pVar, g2, (i12 & 14) | ((i8 >> 15) & 112) | (i12 & 896));
            g2.V(true);
            Modifier j6 = PaddingKt.j(LayoutIdKt.b(companion, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11);
            MeasurePolicy e4 = BoxKt.e(biasAlignment, false);
            int i13 = g2.P;
            PersistentCompositionLocalMap Q4 = g2.Q();
            Modifier c5 = ComposedModifierKt.c(g2, j6);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, e4, pVar4);
            Updater.b(g2, Q4, pVar5);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i13))) {
                d.x(i13, g2, i13, pVar6);
            }
            Updater.b(g2, c5, pVar7);
            CompositionLocalKt.a(dynamicProvidableCompositionLocal.c(new Color(j4)), pVar3, g2, 8 | ((i11 >> 6) & 112));
            g2.V(true);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AppBarKt$TopAppBarLayout$3(modifier, scrolledOffset, j2, j3, j4, pVar, textStyle, f2, vertical, horizontal, i2, z2, pVar2, pVar3, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(androidx.compose.material3.TopAppBarState r9, float r10, androidx.compose.animation.core.DecayAnimationSpec r11, androidx.compose.animation.core.AnimationSpec r12, h0.g r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.j(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, h0.g):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(androidx.compose.material3.BottomAppBarState r9, float r10, androidx.compose.animation.core.DecayAnimationSpec r11, androidx.compose.animation.core.AnimationSpec r12, h0.g r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.k(androidx.compose.material3.BottomAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, h0.g):java.lang.Object");
    }
}
