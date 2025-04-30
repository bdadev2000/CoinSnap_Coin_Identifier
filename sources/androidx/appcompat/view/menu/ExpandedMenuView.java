package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l5.k;
import p.C2535n;
import p.InterfaceC2532k;
import p.MenuC2533l;
import p.z;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC2532k, z, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f4127c = {R.attr.background, R.attr.divider};
    public MenuC2533l b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        k i9 = k.i(context, attributeSet, f4127c, R.attr.listViewStyle, 0);
        TypedArray typedArray = (TypedArray) i9.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(i9.e(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(i9.e(1));
        }
        i9.j();
    }

    @Override // p.InterfaceC2532k
    public final boolean a(C2535n c2535n) {
        return this.b.q(c2535n, null, 0);
    }

    @Override // p.z
    public final void c(MenuC2533l menuC2533l) {
        this.b = menuC2533l;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j7) {
        a((C2535n) getAdapter().getItem(i9));
    }
}
