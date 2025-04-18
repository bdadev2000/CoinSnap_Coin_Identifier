package kf;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class q1 extends p1 {
    public static final SparseIntArray u;

    /* renamed from: t, reason: collision with root package name */
    public long f20868t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        u = sparseIntArray;
        sparseIntArray.put(R.id.creenRating, 1);
        sparseIntArray.put(R.id.icCloseDialog, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        sparseIntArray.put(R.id.tvContent, 4);
        sparseIntArray.put(R.id.star1, 5);
        sparseIntArray.put(R.id.star2, 6);
        sparseIntArray.put(R.id.star3, 7);
        sparseIntArray.put(R.id.star4, 8);
        sparseIntArray.put(R.id.star5, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(View view) {
        super(null, view);
        Object[] K = androidx.databinding.e.K(view, 10, null, u);
        this.f20868t = -1L;
        ((ConstraintLayout) K[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        I();
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20868t = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20868t != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20868t = 1L;
        }
        L();
    }
}
