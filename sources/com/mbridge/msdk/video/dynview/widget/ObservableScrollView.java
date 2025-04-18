package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* loaded from: classes4.dex */
public class ObservableScrollView extends HorizontalScrollView {
    private a a;

    public ObservableScrollView(Context context) {
        super(context);
        this.a = null;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i10) {
        super.fling(i10 / 4);
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this, i10, i11, i12, i13);
        }
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = null;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }
}
