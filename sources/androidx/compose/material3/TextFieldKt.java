package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes3.dex */
public final class TextFieldKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f12056a = 8;

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ac, code lost:
    
        if (p0.a.g(r0.u(), java.lang.Integer.valueOf(r15)) == false) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r37, q0.p r38, q0.p r39, q0.q r40, q0.p r41, q0.p r42, q0.p r43, q0.p r44, boolean r45, float r46, q0.p r47, q0.p r48, androidx.compose.foundation.layout.PaddingValues r49, androidx.compose.runtime.Composer r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.a(androidx.compose.ui.Modifier, q0.p, q0.p, q0.q, q0.p, q0.p, q0.p, q0.p, boolean, float, q0.p, q0.p, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final int b(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f2, long j2, float f3, PaddingValues paddingValues) {
        boolean z2 = i3 > 0;
        float a2 = (paddingValues.a() + paddingValues.d()) * f3;
        if (z2) {
            a2 = MathHelpersKt.b(TextFieldImplKt.f13035b * 2 * f3, a2, f2);
        }
        int[] iArr = {i8, i6, i7, MathHelpersKt.c(i3, 0, f2)};
        for (int i10 = 0; i10 < 4; i10++) {
            i2 = Math.max(i2, iArr[i10]);
        }
        return Math.max(Constraints.j(j2), Math.max(i4, Math.max(i5, p0.a.t0(a2 + MathHelpersKt.c(0, i3, f2) + i2))) + i9);
    }

    public static final int c(boolean z2, int i2, int i3, Placeable placeable) {
        return z2 ? Alignment.Companion.f14667k.a(placeable.f15826b, i2) : i3;
    }
}
