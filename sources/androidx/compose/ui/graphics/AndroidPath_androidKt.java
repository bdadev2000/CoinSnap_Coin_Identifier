package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.Path;

/* loaded from: classes4.dex */
public final class AndroidPath_androidKt {

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Path.Direction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final AndroidPath a() {
        return new AndroidPath(new android.graphics.Path());
    }
}
