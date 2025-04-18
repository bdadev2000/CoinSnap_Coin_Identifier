package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes2.dex */
public final class TextFieldDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldDefaults f12006a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final float f12007b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f12008c = 280;
    public static final float d = 1;
    public static final float e = 2;

    public static TextFieldColors c(Composer composer, int i2) {
        return e(MaterialTheme.a(composer), composer);
    }

    public static PaddingValuesImpl d(TextFieldDefaults textFieldDefaults) {
        float f2 = TextFieldImplKt.f13035b;
        textFieldDefaults.getClass();
        return new PaddingValuesImpl(f2, f2, f2, f2);
    }

    public static TextFieldColors e(ColorScheme colorScheme, Composer composer) {
        TextFieldColors textFieldColors = colorScheme.f8547v0;
        composer.J(27085453);
        if (textFieldColors == null) {
            ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.f13273i;
            long e2 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens);
            long e3 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens);
            long b2 = Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f);
            long e4 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens);
            ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.f13286v;
            long e5 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens2);
            long e6 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens2);
            long e7 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens2);
            long e8 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens2);
            ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.f13278n;
            long e9 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens3);
            ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.f13267a;
            long e10 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4);
            TextSelectionColors textSelectionColors = (TextSelectionColors) composer.K(TextSelectionColorsKt.f7360a);
            long e11 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens3);
            ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.f13274j;
            textFieldColors = new TextFieldColors(e2, e3, b2, e4, e5, e6, e7, e8, e9, e10, textSelectionColors, e11, ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens3), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens5));
            colorScheme.f8547v0 = textFieldColors;
        }
        composer.D();
        return textFieldColors;
    }

    public static PaddingValuesImpl f() {
        float f2 = TextFieldImplKt.f13035b;
        return new PaddingValuesImpl(f2, TextFieldImplKt.d, f2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017b  */
    /* JADX WARN: Type inference failed for: r1v19, types: [kotlin.jvm.internal.a0, kotlin.jvm.internal.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r20, boolean r21, androidx.compose.foundation.interaction.InteractionSource r22, androidx.compose.ui.Modifier r23, androidx.compose.material3.TextFieldColors r24, androidx.compose.ui.graphics.Shape r25, float r26, float r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.a(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r42, q0.p r43, boolean r44, boolean r45, androidx.compose.ui.text.input.VisualTransformation r46, androidx.compose.foundation.interaction.InteractionSource r47, boolean r48, q0.p r49, q0.p r50, q0.p r51, q0.p r52, q0.p r53, q0.p r54, q0.p r55, androidx.compose.ui.graphics.Shape r56, androidx.compose.material3.TextFieldColors r57, androidx.compose.foundation.layout.PaddingValues r58, q0.p r59, androidx.compose.runtime.Composer r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.b(java.lang.String, q0.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, q0.p, q0.p, q0.p, q0.p, q0.p, q0.p, q0.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, q0.p, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
