package com.glority.billing;

import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.init.InitTask;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.billing.QueryHasSubscribedRequest;
import com.glority.android.core.route.utils.PersistDataReadRequest;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.billing.utils.PaddingData;
import com.glority.billing.utils.PaymentUtils;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;

/* compiled from: InitBilling.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0017J\b\u0010\u0010\u001a\u00020\u000fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/glority/billing/InitBilling;", "Lcom/glority/android/core/init/InitTask;", "<init>", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "grade", "", "getGrade", "()I", "preconditions", "", "getPreconditions", "()Ljava/util/List;", "run", "", "stopInterval", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class InitBilling implements InitTask {
    private Disposable disposable;

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
        new QueryHasSubscribedRequest().post();
        try {
            PaymentUtils.INSTANCE.setPaddingPurchases((List) new Gson().fromJson(new PersistDataReadRequest(CorePersistKey.BILLING_PADDING).toResult(), new TypeToken<List<PaddingData>>() { // from class: com.glority.billing.InitBilling$run$1
            }.getType()));
        } catch (Exception e) {
            LogUtils.e("read abtest configs err =  " + e);
        }
        Observable<Long> timer = Observable.timer(60L, TimeUnit.SECONDS);
        final InitBilling$run$2 initBilling$run$2 = new InitBilling$run$2(this);
        timer.subscribe(new Consumer() { // from class: com.glority.billing.InitBilling$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Function1.this.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopInterval() {
        List<PaddingData> paddingPurchases = PaymentUtils.INSTANCE.getPaddingPurchases();
        if (paddingPurchases == null || paddingPurchases.size() != 0) {
            Pair[] pairArr = new Pair[1];
            List<PaddingData> paddingPurchases2 = PaymentUtils.INSTANCE.getPaddingPurchases();
            pairArr[0] = TuplesKt.to(LogEventArguments.ARG_SIZE, paddingPurchases2 != null ? Integer.valueOf(paddingPurchases2.size()) : null);
            new LogEventRequest("revert_from_assumed_vip_failed", LogEventArgumentsKt.logEventBundleOf(pairArr)).post();
        }
        Disposable disposable = this.disposable;
        if (disposable != null) {
            if (disposable != null) {
                disposable.dispose();
            }
            this.disposable = null;
        }
    }
}
