package com.glority.android.picturexx.handler;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.payment.routers.BillingPageTypeConvertRequest;
import com.glority.android.picturexx.payment.routers.PurchaseUrlRouter;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingPageTypeConvertHandler.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\u0012R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/glority/android/picturexx/handler/BillingPageTypeConvertHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "abMap", "", "", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Integer;", "getAbMap", "ab", "(I)Ljava/lang/Integer;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class BillingPageTypeConvertHandler implements RouteHandler<Integer> {
    public static final int $stable = 8;
    private final Map<Integer, List<Integer>> abMap = MapsKt.mapOf(TuplesKt.to(508871, CollectionsKt.listOf((Object[]) new Integer[]{272671, 100052, 100051, 504891})), TuplesKt.to(508881, CollectionsKt.listOf((Object[]) new Integer[]{272671, 100052, 505061, 100051, 504891})));

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Integer> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return PurchaseUrlRouter.INSTANCE.getURL_PAGETYPE_CONVERT();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Integer execute(RouteRequest<Integer> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof BillingPageTypeConvertRequest) {
            return getAbMap(((BillingPageTypeConvertRequest) request).getPageType());
        }
        return null;
    }

    private final Integer getAbMap(int ab) {
        int intValue = ((Number) PersistData.INSTANCE.get(String.valueOf(ab), 0)).intValue();
        List<Integer> list = this.abMap.get(Integer.valueOf(ab));
        List<Integer> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        PersistData.INSTANCE.set(String.valueOf(ab), Integer.valueOf(intValue + 1));
        return list.get(intValue % list.size());
    }
}
