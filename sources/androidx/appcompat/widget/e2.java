package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class e2 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f862c;

    public /* synthetic */ e2(Object obj, int i10) {
        this.f861b = i10;
        this.f862c = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j3) {
        y1 y1Var;
        int i11 = this.f861b;
        Object obj = this.f862c;
        switch (i11) {
            case 0:
                if (i10 != -1 && (y1Var = ((k2) obj).f892d) != null) {
                    y1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) obj).q(i10);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
