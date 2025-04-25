package com.glority.android.picturexx.repository;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.base.viewmodel.AppViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SyncCollectionManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.SyncCollectionManager$observeSummary$1$1", f = "SyncCollectionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SyncCollectionManager$observeSummary$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $isNoCacheBefore;
    final /* synthetic */ LifecycleOwner $owner;
    int label;
    final /* synthetic */ SyncCollectionManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncCollectionManager$observeSummary$1$1(LifecycleOwner lifecycleOwner, Ref.BooleanRef booleanRef, SyncCollectionManager syncCollectionManager, Continuation<? super SyncCollectionManager$observeSummary$1$1> continuation) {
        super(2, continuation);
        this.$owner = lifecycleOwner;
        this.$isNoCacheBefore = booleanRef;
        this.this$0 = syncCollectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SyncCollectionManager$observeSummary$1$1(this.$owner, this.$isNoCacheBefore, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SyncCollectionManager$observeSummary$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$owner != null) {
            LiveData<List<CollectionItem>> allNoOrder = DBManager.INSTANCE.getCollectionItemDao().getAllNoOrder(AppViewModel.INSTANCE.getUserId());
            LifecycleOwner lifecycleOwner = this.$owner;
            final Ref.BooleanRef booleanRef = this.$isNoCacheBefore;
            final SyncCollectionManager syncCollectionManager = this.this$0;
            allNoOrder.observe(lifecycleOwner, new SyncCollectionManager$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.repository.SyncCollectionManager$observeSummary$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends CollectionItem> list) {
                    invoke2((List<CollectionItem>) list);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
                
                    if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) true) == false) goto L6;
                 */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke2(java.util.List<com.glority.android.database.entities.CollectionItem> r4) {
                    /*
                        r3 = this;
                        kotlin.jvm.internal.Ref$BooleanRef r0 = kotlin.jvm.internal.Ref.BooleanRef.this
                        boolean r0 = r0.element
                        if (r0 == 0) goto L17
                        com.glority.android.picturexx.repository.SyncCollectionManager r0 = r2
                        java.lang.Boolean r0 = com.glority.android.picturexx.repository.SyncCollectionManager.access$cacheState(r0)
                        r1 = 1
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                        if (r0 != 0) goto L1d
                    L17:
                        kotlin.jvm.internal.Ref$BooleanRef r0 = kotlin.jvm.internal.Ref.BooleanRef.this
                        boolean r0 = r0.element
                        if (r0 != 0) goto L4b
                    L1d:
                        int r0 = r4.size()
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "observeSummary: "
                        r1.<init>(r2)
                        java.lang.StringBuilder r0 = r1.append(r0)
                        java.lang.String r0 = r0.toString()
                        java.lang.String r1 = "SyncCollectionManager"
                        java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
                        com.glority.utils.stability.LogUtils.d(r0)
                        com.glority.android.picturexx.repository.SyncCollectionManager r0 = r2
                        androidx.lifecycle.MutableLiveData r0 = r0.getSummaryLivedata()
                        com.glority.android.picturexx.repository.SyncCollectionManager r1 = r2
                        kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                        com.glority.android.picturexx.repository.SyncCollectionManager$SummaryInfo r4 = com.glority.android.picturexx.repository.SyncCollectionManager.access$collectionsToSummary(r1, r4)
                        r0.postValue(r4)
                    L4b:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.repository.SyncCollectionManager$observeSummary$1$1.AnonymousClass1.invoke2(java.util.List):void");
                }
            }));
        }
        return Unit.INSTANCE;
    }
}
