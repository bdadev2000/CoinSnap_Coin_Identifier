package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import d0.a;

@Immutable
/* loaded from: classes.dex */
public interface Font {

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    @a
    /* loaded from: classes.dex */
    public interface ResourceLoader {
    }

    default int a() {
        return 0;
    }

    int b();

    FontWeight getWeight();
}
