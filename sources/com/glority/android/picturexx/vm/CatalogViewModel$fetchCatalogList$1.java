package com.glority.android.picturexx.vm;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.glority.android.picturexx.repository.CatalogRepository;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogInfo;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogListMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.vm.CatalogViewModel$fetchCatalogList$1", f = "CatalogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CatalogViewModel$fetchCatalogList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $countryCode;
    int label;
    final /* synthetic */ CatalogViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogViewModel$fetchCatalogList$1(CatalogViewModel catalogViewModel, String str, Continuation<? super CatalogViewModel$fetchCatalogList$1> continuation) {
        super(2, continuation);
        this.this$0 = catalogViewModel;
        this.$countryCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CatalogViewModel$fetchCatalogList$1(this.this$0, this.$countryCode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogViewModel$fetchCatalogList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.this$0.getCatalogCache().containsKey(this.$countryCode)) {
            Resource<CatalogListMessage> requestCatalogListMessage = CatalogRepository.INSTANCE.requestCatalogListMessage(this.$countryCode);
            if (requestCatalogListMessage.getStatus() == Status.SUCCESS) {
                HashMap<String, List<CatalogInfo>> catalogCache = this.this$0.getCatalogCache();
                String str = this.$countryCode;
                CatalogListMessage data = requestCatalogListMessage.getData();
                if (data == null || (arrayList = data.getList()) == null) {
                    arrayList = new ArrayList();
                }
                catalogCache.put(str, arrayList);
            }
        }
        this.this$0.getDisplayCatalogList().clear();
        SnapshotStateList<CatalogInfo> displayCatalogList = this.this$0.getDisplayCatalogList();
        ArrayList arrayList2 = this.this$0.getCatalogCache().get(this.$countryCode);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        displayCatalogList.addAll(arrayList2);
        return Unit.INSTANCE;
    }
}
