package com.bytedance.adsdk.ugeno.component.flexbox;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
interface zp {
    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<KS> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int lMd(int i9, int i10, int i11);

    View lMd(int i9);

    void setFlexLines(List<KS> list);

    int zp(int i9, int i10, int i11);

    int zp(View view);

    int zp(View view, int i9, int i10);

    View zp(int i9);

    void zp(View view, int i9, int i10, KS ks);

    void zp(KS ks);

    boolean zp();
}
