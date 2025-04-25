package com.glority.analysis.handler;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.glority.analysis.InitAnalysis;
import com.glority.analysis.bean.Payload;
import com.glority.analysis.bean.TrackingMessageBean;
import com.glority.analysis.utils.AnalysisUtils;
import com.glority.analysis.utils.SessionUtil;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.LogEventSelfRequest;
import com.glority.android.core.route.billing.GetDeviceIdRequest;
import com.glority.android.core.route.network.GetUserIdRequest;
import com.glority.android.core.route.utils.GetVipTypeRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.android.core.utils.page.AnalysisManage;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogEventSelfHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class LogEventSelfHandler$Companion$eventSaveLocal$1 implements Runnable {
    final /* synthetic */ String $eventName;
    final /* synthetic */ LogEventSelfRequest $request;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LogEventSelfHandler$Companion$eventSaveLocal$1(LogEventSelfRequest logEventSelfRequest, String str) {
        this.$request = logEventSelfRequest;
        this.$eventName = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String valueOf;
        if (Intrinsics.areEqual((Object) EventChecker.INSTANCE.getEnableDataCollect(), (Object) false)) {
            return;
        }
        HashMap<String, Object> bundle2Map = AnalysisUtils.INSTANCE.bundle2Map(this.$request.getBundle());
        Long result = new GetUserIdRequest().toResult();
        long longValue = result != null ? result.longValue() : 0L;
        String result2 = new GetDeviceIdRequest().toResult();
        if (result2 == null) {
            result2 = "";
        }
        Payload payload = new Payload(longValue, 0, result2, AppContext.INSTANCE.getVersionName(), AnalysisUtils.INSTANCE.getSDK_VERSION(), new GetVipTypeRequest().toResult(), AnalysisManage.INSTANCE.preview(), bundle2Map, null, 256, null);
        long currentTimeMillis = System.currentTimeMillis() - ((Number) PersistData.INSTANCE.get(CorePersistKey.SERVER_CLIENT_TIME_OFFSET, 0L)).longValue();
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            valueOf = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(currentTimeMillis / 1000)}, 1));
            Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(locale, format, *args)");
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            valueOf = String.valueOf(currentTimeMillis / 1000);
        }
        final TrackingMessageBean trackingMessageBean = new TrackingMessageBean(this.$request.getEventId(), AppContext.INSTANCE.getPackageName() + "-android" + AppContext.INSTANCE.getConfig("ENV"), NotificationCompat.CATEGORY_EVENT, this.$request.getEventType(), valueOf, payload, SessionUtil.INSTANCE.getSessionId(), 0, 128, null);
        if (EventChecker.INSTANCE.checkValid(this.$request.getEventType(), this.$request.getBundle()) || LoadConfigResult.INSTANCE.getStatus() != 1) {
            LogUtils.i(LogEventSelfHandler.TAG, this.$eventName + " is valid");
            if (EventChecker.INSTANCE.isRealtime(this.$eventName) && Intrinsics.areEqual((Object) EventChecker.INSTANCE.getEnableDataCollect(), (Object) true)) {
                LogEventSelfHandler.logeEventSendThreadPool.execute(new Runnable() { // from class: com.glority.analysis.handler.LogEventSelfHandler$Companion$eventSaveLocal$1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        UploadEventService.INSTANCE.sendBatch(CollectionsKt.mutableListOf(trackingMessageBean), new Function0<Unit>() { // from class: com.glority.analysis.handler.LogEventSelfHandler.Companion.eventSaveLocal.1.1.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        }, new Function0<Unit>() { // from class: com.glority.analysis.handler.LogEventSelfHandler.Companion.eventSaveLocal.1.1.2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                LogEventSelfHandler.INSTANCE.saveEventAndSend(LogEventSelfHandler$Companion$eventSaveLocal$1.this.$eventName, trackingMessageBean);
                            }
                        });
                    }
                });
                return;
            } else {
                LogEventSelfHandler.INSTANCE.saveEventAndSend(this.$eventName, trackingMessageBean);
                return;
            }
        }
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "stage") || Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "dev")) {
            ToastUtils.showLong("filter event -----> " + this.$eventName, new Object[0]);
            final String diffParamsInfo = EventChecker.INSTANCE.diffParamsInfo(this.$request.getEventType(), this.$request.getBundle());
            LogUtils.e(this.$request.getEventType(), diffParamsInfo);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.glority.analysis.handler.LogEventSelfHandler$Companion$eventSaveLocal$1.2
                @Override // java.lang.Runnable
                public final void run() {
                    InitAnalysis.INSTANCE.quitEdit(LogEventSelfHandler$Companion$eventSaveLocal$1.this.$request.getEventType(), diffParamsInfo);
                }
            });
        }
        LogUtils.i(LogEventSelfHandler.TAG, this.$eventName + " invalid");
    }
}
