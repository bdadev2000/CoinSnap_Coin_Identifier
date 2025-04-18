package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;

/* loaded from: classes.dex */
public final class TypographyKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f12631a = new CompositionLocal(TypographyKt$LocalTypography$1.f12632a);

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TypographyKeyTokens.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[12] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[13] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[14] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[0] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[1] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[2] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[9] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[10] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[11] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static final TextStyle a(TypographyKeyTokens typographyKeyTokens, Composer composer) {
        Typography b2 = MaterialTheme.b(composer);
        switch (typographyKeyTokens.ordinal()) {
            case 0:
                return b2.f12625j;
            case 1:
                return b2.f12626k;
            case 2:
                return b2.f12627l;
            case 3:
                return b2.f12618a;
            case 4:
                return b2.f12619b;
            case 5:
                return b2.f12620c;
            case 6:
                return b2.d;
            case 7:
                return b2.e;
            case 8:
                return b2.f12621f;
            case 9:
                return b2.f12628m;
            case 10:
                return b2.f12629n;
            case 11:
                return b2.f12630o;
            case 12:
                return b2.f12622g;
            case 13:
                return b2.f12623h;
            case 14:
                return b2.f12624i;
            default:
                throw new RuntimeException();
        }
    }
}
