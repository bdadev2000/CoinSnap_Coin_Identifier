package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.i3;
import k.e0;
import k.n;
import k.o;
import k.q;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements n, e0, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f644c = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    public o f645b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        i3 i3Var = new i3(context, context.obtainStyledAttributes(attributeSet, f644c, R.attr.listViewStyle, 0));
        if (i3Var.l(0)) {
            setBackgroundDrawable(i3Var.e(0));
        }
        if (i3Var.l(1)) {
            setDivider(i3Var.e(1));
        }
        i3Var.o();
    }

    @Override // k.n
    public final boolean a(q qVar) {
        return this.f645b.q(qVar, null, 0);
    }

    @Override // k.e0
    public final void d(o oVar) {
        this.f645b = oVar;
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
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        a((q) getAdapter().getItem(i10));
    }
}
