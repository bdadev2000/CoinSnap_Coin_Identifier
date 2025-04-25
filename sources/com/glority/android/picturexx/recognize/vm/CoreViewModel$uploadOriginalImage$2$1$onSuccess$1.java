package com.glority.android.picturexx.recognize.vm;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.recognize.repository.NewRecognizeRepository;
import com.glority.base.utils.SHAHelper;
import com.glority.utils.stability.LogUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CoreViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.vm.CoreViewModel$uploadOriginalImage$2$1$onSuccess$1", f = "CoreViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CoreViewModel$uploadOriginalImage$2$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ String $it;
    final /* synthetic */ List<Long> $itemIds;
    final /* synthetic */ String $url;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreViewModel$uploadOriginalImage$2$1$onSuccess$1(String str, List<Long> list, int i, String str2, Continuation<? super CoreViewModel$uploadOriginalImage$2$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.$it = str;
        this.$itemIds = list;
        this.$index = i;
        this.$url = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoreViewModel$uploadOriginalImage$2$1$onSuccess$1(this.$it, this.$itemIds, this.$index, this.$url, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoreViewModel$uploadOriginalImage$2$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = this.$it;
        List<Long> list = this.$itemIds;
        int i = this.$index;
        String str2 = this.$url;
        try {
            String fileToSHA1 = SHAHelper.INSTANCE.fileToSHA1(str);
            if (fileToSHA1 == null) {
                fileToSHA1 = "";
            }
            Long l = (Long) CollectionsKt.getOrNull(list, i);
            long longValue = l != null ? l.longValue() : 0L;
            if (longValue != 0) {
                NewRecognizeRepository companion = NewRecognizeRepository.INSTANCE.getInstance();
                if (str2 == null) {
                    str2 = "";
                }
                companion.uploadItemOriginalImageMethod(longValue, str2, fileToSHA1);
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        return Unit.INSTANCE;
    }
}
