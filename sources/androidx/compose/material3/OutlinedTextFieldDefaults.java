package androidx.compose.material3;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes3.dex */
public final class OutlinedTextFieldDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final OutlinedTextFieldDefaults f10396a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final float f10397b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f10398c = 280;
    public static final float d = 1;
    public static final float e = 2;

    public static TextFieldColors c(Composer composer, int i2) {
        return d(MaterialTheme.a(composer), composer);
    }

    public static TextFieldColors d(ColorScheme colorScheme, Composer composer) {
        TextFieldColors textFieldColors = colorScheme.f8545u0;
        composer.J(1540400102);
        if (textFieldColors == null) {
            ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.f13273i;
            long e2 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens);
            long e3 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens);
            long b2 = Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f);
            long e4 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens);
            long j2 = Color.f14961h;
            ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.f13278n;
            long e5 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens2);
            ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.f13267a;
            long e6 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens3);
            TextSelectionColors textSelectionColors = (TextSelectionColors) composer.K(TextSelectionColorsKt.f7360a);
            long e7 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens2);
            long e8 = ColorSchemeKt.e(colorScheme, ColorSchemeKeyTokens.f13276l);
            long b3 = Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.12f);
            long e9 = ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens3);
            ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.f13274j;
            textFieldColors = new TextFieldColors(e2, e3, b2, e4, j2, j2, j2, j2, e5, e6, textSelectionColors, e7, e8, b3, e9, ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens3), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens2), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens3), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens3), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), Color.b(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4), 0.38f), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens4));
            colorScheme.f8545u0 = textFieldColors;
        }
        composer.D();
        return textFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017d  */
    /* JADX WARN: Type inference failed for: r2v20, types: [kotlin.jvm.internal.a0, kotlin.jvm.internal.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r21, boolean r22, androidx.compose.foundation.interaction.InteractionSource r23, androidx.compose.ui.Modifier r24, androidx.compose.material3.TextFieldColors r25, androidx.compose.ui.graphics.Shape r26, float r27, float r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.a(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r39, q0.p r40, boolean r41, boolean r42, androidx.compose.ui.text.input.VisualTransformation r43, androidx.compose.foundation.interaction.InteractionSource r44, boolean r45, q0.p r46, q0.p r47, q0.p r48, q0.p r49, q0.p r50, q0.p r51, q0.p r52, androidx.compose.material3.TextFieldColors r53, androidx.compose.foundation.layout.PaddingValues r54, q0.p r55, androidx.compose.runtime.Composer r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.b(java.lang.String, q0.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, q0.p, q0.p, q0.p, q0.p, q0.p, q0.p, q0.p, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, q0.p, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
