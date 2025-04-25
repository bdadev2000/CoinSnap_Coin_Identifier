package com.glority.android.core.route.abtest;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbtestGetVariableDataRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/glority/android/core/route/abtest/AbtestGetVariableDataRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "test", "variable", "(Ljava/lang/String;Ljava/lang/String;)V", "getTest", "()Ljava/lang/String;", "setTest", "(Ljava/lang/String;)V", "getVariable", "setVariable", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class AbtestGetVariableDataRequest extends RouteRequest<String> {
    private String test;
    private String variable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbtestGetVariableDataRequest(String test, String variable) {
        super(UrlAbtest.INSTANCE.getURL_ABTEST_VARIABLE_DATA(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(test, "test");
        Intrinsics.checkNotNullParameter(variable, "variable");
        this.test = test;
        this.variable = variable;
    }

    public final String getTest() {
        return this.test;
    }

    public final String getVariable() {
        return this.variable;
    }

    public final void setTest(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.test = str;
    }

    public final void setVariable(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.variable = str;
    }
}
