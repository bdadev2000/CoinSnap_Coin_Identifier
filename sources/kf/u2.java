package kf;

import android.view.View;
import android.widget.ImageView;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class u2 extends t2 {
    public long u;

    public u2(View view) {
        super(null, view, (ImageView) androidx.databinding.e.K(view, 1, null, null)[0]);
        this.u = -1L;
        this.f20893t.setTag(null);
        view.setTag(R.id.dataBinding, this);
        I();
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.u = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.u != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.u = 1L;
        }
        L();
    }
}
