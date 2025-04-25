package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public abstract class SheetDelegate {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract float calculateSlideOffsetBasedOnOutwardEdge(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int calculateTargetStateOnViewReleased(View view, float f, float f2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getExpandedOffset();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getHiddenOffset();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <V extends View> int getOutwardEdge(V v);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getSheetEdge();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean isSettling(View view, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean shouldHide(View view, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void updateCoplanarSiblingLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);
}
