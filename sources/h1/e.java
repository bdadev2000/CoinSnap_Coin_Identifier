package h1;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, Fragment fragment) {
        super(0, fragment, "Attempting to get retain instance for fragment " + fragment);
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return;
        }
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        super(0, fragment, "Attempting to set retain instance for fragment " + fragment);
    }
}
