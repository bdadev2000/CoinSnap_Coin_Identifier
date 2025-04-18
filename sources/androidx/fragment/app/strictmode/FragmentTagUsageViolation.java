package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes4.dex */
public final class FragmentTagUsageViolation extends Violation {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f19914b;

    public FragmentTagUsageViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        this.f19914b = viewGroup;
    }
}
