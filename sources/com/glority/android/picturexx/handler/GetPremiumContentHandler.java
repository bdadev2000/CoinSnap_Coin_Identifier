package com.glority.android.picturexx.handler;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.picturexx.business.R;
import com.glority.base.routers.GetPremiumContentRequest;
import com.glority.base.routers.UrlRouter;
import com.glority.utils.data.StringUtils;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetPremiumContentHandler.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/handler/GetPremiumContentHandler;", "Lcom/glority/android/core/route/RouteHandler;", "Lcom/glority/base/routers/GetPremiumContentRequest$PremiumContent;", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class GetPremiumContentHandler implements RouteHandler<GetPremiumContentRequest.PremiumContent> {
    public static final int $stable = 0;

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<GetPremiumContentRequest.PremiumContent> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlRouter.INSTANCE.getURL_SETTING_VIP_CONTENT();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public GetPremiumContentRequest.PremiumContent execute(RouteRequest<GetPremiumContentRequest.PremiumContent> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new GetPremiumContentRequest.PremiumContent(CollectionsKt.mutableListOf(Integer.valueOf(R.drawable.icon_premium_identify1), Integer.valueOf(R.drawable.icon_premium_high_accuracy1), Integer.valueOf(R.drawable.icon_premium_rich_knowledge1), Integer.valueOf(R.drawable.icon_premium_save1), Integer.valueOf(R.drawable.icon_premium_ad1)), CollectionsKt.mutableListOf(Integer.valueOf(R.drawable.icon_premium_identify), Integer.valueOf(R.drawable.icon_premium_high_accuracy), Integer.valueOf(R.drawable.icon_premium_rich_knowledge), Integer.valueOf(R.drawable.icon_premium_save), Integer.valueOf(R.drawable.icon_premium_ad)), CollectionsKt.mutableListOf(StringUtils.getString(R.string.premium_center_text_feature_title_2), StringUtils.getString(R.string.premium_center_text_feature_title_3), StringUtils.getString(R.string.premium_center_text_feature_title_4), StringUtils.getString(R.string.premium_center_text_feature_title_5), StringUtils.getString(R.string.premium_center_text_feature_title_6)), CollectionsKt.mutableListOf(StringUtils.getString(R.string.premium_center_text_feature_content_2), StringUtils.getString(R.string.premium_center_text_feature_content_3), StringUtils.getString(R.string.premium_center_text_feature_content_4), StringUtils.getString(R.string.premium_center_text_feature_content_5), StringUtils.getString(R.string.premium_center_text_feature_content_6)));
    }
}
