package com.glority.android.picturexx.view.me;

import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.definition.CollectionSortType;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeCollectionAllFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionAllFragment$filter$1", f = "MeCollectionAllFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class MeCollectionAllFragment$filter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<CollectionItem> $data;
    final /* synthetic */ String $issuer;
    final /* synthetic */ Function1<List<CollectionItem>, Unit> $onResult;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MeCollectionAllFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MeCollectionAllFragment$filter$1(List<CollectionItem> list, String str, MeCollectionAllFragment meCollectionAllFragment, Function1<? super List<CollectionItem>, Unit> function1, Continuation<? super MeCollectionAllFragment$filter$1> continuation) {
        super(2, continuation);
        this.$data = list;
        this.$issuer = str;
        this.this$0 = meCollectionAllFragment;
        this.$onResult = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MeCollectionAllFragment$filter$1 meCollectionAllFragment$filter$1 = new MeCollectionAllFragment$filter$1(this.$data, this.$issuer, this.this$0, this.$onResult, continuation);
        meCollectionAllFragment$filter$1.L$0 = obj;
        return meCollectionAllFragment$filter$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MeCollectionAllFragment$filter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.List<com.glority.android.database.entities.CollectionItem>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CollectionSortType collectionSortType;
        ?? sort;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.$data;
        String str2 = this.$issuer;
        str = this.this$0.countryFilterAll;
        if (!Intrinsics.areEqual(str2, str)) {
            Iterable iterable = (Iterable) objectRef.element;
            String str3 = this.$issuer;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (Intrinsics.areEqual(((CollectionItem) obj2).getIssuer(), str3)) {
                    arrayList.add(obj2);
                }
            }
            objectRef.element = arrayList;
            MeCollectionAllFragment meCollectionAllFragment = this.this$0;
            List list = (List) objectRef.element;
            collectionSortType = this.this$0.currentSortType;
            sort = meCollectionAllFragment.sort(list, collectionSortType);
            objectRef.element = sort;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass2(this.$onResult, objectRef, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MeCollectionAllFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionAllFragment$filter$1$2", f = "MeCollectionAllFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.me.MeCollectionAllFragment$filter$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<List<CollectionItem>> $filterData;
        final /* synthetic */ Function1<List<CollectionItem>, Unit> $onResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super List<CollectionItem>, Unit> function1, Ref.ObjectRef<List<CollectionItem>> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onResult = function1;
            this.$filterData = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$onResult, this.$filterData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$onResult.invoke(this.$filterData.element);
            return Unit.INSTANCE;
        }
    }
}
