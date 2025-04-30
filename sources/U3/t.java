package U3;

import android.view.View;
import android.widget.AdapterView;
import q.C0;
import q.L;

/* loaded from: classes2.dex */
public final class t implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3221c;

    public /* synthetic */ t(Object obj, int i9) {
        this.b = i9;
        this.f3221c = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j7) {
        Object item;
        int selectedItemPosition;
        switch (this.b) {
            case 0:
                View view2 = null;
                v vVar = (v) this.f3221c;
                if (i9 < 0) {
                    C0 c02 = vVar.f3224g;
                    if (!c02.f22515B.isShowing()) {
                        item = null;
                    } else {
                        item = c02.f22517d.getSelectedItem();
                    }
                } else {
                    item = vVar.getAdapter().getItem(i9);
                }
                v.a(vVar, item);
                AdapterView.OnItemClickListener onItemClickListener = vVar.getOnItemClickListener();
                C0 c03 = vVar.f3224g;
                if (onItemClickListener != null) {
                    if (view == null || i9 < 0) {
                        if (c03.f22515B.isShowing()) {
                            view2 = c03.f22517d.getSelectedView();
                        }
                        view = view2;
                        if (!c03.f22515B.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = c03.f22517d.getSelectedItemPosition();
                        }
                        i9 = selectedItemPosition;
                        if (!c03.f22515B.isShowing()) {
                            j7 = Long.MIN_VALUE;
                        } else {
                            j7 = c03.f22517d.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(c03.f22517d, view, i9, j7);
                }
                c03.dismiss();
                return;
            default:
                L l = (L) this.f3221c;
                l.f22565I.setSelection(i9);
                if (l.f22565I.getOnItemClickListener() != null) {
                    l.f22565I.performItemClick(view, i9, l.f22562F.getItemId(i9));
                }
                l.dismiss();
                return;
        }
    }
}
