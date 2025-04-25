package com.glority.android.guide.route;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.guide.ConvertPageOpenExtraRequest;
import com.glority.android.core.route.guide.UrlGuide;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ConvertPageOpenWithExtraHandler.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003JH\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/glority/android/guide/route/ConvertPageOpenWithExtraHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "getUrl", "()Ljava/lang/String;", "openActivity", "", "requestId", "memo", "pageIndex", "pageFrom", "pageType", "", "requestCode", "group", "extraParam", "post", "request", "Lcom/glority/android/core/route/RouteRequest;", "Companion", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ConvertPageOpenWithExtraHandler implements RouteHandler<String> {
    public static final String ARG_PAGE_EXTRA_PARAM = "arg_page_extra_param";
    public static final String ARG_PAGE_FROM = "arg_page_from";
    public static final String ARG_PAGE_GROUP = "arg_page_group";
    public static final String ARG_PAGE_TYPE = "arg_page_type";
    public static final String REQUEST_ID = "REQUEST_ID";

    @Override // com.glority.android.core.route.RouteHandler
    public String execute(RouteRequest<String> routeRequest) {
        return (String) RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlGuide.INSTANCE.getURL_OPEN_CONVERT_PAGE_WITH_EXTRA();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> request) {
        ConvertPageOpenExtraRequest convertPageOpenExtraRequest;
        String pageName;
        String pageFrom;
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(request instanceof ConvertPageOpenExtraRequest) || (pageName = (convertPageOpenExtraRequest = (ConvertPageOpenExtraRequest) request).getPageName()) == null || (pageFrom = convertPageOpenExtraRequest.getPageFrom()) == null) {
            return;
        }
        String extraParam = convertPageOpenExtraRequest.getExtraParam();
        String gloup = convertPageOpenExtraRequest.getGloup();
        if (gloup == null) {
            gloup = "";
        }
        String str = gloup;
        if (pageName.length() < 5) {
            return;
        }
        String substring = pageName.substring(0, pageName.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        openActivity(request.getId(), substring, String.valueOf((char) (StringsKt.last(pageName) + 16)), pageFrom, convertPageOpenExtraRequest.getPageType(), convertPageOpenExtraRequest.getRequestCode(), str, extraParam);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void openActivity(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, int r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.guide.route.ConvertPageOpenWithExtraHandler.openActivity(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String):void");
    }
}
