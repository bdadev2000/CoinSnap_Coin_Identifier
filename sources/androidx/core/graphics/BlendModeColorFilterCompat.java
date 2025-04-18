package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeUtils;

/* loaded from: classes2.dex */
public class BlendModeColorFilterCompat {

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        @DoNotInline
        public static ColorFilter a(int i2, Object obj) {
            return new BlendModeColorFilter(i2, (BlendMode) obj);
        }
    }

    public static ColorFilter a() {
        BlendModeCompat blendModeCompat = BlendModeCompat.f18529a;
        if (Build.VERSION.SDK_INT >= 29) {
            Object a2 = BlendModeUtils.Api29Impl.a(blendModeCompat);
            if (a2 != null) {
                return Api29Impl.a(0, a2);
            }
            return null;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        if (mode != null) {
            return new PorterDuffColorFilter(0, mode);
        }
        return null;
    }
}
