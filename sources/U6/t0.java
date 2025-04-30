package u6;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import d0.AbstractC2158e;

/* loaded from: classes3.dex */
public abstract class t0 extends AbstractC2158e {

    /* renamed from: q, reason: collision with root package name */
    public final ConstraintLayout f23414q;

    /* renamed from: r, reason: collision with root package name */
    public final ConstraintLayout f23415r;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f23416s;

    /* renamed from: t, reason: collision with root package name */
    public final LottieAnimationView f23417t;

    /* renamed from: u, reason: collision with root package name */
    public final RecyclerView f23418u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f23419v;

    public t0(Object obj, View view, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, LottieAnimationView lottieAnimationView, RecyclerView recyclerView, TextView textView) {
        super(view, 0, obj);
        this.f23414q = constraintLayout;
        this.f23415r = constraintLayout2;
        this.f23416s = constraintLayout3;
        this.f23417t = lottieAnimationView;
        this.f23418u = recyclerView;
        this.f23419v = textView;
    }
}
