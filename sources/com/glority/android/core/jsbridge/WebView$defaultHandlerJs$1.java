package com.glority.android.core.jsbridge;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.jsbridge.JsBridgeResult;
import com.glority.android.core.route.RouteRequest;
import com.google.gson.Gson;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: WebView.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/glority/android/core/jsbridge/WebView$defaultHandlerJs$1", "Lcom/glority/android/core/jsbridge/JsBridgeHandler;", "getName", "", "handler", "", "data", "function", "Lcom/glority/android/core/jsbridge/NativeCallback;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class WebView$defaultHandlerJs$1 implements JsBridgeHandler {
    final /* synthetic */ WebView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebView$defaultHandlerJs$1(WebView webView) {
        this.this$0 = webView;
    }

    @Override // com.glority.android.core.jsbridge.JsBridgeHandler
    public String getName() {
        return "route";
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    @Override // com.glority.android.core.jsbridge.JsBridgeHandler
    public void handler(String data, final NativeCallback function) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(function, "function");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            objectRef.element = ((JsBridgeRequest) new Gson().fromJson(Uri.parse(Uri.decode(data)).getQueryParameter("data"), JsBridgeRequest.class)).getCallbackId();
        } catch (Exception unused) {
            objectRef.element = "";
        }
        CompositeDisposable compositeDisposable = this.this$0.getCompositeDisposable();
        String decode = Uri.decode(data);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(data)");
        compositeDisposable.add(new RouteRequest(decode, null, null, 6, null).toObservable().observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.glority.android.core.jsbridge.WebView$defaultHandlerJs$1$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WebView$defaultHandlerJs$1.m7741handler$lambda0(Ref.ObjectRef.this, function, obj);
            }
        }, new Consumer() { // from class: com.glority.android.core.jsbridge.WebView$defaultHandlerJs$1$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WebView$defaultHandlerJs$1.m7742handler$lambda2(WebView$defaultHandlerJs$1.this, objectRef, function, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: handler$lambda-0, reason: not valid java name */
    public static final void m7741handler$lambda0(Ref.ObjectRef callbackId, NativeCallback function, Object obj) {
        Intrinsics.checkNotNullParameter(callbackId, "$callbackId");
        Intrinsics.checkNotNullParameter(function, "$function");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.glority.android.core.jsbridge.JsBridgeResult.JsBridgeAdapter<kotlin.Any>");
        }
        JsBridgeResult jsBridgeResult = new JsBridgeResult();
        jsBridgeResult.setCallbackId((String) callbackId.element);
        jsBridgeResult.setResult(((JsBridgeResult.JsBridgeAdapter) obj).getResult());
        String json = new Gson().toJson(jsBridgeResult);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(response)");
        function.onCallback(json);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: handler$lambda-2, reason: not valid java name */
    public static final void m7742handler$lambda2(WebView$defaultHandlerJs$1 this$0, Ref.ObjectRef callbackId, NativeCallback function, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callbackId, "$callbackId");
        Intrinsics.checkNotNullParameter(function, "$function");
        JsBridgeResult jsBridgeResult = new JsBridgeResult();
        jsBridgeResult.setCallbackId((String) callbackId.element);
        jsBridgeResult.setCode("-1");
        String json = new Gson().toJson(jsBridgeResult);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(response)");
        function.onCallback(json);
    }
}
