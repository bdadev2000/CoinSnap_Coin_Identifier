package androidx.core.view;

import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class DisplayCompat {

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api23Impl {
    }

    /* loaded from: classes3.dex */
    public static final class ModeCompat {

        @RequiresApi
        /* loaded from: classes3.dex */
        public static class Api23Impl {
            @DoNotInline
            public static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @DoNotInline
            public static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }
    }
}
