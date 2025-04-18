package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.facebook.ads.AdError;
import w0.e;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes3.dex */
public final class DatePickerDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final DatePickerDefaults f8723a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final float f8724b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.DatePickerDefaults, java.lang.Object] */
    static {
        new e(1900, AdError.BROKEN_MEDIA_ERROR_CODE, 1);
        float f2 = ElevationTokens.f13332a;
        f8724b = ElevationTokens.f13332a;
    }

    public static DatePickerColors c(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        DatePickerColors datePickerColors = a2.f8513e0;
        composer.J(-653687021);
        if (datePickerColors == null) {
            float f2 = DatePickerModalTokens.f13289a;
            long e = ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13285u);
            long e2 = ColorSchemeKt.e(a2, DatePickerModalTokens.f13303q);
            long e3 = ColorSchemeKt.e(a2, DatePickerModalTokens.f13301o);
            long e4 = ColorSchemeKt.e(a2, DatePickerModalTokens.f13309y);
            long e5 = ColorSchemeKt.e(a2, DatePickerModalTokens.w);
            long j2 = a2.f8540s;
            ColorSchemeKeyTokens colorSchemeKeyTokens = DatePickerModalTokens.G;
            long e6 = ColorSchemeKt.e(a2, colorSchemeKeyTokens);
            long b2 = Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens), 0.38f);
            ColorSchemeKeyTokens colorSchemeKeyTokens2 = DatePickerModalTokens.f13298l;
            long e7 = ColorSchemeKt.e(a2, colorSchemeKeyTokens2);
            ColorSchemeKeyTokens colorSchemeKeyTokens3 = DatePickerModalTokens.E;
            long e8 = ColorSchemeKt.e(a2, colorSchemeKeyTokens3);
            long b3 = Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens3), 0.38f);
            ColorSchemeKeyTokens colorSchemeKeyTokens4 = DatePickerModalTokens.D;
            long e9 = ColorSchemeKt.e(a2, colorSchemeKeyTokens4);
            long b4 = Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens4), 0.38f);
            ColorSchemeKeyTokens colorSchemeKeyTokens5 = DatePickerModalTokens.f13299m;
            long e10 = ColorSchemeKt.e(a2, colorSchemeKeyTokens5);
            long b5 = Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens5), 0.38f);
            ColorSchemeKeyTokens colorSchemeKeyTokens6 = DatePickerModalTokens.f13293g;
            long e11 = ColorSchemeKt.e(a2, colorSchemeKeyTokens6);
            long b6 = Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens6), 0.38f);
            ColorSchemeKeyTokens colorSchemeKeyTokens7 = DatePickerModalTokens.f13292f;
            long e12 = ColorSchemeKt.e(a2, colorSchemeKeyTokens7);
            long b7 = Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens7), 0.38f);
            long e13 = ColorSchemeKt.e(a2, colorSchemeKeyTokens2);
            long e14 = ColorSchemeKt.e(a2, DatePickerModalTokens.f13296j);
            long e15 = ColorSchemeKt.e(a2, DatePickerModalTokens.f13306t);
            long e16 = ColorSchemeKt.e(a2, DatePickerModalTokens.f13305s);
            float f3 = DividerTokens.f13315a;
            long e17 = ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13277m);
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f10396a;
            datePickerColors = new DatePickerColors(e, e2, e3, e4, e5, j2, e6, b2, e7, e8, b3, e9, b4, e10, b5, e11, b6, e12, b7, e13, e14, e16, e15, e17, OutlinedTextFieldDefaults.d(a2, composer));
            a2.f8513e0 = datePickerColors;
        }
        composer.D();
        return datePickerColors;
    }

    public static DatePickerFormatter d() {
        return new DatePickerFormatterImpl("yMMMM", "yMMMd", "yMMMMEEEEd");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Long r33, int r34, androidx.compose.material3.DatePickerFormatter r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.a(java.lang.Long, int, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.b(int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
