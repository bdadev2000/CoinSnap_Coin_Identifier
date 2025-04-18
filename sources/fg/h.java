package fg;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends androidx.viewpager2.adapter.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
    }

    @Override // androidx.viewpager2.adapter.g
    public final mf.d c(int i10) {
        if (i10 == 0) {
            return new gg.e();
        }
        return new gg.i();
    }

    @Override // androidx.recyclerview.widget.j0
    public final int getItemCount() {
        return 2;
    }
}
