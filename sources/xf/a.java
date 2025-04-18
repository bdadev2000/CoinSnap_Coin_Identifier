package xf;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.g;
import kotlin.jvm.internal.Intrinsics;
import mf.d;

/* loaded from: classes4.dex */
public final class a extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
    }

    @Override // androidx.viewpager2.adapter.g
    public final d c(int i10) {
        if (i10 == 0) {
            return new zf.c();
        }
        return new yf.b();
    }

    @Override // androidx.recyclerview.widget.j0
    public final int getItemCount() {
        return 2;
    }
}
