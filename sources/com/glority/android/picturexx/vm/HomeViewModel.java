package com.glority.android.picturexx.vm;

import androidx.lifecycle.ViewModelKt;
import com.glority.android.database.entities.ArticleNewEntity;
import com.glority.android.picturexx.adapter.ExpertPickItemWrapper;
import com.glority.android.picturexx.repository.HomeRepository;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.BaseViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0087@¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/glority/android/picturexx/vm/HomeViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "expertPicksData", "", "Lcom/glority/android/picturexx/adapter/ExpertPickItemWrapper;", "getExpertPicksData", "()Ljava/util/List;", "getCoinList", "", Args.indexListUid, "", "getCoinTalkListSync", "", "Lcom/glority/android/database/entities/ArticleNewEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class HomeViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final List<ExpertPickItemWrapper> expertPicksData = new ArrayList();

    public final List<ExpertPickItemWrapper> getExpertPicksData() {
        return this.expertPicksData;
    }

    public final void getCoinList(String indexListUid) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new HomeViewModel$getCoinList$1(indexListUid, null), 2, null);
    }

    public final Object getCoinTalkListSync(Continuation<? super List<ArticleNewEntity>> continuation) {
        return HomeRepository.INSTANCE.getCoinTalkListSync(continuation);
    }
}
