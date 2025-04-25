package com.glority.android.adapterhelper.listener;

import android.graphics.Canvas;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: OnItemSwipeListener.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J4\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0012"}, d2 = {"Lcom/glority/android/adapterhelper/listener/OnItemSwipeListener;", "", "clearView", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "pos", "", "onItemSwipeMoving", "canvas", "Landroid/graphics/Canvas;", "dX", "", "dY", "isCurrentlyActive", "", "onItemSwipeStart", "onItemSwiped", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface OnItemSwipeListener {
    void clearView(RecyclerView.ViewHolder viewHolder, int pos);

    void onItemSwipeMoving(Canvas canvas, RecyclerView.ViewHolder viewHolder, float dX, float dY, boolean isCurrentlyActive);

    void onItemSwipeStart(RecyclerView.ViewHolder viewHolder, int pos);

    void onItemSwiped(RecyclerView.ViewHolder viewHolder, int pos);
}
