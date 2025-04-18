package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final o f20118b;

    /* renamed from: c, reason: collision with root package name */
    public int f20119c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20120d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20121f;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutInflater f20122g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20123h;

    public l(o oVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f20121f = z10;
        this.f20122g = layoutInflater;
        this.f20118b = oVar;
        this.f20123h = i10;
        a();
    }

    public final void a() {
        o oVar = this.f20118b;
        q qVar = oVar.f20144v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f20133j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((q) arrayList.get(i10)) == qVar) {
                    this.f20119c = i10;
                    return;
                }
            }
        }
        this.f20119c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i10) {
        ArrayList l10;
        boolean z10 = this.f20121f;
        o oVar = this.f20118b;
        if (z10) {
            oVar.i();
            l10 = oVar.f20133j;
        } else {
            l10 = oVar.l();
        }
        int i11 = this.f20119c;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (q) l10.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l10;
        boolean z10 = this.f20121f;
        o oVar = this.f20118b;
        if (z10) {
            oVar.i();
            l10 = oVar.f20133j;
        } else {
            l10 = oVar.l();
        }
        if (this.f20119c < 0) {
            return l10.size();
        }
        return l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10 = false;
        if (view == null) {
            view = this.f20122g.inflate(this.f20123h, viewGroup, false);
        }
        int i12 = getItem(i10).f20150b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f20150b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f20118b.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        d0 d0Var = (d0) view;
        if (this.f20120d) {
            listMenuItemView.setForceShowIcon(true);
        }
        d0Var.c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
