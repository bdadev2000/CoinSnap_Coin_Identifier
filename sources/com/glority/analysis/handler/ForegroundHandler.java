package com.glority.analysis.handler;

import androidx.core.os.BundleKt;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.analysis.utils.SessionUtil;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.utils.ForegroundRequest;
import com.glority.android.core.route.utils.UrlUtils;
import com.glority.utils.stability.LogUtils;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ForegroundHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/glority/analysis/handler/ForegroundHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class ForegroundHandler implements RouteHandler<Boolean> {
    public static final String ANALYTICS_FOREGROUND = "analytics_foreground";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (Boolean) RouteHandler.DefaultImpls.execute(this, request);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlUtils.INSTANCE.getURL_FOREGROUND();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof ForegroundRequest) {
            SessionUtil.INSTANCE.onAppSessionStart();
            try {
                String activityFullName = AppContext.INSTANCE.peekContext().getClass().getName();
                Intrinsics.checkNotNullExpressionValue(activityFullName, "activityFullName");
                int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) activityFullName, InstructionFileId.DOT, 0, false, 6, (Object) null) + 1;
                if (activityFullName == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String substring = activityFullName.substring(lastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                new LogEventRequest(ANALYTICS_FOREGROUND, BundleKt.bundleOf(TuplesKt.to("name", substring))).post();
            } catch (Exception unused) {
                LogUtils.e("send analytics_foreground error ");
            }
        }
    }
}
