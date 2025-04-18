package h1;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Fragment fragment, boolean z10) {
        super(fragment, "Attempting to set user visible hint to " + z10 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }
}
