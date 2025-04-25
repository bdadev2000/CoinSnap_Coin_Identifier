package com.glority.android.picturexx.view.recognize;

import android.app.Dialog;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.repository.CollectionRepository;
import com.glority.network.model.Status;
import com.glority.utils.ui.ToastUtils;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionDetailEditDialogFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$saveData$2", f = "CollectionDetailEditDialogFragment.kt", i = {}, l = {573}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CollectionDetailEditDialogFragment$saveData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CollectionDetailEditDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionDetailEditDialogFragment$saveData$2(CollectionDetailEditDialogFragment collectionDetailEditDialogFragment, Continuation<? super CollectionDetailEditDialogFragment$saveData$2> continuation) {
        super(2, continuation);
        this.this$0 = collectionDetailEditDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionDetailEditDialogFragment$saveData$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CollectionDetailEditDialogFragment$saveData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Flow uploadImage;
        List list2;
        Uri uri;
        Collection collection;
        Collection collection2;
        Dialog dialog;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        Collection collection3 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CollectionDetailEditDialogFragment collectionDetailEditDialogFragment = this.this$0;
            list = collectionDetailEditDialogFragment.imageList;
            uploadImage = collectionDetailEditDialogFragment.uploadImage(list);
            this.label = 1;
            obj = FlowKt__CollectionKt.toList$default(uploadImage, null, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            if (!(str == null || str.length() == 0)) {
                arrayList.add(next);
            }
        }
        List<String> mutableList = CollectionsKt.toMutableList((java.util.Collection) CollectionsKt.filterNotNull(arrayList));
        int size = mutableList.size();
        list2 = this.this$0.imageList;
        if (size == list2.size()) {
            uri = this.this$0.headerImageUri;
            if (uri != null) {
                String uri2 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                mutableList.add(0, uri2);
            }
            collection = this.this$0.originalCollectionClone;
            if (collection == null) {
                Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
                collection = null;
            }
            collection.setImageUrl(mutableList);
            CollectionRepository collectionRepository = CollectionRepository.INSTANCE;
            collection2 = this.this$0.originalCollectionClone;
            if (collection2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("originalCollectionClone");
            } else {
                collection3 = collection2;
            }
            LiveData<Pair<Status, Collection>> saveCollectionMessage = collectionRepository.saveCollectionMessage(collection3);
            CollectionDetailEditDialogFragment collectionDetailEditDialogFragment2 = this.this$0;
            final CollectionDetailEditDialogFragment collectionDetailEditDialogFragment3 = this.this$0;
            saveCollectionMessage.observe(collectionDetailEditDialogFragment2, new CollectionDetailEditDialogFragment$sam$androidx_lifecycle_Observer$0(new Function1<Pair<? extends Status, ? extends Collection>, Unit>() { // from class: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$saveData$2.2
                {
                    super(1);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: CollectionDetailEditDialogFragment.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$saveData$2$2$1", f = "CollectionDetailEditDialogFragment.kt", i = {}, l = {586}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment$saveData$2$2$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Pair<Status, Collection> $it;
                    int label;
                    final /* synthetic */ CollectionDetailEditDialogFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(CollectionDetailEditDialogFragment collectionDetailEditDialogFragment, Pair<? extends Status, Collection> pair, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = collectionDetailEditDialogFragment;
                        this.$it = pair;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, this.$it, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object doAfterSaveCollection;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            CollectionDetailEditDialogFragment collectionDetailEditDialogFragment = this.this$0;
                            Pair<Status, Collection> it = this.$it;
                            Intrinsics.checkNotNullExpressionValue(it, "$it");
                            this.label = 1;
                            doAfterSaveCollection = collectionDetailEditDialogFragment.doAfterSaveCollection(it, this);
                            if (doAfterSaveCollection == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Status, ? extends Collection> pair) {
                    invoke2((Pair<? extends Status, Collection>) pair);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Pair<? extends Status, Collection> pair) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(CollectionDetailEditDialogFragment.this), null, null, new AnonymousClass1(CollectionDetailEditDialogFragment.this, pair, null), 3, null);
                }
            }));
            return Unit.INSTANCE;
        }
        ToastUtils.showError(R.string.text_error, new Object[0]);
        dialog = this.this$0.progress;
        if (dialog != null) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }
}
