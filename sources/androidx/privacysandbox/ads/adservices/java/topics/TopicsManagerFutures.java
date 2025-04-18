package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon;
import b1.o0;
import com.google.common.util.concurrent.ListenableFuture;
import g1.u;
import h1.d;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes.dex */
public abstract class TopicsManagerFutures {

    /* loaded from: classes.dex */
    public static final class Api33Ext4JavaImpl extends TopicsManagerFutures {

        /* renamed from: a, reason: collision with root package name */
        public final TopicsManager f20855a;

        public Api33Ext4JavaImpl(TopicsManagerImplCommon topicsManagerImplCommon) {
            this.f20855a = topicsManagerImplCommon;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<GetTopicsResponse> b(@NotNull GetTopicsRequest getTopicsRequest) {
            a.s(getTopicsRequest, "request");
            d dVar = o0.f22355a;
            return CoroutineAdapterKt.a(e.f(a.c(u.f30639a), null, new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this, getTopicsRequest, null), 3));
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public static final TopicsManagerFutures a(Context context) {
        TopicsManagerImplCommon topicsManagerImplCommon;
        a.s(context, "context");
        if (AdServicesInfo.a() >= 5) {
            Object systemService = context.getSystemService((Class<Object>) androidx.privacysandbox.ads.adservices.customaudience.a.x());
            a.r(systemService, "context.getSystemService…opicsManager::class.java)");
            topicsManagerImplCommon = new TopicsManagerImplCommon(androidx.privacysandbox.ads.adservices.customaudience.a.m(systemService));
        } else if (AdServicesInfo.a() == 4) {
            Object systemService2 = context.getSystemService((Class<Object>) androidx.privacysandbox.ads.adservices.customaudience.a.x());
            a.r(systemService2, "context.getSystemService…opicsManager::class.java)");
            topicsManagerImplCommon = new TopicsManagerImplCommon(androidx.privacysandbox.ads.adservices.customaudience.a.m(systemService2));
        } else {
            topicsManagerImplCommon = null;
        }
        if (topicsManagerImplCommon != null) {
            return new Api33Ext4JavaImpl(topicsManagerImplCommon);
        }
        return null;
    }

    public abstract ListenableFuture b(GetTopicsRequest getTopicsRequest);
}
