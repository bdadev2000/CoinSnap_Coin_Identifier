package androidx.compose.material3.internal;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes2.dex */
public final class TextFieldImplKt {

    /* renamed from: b, reason: collision with root package name */
    public static final float f13035b;

    /* renamed from: g, reason: collision with root package name */
    public static final float f13038g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f13039h;

    /* renamed from: i, reason: collision with root package name */
    public static final Modifier f13040i;

    /* renamed from: a, reason: collision with root package name */
    public static final long f13034a = ConstraintsKt.a(0, 0, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final float f13036c = 12;
    public static final float d = 4;
    public static final float e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final float f13037f = 24;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13105a;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f13105a = iArr2;
        }
    }

    static {
        float f2 = 16;
        f13035b = f2;
        f13038g = f2;
        f13039h = f2;
        float f3 = 48;
        f13040i = SizeKt.a(Modifier.Companion.f14687a, f3, f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0312, code lost:
    
        if (androidx.compose.ui.graphics.Color.c(r4.b(), r5) != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04c9, code lost:
    
        if (r2 != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x05c7, code lost:
    
        if (r14 == r13) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0446, code lost:
    
        if (r2 != false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0417, code lost:
    
        if (r2 != false) goto L299;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0526 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0299 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.material3.internal.TextFieldType r43, java.lang.String r44, q0.p r45, androidx.compose.ui.text.input.VisualTransformation r46, q0.p r47, q0.p r48, q0.p r49, q0.p r50, q0.p r51, q0.p r52, q0.p r53, boolean r54, boolean r55, boolean r56, androidx.compose.foundation.interaction.InteractionSource r57, androidx.compose.foundation.layout.PaddingValues r58, androidx.compose.material3.TextFieldColors r59, q0.p r60, androidx.compose.runtime.Composer r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 2238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.a(androidx.compose.material3.internal.TextFieldType, java.lang.String, q0.p, androidx.compose.ui.text.input.VisualTransformation, q0.p, q0.p, q0.p, q0.p, q0.p, q0.p, q0.p, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, q0.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final boolean b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final void c(long j2, TextStyle textStyle, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1208685580);
        if ((i2 & 6) == 0) {
            i3 = (g2.d(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(textStyle) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            ProvideContentColorTextStyleKt.a(j2, textStyle, pVar, g2, (i3 & 14) | (i3 & 112) | (i3 & 896));
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TextFieldImplKt$Decoration$1(j2, textStyle, pVar, i2);
        }
    }

    public static final void d(long j2, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(660142980);
        if ((i2 & 6) == 0) {
            i3 = (g2.d(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(j2, ContentColorKt.f8654a), pVar, g2, (i3 & 112) | 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TextFieldImplKt$Decoration$2(j2, pVar, i2);
        }
    }

    public static final MutableState e(boolean z2, boolean z3, boolean z4, TextFieldColors textFieldColors, float f2, float f3, Composer composer, int i2) {
        State k2;
        State k3;
        long j2 = !z2 ? textFieldColors.f11995n : z3 ? textFieldColors.f11996o : z4 ? textFieldColors.f11993l : textFieldColors.f11994m;
        if (z2) {
            composer.J(1023053998);
            k2 = SingleValueAnimationKt.a(j2, AnimationSpecKt.d(Opcodes.FCMPG, 0, null, 6), composer, 48);
            composer.D();
        } else {
            composer.J(1023165505);
            k2 = SnapshotStateKt.k(new Color(j2), composer);
            composer.D();
        }
        if (z2) {
            composer.J(1023269417);
            if (!z4) {
                f2 = f3;
            }
            k3 = AnimateAsStateKt.a(f2, AnimationSpecKt.d(Opcodes.FCMPG, 0, null, 6), composer, 48);
            composer.D();
        } else {
            composer.J(1023478388);
            k3 = SnapshotStateKt.k(new Dp(f3), composer);
            composer.D();
        }
        return SnapshotStateKt.k(BorderStrokeKt.a(((Color) k2.getValue()).f14964a, ((Dp) k3.getValue()).f17486a), composer);
    }

    public static final Modifier f(Modifier modifier, boolean z2, String str) {
        return z2 ? SemanticsModifierKt.b(modifier, false, new TextFieldImplKt$defaultErrorSemantics$1(str)) : modifier;
    }

    public static final Object g(IntrinsicMeasurable intrinsicMeasurable) {
        Object m2 = intrinsicMeasurable.m();
        LayoutIdParentData layoutIdParentData = m2 instanceof LayoutIdParentData ? (LayoutIdParentData) m2 : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.X0();
        }
        return null;
    }

    public static final int h(Placeable placeable) {
        if (placeable != null) {
            return placeable.f15826b;
        }
        return 0;
    }

    public static final Modifier i(Modifier modifier, ColorProducer colorProducer, Shape shape) {
        return DrawModifierKt.c(modifier, new TextFieldImplKt$textFieldBackground$1(shape, colorProducer));
    }

    public static final int j(Placeable placeable) {
        if (placeable != null) {
            return placeable.f15825a;
        }
        return 0;
    }
}
