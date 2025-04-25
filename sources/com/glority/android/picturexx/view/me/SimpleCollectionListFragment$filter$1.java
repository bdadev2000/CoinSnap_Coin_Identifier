package com.glority.android.picturexx.view.me;

import com.glority.android.database.entities.CollectionItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SimpleCollectionListFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.SimpleCollectionListFragment$filter$1", f = "SimpleCollectionListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SimpleCollectionListFragment$filter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<CollectionItem> $data;
    final /* synthetic */ String $issuer;
    final /* synthetic */ String $keyword;
    final /* synthetic */ Function1<List<CollectionItem>, Unit> $onResult;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SimpleCollectionListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleCollectionListFragment$filter$1(String str, List<CollectionItem> list, String str2, SimpleCollectionListFragment simpleCollectionListFragment, Function1<? super List<CollectionItem>, Unit> function1, Continuation<? super SimpleCollectionListFragment$filter$1> continuation) {
        super(2, continuation);
        this.$keyword = str;
        this.$data = list;
        this.$issuer = str2;
        this.this$0 = simpleCollectionListFragment;
        this.$onResult = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SimpleCollectionListFragment$filter$1 simpleCollectionListFragment$filter$1 = new SimpleCollectionListFragment$filter$1(this.$keyword, this.$data, this.$issuer, this.this$0, this.$onResult, continuation);
        simpleCollectionListFragment$filter$1.L$0 = obj;
        return simpleCollectionListFragment$filter$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SimpleCollectionListFragment$filter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        T t;
        String str;
        int i;
        ?? sort;
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String str2 = this.$keyword;
        if (str2 != null && str2.length() != 0) {
            ArrayList arrayList = new ArrayList();
            List<CollectionItem> list = this.$data;
            String str3 = this.$keyword;
            for (CollectionItem collectionItem : list) {
                String name = collectionItem.getName();
                String mintMark = collectionItem.getMintMark();
                if (mintMark == null) {
                    mintMark = "";
                }
                String note = collectionItem.getNote();
                List<String> split$default = StringsKt.split$default((CharSequence) (name + mintMark + (note != null ? note : "")), new String[]{" "}, false, 0, 6, (Object) null);
                List split$default2 = StringsKt.split$default((CharSequence) str3, new String[]{" "}, false, 0, 6, (Object) null);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : split$default2) {
                    if (StringsKt.trim((CharSequence) obj3).toString().length() > 0) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                int i2 = 0;
                for (String str4 : split$default) {
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (StringsKt.contains((CharSequence) str4, (CharSequence) obj2, true)) {
                            break;
                        }
                    }
                    if (obj2 != null) {
                        i2++;
                    }
                }
                if (i2 >= arrayList3.size()) {
                    arrayList.add(new Pair(Boxing.boxInt(i2), collectionItem));
                }
            }
            List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$filter$1$invokeSuspend$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t3) {
                    return ComparisonsKt.compareValues((Integer) ((Pair) t3).getFirst(), (Integer) ((Pair) t2).getFirst());
                }
            });
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
            Iterator it2 = sortedWith.iterator();
            while (it2.hasNext()) {
                arrayList4.add((CollectionItem) ((Pair) it2.next()).getSecond());
            }
            t = arrayList4;
        } else {
            t = this.$data;
        }
        objectRef.element = t;
        String str5 = this.$issuer;
        str = this.this$0.countryFilterAll;
        if (!Intrinsics.areEqual(str5, str)) {
            Iterable iterable = (Iterable) objectRef.element;
            String str6 = this.$issuer;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : iterable) {
                if (Intrinsics.areEqual(((CollectionItem) obj4).getIssuer(), str6)) {
                    arrayList5.add(obj4);
                }
            }
            objectRef.element = arrayList5;
            SimpleCollectionListFragment simpleCollectionListFragment = this.this$0;
            List list2 = (List) objectRef.element;
            i = this.this$0.currentSortType;
            sort = simpleCollectionListFragment.sort(list2, i);
            objectRef.element = sort;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass2(this.this$0, this.$issuer, this.$onResult, objectRef, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleCollectionListFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.me.SimpleCollectionListFragment$filter$1$2", f = "SimpleCollectionListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$filter$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<List<CollectionItem>> $filterData;
        final /* synthetic */ String $issuer;
        final /* synthetic */ Function1<List<CollectionItem>, Unit> $onResult;
        int label;
        final /* synthetic */ SimpleCollectionListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(SimpleCollectionListFragment simpleCollectionListFragment, String str, Function1<? super List<CollectionItem>, Unit> function1, Ref.ObjectRef<List<CollectionItem>> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = simpleCollectionListFragment;
            this.$issuer = str;
            this.$onResult = function1;
            this.$filterData = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$issuer, this.$onResult, this.$filterData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                z = this.this$0.visibleExportBar;
                if (z) {
                    SimpleCollectionListFragment simpleCollectionListFragment = this.this$0;
                    String str2 = this.$issuer;
                    str = simpleCollectionListFragment.countryFilterAll;
                    simpleCollectionListFragment.visibleExportBar(Intrinsics.areEqual(str2, str));
                }
                this.$onResult.invoke(this.$filterData.element);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
