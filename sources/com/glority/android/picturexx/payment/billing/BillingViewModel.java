package com.glority.android.picturexx.payment.billing;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.ProductDetails;
import com.glority.base.repository.ConfigRepository;
import com.glority.base.repository.UserRepository;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.GetConfigMessage;
import com.glority.component.generatedAPI.kotlinAPI.vip.GetVipCardMessage;
import com.glority.component.generatedAPI.kotlinAPI.vip.RestoreResult;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: BillingViewModel.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 J\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001dJ\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\"0\u001dR'\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/glority/android/picturexx/payment/billing/BillingViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "skuDetailsList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/android/billingclient/api/ProductDetails;", "getSkuDetailsList", "()Landroidx/lifecycle/MutableLiveData;", "skuDetailsList$delegate", "Lkotlin/Lazy;", "billingCancelled", "", "getBillingCancelled", "setBillingCancelled", "(Landroidx/lifecycle/MutableLiveData;)V", "restore", "getRestore", "()Z", "setRestore", "(Z)V", "currentPageName", "", "getCurrentPageName", "()Ljava/lang/String;", "setCurrentPageName", "(Ljava/lang/String;)V", "loginWithRestore", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Status;", "restoreResult", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/RestoreResult;", "getVipInfo", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/GetVipCardMessage;", "getClientConfig", "Lcom/glority/component/generatedAPI/kotlinAPI/user/GetConfigMessage;", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class BillingViewModel extends BaseViewModel {
    private String currentPageName;
    private boolean restore;

    /* renamed from: skuDetailsList$delegate, reason: from kotlin metadata */
    private final Lazy skuDetailsList = LazyKt.lazy(new Function0<MutableLiveData<List<ProductDetails>>>() { // from class: com.glority.android.picturexx.payment.billing.BillingViewModel$skuDetailsList$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<List<ProductDetails>> invoke() {
            return new MutableLiveData<>();
        }
    });
    private MutableLiveData<Boolean> billingCancelled = new MutableLiveData<>();

    public final MutableLiveData<List<ProductDetails>> getSkuDetailsList() {
        return (MutableLiveData) this.skuDetailsList.getValue();
    }

    public final MutableLiveData<Boolean> getBillingCancelled() {
        return this.billingCancelled;
    }

    public final void setBillingCancelled(MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.billingCancelled = mutableLiveData;
    }

    public final boolean getRestore() {
        return this.restore;
    }

    public final void setRestore(boolean z) {
        this.restore = z;
    }

    public final String getCurrentPageName() {
        return this.currentPageName;
    }

    public final void setCurrentPageName(String str) {
        this.currentPageName = str;
    }

    public final LiveData<Status> loginWithRestore(RestoreResult restoreResult) {
        Intrinsics.checkNotNullParameter(restoreResult, "restoreResult");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new BillingViewModel$loginWithRestore$1(mutableLiveData, restoreResult, null), 3, null);
        return mutableLiveData;
    }

    public final LiveData<Resource<GetVipCardMessage>> getVipInfo() {
        return BaseViewModel.request$default(this, GetVipCardMessage.class, UserRepository.INSTANCE.getInstance().getVipCardMethod(), null, null, null, 28, null);
    }

    public final LiveData<Resource<GetConfigMessage>> getClientConfig() {
        return BaseViewModel.request$default(this, GetConfigMessage.class, ConfigRepository.INSTANCE.getInstance().getClientConfigMethod(), null, null, null, 28, null);
    }
}
