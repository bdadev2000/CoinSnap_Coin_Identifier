package com.glority.analysis;

import android.app.Activity;
import android.app.AlertDialog;
import com.glority.analysis.handler.LoadConfigResult;
import com.glority.analysis.handler.UploadEventService;
import com.glority.analysis.utils.AnalysisCacheManager;
import com.glority.analysis.utils.AnalysisUtils;
import com.glority.analysis.utils.CrashHandler;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.init.InitTask;
import com.glority.android.core.route.analysis.DeviceInfoChangeRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.analysis.SendErrorEventRequest;
import com.glority.android.core.route.utils.PersistDataReadRequest;
import com.glority.android.core.route.utils.PersistDataWriteRequest;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.android.xx.constants.Args;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.repository.AnalysisRepository;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventConfig;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.GetEventConfigMessage;
import com.glority.utils.stability.LogUtils;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: InitAnalysis.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0017R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/glority/analysis/InitAnalysis;", "Lcom/glority/android/core/init/InitTask;", "()V", "grade", "", "getGrade", "()I", "preconditions", "", "getPreconditions", "()Ljava/util/List;", "run", "", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class InitAnalysis implements InitTask {
    public static final String CLIENT_INSTALL = "client_install";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DEVICE_INFO_CHANGED = "device_info_changed";
    public static final String TAG = "com.glority.analysis.InitAnalysis";

    @Override // com.glority.android.core.init.InitTask
    public int getGrade() {
        return 1;
    }

    @Override // com.glority.android.core.init.InitTask
    public List<InitTask> getPreconditions() {
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        LogUtils.i(TAG, "run");
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "stage") || Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "dev")) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new InitAnalysis$run$1(null), 2, null);
        }
        CrashHandler.INSTANCE.getInstance().init(AppContext.INSTANCE.peekContext().getApplicationContext());
        INSTANCE.getAnalysisConfig();
        UploadEventService.INSTANCE.start();
        Observable.timer(3L, TimeUnit.SECONDS).subscribe(new Consumer<Long>() { // from class: com.glority.analysis.InitAnalysis$run$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Long l) {
                new DeviceInfoChangeRequest("device_info_changed", null, 2, null).post();
                String result = new PersistDataReadRequest(CorePersistKey.CORE_CLIENT_INSTALL).toResult();
                if (result == null || result.length() == 0) {
                    new LogEventRequest(InitAnalysis.CLIENT_INSTALL, null, 2, null).post();
                    new PersistDataWriteRequest(CorePersistKey.CORE_CLIENT_INSTALL, "true").post();
                }
            }
        });
    }

    /* compiled from: InitAnalysis.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/glority/analysis/InitAnalysis$Companion;", "", "()V", "CLIENT_INSTALL", "", "DEVICE_INFO_CHANGED", "TAG", "getAnalysisConfig", "", "getAnalysisConfigSync", "quitEdit", Args.title, LogEventArguments.ARG_MESSAGE, "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void getAnalysisConfig() {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new InitAnalysis$Companion$getAnalysisConfig$1(null), 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void getAnalysisConfigSync() {
            ArrayList arrayList;
            Resource<GetEventConfigMessage> eventConfig = AnalysisRepository.INSTANCE.getEventConfig();
            LogUtils.i(InitAnalysis.TAG, "status = " + eventConfig.getStatus());
            if (eventConfig.getStatus() == Status.SUCCESS) {
                LoadConfigResult.INSTANCE.setStatus(1);
                try {
                    AnalysisCacheManager analysisCacheManager = AnalysisCacheManager.INSTANCE;
                    GetEventConfigMessage data = eventConfig.getData();
                    analysisCacheManager.setInterval(data != null ? data.getInterval() : 0);
                    AnalysisCacheManager analysisCacheManager2 = AnalysisCacheManager.INSTANCE;
                    GetEventConfigMessage data2 = eventConfig.getData();
                    analysisCacheManager2.setBatchLimit(data2 != null ? data2.getBatchLimit() : 0);
                    AnalysisUtils analysisUtils = AnalysisUtils.INSTANCE;
                    GetEventConfigMessage data3 = eventConfig.getData();
                    analysisUtils.setEventsConfig(data3 != null ? data3.getEvents() : null);
                    AnalysisCacheManager analysisCacheManager3 = AnalysisCacheManager.INSTANCE;
                    ArrayList eventsConfig = AnalysisUtils.INSTANCE.getEventsConfig();
                    if (eventsConfig == null) {
                        eventsConfig = new ArrayList();
                    }
                    analysisCacheManager3.saveEventConfig(eventsConfig);
                    AnalysisCacheManager analysisCacheManager4 = AnalysisCacheManager.INSTANCE;
                    GetEventConfigMessage data4 = eventConfig.getData();
                    if (data4 == null || (arrayList = data4.getBlackListEvents()) == null) {
                        arrayList = new ArrayList();
                    }
                    analysisCacheManager4.setBackList(arrayList);
                    AnalysisUtils analysisUtils2 = AnalysisUtils.INSTANCE;
                    GetEventConfigMessage data5 = eventConfig.getData();
                    analysisUtils2.setBackListEvents(data5 != null ? data5.getBlackListEvents() : null);
                    return;
                } catch (Exception e) {
                    new SendErrorEventRequest("InitAnalysis", e.toString()).post();
                    return;
                }
            }
            LoadConfigResult.INSTANCE.setStatus(2);
            AnalysisUtils analysisUtils3 = AnalysisUtils.INSTANCE;
            List<EventConfig> eventConfig2 = AnalysisCacheManager.INSTANCE.getEventConfig();
            analysisUtils3.setEventsConfig(eventConfig2 != null ? CollectionsKt.toMutableList((Collection) eventConfig2) : null);
            AnalysisUtils.INSTANCE.setBackListEvents(CollectionsKt.toMutableList((Collection) AnalysisCacheManager.INSTANCE.getBackList()));
        }

        public final void quitEdit(String title, String message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            if (AppContext.INSTANCE.peekContext() instanceof Activity) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AppContext.INSTANCE.peekContext());
                builder.setTitle(title);
                builder.setMessage(message);
                if (AppContext.INSTANCE.isDebugMode()) {
                    builder.setCancelable(false);
                }
                builder.create().show();
                LogUtils.e("trackingConfigError", message);
            }
        }
    }
}
