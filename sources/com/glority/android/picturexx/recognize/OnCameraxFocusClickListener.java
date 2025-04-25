package com.glority.android.picturexx.recognize;

import android.graphics.PointF;
import android.widget.FrameLayout;
import kotlin.Metadata;

/* compiled from: FocusFrameLayout.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/glority/android/picturexx/recognize/OnCameraxFocusClickListener;", "", "initFocusView", "", "absFocusView", "Lcom/glority/android/picturexx/recognize/AbsFocusView;", "parent", "Landroid/widget/FrameLayout;", "onClickToFocus", "touchPoint", "Landroid/graphics/PointF;", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public interface OnCameraxFocusClickListener {
    void initFocusView(AbsFocusView absFocusView, FrameLayout parent);

    void onClickToFocus(AbsFocusView absFocusView, FrameLayout parent, PointF touchPoint);
}
