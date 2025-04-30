package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: p.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2530i extends BaseAdapter {
    public final MenuC2533l b;

    /* renamed from: c, reason: collision with root package name */
    public int f22096c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22097d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22098f;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutInflater f22099g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22100h;

    public C2530i(MenuC2533l menuC2533l, LayoutInflater layoutInflater, boolean z8, int i9) {
        this.f22098f = z8;
        this.f22099g = layoutInflater;
        this.b = menuC2533l;
        this.f22100h = i9;
        a();
    }

    public final void a() {
        MenuC2533l menuC2533l = this.b;
        C2535n c2535n = menuC2533l.f22120x;
        if (c2535n != null) {
            menuC2533l.i();
            ArrayList arrayList = menuC2533l.l;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((C2535n) arrayList.get(i9)) == c2535n) {
                    this.f22096c = i9;
                    return;
                }
            }
        }
        this.f22096c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2535n getItem(int i9) {
        ArrayList l;
        boolean z8 = this.f22098f;
        MenuC2533l menuC2533l = this.b;
        if (z8) {
            menuC2533l.i();
            l = menuC2533l.l;
        } else {
            l = menuC2533l.l();
        }
        int i10 = this.f22096c;
        if (i10 >= 0 && i9 >= i10) {
            i9++;
        }
        return (C2535n) l.get(i9);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z8 = this.f22098f;
        MenuC2533l menuC2533l = this.b;
        if (z8) {
            menuC2533l.i();
            l = menuC2533l.l;
        } else {
            l = menuC2533l.l();
        }
        if (this.f22096c < 0) {
            return l.size();
        }
        return l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i9) {
        return i9;
    }

    @Override // android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        int i10;
        boolean z8 = false;
        if (view == null) {
            view = this.f22099g.inflate(this.f22100h, viewGroup, false);
        }
        int i11 = getItem(i9).f22130c;
        int i12 = i9 - 1;
        if (i12 >= 0) {
            i10 = getItem(i12).f22130c;
        } else {
            i10 = i11;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.b.m() && i11 != i10) {
            z8 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z8);
        y yVar = (y) view;
        if (this.f22097d) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i9));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
