package com.glority.reviewpopview.base;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewPopILogEvent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/glority/reviewpopview/base/ReviewPopILogEvent;", "", "logEvent", "", NotificationCompat.CATEGORY_EVENT, "", "bundle", "Landroid/os/Bundle;", "mod_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public interface ReviewPopILogEvent {
    void logEvent(String event, Bundle bundle);

    /* compiled from: ReviewPopILogEvent.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void logEvent$default(ReviewPopILogEvent reviewPopILogEvent, String str, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
            }
            if ((i & 2) != 0) {
                bundle = null;
            }
            reviewPopILogEvent.logEvent(str, bundle);
        }

        public static void logEvent(ReviewPopILogEvent reviewPopILogEvent, String event, Bundle bundle) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : bundle.keySet()) {
                    arrayList.add(TuplesKt.to(str, bundle.get(str)));
                }
                Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                new LogEventRequest(event, LogEventArgumentsKt.logEventBundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length))).post();
                return;
            }
            new LogEventRequest(event, bundle).post();
        }
    }
}
