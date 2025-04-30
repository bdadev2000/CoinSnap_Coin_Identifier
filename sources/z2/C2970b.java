package z2;

import android.view.View;
import android.widget.AdapterView;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;

/* renamed from: z2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2970b implements AdapterView.OnItemClickListener {
    public final A2.c b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f24503c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f24504d;

    /* renamed from: f, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f24505f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24506g = true;

    public C2970b(A2.c cVar, View view, AdapterView adapterView) {
        this.b = cVar;
        this.f24503c = new WeakReference(adapterView);
        this.f24504d = new WeakReference(view);
        this.f24505f = adapterView.getOnItemClickListener();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j7) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        AdapterView.OnItemClickListener onItemClickListener = this.f24505f;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i9, j7);
        }
        View view2 = (View) this.f24504d.get();
        AdapterView adapterView2 = (AdapterView) this.f24503c.get();
        if (view2 != null && adapterView2 != null) {
            c.c(this.b, view2, adapterView2);
        }
    }
}
