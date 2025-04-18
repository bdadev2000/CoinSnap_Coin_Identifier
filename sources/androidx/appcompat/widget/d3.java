package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class d3 implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f856c;

    public /* synthetic */ d3(View view, int i10) {
        this.f855b = i10;
        this.f856c = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        Object item;
        CharSequence convertSelectionToString;
        int selectedItemPosition;
        int i11 = this.f855b;
        View view2 = this.f856c;
        switch (i11) {
            case 0:
                ((SearchView) view2).p(i10);
                return;
            default:
                na.s sVar = (na.s) view2;
                View view3 = null;
                if (i10 < 0) {
                    k2 k2Var = sVar.f22690g;
                    if (!k2Var.a()) {
                        item = null;
                    } else {
                        item = k2Var.f892d.getSelectedItem();
                    }
                } else {
                    item = sVar.getAdapter().getItem(i10);
                }
                convertSelectionToString = sVar.convertSelectionToString(item);
                sVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = sVar.getOnItemClickListener();
                k2 k2Var2 = sVar.f22690g;
                if (onItemClickListener != null) {
                    if (view == null || i10 < 0) {
                        if (k2Var2.a()) {
                            view3 = k2Var2.f892d.getSelectedView();
                        }
                        view = view3;
                        if (!k2Var2.a()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = k2Var2.f892d.getSelectedItemPosition();
                        }
                        i10 = selectedItemPosition;
                        if (!k2Var2.a()) {
                            j3 = Long.MIN_VALUE;
                        } else {
                            j3 = k2Var2.f892d.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(k2Var2.f892d, view, i10, j3);
                }
                k2Var2.dismiss();
                return;
        }
    }
}
