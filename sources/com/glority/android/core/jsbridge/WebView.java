package com.glority.android.core.jsbridge;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import io.reactivex.disposables.CompositeDisposable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: WebView.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u000bJ\u0015\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020&H\u0000¢\u0006\u0002\b,J\u0006\u0010-\u001a\u00020*J\r\u0010.\u001a\u00020*H\u0000¢\u0006\u0002\b/J\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020&\u0018\u000101J\u0015\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\rH\u0000¢\u0006\u0002\b4J\b\u00105\u001a\u00020*H\u0002J\u0018\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020!H\u0002J\u0010\u00109\u001a\u00020*2\u0006\u0010+\u001a\u00020&H\u0002J\u0010\u0010:\u001a\u00020*2\b\u0010;\u001a\u0004\u0018\u00010\u0015J\u0010\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\rH\u0016J\u001a\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010!H\u0016J$\u0010<\u001a\u00020*2\b\u0010?\u001a\u0004\u0018\u00010\r2\u0006\u0010=\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010!H\u0016J\u000e\u0010@\u001a\u00020*2\u0006\u0010;\u001a\u00020\u0015J\u0016\u0010A\u001a\u00020*2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%J\u0010\u0010B\u001a\u00020*2\b\u0010?\u001a\u0004\u0018\u00010\rJ\r\u0010C\u001a\u00020DH\u0000¢\u0006\u0002\bER\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u0016\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/glority/android/core/jsbridge/WebView;", "Landroid/webkit/WebView;", "Lcom/glority/android/core/jsbridge/AndroidJsBridge;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "TAG", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setCompositeDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "defaultHandlerJs", "Lcom/glority/android/core/jsbridge/JsBridgeHandler;", "getDefaultHandlerJs$fwk_core_release", "()Lcom/glority/android/core/jsbridge/JsBridgeHandler;", "setDefaultHandlerJs$fwk_core_release", "(Lcom/glority/android/core/jsbridge/JsBridgeHandler;)V", "messageHandlers", "", "getMessageHandlers$fwk_core_release", "()Ljava/util/Map;", "setMessageHandlers$fwk_core_release", "(Ljava/util/Map;)V", "responseCallbacks", "Lcom/glority/android/core/jsbridge/NativeCallback;", "getResponseCallbacks$fwk_core_release", "setResponseCallbacks$fwk_core_release", "startupMessage", "", "Lcom/glority/android/core/jsbridge/Message;", "uniqueId", "", "dispatchMessage", "", "m", "dispatchMessage$fwk_core_release", "dispose", "flushMessageQueue", "flushMessageQueue$fwk_core_release", "getStartupMessage", "", "handlerReturnData", "url", "handlerReturnData$fwk_core_release", "init", "loadUrl", "jsUrl", "returnCallback", "queueMessage", "registerHandler", "handlerJs", "sendMessage", "data", "responseCallback", "handlerName", "setDefaultHandler", "setStartupMessage", "unregisterHandler", "validateHost", "", "validateHost$fwk_core_release", "Companion", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class WebView extends android.webkit.WebView implements AndroidJsBridge {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String toLoadJs = "AndroidJsBridge.js";
    private final String TAG;
    private CompositeDisposable compositeDisposable;
    private JsBridgeHandler defaultHandlerJs;
    private Map<String, JsBridgeHandler> messageHandlers;
    private Map<String, NativeCallback> responseCallbacks;
    private List<Message> startupMessage;
    private long uniqueId;

    public final CompositeDisposable getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void setCompositeDisposable(CompositeDisposable compositeDisposable) {
        Intrinsics.checkNotNullParameter(compositeDisposable, "<set-?>");
        this.compositeDisposable = compositeDisposable;
    }

    public final Map<String, NativeCallback> getResponseCallbacks$fwk_core_release() {
        return this.responseCallbacks;
    }

    public final void setResponseCallbacks$fwk_core_release(Map<String, NativeCallback> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.responseCallbacks = map;
    }

    public final Map<String, JsBridgeHandler> getMessageHandlers$fwk_core_release() {
        return this.messageHandlers;
    }

    public final void setMessageHandlers$fwk_core_release(Map<String, JsBridgeHandler> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.messageHandlers = map;
    }

    /* renamed from: getDefaultHandlerJs$fwk_core_release, reason: from getter */
    public final JsBridgeHandler getDefaultHandlerJs() {
        return this.defaultHandlerJs;
    }

    public final void setDefaultHandlerJs$fwk_core_release(JsBridgeHandler jsBridgeHandler) {
        Intrinsics.checkNotNullParameter(jsBridgeHandler, "<set-?>");
        this.defaultHandlerJs = jsBridgeHandler;
    }

    public final List<Message> getStartupMessage() {
        return this.startupMessage;
    }

    public final void setStartupMessage(List<Message> startupMessage) {
        this.startupMessage = startupMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.TAG = "WebView";
        this.compositeDisposable = new CompositeDisposable();
        this.responseCallbacks = new HashMap();
        this.messageHandlers = new HashMap();
        this.defaultHandlerJs = new WebView$defaultHandlerJs$1(this);
        this.startupMessage = new ArrayList();
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.TAG = "WebView";
        this.compositeDisposable = new CompositeDisposable();
        this.responseCallbacks = new HashMap();
        this.messageHandlers = new HashMap();
        this.defaultHandlerJs = new WebView$defaultHandlerJs$1(this);
        this.startupMessage = new ArrayList();
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = "WebView";
        this.compositeDisposable = new CompositeDisposable();
        this.responseCallbacks = new HashMap();
        this.messageHandlers = new HashMap();
        this.defaultHandlerJs = new WebView$defaultHandlerJs$1(this);
        this.startupMessage = new ArrayList();
        init();
    }

    public final void setDefaultHandler(JsBridgeHandler handlerJs) {
        Intrinsics.checkNotNullParameter(handlerJs, "handlerJs");
        this.defaultHandlerJs = handlerJs;
    }

    private final void init() {
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        android.webkit.WebView.setWebContentsDebuggingEnabled(AppContext.INSTANCE.isDebugMode());
    }

    public final void dispose() {
        this.compositeDisposable.dispose();
    }

    public final boolean validateHost$fwk_core_release() {
        if (AppContext.INSTANCE.isDebugMode()) {
            return true;
        }
        try {
            String host = Uri.parse(getUrl()).getHost();
            if (StringsKt.equals$default(host, "glority.cn", false, 2, null)) {
                return true;
            }
            if (host != null) {
                if (StringsKt.endsWith$default(host, ".glority.cn", false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void handlerReturnData$fwk_core_release(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (validateHost$fwk_core_release()) {
            String functionFromReturnUrl = BridgeUtil.INSTANCE.getFunctionFromReturnUrl(url);
            NativeCallback nativeCallback = this.responseCallbacks.get(functionFromReturnUrl);
            String dataFromReturnUrl = BridgeUtil.INSTANCE.getDataFromReturnUrl(url);
            if (nativeCallback != null) {
                nativeCallback.onCallback(dataFromReturnUrl);
                Map<String, NativeCallback> map = this.responseCallbacks;
                if (map == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
                TypeIntrinsics.asMutableMap(map).remove(functionFromReturnUrl);
            }
        }
    }

    @Override // com.glority.android.core.jsbridge.AndroidJsBridge
    public void sendMessage(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        sendMessage(data, null);
    }

    @Override // com.glority.android.core.jsbridge.AndroidJsBridge
    public void sendMessage(String data, NativeCallback responseCallback) {
        Intrinsics.checkNotNullParameter(data, "data");
        sendMessage(null, data, responseCallback);
    }

    @Override // com.glority.android.core.jsbridge.AndroidJsBridge
    public void sendMessage(String handlerName, String data, NativeCallback responseCallback) {
        Intrinsics.checkNotNullParameter(data, "data");
        Message message = new Message();
        if (!TextUtils.isEmpty(data)) {
            message.setData(data);
        }
        if (responseCallback != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String cALLBACK_ID_FORMAT$fwk_core_release = BridgeUtil.INSTANCE.getCALLBACK_ID_FORMAT$fwk_core_release();
            StringBuilder sb = new StringBuilder();
            long j = this.uniqueId + 1;
            this.uniqueId = j;
            String format = String.format(cALLBACK_ID_FORMAT$fwk_core_release, Arrays.copyOf(new Object[]{sb.append(j).append(BridgeUtil.INSTANCE.getUNDERLINE_STR$fwk_core_release()).append(SystemClock.currentThreadTimeMillis()).toString()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            this.responseCallbacks.put(format, responseCallback);
            message.setCallbackId(format);
        }
        if (!TextUtils.isEmpty(handlerName)) {
            message.setHandlerName(handlerName);
        }
        queueMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queueMessage(Message m) {
        List<Message> list = this.startupMessage;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            list.add(m);
        } else {
            dispatchMessage$fwk_core_release(m);
        }
    }

    public final void dispatchMessage$fwk_core_release(Message m) {
        Intrinsics.checkNotNullParameter(m, "m");
        String json = m.toJson();
        Intrinsics.checkNotNull(json);
        String replace = new Regex("(?<=[^\\\\])(')").replace(new Regex("(?<=[^\\\\])(\")").replace(new Regex("(\\\\)([^utrn])").replace(json, "\\\\\\\\$1$2"), "\\\\\""), "\\\\'");
        Regex regex = new Regex("%7B");
        String encode = URLEncoder.encode("%7B");
        Intrinsics.checkNotNullExpressionValue(encode, "encode(\"%7B\")");
        String replace2 = regex.replace(replace, encode);
        Regex regex2 = new Regex("%7D");
        String encode2 = URLEncoder.encode("%7D");
        Intrinsics.checkNotNullExpressionValue(encode2, "encode(\"%7D\")");
        String replace3 = regex2.replace(replace2, encode2);
        Regex regex3 = new Regex("%22");
        String encode3 = URLEncoder.encode("%22");
        Intrinsics.checkNotNullExpressionValue(encode3, "encode(\"%22\")");
        String replace4 = regex3.replace(replace3, encode3);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(BridgeUtil.INSTANCE.getJS_HANDLE_MESSAGE_FROM_JAVA$fwk_core_release(), Arrays.copyOf(new Object[]{replace4}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            loadUrl(format);
        }
    }

    public final void flushMessageQueue$fwk_core_release() {
        if (validateHost$fwk_core_release() && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            loadUrl(BridgeUtil.INSTANCE.getJS_FETCH_QUEUE_FROM_JAVA$fwk_core_release(), new NativeCallback() { // from class: com.glority.android.core.jsbridge.WebView$flushMessageQueue$1
                @Override // com.glority.android.core.jsbridge.NativeCallback
                public void onCallback(String data) {
                    int size;
                    NativeCallback nativeCallback;
                    Intrinsics.checkNotNullParameter(data, "data");
                    try {
                        List<Message> arrayList = Message.INSTANCE.toArrayList(data);
                        if (arrayList.isEmpty() || arrayList.size() - 1 < 0) {
                            return;
                        }
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            Message message = arrayList.get(i);
                            String responseId = message.getResponseId();
                            if (!TextUtils.isEmpty(responseId)) {
                                NativeCallback nativeCallback2 = WebView.this.getResponseCallbacks$fwk_core_release().get(responseId);
                                String responseData = message.getResponseData();
                                if (nativeCallback2 != null) {
                                    nativeCallback2.onCallback(responseData);
                                }
                                Map<String, NativeCallback> responseCallbacks$fwk_core_release = WebView.this.getResponseCallbacks$fwk_core_release();
                                if (responseCallbacks$fwk_core_release == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                                }
                                TypeIntrinsics.asMutableMap(responseCallbacks$fwk_core_release).remove(responseId);
                            } else {
                                final String callbackId = message.getCallbackId();
                                if (!TextUtils.isEmpty(callbackId)) {
                                    final WebView webView = WebView.this;
                                    nativeCallback = new NativeCallback() { // from class: com.glority.android.core.jsbridge.WebView$flushMessageQueue$1$onCallback$1
                                        @Override // com.glority.android.core.jsbridge.NativeCallback
                                        public void onCallback(String data2) {
                                            Intrinsics.checkNotNullParameter(data2, "data");
                                            Message message2 = new Message();
                                            message2.setResponseId(callbackId);
                                            message2.setResponseData(data2);
                                            webView.queueMessage(message2);
                                        }
                                    };
                                } else {
                                    nativeCallback = new NativeCallback() { // from class: com.glority.android.core.jsbridge.WebView$flushMessageQueue$1$onCallback$2
                                        @Override // com.glority.android.core.jsbridge.NativeCallback
                                        public void onCallback(String data2) {
                                            Intrinsics.checkNotNullParameter(data2, "data");
                                            LogUtils.i(data2);
                                        }
                                    };
                                }
                                JsBridgeHandler defaultHandlerJs = !TextUtils.isEmpty(message.getHandlerName()) ? WebView.this.getMessageHandlers$fwk_core_release().get(message.getHandlerName()) : WebView.this.getDefaultHandlerJs();
                                if (defaultHandlerJs != null) {
                                    String data2 = message.getData();
                                    if (data2 == null) {
                                        data2 = "";
                                    }
                                    defaultHandlerJs.handler(data2, nativeCallback);
                                }
                            }
                            if (i2 > size) {
                                return;
                            } else {
                                i = i2;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private final void loadUrl(String jsUrl, NativeCallback returnCallback) {
        loadUrl(jsUrl);
        this.responseCallbacks.put(BridgeUtil.INSTANCE.parseFunctionName(jsUrl), returnCallback);
    }

    public final void registerHandler(JsBridgeHandler handlerJs) {
        if (handlerJs != null) {
            this.messageHandlers.put(handlerJs.getName(), handlerJs);
        }
    }

    public final void unregisterHandler(String handlerName) {
        if (handlerName != null) {
            this.messageHandlers.remove(handlerName);
        }
    }

    /* compiled from: WebView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/core/jsbridge/WebView$Companion;", "", "()V", "toLoadJs", "", "getToLoadJs", "()Ljava/lang/String;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getToLoadJs() {
            return WebView.toLoadJs;
        }
    }
}
