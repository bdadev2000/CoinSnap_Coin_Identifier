package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class SheetDelegate {
    public abstract int calculateInnerMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float calculateSlideOffset(int i2);

    public abstract int getCoplanarSiblingAdjacentMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int getExpandedOffset();

    public abstract int getHiddenOffset();

    public abstract int getMaxViewPositionHorizontal();

    public abstract int getMinViewPositionHorizontal();

    public abstract <V extends View> int getOuterEdge(@NonNull V v2);

    public abstract int getParentInnerEdge(@NonNull CoordinatorLayout coordinatorLayout);

    public abstract int getSheetEdge();

    public abstract boolean isExpandingOutwards(float f2);

    public abstract boolean isReleasedCloseToInnerEdge(@NonNull View view);

    public abstract boolean isSwipeSignificant(float f2, float f3);

    public abstract boolean shouldHide(@NonNull View view, float f2);

    public abstract void updateCoplanarSiblingAdjacentMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i2);

    public abstract void updateCoplanarSiblingLayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);
}
