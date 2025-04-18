package androidx.privacysandbox.ads.adservices.java.customaudience;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import b1.o0;
import com.google.common.util.concurrent.ListenableFuture;
import d0.b0;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes.dex */
public abstract class CustomAudienceManagerFutures {

    /* loaded from: classes.dex */
    public static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<b0> a(@NotNull JoinCustomAudienceRequest joinCustomAudienceRequest) {
            a.s(joinCustomAudienceRequest, "request");
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this, joinCustomAudienceRequest, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<b0> b(@NotNull LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
            a.s(leaveCustomAudienceRequest, "request");
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this, leaveCustomAudienceRequest, null), 3));
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
    }
}
