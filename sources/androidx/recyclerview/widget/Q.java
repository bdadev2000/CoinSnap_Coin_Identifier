package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public O f4938a;
    public ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public long f4939c;

    /* renamed from: d, reason: collision with root package name */
    public long f4940d;

    /* renamed from: e, reason: collision with root package name */
    public long f4941e;

    /* renamed from: f, reason: collision with root package name */
    public long f4942f;

    public static void b(p0 p0Var) {
        int i9 = p0Var.mFlags;
        if (!p0Var.isInvalid() && (i9 & 4) == 0) {
            p0Var.getOldPosition();
            p0Var.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(p0 p0Var, p0 p0Var2, P p2, P p7);

    public final void c(p0 p0Var) {
        O o3 = this.f4938a;
        if (o3 != null) {
            H h6 = (H) o3;
            h6.getClass();
            p0Var.setIsRecyclable(true);
            if (p0Var.mShadowedHolder != null && p0Var.mShadowingHolder == null) {
                p0Var.mShadowedHolder = null;
            }
            p0Var.mShadowingHolder = null;
            if (!p0Var.shouldBeKeptAsChild()) {
                View view = p0Var.itemView;
                RecyclerView recyclerView = h6.f4935a;
                if (!recyclerView.removeAnimatingView(view) && p0Var.isTmpDetached()) {
                    recyclerView.removeDetachedView(p0Var.itemView, false);
                }
            }
        }
    }

    public abstract void d(p0 p0Var);

    public abstract void e();

    public abstract boolean f();
}
