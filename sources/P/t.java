package p;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class t implements InterfaceC2519B, x, AdapterView.OnItemClickListener {
    public Rect b;

    public static int l(ListAdapter listAdapter, Context context, int i9) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i10 = 0;
        int i11 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i9) {
                return i9;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    public static boolean t(MenuC2533l menuC2533l) {
        int size = menuC2533l.f22106h.size();
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem item = menuC2533l.getItem(i9);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p.x
    public final boolean i(C2535n c2535n) {
        return false;
    }

    @Override // p.x
    public final boolean j(C2535n c2535n) {
        return false;
    }

    public abstract void k(MenuC2533l menuC2533l);

    public abstract void m(View view);

    public abstract void n(boolean z8);

    public abstract void o(int i9);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j7) {
        C2530i c2530i;
        int i10;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            c2530i = (C2530i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            c2530i = (C2530i) listAdapter;
        }
        MenuC2533l menuC2533l = c2530i.b;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i9);
        if (!(this instanceof ViewOnKeyListenerC2527f)) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        menuC2533l.q(menuItem, this, i10);
    }

    public abstract void p(int i9);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z8);

    public abstract void s(int i9);

    @Override // p.x
    public final void c(Context context, MenuC2533l menuC2533l) {
    }
}
