package com.glority.android.picturexx.splash.vm.main;

import com.glority.android.picturexx.splash.repository.SplashRestoreRepository;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionListPaginateMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SplashViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.vm.main.SplashViewModel$checkIfNeedManualRestoreDirect$2", f = "SplashViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class SplashViewModel$checkIfNeedManualRestoreDirect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;

    /* compiled from: SplashViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SplashViewModel$checkIfNeedManualRestoreDirect$2(Continuation<? super SplashViewModel$checkIfNeedManualRestoreDirect$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashViewModel$checkIfNeedManualRestoreDirect$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((SplashViewModel$checkIfNeedManualRestoreDirect$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<Collection> collections;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Resource<GetCollectionListPaginateMessage> collectionListMessageSync = SplashRestoreRepository.INSTANCE.getCollectionListMessageSync(1, null);
        int i = WhenMappings.$EnumSwitchMapping$0[collectionListMessageSync.getStatus().ordinal()];
        if (i == 1) {
            return Boxing.boxBoolean(false);
        }
        if (i == 2) {
            GetCollectionListPaginateMessage data = collectionListMessageSync.getData();
            return Boxing.boxBoolean((data == null || (collections = data.getCollections()) == null || !(collections.isEmpty() ^ true)) ? false : true);
        }
        return Boxing.boxBoolean(false);
    }
}
