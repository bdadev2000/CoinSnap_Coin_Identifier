package com.glority.android.core.route.abtest;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AbtestGetTagMapRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/glority/android/core/route/abtest/AbtestGetTagMapRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "", "", "()V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class AbtestGetTagMapRequest extends RouteRequest<Map<String, ? extends Object>> {
    public AbtestGetTagMapRequest() {
        super(UrlAbtest.INSTANCE.getURL_ABTEST_TAG_MAP(), null, null, 6, null);
    }
}
