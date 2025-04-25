package com.glority.billing.handler;

import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.Router;
import com.glority.android.core.route.billing.QueryHasSubscribedRequest;
import com.glority.android.core.route.billing.UrlBilling;
import com.glority.android.core.utils.data.PersistData;
import com.glority.billing.agent.MyBillingAgent;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QueryHasActiveSubscribedHandler.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0016J\u001d\u0010\r\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/glority/billing/handler/QueryHasActiveSubscribedHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "execute", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Boolean;", "Companion", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class QueryHasActiveSubscribedHandler implements RouteHandler<Boolean> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String KEY_BILLING_HAS_ACTIVE_SUBSCRIBE = "key_billing_has_active_subscribe";

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlBilling.INSTANCE.getURL_QUERY_HAS_ACTIVE_SUBSCRIBED();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(final RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        MyBillingAgent.INSTANCE.hasActiveSubscribed(AppContext.INSTANCE.peekContext(), new Function2<Exception, Boolean, Unit>() { // from class: com.glority.billing.handler.QueryHasActiveSubscribedHandler$post$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc, Boolean bool) {
                invoke2(exc, bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Exception exc, Boolean bool) {
                if (exc == null) {
                    PersistData.INSTANCE.set(QueryHasActiveSubscribedHandler.INSTANCE.getKEY_BILLING_HAS_ACTIVE_SUBSCRIBE(), bool);
                    Router.onResponse(request.getId(), bool);
                } else {
                    Router.onException(request.getId(), exc);
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof QueryHasSubscribedRequest) {
            return (Boolean) PersistData.INSTANCE.get(KEY_BILLING_HAS_ACTIVE_SUBSCRIBE, false);
        }
        return false;
    }

    /* compiled from: QueryHasActiveSubscribedHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/glority/billing/handler/QueryHasActiveSubscribedHandler$Companion;", "", "<init>", "()V", "KEY_BILLING_HAS_ACTIVE_SUBSCRIBE", "", "getKEY_BILLING_HAS_ACTIVE_SUBSCRIBE", "()Ljava/lang/String;", "setKEY_BILLING_HAS_ACTIVE_SUBSCRIBE", "(Ljava/lang/String;)V", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getKEY_BILLING_HAS_ACTIVE_SUBSCRIBE() {
            return QueryHasActiveSubscribedHandler.KEY_BILLING_HAS_ACTIVE_SUBSCRIBE;
        }

        public final void setKEY_BILLING_HAS_ACTIVE_SUBSCRIBE(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            QueryHasActiveSubscribedHandler.KEY_BILLING_HAS_ACTIVE_SUBSCRIBE = str;
        }
    }
}
