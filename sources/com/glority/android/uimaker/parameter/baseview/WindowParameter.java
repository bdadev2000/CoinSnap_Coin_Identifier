package com.glority.android.uimaker.parameter.baseview;

import com.glority.android.core.data.LogEventArguments;
import kotlin.Metadata;

/* compiled from: WindowParameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/glority/android/uimaker/parameter/baseview/WindowParameter;", "Lcom/glority/android/uimaker/parameter/baseview/ViewGroupParameter;", "()V", LogEventArguments.ARG_VERSION, "", "getVersion", "()I", "setVersion", "(I)V", "viewName", "", "getViewName", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class WindowParameter extends ViewGroupParameter {
    private int version = 1;

    public final int getVersion() {
        return this.version;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    @Override // com.glority.android.uimaker.parameter.baseview.ViewGroupParameter, com.glority.android.uimaker.parameter.baseview.ViewParameter, com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public String getViewName() {
        return "WINDOW";
    }
}
