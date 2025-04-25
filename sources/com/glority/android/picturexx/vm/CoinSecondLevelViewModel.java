package com.glority.android.picturexx.vm;

import androidx.lifecycle.LiveData;
import com.glority.android.picturexx.repository.HomeRepository;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.network.model.Resource;
import com.picturecoin.generatedAPI.kotlinAPI.cmsconsumer.CoinHomeGetMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinSecondLevelViewModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/vm/CoinSecondLevelViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "getCoinList", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/cmsconsumer/CoinHomeGetMessage;", Args.indexListUid, "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoinSecondLevelViewModel extends BaseViewModel {
    public static final int $stable = 0;

    public final LiveData<Resource<CoinHomeGetMessage>> getCoinList(String indexListUid) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        return HomeRepository.INSTANCE.getCoinList(AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode(), indexListUid);
    }
}
