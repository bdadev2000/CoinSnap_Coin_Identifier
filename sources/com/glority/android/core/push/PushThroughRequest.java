package com.glority.android.core.push;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.modules.PushMessageBean;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PushThroughRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/glority/android/core/push/PushThroughRequest;", "Lcom/glority/android/core/route/RouteRequest;", "Lcom/glority/android/core/modules/PushMessageBean;", "pushMessageBean", "(Lcom/glority/android/core/modules/PushMessageBean;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class PushThroughRequest extends RouteRequest<PushMessageBean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushThroughRequest(PushMessageBean pushMessageBean) {
        super(Intrinsics.stringPlus(AppContext.INSTANCE.getScheme(), "launcher/through_push"), null, null, 6, null);
        Intrinsics.checkNotNullParameter(pushMessageBean, "pushMessageBean");
        setData(pushMessageBean);
    }
}
