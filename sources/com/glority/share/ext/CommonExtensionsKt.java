package com.glority.share.ext;

import com.glority.android.core.route.Router;
import com.glority.share.ShareHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonExtensions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"tryCatch", "R", "channel", "", "tried", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "base-share_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final class CommonExtensionsKt {
    public static final <R> R tryCatch(String channel, Function0<? extends R> tried) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(tried, "tried");
        try {
            ShareLogEvents.post$default(ShareLogEvents.INSTANCE, channel, false, null, 6, null);
            return tried.invoke();
        } catch (Exception e) {
            ShareLogEvents.INSTANCE.post(channel, true, e);
            Router.onResponse(ShareHandler.INSTANCE.getRequestId(), 0);
            return null;
        }
    }
}
