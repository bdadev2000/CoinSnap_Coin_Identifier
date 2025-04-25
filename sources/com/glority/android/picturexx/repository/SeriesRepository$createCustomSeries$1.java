package com.glority.android.picturexx.repository;

import androidx.lifecycle.MutableLiveData;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.picturecoin.generatedAPI.kotlinAPI.series.CreateUserCustomSeriesMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserCustomSeries;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeriesRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.SeriesRepository$createCustomSeries$1", f = "SeriesRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SeriesRepository$createCustomSeries$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLiveData<Resource<CreateUserCustomSeriesMessage>> $liveData;
    final /* synthetic */ String $title;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeriesRepository$createCustomSeries$1(String str, MutableLiveData<Resource<CreateUserCustomSeriesMessage>> mutableLiveData, Continuation<? super SeriesRepository$createCustomSeries$1> continuation) {
        super(2, continuation);
        this.$title = str;
        this.$liveData = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SeriesRepository$createCustomSeries$1(this.$title, this.$liveData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SeriesRepository$createCustomSeries$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserCustomSeries customSeries;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Resource<CreateUserCustomSeriesMessage> sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new CreateUserCustomSeriesMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode(), this.$title));
        if (sendMessageBlocking.getStatus() == Status.SUCCESS) {
            CreateUserCustomSeriesMessage data = sendMessageBlocking.getData();
            UserCustomSeriesItem userCustomSeriesItem = (data == null || (customSeries = data.getCustomSeries()) == null) ? null : new UserCustomSeriesItem(customSeries.getCustomSeriesId(), customSeries.getTitle(), customSeries.getCreatedAt(), customSeries.getUpdatedAt(), customSeries.getCollectionCount(), customSeries.getLatestCollectionUrlList(), customSeries.getTotalPrice());
            if (userCustomSeriesItem != null) {
                DBManager.INSTANCE.getUserCustomSeriesItemDao().insert(userCustomSeriesItem);
            }
        }
        this.$liveData.postValue(sendMessageBlocking);
        return Unit.INSTANCE;
    }
}
