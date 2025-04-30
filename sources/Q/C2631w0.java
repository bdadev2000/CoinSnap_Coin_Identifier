package q;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: q.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2631w0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ C0 b;

    public C2631w0(C0 c02) {
        this.b = c02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i9, long j7) {
        C2621r0 c2621r0;
        if (i9 != -1 && (c2621r0 = this.b.f22517d) != null) {
            c2621r0.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
