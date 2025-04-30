package z2;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2969a implements View.OnClickListener {
    public final A2.c b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f24499c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f24500d;

    /* renamed from: f, reason: collision with root package name */
    public final View.OnClickListener f24501f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24502g = true;

    public ViewOnClickListenerC2969a(A2.c cVar, View view, View view2) {
        this.b = cVar;
        this.f24499c = new WeakReference(view2);
        this.f24500d = new WeakReference(view);
        this.f24501f = A2.g.e(view2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            if (O2.a.b(this)) {
                return;
            }
            try {
                if (O2.a.b(this)) {
                    return;
                }
                try {
                    G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                    View.OnClickListener onClickListener = this.f24501f;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = (View) this.f24500d.get();
                    View view3 = (View) this.f24499c.get();
                    if (view2 != null && view3 != null) {
                        c.c(this.b, view2, view3);
                    }
                } catch (Throwable th) {
                    O2.a.a(this, th);
                }
            } catch (Throwable th2) {
                O2.a.a(this, th2);
            }
        } catch (Throwable th3) {
            O2.a.a(this, th3);
        }
    }
}
