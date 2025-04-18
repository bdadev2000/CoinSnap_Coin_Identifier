package x5;

import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final y5.c f27368b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f27369c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f27370d;

    /* renamed from: f, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f27371f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27372g;

    public b(y5.c mapping, View rootView, AdapterView hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f27368b = mapping;
        this.f27369c = new WeakReference(hostView);
        this.f27370d = new WeakReference(rootView);
        this.f27371f = hostView.getOnItemClickListener();
        this.f27372g = true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        Intrinsics.checkNotNullParameter(view, "view");
        AdapterView.OnItemClickListener onItemClickListener = this.f27371f;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i10, j3);
        }
        View view2 = (View) this.f27370d.get();
        AdapterView adapterView2 = (AdapterView) this.f27369c.get();
        if (view2 != null && adapterView2 != null) {
            c.b(this.f27368b, view2, adapterView2);
        }
    }
}
