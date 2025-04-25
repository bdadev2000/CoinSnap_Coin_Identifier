package com.glority.analysis.handler;

import com.glority.analysis.bean.TrackingMessageBean;
import com.glority.analysis.definitions.TimingType;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.analysis.LogEventSelfRequest;
import com.glority.android.core.route.analysis.UrlTracking;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import io.reactivex.Observable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogEventSelfHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/glority/analysis/handler/LogEventSelfHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class LogEventSelfHandler implements RouteHandler<Boolean> {
    private static final int ANDROID_DEVICE_TYPE = 0;
    public static final String TAG = "LogEventSelfHandler";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ExecutorService logeEventThreadPool = Executors.newFixedThreadPool(1);
    private static final ExecutorService logeEventSendThreadPool = Executors.newFixedThreadPool(1);

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
        return UrlTracking.INSTANCE.getURL_LOG_EVENT_SELF();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof LogEventSelfRequest) {
            LogEventSelfRequest logEventSelfRequest = (LogEventSelfRequest) request;
            String eventType = logEventSelfRequest.getEventType();
            if (EventChecker.INSTANCE.isInBackListEvents(logEventSelfRequest.getEventType()) || Intrinsics.areEqual(logEventSelfRequest.getEventType(), "http_request")) {
                return;
            }
            if ((Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "stage") || Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "dev")) && !EventChecker.INSTANCE.checkParamValue(logEventSelfRequest.getBundle())) {
                return;
            }
            INSTANCE.eventSaveLocal(eventType, logEventSelfRequest);
        }
    }

    /* compiled from: LogEventSelfHandler.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/glority/analysis/handler/LogEventSelfHandler$Companion;", "", "()V", "ANDROID_DEVICE_TYPE", "", "TAG", "", "logeEventSendThreadPool", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "logeEventThreadPool", "eventSaveLocal", "", "eventName", "request", "Lcom/glority/android/core/route/analysis/LogEventSelfRequest;", "saveEventAndSend", "trackingMessageBean", "Lcom/glority/analysis/bean/TrackingMessageBean;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void eventSaveLocal(String eventName, LogEventSelfRequest request) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(request, "request");
            LogEventSelfHandler.logeEventThreadPool.execute(new LogEventSelfHandler$Companion$eventSaveLocal$1(request, eventName));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void saveEventAndSend(final String eventName, final TrackingMessageBean trackingMessageBean) {
            try {
                String messageBean = new Gson().toJson(trackingMessageBean);
                UploadEventService uploadEventService = UploadEventService.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(messageBean, "messageBean");
                uploadEventService.saveLogEvent(messageBean);
            } catch (Exception e) {
                LogUtils.e("" + e.toString());
                LogEventSelfHandler.logeEventSendThreadPool.execute(new Runnable() { // from class: com.glority.analysis.handler.LogEventSelfHandler$Companion$saveEventAndSend$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        UploadEventService.sendBatch$default(UploadEventService.INSTANCE, CollectionsKt.mutableListOf(TrackingMessageBean.this), null, null, 6, null);
                    }
                });
            }
            LogEventSelfHandler.logeEventSendThreadPool.execute(new Runnable() { // from class: com.glority.analysis.handler.LogEventSelfHandler$Companion$saveEventAndSend$2
                @Override // java.lang.Runnable
                public final void run() {
                    if (EventChecker.INSTANCE.isRealtime(eventName) && Intrinsics.areEqual((Object) EventChecker.INSTANCE.getEnableDataCollect(), (Object) true)) {
                        UploadEventService.INSTANCE.sendEventOfOnePage(TimingType.REAL_TIME);
                    } else if (UploadEventService.INSTANCE.isNeedSend()) {
                        UploadEventService.sendEventOfOnePage$default(UploadEventService.INSTANCE, null, 1, null);
                    }
                }
            });
        }
    }
}
