package androidx.compose.material3;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class SearchBarDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final SearchBarDefaults f10859a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final float f10860b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f10861c;
    public static final float d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.compose.material3.SearchBarDefaults] */
    static {
        float f2 = ElevationTokens.f13332a;
        float f3 = ElevationTokens.f13332a;
        f10860b = f3;
        f10861c = f3;
        float f4 = SearchBarTokens.f13501a;
        d = SearchBarTokens.f13501a;
    }

    public static SearchBarColors b(Composer composer) {
        float f2 = SearchBarTokens.f13501a;
        return new SearchBarColors(ColorSchemeKt.f(ColorSchemeKeyTokens.f13285u, composer), ColorSchemeKt.f(SearchViewTokens.f13505a, composer), c(composer));
    }

    public static TextFieldColors c(Composer composer) {
        ColorSchemeKeyTokens colorSchemeKeyTokens = SearchBarTokens.f13503c;
        long f2 = ColorSchemeKt.f(colorSchemeKeyTokens, composer);
        long f3 = ColorSchemeKt.f(colorSchemeKeyTokens, composer);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.f13273i;
        long b2 = Color.b(ColorSchemeKt.f(colorSchemeKeyTokens2, composer), 0.38f);
        long f4 = ColorSchemeKt.f(ColorSchemeKeyTokens.f13278n, composer);
        TextSelectionColors textSelectionColors = (TextSelectionColors) composer.K(TextSelectionColorsKt.f7360a);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = SearchBarTokens.d;
        long f5 = ColorSchemeKt.f(colorSchemeKeyTokens3, composer);
        long f6 = ColorSchemeKt.f(colorSchemeKeyTokens3, composer);
        long b3 = Color.b(ColorSchemeKt.f(colorSchemeKeyTokens2, composer), 0.38f);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = SearchBarTokens.f13504f;
        long f7 = ColorSchemeKt.f(colorSchemeKeyTokens4, composer);
        long f8 = ColorSchemeKt.f(colorSchemeKeyTokens4, composer);
        long b4 = Color.b(ColorSchemeKt.f(colorSchemeKeyTokens2, composer), 0.38f);
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = SearchBarTokens.e;
        long f9 = ColorSchemeKt.f(colorSchemeKeyTokens5, composer);
        long f10 = ColorSchemeKt.f(colorSchemeKeyTokens5, composer);
        long b5 = Color.b(ColorSchemeKt.f(colorSchemeKeyTokens2, composer), 0.38f);
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f12006a;
        long j2 = Color.f14962i;
        return TextFieldDefaults.e(MaterialTheme.a(composer), composer).a(f2, f3, b2, j2, j2, j2, j2, j2, f4, j2, textSelectionColors, j2, j2, j2, j2, f5, f6, b3, j2, f7, f8, b4, j2, j2, j2, j2, j2, f9, f10, b5, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r49, q0.l r50, q0.l r51, boolean r52, q0.l r53, androidx.compose.ui.Modifier r54, boolean r55, q0.p r56, q0.p r57, q0.p r58, androidx.compose.material3.TextFieldColors r59, androidx.compose.foundation.interaction.MutableInteractionSource r60, androidx.compose.runtime.Composer r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarDefaults.a(java.lang.String, q0.l, q0.l, boolean, q0.l, androidx.compose.ui.Modifier, boolean, q0.p, q0.p, q0.p, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
