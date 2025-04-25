package com.glority.android.uimaker.uimaker;

import android.view.View;
import android.widget.ScrollView;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import kotlin.Metadata;

/* compiled from: BaseUiMaker.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/glority/android/uimaker/uimaker/BaseUiMaker;", "", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "scrollView", "Landroid/widget/ScrollView;", "getScrollView", "()Landroid/widget/ScrollView;", "toView", "json", "", "onClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "uimaker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public interface BaseUiMaker {
    /* renamed from: getRootView */
    View mo7943getRootView();

    ScrollView getScrollView();

    View toView(String json, UiMakerOnClickListener onClickListener);
}
