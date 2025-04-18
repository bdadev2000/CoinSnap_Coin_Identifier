package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Composer;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class SystemBarsDefaultInsets_androidKt {
    public static final AndroidWindowInsets a(Composer composer) {
        WeakHashMap weakHashMap = WindowInsetsHolder.x;
        return WindowInsetsHolder.Companion.c(composer).f4141g;
    }
}
