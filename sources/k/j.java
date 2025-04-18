package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public int f20110b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f20111c;

    public j(k kVar) {
        this.f20111c = kVar;
        a();
    }

    public final void a() {
        o oVar = this.f20111c.f20114d;
        q qVar = oVar.f20144v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f20133j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((q) arrayList.get(i10)) == qVar) {
                    this.f20110b = i10;
                    return;
                }
            }
        }
        this.f20110b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i10) {
        k kVar = this.f20111c;
        o oVar = kVar.f20114d;
        oVar.i();
        ArrayList arrayList = oVar.f20133j;
        kVar.getClass();
        int i11 = i10 + 0;
        int i12 = this.f20110b;
        if (i12 >= 0 && i11 >= i12) {
            i11++;
        }
        return (q) arrayList.get(i11);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        k kVar = this.f20111c;
        o oVar = kVar.f20114d;
        oVar.i();
        int size = oVar.f20133j.size();
        kVar.getClass();
        int i10 = size + 0;
        if (this.f20110b < 0) {
            return i10;
        }
        return i10 - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f20111c.f20113c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((d0) view).c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
