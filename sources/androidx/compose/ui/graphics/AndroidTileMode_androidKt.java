package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;

/* loaded from: classes2.dex */
public final class AndroidTileMode_androidKt {

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final Shader.TileMode a(int i2) {
        if (TileMode.a(i2, 0)) {
            return Shader.TileMode.CLAMP;
        }
        if (TileMode.a(i2, 1)) {
            return Shader.TileMode.REPEAT;
        }
        if (TileMode.a(i2, 2)) {
            return Shader.TileMode.MIRROR;
        }
        if (TileMode.a(i2, 3) && Build.VERSION.SDK_INT >= 31) {
            return TileModeVerificationHelper.f15058a.b();
        }
        return Shader.TileMode.CLAMP;
    }
}
