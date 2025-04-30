package o0;

import G7.j;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f21936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Fragment fragment, ViewGroup viewGroup, int i9) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        switch (i9) {
            case 1:
                j.e(fragment, "fragment");
                super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.f21936c = viewGroup;
                return;
            default:
                this.f21936c = viewGroup;
                return;
        }
    }
}
