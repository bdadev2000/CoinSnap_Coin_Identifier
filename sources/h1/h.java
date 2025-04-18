package h1;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Fragment fragment, Fragment targetFragment, int i10) {
        super(1, fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
    }
}
