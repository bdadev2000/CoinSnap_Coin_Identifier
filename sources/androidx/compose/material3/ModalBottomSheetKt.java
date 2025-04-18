package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.util.MathHelpersKt;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class ModalBottomSheetKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f9809a = 48;

    /* renamed from: b, reason: collision with root package name */
    public static final float f9810b = 24;

    /* renamed from: c, reason: collision with root package name */
    public static final long f9811c = TransformOriginKt.a(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0330 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(q0.a r44, androidx.compose.ui.Modifier r45, androidx.compose.material3.SheetState r46, float r47, androidx.compose.ui.graphics.Shape r48, long r49, long r51, float r53, long r54, q0.p r56, q0.p r57, androidx.compose.material3.ModalBottomSheetProperties r58, q0.q r59, androidx.compose.runtime.Composer r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.a(q0.a, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, long, q0.p, q0.p, androidx.compose.material3.ModalBottomSheetProperties, q0.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0192, code lost:
    
        if (r0.w(r60) == false) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0300 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0334 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0394 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.foundation.layout.BoxScope r45, androidx.compose.animation.core.Animatable r46, b1.d0 r47, q0.a r48, q0.l r49, androidx.compose.ui.Modifier r50, androidx.compose.material3.SheetState r51, float r52, androidx.compose.ui.graphics.Shape r53, long r54, long r56, float r58, q0.p r59, q0.p r60, q0.q r61, androidx.compose.runtime.Composer r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.b(androidx.compose.foundation.layout.BoxScope, androidx.compose.animation.core.Animatable, b1.d0, q0.a, q0.l, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, q0.p, q0.p, q0.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void c(long j2, q0.a aVar, boolean z2, Composer composer, int i2) {
        int i3;
        boolean z3;
        ComposerImpl g2 = composer.g(951870469);
        if ((i2 & 6) == 0) {
            i3 = (g2.d(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.a(z2) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else if (j2 != 16) {
            State b2 = AnimateAsStateKt.b(z2 ? 1.0f : 0.0f, new TweenSpec(0, (Easing) null, 7), g2);
            String a2 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.close_sheet, g2);
            g2.J(-1785653838);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            Modifier modifier = Modifier.Companion.f14687a;
            if (z2) {
                int i4 = i3 & 112;
                boolean z4 = i4 == 32;
                Object u2 = g2.u();
                if (z4 || u2 == composer$Companion$Empty$1) {
                    u2 = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(aVar, null);
                    g2.o(u2);
                }
                Modifier b3 = SuspendingPointerInputFilterKt.b(modifier, aVar, (p) u2);
                boolean I = (i4 == 32) | g2.I(a2);
                Object u3 = g2.u();
                if (I || u3 == composer$Companion$Empty$1) {
                    u3 = new ModalBottomSheetKt$Scrim$dismissSheet$2$1(a2, aVar);
                    g2.o(u3);
                }
                modifier = SemanticsModifierKt.b(b3, true, (l) u3);
                z3 = false;
            } else {
                z3 = false;
            }
            g2.V(z3);
            Modifier T0 = SizeKt.f4107c.T0(modifier);
            boolean I2 = g2.I(b2) | ((i3 & 14) == 4);
            Object u4 = g2.u();
            if (I2 || u4 == composer$Companion$Empty$1) {
                u4 = new ModalBottomSheetKt$Scrim$1$1(j2, b2);
                g2.o(u4);
            }
            CanvasKt.a(T0, (l) u4, g2, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ModalBottomSheetKt$Scrim$2(j2, aVar, z2, i2);
        }
    }

    public static final float d(GraphicsLayerScope graphicsLayerScope, float f2) {
        float d = Size.d(graphicsLayerScope.b());
        if (Float.isNaN(d) || d == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.b(0.0f, Math.min(graphicsLayerScope.y1(f9809a), d), f2) / d);
    }

    public static final float e(GraphicsLayerScope graphicsLayerScope, float f2) {
        float b2 = Size.b(graphicsLayerScope.b());
        if (Float.isNaN(b2) || b2 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.b(0.0f, Math.min(graphicsLayerScope.y1(f9810b), b2), f2) / b2);
    }

    public static final SheetState f(Composer composer) {
        return SheetDefaultsKt.a(false, ModalBottomSheetKt$rememberModalBottomSheetState$1.f9931a, SheetValue.f11206a, false, composer, 384, 8);
    }
}
