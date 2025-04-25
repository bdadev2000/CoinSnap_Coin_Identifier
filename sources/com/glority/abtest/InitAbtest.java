package com.glority.abtest;

import com.glority.abtest.utils.ABTesting;
import com.glority.abtest.utils.AbtestUtils;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.GetAbtestingDefinitionsMessage;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.init.InitTask;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.utils.PersistDataReadRequest;
import com.glority.android.core.route.utils.PersistDataWriteRequest;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.bean.AbtestLog;
import com.glority.bean.AbtestLogLocalRecord;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitAbtest.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/glority/abtest/InitAbtest;", "Lcom/glority/android/core/init/InitTask;", "()V", "grade", "", "getGrade", "()I", "preconditions", "", "getPreconditions", "()Ljava/util/List;", "run", "", "Companion", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class InitAbtest implements InitTask {
    public static final int MAX_SIZE_LOCAL_RECODE = 500;

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
        List<AbtestLog> abtestLogArray;
        List<AbtestLog> abtestLogArray2;
        PersistDataWriteRequest persistDataWriteRequest;
        AbtestLogLocalRecord abtestLogLocalRecord;
        List<AbtestLog> abtestLogArray3;
        try {
            if (Intrinsics.areEqual(new PersistDataReadRequest(CorePersistKey.ABTEST_IS_REINSTALL).toResult(), "")) {
                new PersistDataWriteRequest(CorePersistKey.ABTEST_IS_REINSTALL, "true").post();
            } else {
                new PersistDataWriteRequest(CorePersistKey.ABTEST_IS_REINSTALL, "false").post();
            }
            String result = new PersistDataReadRequest(CorePersistKey.ABTESTING_DEFINITIONS).toResult();
            String str = result;
            if ((str == null || str.length() == 0) && (result = AbtestUtils.INSTANCE.assetFile2Str(AppContext.INSTANCE.peekContext(), ABTesting.ABTESTING_CONFIG_LOCAL)) != null) {
                new PersistDataWriteRequest(CorePersistKey.ABTESTING_DEFINITIONS, result).post();
            }
            AbtestUtils.INSTANCE.setAbtestingDefinitionsMessage((GetAbtestingDefinitionsMessage) new Gson().fromJson(result, GetAbtestingDefinitionsMessage.class));
            String result2 = new PersistDataReadRequest(ABTesting.ABTESTING_LOG_EVENT_LOCAL).toResult();
            if (result2 == null || result2.length() <= 0) {
                return;
            }
            try {
                try {
                    AbtestUtils.INSTANCE.setAbtestLogLocalRecord((AbtestLogLocalRecord) new Gson().fromJson(result2, AbtestLogLocalRecord.class));
                    abtestLogLocalRecord = AbtestUtils.INSTANCE.getAbtestLogLocalRecord();
                } catch (Throwable th) {
                    AbtestLogLocalRecord abtestLogLocalRecord2 = AbtestUtils.INSTANCE.getAbtestLogLocalRecord();
                    if (abtestLogLocalRecord2 != null && (abtestLogArray = abtestLogLocalRecord2.getAbtestLogArray()) != null && abtestLogArray.size() > 500) {
                        AbtestUtils.INSTANCE.setAbtestLogLocalRecord(null);
                        new PersistDataWriteRequest(ABTesting.ABTESTING_LOG_EVENT_LOCAL, "").post();
                    }
                    throw th;
                }
            } catch (Exception unused) {
                AbtestUtils.INSTANCE.setAbtestLogLocalRecord(null);
                new PersistDataWriteRequest(ABTesting.ABTESTING_LOG_EVENT_LOCAL, "").post();
                AbtestLogLocalRecord abtestLogLocalRecord3 = AbtestUtils.INSTANCE.getAbtestLogLocalRecord();
                if (abtestLogLocalRecord3 == null || (abtestLogArray2 = abtestLogLocalRecord3.getAbtestLogArray()) == null || abtestLogArray2.size() <= 500) {
                    return;
                }
                AbtestUtils.INSTANCE.setAbtestLogLocalRecord(null);
                persistDataWriteRequest = new PersistDataWriteRequest(ABTesting.ABTESTING_LOG_EVENT_LOCAL, "");
            }
            if (abtestLogLocalRecord == null || (abtestLogArray3 = abtestLogLocalRecord.getAbtestLogArray()) == null || abtestLogArray3.size() <= 500) {
                return;
            }
            AbtestUtils.INSTANCE.setAbtestLogLocalRecord(null);
            persistDataWriteRequest = new PersistDataWriteRequest(ABTesting.ABTESTING_LOG_EVENT_LOCAL, "");
            persistDataWriteRequest.post();
        } catch (Exception e) {
            LogUtils.e("read abtest configs err =  " + e);
            new LogEventRequest(AbtestLogEvent.ABTEST_EXCEPTION, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("error", e.toString()))).post();
        }
    }
}
