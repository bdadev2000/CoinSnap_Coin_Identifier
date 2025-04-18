package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes4.dex */
public final class PointerIconCompat {

    /* renamed from: a, reason: collision with root package name */
    public final PointerIcon f18728a;

    @RequiresApi
    /* loaded from: classes4.dex */
    public static class Api24Impl {
        @DoNotInline
        public static PointerIcon a(Bitmap bitmap, float f2, float f3) {
            return PointerIcon.create(bitmap, f2, f3);
        }

        @DoNotInline
        public static PointerIcon b(Context context, int i2) {
            return PointerIcon.getSystemIcon(context, i2);
        }

        @DoNotInline
        public static PointerIcon c(Resources resources, int i2) {
            return PointerIcon.load(resources, i2);
        }
    }

    public PointerIconCompat(PointerIcon pointerIcon) {
        this.f18728a = pointerIcon;
    }

    public static PointerIconCompat a(Context context) {
        return new PointerIconCompat(Api24Impl.b(context, 1002));
    }
}
