package com.glority.android.picturexx.view.me;

import com.glority.android.cmsui2.view.child.WebViewItemView;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.entity.MethodResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectDetailFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectDetailFragment$editCollection$1", f = "CollectDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CollectDetailFragment$editCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $collectionId;
    final /* synthetic */ JsbWebView.MethodCallback $methodCallback;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CollectDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectDetailFragment$editCollection$1(int i, CollectDetailFragment collectDetailFragment, JsbWebView.MethodCallback methodCallback, Continuation<? super CollectDetailFragment$editCollection$1> continuation) {
        super(2, continuation);
        this.$collectionId = i;
        this.this$0 = collectDetailFragment;
        this.$methodCallback = methodCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CollectDetailFragment$editCollection$1 collectDetailFragment$editCollection$1 = new CollectDetailFragment$editCollection$1(this.$collectionId, this.this$0, this.$methodCallback, continuation);
        collectDetailFragment$editCollection$1.L$0 = obj;
        return collectDetailFragment$editCollection$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CollectDetailFragment$editCollection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CollectionItem itemSync = DBManager.INSTANCE.getCollectionItemDao().getItemSync(this.$collectionId);
        if (itemSync == null) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(this.this$0, itemSync, this.$collectionId, this.$methodCallback, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollectDetailFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectDetailFragment$editCollection$1$1", f = "CollectDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.me.CollectDetailFragment$editCollection$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $collectionId;
        final /* synthetic */ CollectionItem $item;
        final /* synthetic */ JsbWebView.MethodCallback $methodCallback;
        int label;
        final /* synthetic */ CollectDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CollectDetailFragment collectDetailFragment, CollectionItem collectionItem, int i, JsbWebView.MethodCallback methodCallback, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = collectDetailFragment;
            this.$item = collectionItem;
            this.$collectionId = i;
            this.$methodCallback = methodCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$item, this.$collectionId, this.$methodCallback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CollectionDetailEditDialogFragment editOpen$default = CollectionDetailEditDialogFragment.Companion.editOpen$default(CollectionDetailEditDialogFragment.INSTANCE, this.this$0.getSupportFragmentManager(), this.$item.toCollection(), 0, this.this$0.getPageName(), this.this$0.getCmsName(), null, null, 96, null);
            final int i = this.$collectionId;
            final CollectDetailFragment collectDetailFragment = this.this$0;
            final JsbWebView.MethodCallback methodCallback = this.$methodCallback;
            editOpen$default.setStatusCallback(new Function1<String, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment.editCollection.1.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: CollectDetailFragment.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectDetailFragment$editCollection$1$1$1$1", f = "CollectDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.view.me.CollectDetailFragment$editCollection$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C01171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ int $collectionId;
                    final /* synthetic */ String $it;
                    final /* synthetic */ JsbWebView.MethodCallback $methodCallback;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ CollectDetailFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01171(int i, CollectDetailFragment collectDetailFragment, JsbWebView.MethodCallback methodCallback, String str, Continuation<? super C01171> continuation) {
                        super(2, continuation);
                        this.$collectionId = i;
                        this.this$0 = collectDetailFragment;
                        this.$methodCallback = methodCallback;
                        this.$it = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C01171 c01171 = new C01171(this.$collectionId, this.this$0, this.$methodCallback, this.$it, continuation);
                        c01171.L$0 = obj;
                        return c01171;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C01171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, Dispatchers.getMain(), null, new C01181(DBManager.INSTANCE.getCollectionItemDao().getItemSync(this.$collectionId), DBManager.INSTANCE.getUserCustomSeriesItemDao().getAllSync(), this.this$0, this.$methodCallback, this.$it, null), 2, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: CollectDetailFragment.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                    @DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectDetailFragment$editCollection$1$1$1$1$1", f = "CollectDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.glority.android.picturexx.view.me.CollectDetailFragment$editCollection$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes5.dex */
                    public static final class C01181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ List<UserCustomSeriesItem> $allCustomSeries;
                        final /* synthetic */ String $it;
                        final /* synthetic */ JsbWebView.MethodCallback $methodCallback;
                        final /* synthetic */ CollectionItem $newItem;
                        int label;
                        final /* synthetic */ CollectDetailFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C01181(CollectionItem collectionItem, List<UserCustomSeriesItem> list, CollectDetailFragment collectDetailFragment, JsbWebView.MethodCallback methodCallback, String str, Continuation<? super C01181> continuation) {
                            super(2, continuation);
                            this.$newItem = collectionItem;
                            this.$allCustomSeries = list;
                            this.this$0 = collectDetailFragment;
                            this.$methodCallback = methodCallback;
                            this.$it = str;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C01181(this.$newItem, this.$allCustomSeries, this.this$0, this.$methodCallback, this.$it, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C01181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CollectionViewModel vm;
                            JsbWebView webView;
                            JsbWebView webView2;
                            Object obj2;
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            CollectionItem collectionItem = this.$newItem;
                            if (collectionItem != null) {
                                Iterator<T> it = this.$allCustomSeries.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    int customSeriesId = ((UserCustomSeriesItem) obj2).getCustomSeriesId();
                                    Integer customSeriesId2 = collectionItem.getCustomSeriesId();
                                    if (customSeriesId2 != null && customSeriesId == customSeriesId2.intValue()) {
                                        break;
                                    }
                                }
                                UserCustomSeriesItem userCustomSeriesItem = (UserCustomSeriesItem) obj2;
                                collectionItem.setCustomSeriesName(userCustomSeriesItem != null ? userCustomSeriesItem.getTitle() : null);
                            }
                            vm = this.this$0.getVm();
                            vm.setCurrentItem(this.$newItem);
                            WebViewItemView webViewItem = this.this$0.getWebViewItem();
                            if (webViewItem != null && (webView2 = webViewItem.getWebView()) != null) {
                                webView2.setInjectStartupParams(this.this$0.getInjectJsVariableData());
                            }
                            WebViewItemView webViewItem2 = this.this$0.getWebViewItem();
                            if (webViewItem2 != null && (webView = webViewItem2.getWebView()) != null) {
                                webView.rejectStartupParams();
                            }
                            JsbWebView.MethodCallback methodCallback = this.$methodCallback;
                            if (methodCallback != null) {
                                methodCallback.callback(new MethodResponse("success", MapsKt.mapOf(TuplesKt.to("status", this.$it)), null, null, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C01171(i, collectDetailFragment, methodCallback, it, null), 3, null);
                }
            });
            return Unit.INSTANCE;
        }
    }
}
