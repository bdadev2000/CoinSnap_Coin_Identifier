package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;

/* renamed from: p.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2528g extends BaseAdapter {
    public int b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2529h f22090c;

    public C2528g(C2529h c2529h) {
        this.f22090c = c2529h;
        a();
    }

    public final void a() {
        MenuC2533l menuC2533l = this.f22090c.f22092d;
        C2535n c2535n = menuC2533l.f22120x;
        if (c2535n != null) {
            menuC2533l.i();
            ArrayList arrayList = menuC2533l.l;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((C2535n) arrayList.get(i9)) == c2535n) {
                    this.b = i9;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2535n getItem(int i9) {
        C2529h c2529h = this.f22090c;
        MenuC2533l menuC2533l = c2529h.f22092d;
        menuC2533l.i();
        ArrayList arrayList = menuC2533l.l;
        c2529h.getClass();
        int i10 = this.b;
        if (i10 >= 0 && i9 >= i10) {
            i9++;
        }
        return (C2535n) arrayList.get(i9);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C2529h c2529h = this.f22090c;
        MenuC2533l menuC2533l = c2529h.f22092d;
        menuC2533l.i();
        int size = menuC2533l.l.size();
        c2529h.getClass();
        if (this.b < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i9) {
        return i9;
    }

    @Override // android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f22090c.f22091c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).b(getItem(i9));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
