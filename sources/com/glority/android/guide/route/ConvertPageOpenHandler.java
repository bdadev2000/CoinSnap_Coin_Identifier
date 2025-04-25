package com.glority.android.guide.route;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.Router;
import com.glority.android.core.route.guide.ConvertPageOpenRequest;
import com.glority.android.core.route.guide.UrlGuide;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ConvertPageOpenHandler.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0003J8\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/glority/android/guide/route/ConvertPageOpenHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "getUrl", "()Ljava/lang/String;", "openActivity", "", "requestId", "memo", "pageIndex", "pageFrom", "pageType", "", "requestCode", "post", "request", "Lcom/glority/android/core/route/RouteRequest;", "Companion", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ConvertPageOpenHandler implements RouteHandler<String> {
    public static final String ARG_PAGE_FROM = "arg_page_from";
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
        return UrlGuide.INSTANCE.getURL_OPEN_CONVERT_PAGE();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> request) {
        ConvertPageOpenRequest convertPageOpenRequest;
        String pageName;
        String pageFrom;
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(request instanceof ConvertPageOpenRequest) || (pageName = (convertPageOpenRequest = (ConvertPageOpenRequest) request).getPageName()) == null || (pageFrom = convertPageOpenRequest.getPageFrom()) == null || pageName.length() < 5) {
            return;
        }
        String substring = pageName.substring(0, pageName.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        openActivity(request.getId(), substring, String.valueOf((char) (StringsKt.last(pageName) + 16)), pageFrom, convertPageOpenRequest.getPageType(), convertPageOpenRequest.getRequestCode());
    }

    private final void openActivity(String requestId, String memo, String pageIndex, String pageFrom, int pageType, int requestCode) {
        Class<?> cls;
        String config = AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO");
        char first = StringsKt.first(AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO_INDEX"));
        try {
            try {
                cls = Class.forName("com.glority.android.guide.memo" + memo + ".activity.Vip" + memo + pageIndex + "Activity");
                Intrinsics.checkNotNullExpressionValue(cls, "{\n            Class.forN…ndex}Activity\")\n        }");
            } catch (Exception unused) {
                Router.onResponse(requestId, Intrinsics.stringPlus(config, Character.valueOf(first)));
                cls = Class.forName("com.glority.android.guide.memo" + config + ".activity.Vip" + config + ((char) (first + 16)) + "Activity");
                Intrinsics.checkNotNullExpressionValue(cls, "{\n            try {\n    …n\n            }\n        }");
            }
            Intent intent = new Intent(AppContext.INSTANCE.peekContext(), cls);
            intent.putExtras(BundleKt.bundleOf(TuplesKt.to("arg_page_from", pageFrom), TuplesKt.to("arg_page_type", Integer.valueOf(pageType))));
            intent.putExtra("REQUEST_ID", requestId);
            Context peekContext = AppContext.INSTANCE.peekContext();
            if (peekContext instanceof AppCompatActivity) {
                ((AppCompatActivity) peekContext).startActivityForResult(intent, requestCode);
            } else {
                intent.addFlags(268435456);
                peekContext.startActivity(intent);
            }
        } catch (Exception unused2) {
        }
    }
}
