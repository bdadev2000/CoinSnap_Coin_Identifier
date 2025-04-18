package kf;

import android.view.View;
import android.widget.LinearLayout;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class d1 extends c1 {

    /* renamed from: t, reason: collision with root package name */
    public long f20726t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(View view) {
        super(view, null);
        Object[] K = androidx.databinding.e.K(view, 1, null, null);
        this.f20726t = -1L;
        ((LinearLayout) K[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        I();
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20726t = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20726t != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20726t = 1L;
        }
        L();
    }
}
