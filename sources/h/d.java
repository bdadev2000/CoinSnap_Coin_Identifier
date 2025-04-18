package h;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class d implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18530d;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f18528b = i10;
        this.f18530d = obj;
        this.f18529c = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        int i11 = this.f18528b;
        Object obj = this.f18530d;
        switch (i11) {
            case 0:
                e eVar = (e) obj;
                DialogInterface.OnClickListener onClickListener = eVar.f18546o;
                h hVar = (h) this.f18529c;
                onClickListener.onClick(hVar.f18594b, i10);
                if (!eVar.f18548q) {
                    hVar.f18594b.dismiss();
                    return;
                }
                return;
            default:
                androidx.appcompat.widget.q0 q0Var = (androidx.appcompat.widget.q0) obj;
                q0Var.I.setSelection(i10);
                androidx.appcompat.widget.t0 t0Var = q0Var.I;
                if (t0Var.getOnItemClickListener() != null) {
                    t0Var.performItemClick(view, i10, q0Var.F.getItemId(i10));
                }
                q0Var.dismiss();
                return;
        }
    }
}
