package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import com.google.zxing.aztec.encoder.Encoder;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class ColorSchemeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f8552a = new CompositionLocal(ColorSchemeKt$LocalColorScheme$1.f8554a);

    /* renamed from: b, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f8553b = new CompositionLocal(ColorSchemeKt$LocalTonalElevationEnabled$1.f8555a);

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[13] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[14] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[17] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[18] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[42] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[19] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[20] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[23] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[24] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[25] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[26] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[29] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[30] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[31] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[34] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[43] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[35] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[36] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[37] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[38] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[39] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[40] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[41] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[44] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[45] = 36;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    public static final long a(ColorScheme colorScheme, long j2, float f2, Composer composer) {
        boolean booleanValue = ((Boolean) composer.K(f8553b)).booleanValue();
        if (!Color.c(j2, colorScheme.f8534p) || !booleanValue) {
            return j2;
        }
        boolean a2 = Dp.a(f2, 0);
        long j3 = colorScheme.f8534p;
        if (a2) {
            return j3;
        }
        return ColorKt.g(Color.b(colorScheme.f8542t, ((((float) Math.log(f2 + 1)) * 4.5f) + 2.0f) / 100.0f), j3);
    }

    public static final long b(ColorScheme colorScheme, long j2) {
        if (Color.c(j2, colorScheme.f8506a)) {
            return colorScheme.f8508b;
        }
        if (Color.c(j2, colorScheme.f8514f)) {
            return colorScheme.f8516g;
        }
        if (Color.c(j2, colorScheme.f8522j)) {
            return colorScheme.f8524k;
        }
        if (Color.c(j2, colorScheme.f8530n)) {
            return colorScheme.f8532o;
        }
        if (Color.c(j2, colorScheme.w)) {
            return colorScheme.x;
        }
        if (Color.c(j2, colorScheme.f8510c)) {
            return colorScheme.d;
        }
        if (Color.c(j2, colorScheme.f8518h)) {
            return colorScheme.f8520i;
        }
        if (Color.c(j2, colorScheme.f8526l)) {
            return colorScheme.f8528m;
        }
        if (Color.c(j2, colorScheme.f8550y)) {
            return colorScheme.f8551z;
        }
        if (Color.c(j2, colorScheme.f8544u)) {
            return colorScheme.f8546v;
        }
        boolean c2 = Color.c(j2, colorScheme.f8534p);
        long j3 = colorScheme.f8536q;
        if (!c2) {
            if (Color.c(j2, colorScheme.f8538r)) {
                return colorScheme.f8540s;
            }
            if (!Color.c(j2, colorScheme.D) && !Color.c(j2, colorScheme.F) && !Color.c(j2, colorScheme.G) && !Color.c(j2, colorScheme.H) && !Color.c(j2, colorScheme.I) && !Color.c(j2, colorScheme.J)) {
                int i2 = Color.f14963j;
                return Color.f14962i;
            }
        }
        return j3;
    }

    public static final long c(long j2, Composer composer) {
        composer.J(-1680936624);
        long b2 = b(MaterialTheme.a(composer), j2);
        if (b2 == 16) {
            b2 = ((Color) composer.K(ContentColorKt.f8654a)).f14964a;
        }
        composer.D();
        return b2;
    }

    public static ColorScheme d(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, int i2, int i3) {
        long j34 = (i2 & 1) != 0 ? ColorDarkTokens.f13240t : j2;
        return new ColorScheme(j34, (i2 & 2) != 0 ? ColorDarkTokens.f13230j : j3, (i2 & 4) != 0 ? ColorDarkTokens.f13241u : j4, (i2 & 8) != 0 ? ColorDarkTokens.f13231k : j5, (i2 & 16) != 0 ? ColorDarkTokens.e : j6, (i2 & 32) != 0 ? ColorDarkTokens.w : j7, (i2 & 64) != 0 ? ColorDarkTokens.f13232l : j8, (i2 & 128) != 0 ? ColorDarkTokens.x : j9, (i2 & 256) != 0 ? ColorDarkTokens.f13233m : j10, (i2 & 512) != 0 ? ColorDarkTokens.H : j11, (i2 & 1024) != 0 ? ColorDarkTokens.f13236p : j12, (i2 & Opcodes.ACC_STRICT) != 0 ? ColorDarkTokens.I : j13, (i2 & 4096) != 0 ? ColorDarkTokens.f13237q : j14, (i2 & 8192) != 0 ? ColorDarkTokens.f13223a : j15, (i2 & 16384) != 0 ? ColorDarkTokens.f13227g : j16, (32768 & i2) != 0 ? ColorDarkTokens.f13243y : j17, (65536 & i2) != 0 ? ColorDarkTokens.f13234n : j18, (131072 & i2) != 0 ? ColorDarkTokens.G : j19, (262144 & i2) != 0 ? ColorDarkTokens.f13235o : j20, (524288 & i2) != 0 ? j34 : j21, (1048576 & i2) != 0 ? ColorDarkTokens.f13226f : j22, (2097152 & i2) != 0 ? ColorDarkTokens.d : j23, (4194304 & i2) != 0 ? ColorDarkTokens.f13224b : 0L, (8388608 & i2) != 0 ? ColorDarkTokens.f13228h : 0L, (16777216 & i2) != 0 ? ColorDarkTokens.f13225c : 0L, (33554432 & i2) != 0 ? ColorDarkTokens.f13229i : 0L, (67108864 & i2) != 0 ? ColorDarkTokens.f13238r : j24, (134217728 & i2) != 0 ? ColorDarkTokens.f13239s : j25, (268435456 & i2) != 0 ? ColorDarkTokens.f13242v : j26, (536870912 & i2) != 0 ? ColorDarkTokens.f13244z : j27, (i3 & 8) != 0 ? ColorDarkTokens.F : j33, (1073741824 & i2) != 0 ? ColorDarkTokens.A : j28, (i2 & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.B : j29, (i3 & 1) != 0 ? ColorDarkTokens.C : j30, (i3 & 2) != 0 ? ColorDarkTokens.D : j31, (i3 & 4) != 0 ? ColorDarkTokens.E : j32);
    }

    public static final long e(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (colorSchemeKeyTokens.ordinal()) {
            case 0:
                return colorScheme.f8530n;
            case 1:
                return colorScheme.w;
            case 2:
                return colorScheme.f8550y;
            case 3:
                return colorScheme.f8546v;
            case 4:
                return colorScheme.e;
            case 5:
                return colorScheme.f8544u;
            case 6:
                return colorScheme.f8532o;
            case 7:
                return colorScheme.x;
            case 8:
                return colorScheme.f8551z;
            case 9:
                return colorScheme.f8508b;
            case 10:
                return colorScheme.d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            default:
                int i2 = Color.f14963j;
                return Color.f14962i;
            case 13:
                return colorScheme.f8516g;
            case 14:
                return colorScheme.f8520i;
            case 17:
                return colorScheme.f8536q;
            case 18:
                return colorScheme.f8540s;
            case 19:
                return colorScheme.f8524k;
            case 20:
                return colorScheme.f8528m;
            case 23:
                return colorScheme.A;
            case 24:
                return colorScheme.B;
            case 25:
                return colorScheme.f8506a;
            case 26:
                return colorScheme.f8510c;
            case 29:
                return colorScheme.C;
            case 30:
                return colorScheme.f8514f;
            case 31:
                return colorScheme.f8518h;
            case 34:
                return colorScheme.f8534p;
            case 35:
                return colorScheme.D;
            case 36:
                return colorScheme.F;
            case 37:
                return colorScheme.G;
            case 38:
                return colorScheme.H;
            case 39:
                return colorScheme.I;
            case 40:
                return colorScheme.J;
            case 41:
                return colorScheme.E;
            case 42:
                return colorScheme.f8542t;
            case 43:
                return colorScheme.f8538r;
            case 44:
                return colorScheme.f8522j;
            case 45:
                return colorScheme.f8526l;
        }
    }

    public static final long f(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer) {
        return e(MaterialTheme.a(composer), colorSchemeKeyTokens);
    }

    public static ColorScheme g(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, int i2, int i3) {
        long j34 = (i2 & 1) != 0 ? ColorLightTokens.f13262t : j2;
        return new ColorScheme(j34, (i2 & 2) != 0 ? ColorLightTokens.f13252j : j3, (i2 & 4) != 0 ? ColorLightTokens.f13263u : j4, (i2 & 8) != 0 ? ColorLightTokens.f13253k : j5, (i2 & 16) != 0 ? ColorLightTokens.e : j6, (i2 & 32) != 0 ? ColorLightTokens.w : j7, (i2 & 64) != 0 ? ColorLightTokens.f13254l : j8, (i2 & 128) != 0 ? ColorLightTokens.x : j9, (i2 & 256) != 0 ? ColorLightTokens.f13255m : j10, (i2 & 512) != 0 ? ColorLightTokens.H : j11, (i2 & 1024) != 0 ? ColorLightTokens.f13258p : j12, (i2 & Opcodes.ACC_STRICT) != 0 ? ColorLightTokens.I : j13, (i2 & 4096) != 0 ? ColorLightTokens.f13259q : j14, (i2 & 8192) != 0 ? ColorLightTokens.f13245a : j15, (i2 & 16384) != 0 ? ColorLightTokens.f13249g : j16, (32768 & i2) != 0 ? ColorLightTokens.f13265y : j17, (65536 & i2) != 0 ? ColorLightTokens.f13256n : j18, (131072 & i2) != 0 ? ColorLightTokens.G : j19, (262144 & i2) != 0 ? ColorLightTokens.f13257o : j20, (524288 & i2) != 0 ? j34 : j21, (1048576 & i2) != 0 ? ColorLightTokens.f13248f : j22, (2097152 & i2) != 0 ? ColorLightTokens.d : j23, (4194304 & i2) != 0 ? ColorLightTokens.f13246b : 0L, (8388608 & i2) != 0 ? ColorLightTokens.f13250h : 0L, (16777216 & i2) != 0 ? ColorLightTokens.f13247c : 0L, (33554432 & i2) != 0 ? ColorLightTokens.f13251i : 0L, (67108864 & i2) != 0 ? ColorLightTokens.f13260r : j24, (134217728 & i2) != 0 ? ColorLightTokens.f13261s : j25, (268435456 & i2) != 0 ? ColorLightTokens.f13264v : j26, (536870912 & i2) != 0 ? ColorLightTokens.f13266z : j27, (i3 & 8) != 0 ? ColorLightTokens.F : j33, (1073741824 & i2) != 0 ? ColorLightTokens.A : j28, (i2 & Integer.MIN_VALUE) != 0 ? ColorLightTokens.B : j29, (i3 & 1) != 0 ? ColorLightTokens.C : j30, (i3 & 2) != 0 ? ColorLightTokens.D : j31, (i3 & 4) != 0 ? ColorLightTokens.E : j32);
    }
}
