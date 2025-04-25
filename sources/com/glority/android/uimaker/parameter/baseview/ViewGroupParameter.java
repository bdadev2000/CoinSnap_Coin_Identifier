package com.glority.android.uimaker.parameter.baseview;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewGroupParameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/glority/android/uimaker/parameter/baseview/ViewGroupParameter;", "Lcom/glority/android/uimaker/parameter/baseview/ViewParameter;", "()V", "childViewParameters", "", "getChildViewParameters", "()Ljava/util/List;", "viewName", "", "getViewName", "()Ljava/lang/String;", "addView", "", "viewParameter", "removeView", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public class ViewGroupParameter extends ViewParameter {
    private final List<ViewParameter> childViewParameters = new ArrayList();

    public final List<ViewParameter> getChildViewParameters() {
        return this.childViewParameters;
    }

    public final void addView(ViewParameter viewParameter) {
        Intrinsics.checkNotNullParameter(viewParameter, "viewParameter");
        viewParameter.setParentViewParameter(this);
        this.childViewParameters.add(viewParameter);
    }

    public final void removeView(ViewParameter viewParameter) {
        Intrinsics.checkNotNullParameter(viewParameter, "viewParameter");
        this.childViewParameters.remove(viewParameter);
    }

    @Override // com.glority.android.uimaker.parameter.baseview.ViewParameter, com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public String getViewName() {
        return "VIEWGROUP";
    }
}
