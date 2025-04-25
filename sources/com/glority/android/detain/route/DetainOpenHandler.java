package com.glority.android.detain.route;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.Router;
import com.glority.android.core.route.abtest.AbtestGetVariableDataRequest;
import com.glority.android.core.route.abtest.AbtestGetVariableTestIdRequest;
import com.glority.android.core.route.detain.DetainOpenRequest;
import com.glority.android.core.route.detain.UrlDetain;
import com.glority.android.detain.base.BaseDetainActivity;
import com.glority.base.utils.AbTestUtil;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DetainOpenHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003JP\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/glority/android/detain/route/DetainOpenHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "getUrl", "()Ljava/lang/String;", "openActivity", "", "requestId", "memo", "pageIndex", LogEventArguments.ARG_SKU, "pageFrom", "pageType", "groupData", "testId", "detainId", "post", "request", "Lcom/glority/android/core/route/RouteRequest;", "base-detain_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes13.dex */
public final class DetainOpenHandler implements RouteHandler<String> {
    @Override // com.glority.android.core.route.RouteHandler
    public String execute(RouteRequest<String> request) {
        Intrinsics.checkParameterIsNotNull(request, "request");
        return (String) RouteHandler.DefaultImpls.execute(this, request);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlDetain.INSTANCE.getURL_DETAIN_OPEN();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> request) {
        Intrinsics.checkParameterIsNotNull(request, "request");
        if (request instanceof DetainOpenRequest) {
            DetainOpenRequest detainOpenRequest = (DetainOpenRequest) request;
            String sku = detainOpenRequest.getSku();
            String pageFrom = detainOpenRequest.getPageFrom();
            String pageType = detainOpenRequest.getPageType();
            String result = new AbtestGetVariableDataRequest(AbTestUtil.PURCHASE_DETAIN_ANDROID, detainOpenRequest.getParamString()).toResult();
            String str = result != null ? result : "";
            String result2 = new AbtestGetVariableTestIdRequest(AbTestUtil.tag_conversion_page, detainOpenRequest.getParamString()).toResult();
            String str2 = result2 != null ? result2 : "";
            String paramString = detainOpenRequest.getParamString();
            int length = detainOpenRequest.getParamString().length() - 1;
            if (paramString == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = paramString.substring(0, length);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            openActivity(request.getId(), substring, String.valueOf((char) (StringsKt.last(detainOpenRequest.getParamString()) + 16)), sku, pageFrom, pageType, str, str2, detainOpenRequest.getParamString());
        }
    }

    private final void openActivity(String requestId, String memo, String pageIndex, String sku, String pageFrom, String pageType, String groupData, String testId, String detainId) {
        Class<?> cls;
        String config = AppContext.INSTANCE.getConfig("PURCHASE_DETAIN_DEFAULT_MEMO");
        char first = StringsKt.first(AppContext.INSTANCE.getConfig("PURCHASE_DETAIN_DEFAULT_MEMO_INDEX"));
        try {
            try {
                cls = Class.forName("com.glority.android.detain.memo" + memo + ".activity.Detain" + memo + pageIndex + "Activity");
            } catch (Exception unused) {
                return;
            }
        } catch (Exception unused2) {
            Router.onResponse(requestId, config + first);
            cls = Class.forName("com.glority.android.detain.memo" + config + ".activity.Detain" + config + ((char) (first + 16)) + "Activity");
        }
        Intrinsics.checkExpressionValueIsNotNull(cls, "try {\n            Class.…n\n            }\n        }");
        Intent intent = new Intent(AppContext.INSTANCE.peekContext(), cls);
        intent.putExtras(BundleKt.bundleOf(TuplesKt.to("arg_sku", sku), TuplesKt.to("arg_page_from", pageFrom), TuplesKt.to("arg_page_type", pageType), TuplesKt.to("arg_group", groupData), TuplesKt.to("arg_abtest_id", testId), TuplesKt.to(BaseDetainActivity.ARG_DETAIN_ID, detainId)));
        Context peekContext = AppContext.INSTANCE.peekContext();
        if (peekContext instanceof AppCompatActivity) {
            peekContext.startActivity(intent);
        } else {
            intent.addFlags(268435456);
            peekContext.startActivity(intent);
        }
    }
}
