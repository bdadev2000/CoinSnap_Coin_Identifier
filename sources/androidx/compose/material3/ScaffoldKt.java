package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import org.objectweb.asm.Opcodes;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
public final class ScaffoldKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10792a = 16;

    /* JADX WARN: Removed duplicated region for block: B:102:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r29, q0.p r30, q0.p r31, q0.p r32, q0.p r33, int r34, long r35, long r37, androidx.compose.foundation.layout.WindowInsets r39, q0.q r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.a(androidx.compose.ui.Modifier, q0.p, q0.p, q0.p, q0.p, int, long, long, androidx.compose.foundation.layout.WindowInsets, q0.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(int i2, p pVar, q qVar, p pVar2, p pVar3, WindowInsets windowInsets, p pVar4, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-975511942);
        if ((i3 & 6) == 0) {
            i4 = (g2.c(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= g2.w(qVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= g2.w(pVar2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= g2.w(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= g2.I(windowInsets) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= g2.w(pVar4) ? 1048576 : Opcodes.ASM8;
        }
        if ((i4 & 599187) == 599186 && g2.i()) {
            g2.A();
        } else {
            boolean z2 = ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((458752 & i4) == 131072) | ((57344 & i4) == 16384) | ((i4 & 14) == 4) | ((3670016 & i4) == 1048576) | ((i4 & 896) == 256);
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new ScaffoldKt$ScaffoldLayout$1$1(pVar, pVar2, pVar3, i2, windowInsets, pVar4, qVar);
                g2.o(u2);
            }
            SubcomposeLayoutKt.a(null, (p) u2, g2, 0, 1);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ScaffoldKt$ScaffoldLayout$2(i2, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, i3);
        }
    }
}
