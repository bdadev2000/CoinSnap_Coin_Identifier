package com.glority.billing.utils;

import com.android.billingclient.api.Purchase;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.purchase.generatedAPI.kotlinAPI.purchase.VerifyMessage;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OutAppSubscribe.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.utils.OutAppSubscribe$verifyPurchase$1", f = "OutAppSubscribe.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OutAppSubscribe$verifyPurchase$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<String> $appData;
    final /* synthetic */ List<Purchase> $purchases;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OutAppSubscribe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OutAppSubscribe$verifyPurchase$1(List<? extends Purchase> list, Ref.ObjectRef<String> objectRef, OutAppSubscribe outAppSubscribe, Continuation<? super OutAppSubscribe$verifyPurchase$1> continuation) {
        super(2, continuation);
        this.$purchases = list;
        this.$appData = objectRef;
        this.this$0 = outAppSubscribe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OutAppSubscribe$verifyPurchase$1 outAppSubscribe$verifyPurchase$1 = new OutAppSubscribe$verifyPurchase$1(this.$purchases, this.$appData, this.this$0, continuation);
        outAppSubscribe$verifyPurchase$1.L$0 = obj;
        return outAppSubscribe$verifyPurchase$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OutAppSubscribe$verifyPurchase$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        VerifyMessage verifyMessage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        T t = 0;
        t = 0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<Purchase> list = this.$purchases;
            OutAppSubscribe outAppSubscribe = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Purchase purchase : list) {
                List<String> products = purchase.getProducts();
                Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
                String str = (String) CollectionsKt.firstOrNull((List) products);
                arrayList.add(str != null ? BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OutAppSubscribe$verifyPurchase$1$verifyTasks$1$1(outAppSubscribe, str, purchase, null), 3, null) : null);
            }
            this.label = 1;
            obj = AwaitKt.awaitAll(CollectionsKt.filterNotNull(arrayList), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((Resource) obj2).getStatus() == Status.SUCCESS) {
                break;
            }
        }
        Resource resource = (Resource) obj2;
        Ref.ObjectRef<String> objectRef = this.$appData;
        if (resource != null && (verifyMessage = (VerifyMessage) resource.getData()) != null) {
            t = verifyMessage.getAppData();
        }
        objectRef.element = t;
        return Unit.INSTANCE;
    }
}
