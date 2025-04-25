package com.glority.billing;

import com.glority.android.core.route.analysis.SendErrorEventRequest;
import com.glority.android.core.route.utils.PersistDataReadRequest;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.billing.utils.PaddingData;
import com.glority.billing.utils.PaymentUtils;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: InitBilling.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)V"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
final class InitBilling$run$2 extends Lambda implements Function1<Long, Unit> {
    final /* synthetic */ InitBilling this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitBilling$run$2(InitBilling initBilling) {
        super(1);
        this.this$0 = initBilling;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
        invoke2(l);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Long l) {
        final Ref.IntRef intRef = new Ref.IntRef();
        try {
            final List list = (List) new Gson().fromJson(new PersistDataReadRequest(CorePersistKey.BILLING_PADDING).toResult(), new TypeToken<List<PaddingData>>() { // from class: com.glority.billing.InitBilling$run$2.1
            }.getType());
            InitBilling initBilling = this.this$0;
            Observable<Long> interval = Observable.interval(10L, TimeUnit.SECONDS);
            final InitBilling initBilling2 = this.this$0;
            final Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: com.glority.billing.InitBilling$run$2.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                    invoke2(l2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Long l2) {
                    PaddingData paddingData;
                    try {
                        int i = Ref.IntRef.this.element;
                        List<PaddingData> list2 = list;
                        if (i >= (list2 != null ? list2.size() : 0)) {
                            initBilling2.stopInterval();
                            return;
                        }
                        List<PaddingData> list3 = list;
                        if (list3 == null || (paddingData = list3.get(Ref.IntRef.this.element)) == null) {
                            return;
                        }
                        Ref.IntRef intRef2 = Ref.IntRef.this;
                        String originalJson = paddingData.getPurchase().getOriginalJson();
                        if (originalJson != null && originalJson.length() != 0) {
                            PaymentUtils.INSTANCE.synRestore(paddingData.getPurchase());
                            intRef2.element++;
                        }
                        PaymentUtils.INSTANCE.cleanPaddingData();
                        intRef2.element++;
                    } catch (Exception e) {
                        new SendErrorEventRequest("revert_from_assumed_vip_failed", e.toString()).post();
                    }
                }
            };
            initBilling.disposable = interval.subscribe(new Consumer() { // from class: com.glority.billing.InitBilling$run$2$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    Function1.this.invoke(obj);
                }
            });
        } catch (Exception e) {
            LogUtils.e("read abtest configs err =  " + e);
            this.this$0.stopInterval();
        }
    }
}
