package com.glority.android.core.route;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.xx.constants.LogEvents;
import com.glority.utils.stability.LogUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.gson.Gson;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RouteRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 A*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001AB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\b\u0010\u001d\u001a\u00020\u001eH\u0007J!\u0010\u001f\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0001\u0010\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00010!¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\u0004J\b\u0010%\u001a\u00020\u001eH\u0002J\u0006\u0010&\u001a\u00020\u001eJ\u0012\u0010'\u001a\u00020\u001e2\n\u0010(\u001a\u00060)j\u0002`*J\u0013\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u0004H\u0002J\b\u0010/\u001a\u000200H\u0007J\u0010\u00101\u001a\u00020\u001e2\b\u00102\u001a\u0004\u0018\u00010\u0002J\u0010\u00103\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J&\u00104\u001a\u0002002\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000062\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020806H\u0007J.\u00109\u001a\u0002002\u0006\u0010\u0017\u001a\u00020\u00162\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000062\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020806H\u0002J\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;J\u000b\u0010<\u001a\u00028\u0000¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00028\u00002\u0006\u0010?\u001a\u00028\u0000¢\u0006\u0002\u0010@R.\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012¨\u0006B"}, d2 = {"Lcom/glority/android/core/route/RouteRequest;", ExifInterface.GPS_DIRECTION_TRUE, "", "urlOrPath", "", "context", "Landroid/content/Context;", "referenceId", "(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V", "<set-?>", "Ljava/lang/ref/WeakReference;", "contextRef", "getContextRef", "()Ljava/lang/ref/WeakReference;", "emitter", "Lio/reactivex/ObservableEmitter;", "id", "getId", "()Ljava/lang/String;", "getReferenceId", "setReferenceId", "(Ljava/lang/String;)V", "", "requireResponse", "getRequireResponse", "()Z", "url", "urlWithoutData", "getUrlWithoutData", "execute", "", "getData", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getDataJson", "getUrl", "initId", "onComplete", "onException", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onResult", LogEvents.result, "(Ljava/lang/Object;)V", "parseData", "post", "Lio/reactivex/disposables/Disposable;", "setData", "data", "setUrl", "subscribe", "onNext", "Lio/reactivex/functions/Consumer;", "onError", "", "subscribeImpl", "toObservable", "Lio/reactivex/Observable;", "toResult", "()Ljava/lang/Object;", "toResultOrDefault", "default", "(Ljava/lang/Object;)Ljava/lang/Object;", "Companion", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public class RouteRequest<T> {
    private static final String DATA = "data";
    private static final String QUESTION = "?";
    private static final String TAG = "RouteRequest";
    private transient WeakReference<Context> contextRef;
    private transient ObservableEmitter<T> emitter;
    private transient String id;
    private transient String referenceId;
    private transient boolean requireResponse;
    private String url;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RouteRequest(String urlOrPath) {
        this(urlOrPath, null, null, 6, null);
        Intrinsics.checkNotNullParameter(urlOrPath, "urlOrPath");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RouteRequest(String urlOrPath, Context context) {
        this(urlOrPath, context, null, 4, null);
        Intrinsics.checkNotNullParameter(urlOrPath, "urlOrPath");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: post$lambda-5, reason: not valid java name */
    public static final void m7746post$lambda5(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: subscribe$lambda-6, reason: not valid java name */
    public static final void m7747subscribe$lambda6(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: subscribeImpl$lambda-7, reason: not valid java name */
    public static final void m7748subscribeImpl$lambda7(Throwable th) {
    }

    public final Disposable subscribe(Consumer<T> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribe$default(this, onNext, null, 2, null);
    }

    public final String getId() {
        return this.id;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final void setReferenceId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.referenceId = str;
    }

    public final WeakReference<Context> getContextRef() {
        return this.contextRef;
    }

    public final boolean getRequireResponse() {
        return this.requireResponse;
    }

    public RouteRequest(String urlOrPath, Context context, String str) {
        Intrinsics.checkNotNullParameter(urlOrPath, "urlOrPath");
        this.id = "";
        this.referenceId = "";
        this.url = "";
        initId();
        setUrl(urlOrPath);
        if (context != null) {
            this.contextRef = new WeakReference<>(context == null ? AppContext.INSTANCE.peekContext() : context);
        }
        if (str == null) {
            return;
        }
        setReferenceId(str);
    }

    public /* synthetic */ RouteRequest(String str, Context context, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : context, (i & 4) != 0 ? null : str2);
    }

    public final String getUrlWithoutData() {
        Uri parse = Uri.parse(this.url);
        if (StringsKt.startsWith$default(AppContext.INSTANCE.getScheme(), String.valueOf(parse.getScheme()), false, 2, (Object) null)) {
            return ((Object) parse.getScheme()) + "://" + ((Object) parse.getHost()) + ((Object) parse.getPath());
        }
        return Intrinsics.stringPlus(parse.getScheme(), "://");
    }

    private final void initId() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.id = uuid;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String urlOrPath) {
        this.url = urlOrPath == null ? "" : urlOrPath;
        if (Pattern.compile("^[a-z0-9A-Z]+://[\\s\\S]+").matcher(this.url).matches()) {
            return;
        }
        String scheme = AppContext.INSTANCE.getScheme();
        if (StringsKt.startsWith$default(this.url, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
            String str = this.url;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            urlOrPath = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(urlOrPath, "(this as java.lang.String).substring(startIndex)");
        }
        this.url = Intrinsics.stringPlus(scheme, urlOrPath);
    }

    private final String parseData() {
        if (StringsKt.indexOf$default((CharSequence) this.url, QUESTION, 0, false, 6, (Object) null) < 0) {
            return "{}";
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.url, "data=", 0, false, 6, (Object) null);
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) this.url, "}", 0, false, 6, (Object) null);
        if (indexOf$default < 0 || lastIndexOf$default < 0) {
            return "{}";
        }
        String str = this.url;
        int i = indexOf$default + 5;
        int i2 = lastIndexOf$default + 1;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final void setData(Object data) {
        String json;
        if (data != null) {
            try {
                json = new Gson().toJson(data);
                Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(data)");
            } catch (Exception e) {
                LogUtils.e(e, TAG);
            }
            this.url = getUrlWithoutData() + "?data=" + json;
        }
        json = "";
        this.url = getUrlWithoutData() + "?data=" + json;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T getData(Class<T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            return Intrinsics.areEqual(getClass(), type) ? this : (T) new Gson().fromJson(getDataJson(), (Class) type);
        } catch (Exception e) {
            LogUtils.e(e, TAG);
            return null;
        }
    }

    public final String getDataJson() {
        try {
            String parseData = parseData();
            if (parseData.length() > 0) {
                return parseData;
            }
            String json = new Gson().toJson(this);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
            return json;
        } catch (Exception e) {
            LogUtils.e(e, TAG);
            return "{}";
        }
    }

    public final void onResult(T result) {
        ObservableEmitter<T> observableEmitter = this.emitter;
        if (observableEmitter != null) {
            Intrinsics.checkNotNull(observableEmitter);
            if (observableEmitter.isDisposed()) {
                return;
            }
            try {
                ObservableEmitter<T> observableEmitter2 = this.emitter;
                Intrinsics.checkNotNull(observableEmitter2);
                observableEmitter2.onNext(result);
            } catch (Exception e) {
                LogUtils.e(e, TAG);
            }
            ObservableEmitter<T> observableEmitter3 = this.emitter;
            Intrinsics.checkNotNull(observableEmitter3);
            observableEmitter3.onComplete();
        }
    }

    public final void onException(Exception ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        ObservableEmitter<T> observableEmitter = this.emitter;
        if (observableEmitter != null) {
            Intrinsics.checkNotNull(observableEmitter);
            if (observableEmitter.isDisposed()) {
                return;
            }
            try {
                ObservableEmitter<T> observableEmitter2 = this.emitter;
                Intrinsics.checkNotNull(observableEmitter2);
                observableEmitter2.onError(ex);
            } catch (Exception e) {
                LogUtils.e(e, TAG);
            }
            ObservableEmitter<T> observableEmitter3 = this.emitter;
            Intrinsics.checkNotNull(observableEmitter3);
            observableEmitter3.onComplete();
        }
    }

    public final void onComplete() {
        ObservableEmitter<T> observableEmitter;
        ObservableEmitter<T> observableEmitter2 = this.emitter;
        if ((observableEmitter2 != null && observableEmitter2.isDisposed()) || (observableEmitter = this.emitter) == null) {
            return;
        }
        observableEmitter.onComplete();
    }

    public final Observable<T> toObservable() {
        Observable<T> create = Observable.create(new ObservableOnSubscribe() { // from class: com.glority.android.core.route.RouteRequest$$ExternalSyntheticLambda4
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                RouteRequest.m7750toObservable$lambda3(RouteRequest.this, observableEmitter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(create, "create { e: ObservableEm…s@RouteRequest)\n        }");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toObservable$lambda-3, reason: not valid java name */
    public static final void m7750toObservable$lambda3(RouteRequest this$0, ObservableEmitter e) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e, "e");
        this$0.emitter = e;
        Router.postRequest(this$0);
    }

    public final T toResult() {
        return (T) Router.executeRequest(this);
    }

    public final T toResultOrDefault(T r2) {
        T result = toResult();
        return result == null ? r2 : result;
    }

    public final void execute() {
        Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread());
        Router.executeAtOnce(this);
    }

    @NotProguard
    public final Disposable post() {
        return subscribeImpl$default(this, false, new Consumer() { // from class: com.glority.android.core.route.RouteRequest$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RouteRequest.m7746post$lambda5(obj);
            }
        }, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribe$default(RouteRequest routeRequest, Consumer consumer, Consumer consumer2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
        }
        if ((i & 2) != 0) {
            consumer2 = new Consumer() { // from class: com.glority.android.core.route.RouteRequest$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    RouteRequest.m7747subscribe$lambda6((Throwable) obj2);
                }
            };
        }
        return routeRequest.subscribe(consumer, consumer2);
    }

    public final Disposable subscribe(Consumer<T> onNext, Consumer<Throwable> onError) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return subscribeImpl(true, onNext, onError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Disposable subscribeImpl$default(RouteRequest routeRequest, boolean z, Consumer consumer, Consumer consumer2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeImpl");
        }
        if ((i & 4) != 0) {
            consumer2 = new Consumer() { // from class: com.glority.android.core.route.RouteRequest$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    RouteRequest.m7748subscribeImpl$lambda7((Throwable) obj2);
                }
            };
        }
        return routeRequest.subscribeImpl(z, consumer, consumer2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Disposable subscribeImpl(boolean requireResponse, Consumer<T> onNext, Consumer<Throwable> onError) {
        this.requireResponse = requireResponse;
        Disposable subscribe = toObservable().subscribeOn(AndroidSchedulers.mainThread()).doFinally(new Action() { // from class: com.glority.android.core.route.RouteRequest$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Action
            public final void run() {
                RouteRequest.m7749subscribeImpl$lambda8(RouteRequest.this);
            }
        }).subscribe(onNext, onError);
        Intrinsics.checkNotNullExpressionValue(subscribe, "toObservable()\n         …ubscribe(onNext, onError)");
        return subscribe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: subscribeImpl$lambda-8, reason: not valid java name */
    public static final void m7749subscribeImpl$lambda8(RouteRequest this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Router.removeRequest(this$0.getId());
    }
}
