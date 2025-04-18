package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes2.dex */
public final class OutlinedTextFieldKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10441a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final long f10442b;

    static {
        long j2 = TypeScaleTokens.f13615l;
        if (!(!TextUnitKt.c(j2))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        f10442b = TextUnitKt.d(1095216660480L & j2, TextUnit.c(j2) / 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.text.input.TextFieldValue r51, q0.l r52, androidx.compose.ui.Modifier r53, boolean r54, boolean r55, androidx.compose.ui.text.TextStyle r56, q0.p r57, q0.p r58, q0.p r59, q0.p r60, q0.p r61, q0.p r62, q0.p r63, boolean r64, androidx.compose.ui.text.input.VisualTransformation r65, androidx.compose.foundation.text.KeyboardOptions r66, androidx.compose.foundation.text.KeyboardActions r67, boolean r68, int r69, int r70, androidx.compose.foundation.interaction.MutableInteractionSource r71, androidx.compose.ui.graphics.Shape r72, androidx.compose.material3.TextFieldColors r73, androidx.compose.runtime.Composer r74, int r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, q0.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, q0.p, q0.p, q0.p, q0.p, q0.p, q0.p, q0.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01c9, code lost:
    
        if (p0.a.g(r13.u(), java.lang.Integer.valueOf(r4)) == false) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.Modifier r37, q0.p r38, q0.q r39, q0.p r40, q0.p r41, q0.p r42, q0.p r43, q0.p r44, boolean r45, float r46, q0.l r47, q0.p r48, q0.p r49, androidx.compose.foundation.layout.PaddingValues r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.b(androidx.compose.ui.Modifier, q0.p, q0.q, q0.p, q0.p, q0.p, q0.p, q0.p, boolean, float, q0.l, q0.p, q0.p, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final int c(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f2, long j2, float f3, PaddingValues paddingValues) {
        int[] iArr = {i8, i4, i5, MathHelpersKt.c(i7, 0, f2)};
        for (int i10 = 0; i10 < 4; i10++) {
            i6 = Math.max(i6, iArr[i10]);
        }
        float d = paddingValues.d() * f3;
        return Math.max(Constraints.j(j2), Math.max(i2, Math.max(i3, p0.a.t0(MathHelpersKt.b(d, Math.max(d, i7 / 2.0f), f2) + i6 + (paddingValues.a() * f3)))) + i9);
    }

    public static final int d(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2, long j2, float f3, PaddingValues paddingValues) {
        int i9 = i4 + i5;
        int max = Math.max(i6 + i9, Math.max(i8 + i9, MathHelpersKt.c(i7, 0, f2))) + i2 + i3;
        LayoutDirection layoutDirection = LayoutDirection.f17494a;
        return Math.max(max, Math.max(p0.a.t0((i7 + ((paddingValues.c(layoutDirection) + paddingValues.b(layoutDirection)) * f3)) * f2), Constraints.k(j2)));
    }

    public static final Modifier e(Modifier modifier, q0.a aVar, PaddingValues paddingValues) {
        return DrawModifierKt.d(modifier, new OutlinedTextFieldKt$outlineCutout$1(aVar, paddingValues));
    }

    public static final int f(boolean z2, int i2, int i3, Placeable placeable, Placeable placeable2) {
        if (z2) {
            i3 = Alignment.Companion.f14667k.a(placeable2.f15826b, i2);
        }
        return Math.max(i3, TextFieldImplKt.h(placeable) / 2);
    }
}
