package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11659b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        u.d(null);
        if (l.f(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f11659b = l.g(getContext(), R.attr.nestedScrollable);
        ViewCompat.setAccessibilityDelegate(this, new g(this, 3));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final o getAdapter2() {
        return (o) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o adapter = getAdapter();
        adapter.getClass();
        int max = Math.max(adapter.a(), getFirstVisiblePosition());
        int min = Math.min(adapter.c(), getLastVisiblePosition());
        adapter.getItem(max);
        adapter.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            if (i10 == 33) {
                setSelection(getAdapter().c());
                return;
            } else if (i10 == 130) {
                setSelection(getAdapter().a());
                return;
            } else {
                super.onFocusChanged(true, i10, rect);
                return;
            }
        }
        super.onFocusChanged(false, i10, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().a() && selectedItemPosition <= getAdapter().c())) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f11659b) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < getAdapter().a()) {
            super.setSelection(getAdapter().a());
        } else {
            super.setSelection(i10);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof o) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), o.class.getCanonicalName()));
    }
}
