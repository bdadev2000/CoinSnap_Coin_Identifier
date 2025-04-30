package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p.C2530i;
import p.C2535n;
import p.MenuC2533l;

/* loaded from: classes.dex */
public final class G0 extends C2621r0 {

    /* renamed from: o, reason: collision with root package name */
    public final int f22543o;

    /* renamed from: p, reason: collision with root package name */
    public final int f22544p;

    /* renamed from: q, reason: collision with root package name */
    public D0 f22545q;

    /* renamed from: r, reason: collision with root package name */
    public C2535n f22546r;

    public G0(Context context, boolean z8) {
        super(context, z8);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f22543o = 21;
            this.f22544p = 22;
        } else {
            this.f22543o = 22;
            this.f22544p = 21;
        }
    }

    @Override // q.C2621r0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C2530i c2530i;
        int i9;
        C2535n c2535n;
        int pointToPosition;
        int i10;
        if (this.f22545q != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i9 = headerViewListAdapter.getHeadersCount();
                c2530i = (C2530i) headerViewListAdapter.getWrappedAdapter();
            } else {
                c2530i = (C2530i) adapter;
                i9 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i10 = pointToPosition - i9) >= 0 && i10 < c2530i.getCount()) {
                c2535n = c2530i.getItem(i10);
            } else {
                c2535n = null;
            }
            C2535n c2535n2 = this.f22546r;
            if (c2535n2 != c2535n) {
                MenuC2533l menuC2533l = c2530i.b;
                if (c2535n2 != null) {
                    this.f22545q.c(menuC2533l, c2535n2);
                }
                this.f22546r = c2535n;
                if (c2535n != null) {
                    this.f22545q.n(menuC2533l, c2535n);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        C2530i c2530i;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i9 == this.f22543o) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i9 == this.f22544p) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                c2530i = (C2530i) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                c2530i = (C2530i) adapter;
            }
            c2530i.b.c(false);
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    public void setHoverListener(D0 d02) {
        this.f22545q = d02;
    }

    @Override // q.C2621r0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
