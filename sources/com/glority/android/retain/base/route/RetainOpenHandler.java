package com.glority.android.retain.base.route;

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
import com.glority.android.core.route.retain.RetainOpenRequest;
import com.glority.android.core.route.retain.UrlRetain;
import com.glority.android.retain.base.activity.BaseRetainActivity;
import com.glority.base.utils.AbTestUtil;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RetainOpenHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003JX\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0016H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/glority/android/retain/base/route/RetainOpenHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "getUrl", "()Ljava/lang/String;", "openActivity", "", "requestId", "memo", "pageIndex", LogEventArguments.ARG_SKU, "pageFrom", "pageType", "groupData", "testId", "retainId", "requestCode", "", "post", "request", "Lcom/glority/android/core/route/RouteRequest;", "base-retain_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class RetainOpenHandler implements RouteHandler<String> {
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
        return UrlRetain.INSTANCE.getURL_RETAIN_OPEN();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<String> request) {
        Intrinsics.checkParameterIsNotNull(request, "request");
        if (request instanceof RetainOpenRequest) {
            RetainOpenRequest retainOpenRequest = (RetainOpenRequest) request;
            String sku = retainOpenRequest.getSku();
            String pageFrom = retainOpenRequest.getPageFrom();
            String pageType = retainOpenRequest.getPageType();
            String result = new AbtestGetVariableDataRequest(AbTestUtil.COVERT_RETAIN_ANDROID, retainOpenRequest.getParamString()).toResult();
            String str = result != null ? result : "";
            String result2 = new AbtestGetVariableTestIdRequest(AbTestUtil.tag_conversion_page, retainOpenRequest.getParamString()).toResult();
            String str2 = result2 != null ? result2 : "";
            String paramString = retainOpenRequest.getParamString();
            int length = retainOpenRequest.getParamString().length() - 1;
            if (paramString == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = paramString.substring(0, length);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            openActivity(request.getId(), substring, String.valueOf((char) (StringsKt.last(retainOpenRequest.getParamString()) + 16)), sku, pageFrom, pageType, str, str2, retainOpenRequest.getParamString(), retainOpenRequest.getRequestCode());
        }
    }

    private final void openActivity(String requestId, String memo, String pageIndex, String sku, String pageFrom, String pageType, String groupData, String testId, String retainId, int requestCode) {
        Class<?> cls;
        boolean z;
        String config = AppContext.INSTANCE.getConfig("CONVERT_RETAIN_DEFAULT_MEMO");
        char first = StringsKt.first(AppContext.INSTANCE.getConfig("CONVERT_RETAIN_DEFAULT_MEMO_INDEX"));
        try {
            try {
                cls = Class.forName("com.glority.android.retain.memo" + memo + ".activity.Retain" + memo + pageIndex + "Activity");
                z = false;
            } catch (Exception unused) {
                return;
            }
        } catch (Exception unused2) {
            Router.onResponse(requestId, config + first);
            cls = Class.forName("com.glority.android.retain.memo" + config + ".activity.Retain" + config + ((char) (first + 16)) + "Activity");
            z = true;
        }
        Intrinsics.checkExpressionValueIsNotNull(cls, "try {\n            Class.…n\n            }\n        }");
        Intent intent = new Intent(AppContext.INSTANCE.peekContext(), cls);
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.to("arg_sku", sku);
        pairArr[1] = TuplesKt.to("arg_page_from", pageFrom);
        pairArr[2] = TuplesKt.to("arg_page_type", pageType);
        pairArr[3] = TuplesKt.to("arg_group", groupData);
        pairArr[4] = TuplesKt.to("arg_abtest_id", testId);
        pairArr[5] = TuplesKt.to(BaseRetainActivity.ARG_RETAIN_ID, z ? config + first : retainId);
        intent.putExtras(BundleKt.bundleOf(pairArr));
        Context peekContext = AppContext.INSTANCE.peekContext();
        if (peekContext instanceof AppCompatActivity) {
            ((AppCompatActivity) peekContext).startActivityForResult(intent, requestCode);
        } else {
            intent.addFlags(268435456);
            peekContext.startActivity(intent);
        }
    }
}
