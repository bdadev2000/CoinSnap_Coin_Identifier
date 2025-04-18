package h1;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, Fragment fragment, String str) {
        super(fragment, str);
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        } else {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            super(fragment, str);
        }
    }
}
