package com.glority.share.ext;

import android.os.Bundle;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareLogEvents.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/glority/share/ext/ShareLogEvents;", "", "()V", "SHARE", "", "SHARE_FAILED", "post", "", "platform", "", "failed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "base-share_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final class ShareLogEvents {
    public static final ShareLogEvents INSTANCE = new ShareLogEvents();
    private static final int SHARE = 1;
    private static final int SHARE_FAILED = 0;

    private ShareLogEvents() {
    }

    public static /* synthetic */ void post$default(ShareLogEvents shareLogEvents, String str, boolean z, Exception exc, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            exc = null;
        }
        shareLogEvents.post(str, z, exc);
    }

    public final void post(String platform, boolean failed, Exception e) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Bundle logEventBundleOf = LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", platform), TuplesKt.to("value", Integer.valueOf(!failed ? 1 : 0)));
        if (e != null) {
            logEventBundleOf = LogEventArgumentsKt.logEventBundleAdd(logEventBundleOf, TuplesKt.to("error", e.getMessage()));
        }
        new LogEventRequest("component_share", logEventBundleOf).post();
    }
}
