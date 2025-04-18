package h1;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f18709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Fragment fragment, ViewGroup container, int i10) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + container);
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f18709c = container;
            return;
        }
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        this.f18709c = container;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Fragment fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
    }
}
