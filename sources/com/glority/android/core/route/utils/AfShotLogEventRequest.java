package com.glority.android.core.route.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;

/* compiled from: AfShotLogEventRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/glority/android/core/route/utils/AfShotLogEventRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "times", "", "(I)V", "getTimes", "()I", "setTimes", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class AfShotLogEventRequest extends RouteRequest<Boolean> {
    private int times;

    public AfShotLogEventRequest(int i) {
        super(UrlUtils.INSTANCE.getAF_SHOT_TIMES_LOG_EVENT(), null, null, 6, null);
        this.times = i;
    }

    public final int getTimes() {
        return this.times;
    }

    public final void setTimes(int i) {
        this.times = i;
    }
}
