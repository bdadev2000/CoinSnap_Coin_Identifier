package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class p2 extends y1 {

    /* renamed from: o, reason: collision with root package name */
    public final int f990o;

    /* renamed from: p, reason: collision with root package name */
    public final int f991p;

    /* renamed from: q, reason: collision with root package name */
    public l2 f992q;

    /* renamed from: r, reason: collision with root package name */
    public k.q f993r;

    public p2(Context context, boolean z10) {
        super(context, z10);
        if (1 == o2.a(context.getResources().getConfiguration())) {
            this.f990o = 21;
            this.f991p = 22;
        } else {
            this.f990o = 22;
            this.f991p = 21;
        }
    }

    @Override // androidx.appcompat.widget.y1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        k.l lVar;
        int i10;
        k.q qVar;
        int pointToPosition;
        int i11;
        if (this.f992q != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i10 = headerViewListAdapter.getHeadersCount();
                lVar = (k.l) headerViewListAdapter.getWrappedAdapter();
            } else {
                lVar = (k.l) adapter;
                i10 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < lVar.getCount()) {
                qVar = lVar.getItem(i11);
            } else {
                qVar = null;
            }
            k.q qVar2 = this.f993r;
            if (qVar2 != qVar) {
                k.o oVar = lVar.f20118b;
                if (qVar2 != null) {
                    this.f992q.h(oVar, qVar2);
                }
                this.f993r = qVar;
                if (qVar != null) {
                    this.f992q.q(oVar, qVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        k.l lVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f990o) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i10 == this.f991p) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                lVar = (k.l) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                lVar = (k.l) adapter;
            }
            lVar.f20118b.c(false);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void setHoverListener(l2 l2Var) {
        this.f992q = l2Var;
    }

    @Override // androidx.appcompat.widget.y1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
