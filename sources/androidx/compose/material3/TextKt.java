package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import q0.p;

/* loaded from: classes4.dex */
public final class TextKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f12204a = new DynamicProvidableCompositionLocal(SnapshotStateKt.m(), TextKt$LocalTextStyle$1.f12205a);

    public static final void a(TextStyle textStyle, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-460300127);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(textStyle) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = f12204a;
            CompositionLocalKt.a(dynamicProvidableCompositionLocal.c(((TextStyle) g2.K(dynamicProvidableCompositionLocal)).e(textStyle)), pVar, g2, (i3 & 112) | 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TextKt$ProvideTextStyle$1(textStyle, pVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r39, androidx.compose.ui.Modifier r40, long r41, long r43, androidx.compose.ui.text.font.FontStyle r45, androidx.compose.ui.text.font.FontWeight r46, androidx.compose.ui.text.font.FontFamily r47, long r48, androidx.compose.ui.text.style.TextDecoration r50, androidx.compose.ui.text.style.TextAlign r51, long r52, int r54, boolean r55, int r56, int r57, q0.l r58, androidx.compose.ui.text.TextStyle r59, androidx.compose.runtime.Composer r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.b(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, q0.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0339  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.text.AnnotatedString r43, androidx.compose.ui.Modifier r44, long r45, long r47, androidx.compose.ui.text.font.FontStyle r49, androidx.compose.ui.text.font.FontWeight r50, androidx.compose.ui.text.font.FontFamily r51, long r52, androidx.compose.ui.text.style.TextDecoration r54, androidx.compose.ui.text.style.TextAlign r55, long r56, int r58, boolean r59, int r60, int r61, java.util.Map r62, q0.l r63, androidx.compose.ui.text.TextStyle r64, androidx.compose.runtime.Composer r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.c(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, q0.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
