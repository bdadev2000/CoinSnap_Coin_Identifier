package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        u.d(null);
        if (k.e(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.tools.arruler.photomeasure.camera.ruler.R.id.cancel_button);
            setNextFocusRightId(com.tools.arruler.photomeasure.camera.ruler.R.id.confirm_button);
        }
        this.b = k.e(getContext(), com.tools.arruler.photomeasure.camera.ruler.R.attr.nestedScrollable);
        ViewCompat.setAccessibilityDelegate(this, new Z.h(3));
    }

    public final n a() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((n) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n nVar = (n) super.getAdapter();
        nVar.getClass();
        int max = Math.max(nVar.a(), getFirstVisiblePosition());
        int min = Math.min(nVar.c(), getLastVisiblePosition());
        nVar.getItem(max);
        nVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z8, int i9, Rect rect) {
        if (z8) {
            if (i9 == 33) {
                setSelection(((n) super.getAdapter()).c());
                return;
            } else if (i9 == 130) {
                setSelection(((n) super.getAdapter()).a());
                return;
            } else {
                super.onFocusChanged(true, i9, rect);
                return;
            }
        }
        super.onFocusChanged(false, i9, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (!super.onKeyDown(i9, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((n) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i9) {
            return false;
        }
        setSelection(((n) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.b) {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i9, i10);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i9) {
        if (i9 < ((n) super.getAdapter()).a()) {
            super.setSelection(((n) super.getAdapter()).a());
        } else {
            super.setSelection(i9);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof n) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
    }
}
