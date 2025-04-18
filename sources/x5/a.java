package x5;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final y5.c f27363b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f27364c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f27365d;

    /* renamed from: f, reason: collision with root package name */
    public final View.OnClickListener f27366f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27367g;

    public a(y5.c mapping, View rootView, View hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f27363b = mapping;
        this.f27364c = new WeakReference(hostView);
        this.f27365d = new WeakReference(rootView);
        this.f27366f = y5.g.e(hostView);
        this.f27367g = true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (m6.a.b(this)) {
                return;
            }
            try {
                if (m6.a.b(this)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(view, "view");
                    View.OnClickListener onClickListener = this.f27366f;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = (View) this.f27365d.get();
                    View view3 = (View) this.f27364c.get();
                    if (view2 != null && view3 != null) {
                        c.b(this.f27363b, view2, view3);
                    }
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                }
            } catch (Throwable th3) {
                m6.a.a(this, th3);
            }
        } catch (Throwable th4) {
            m6.a.a(this, th4);
        }
    }
}
