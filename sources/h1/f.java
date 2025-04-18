package h1;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, Fragment fragment) {
        super(1, fragment, "Attempting to get target request code from fragment " + fragment);
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return;
        }
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        super(1, fragment, "Attempting to get target fragment from fragment " + fragment);
    }
}
