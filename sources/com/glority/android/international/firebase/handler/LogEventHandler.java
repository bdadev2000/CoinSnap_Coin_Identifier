package com.glority.android.international.firebase.handler;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.internal.view.SupportMenu;
import androidx.core.os.BundleKt;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.analysis.LogCheckParametersRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.analysis.LogEventSelfRequest;
import com.glority.android.core.route.analysis.UrlTracking;
import com.glority.android.core.route.debugtool.DebugLogEventRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogEventHandler.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/glority/android/international/firebase/handler/LogEventHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "Companion", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class LogEventHandler implements RouteHandler<Boolean> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<Boolean> isDebugMode$delegate = LazyKt.lazy(new Function0<Boolean>() { // from class: com.glority.android.international.firebase.handler.LogEventHandler$Companion$isDebugMode$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "stage") || Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "dev"));
        }
    });
    private static final Lazy<Boolean> enableLogEventChecking$delegate = LazyKt.lazy(new Function0<Boolean>() { // from class: com.glority.android.international.firebase.handler.LogEventHandler$Companion$enableLogEventChecking$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(!Intrinsics.areEqual(AppContext.INSTANCE.getConfig("DISABLE_LOG_EVENT_CHECKING"), "true"));
        }
    });

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> routeRequest) {
        return (Boolean) RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlTracking.INSTANCE.getURL_LOG_EVENT();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof LogEventRequest) {
            LogEventRequest logEventRequest = (LogEventRequest) request;
            String eventType = logEventRequest.getEventType();
            Companion companion = INSTANCE;
            if (companion.isDebugMode()) {
                new DebugLogEventRequest(eventType, logEventRequest.getBundle(), (!companion.getEnableLogEventChecking() || new LogCheckParametersRequest(logEventRequest.getEventType(), logEventRequest.getBundle()).toResult().booleanValue()) ? null : BundleKt.bundleOf(TuplesKt.to("background_color", Integer.valueOf(SupportMenu.CATEGORY_MASK)))).post();
            }
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_5, uuid));
            Bundle bundle = logEventRequest.getBundle();
            if (bundle != null) {
                bundleOf.putAll(bundle);
            }
            FirebaseAnalytics.getInstance(AppContext.INSTANCE.peekContext().getApplicationContext()).logEvent(eventType, bundleOf);
            new LogEventSelfRequest(eventType, uuid, logEventRequest.getBundle()).post();
        }
    }

    /* compiled from: LogEventHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/glority/android/international/firebase/handler/LogEventHandler$Companion;", "", "()V", "enableLogEventChecking", "", "getEnableLogEventChecking", "()Z", "enableLogEventChecking$delegate", "Lkotlin/Lazy;", "isDebugMode", "isDebugMode$delegate", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isDebugMode() {
            return ((Boolean) LogEventHandler.isDebugMode$delegate.getValue()).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getEnableLogEventChecking() {
            return ((Boolean) LogEventHandler.enableLogEventChecking$delegate.getValue()).booleanValue();
        }
    }
}
