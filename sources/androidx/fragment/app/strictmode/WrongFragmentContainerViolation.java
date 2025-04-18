package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes4.dex */
public final class WrongFragmentContainerViolation extends Violation {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f19916b;

    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        this.f19916b = viewGroup;
    }
}
