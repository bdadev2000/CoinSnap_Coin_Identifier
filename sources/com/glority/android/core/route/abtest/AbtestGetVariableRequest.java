package com.glority.android.core.route.abtest;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;

/* compiled from: AbtestGetVariableRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/glority/android/core/route/abtest/AbtestGetVariableRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "test", "", "(Ljava/lang/String;)V", "getTest", "()Ljava/lang/String;", "setTest", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class AbtestGetVariableRequest extends RouteRequest<Integer> {
    private String test;

    public AbtestGetVariableRequest(String str) {
        super(UrlAbtest.INSTANCE.getURL_ABTEST_VARIABLE(), null, null, 6, null);
        this.test = str;
    }

    public final String getTest() {
        return this.test;
    }

    public final void setTest(String str) {
        this.test = str;
    }
}
