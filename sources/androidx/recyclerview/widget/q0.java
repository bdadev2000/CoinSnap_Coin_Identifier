package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class q0 {
    public o0 a = null;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2013b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final long f2014c = 120;

    /* renamed from: d, reason: collision with root package name */
    public final long f2015d = 120;

    /* renamed from: e, reason: collision with root package name */
    public final long f2016e = 250;

    /* renamed from: f, reason: collision with root package name */
    public final long f2017f = 250;

    public static void b(o1 o1Var) {
        int i10 = o1Var.mFlags & 14;
        if (!o1Var.isInvalid() && (i10 & 4) == 0) {
            o1Var.getOldPosition();
            o1Var.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(o1 o1Var, o1 o1Var2, p0 p0Var, p0 p0Var2);

    public final void c(o1 o1Var) {
        o0 o0Var = this.a;
        if (o0Var != null) {
            h0 h0Var = (h0) o0Var;
            h0Var.getClass();
            o1Var.setIsRecyclable(true);
            if (o1Var.mShadowedHolder != null && o1Var.mShadowingHolder == null) {
                o1Var.mShadowedHolder = null;
            }
            o1Var.mShadowingHolder = null;
            if (!o1Var.shouldBeKeptAsChild()) {
                View view = o1Var.itemView;
                RecyclerView recyclerView = h0Var.a;
                if (!recyclerView.removeAnimatingView(view) && o1Var.isTmpDetached()) {
                    recyclerView.removeDetachedView(o1Var.itemView, false);
                }
            }
        }
    }

    public abstract void d(o1 o1Var);

    public abstract void e();

    public abstract boolean f();
}
