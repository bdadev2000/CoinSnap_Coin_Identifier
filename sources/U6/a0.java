package u6;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import d0.AbstractC2158e;

/* loaded from: classes3.dex */
public abstract class a0 extends AbstractC2158e {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f23260t = 0;

    /* renamed from: q, reason: collision with root package name */
    public final FrameLayout f23261q;

    /* renamed from: r, reason: collision with root package name */
    public final E f23262r;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f23263s;

    public a0(Object obj, View view, FrameLayout frameLayout, E e4, ConstraintLayout constraintLayout) {
        super(view, 1, obj);
        this.f23261q = frameLayout;
        this.f23262r = e4;
        this.f23263s = constraintLayout;
    }
}
