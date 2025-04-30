package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* loaded from: classes3.dex */
public class ObservableScrollView extends HorizontalScrollView {

    /* renamed from: a, reason: collision with root package name */
    private a f18765a;

    public ObservableScrollView(Context context) {
        super(context);
        this.f18765a = null;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i9) {
        super.fling(i9 / 4);
    }

    @Override // android.view.View
    public void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        a aVar = this.f18765a;
        if (aVar != null) {
            aVar.a(this, i9, i10, i11, i12);
        }
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f18765a = null;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18765a = null;
    }
}
