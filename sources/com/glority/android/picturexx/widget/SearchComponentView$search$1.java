package com.glority.android.picturexx.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.databinding.GlSearchViewBinding;
import com.glority.android.picturexx.widget.SearchComponentView;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchComponentView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.widget.SearchComponentView$search$1", f = "SearchComponentView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SearchComponentView$search$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $keyword;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchComponentView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchComponentView$search$1(SearchComponentView searchComponentView, String str, Continuation<? super SearchComponentView$search$1> continuation) {
        super(2, continuation);
        this.this$0 = searchComponentView;
        this.$keyword = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchComponentView$search$1 searchComponentView$search$1 = new SearchComponentView$search$1(this.this$0, this.$keyword, continuation);
        searchComponentView$search$1.L$0 = obj;
        return searchComponentView$search$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchComponentView$search$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchComponentView.SearchCallback searchCallback;
        HashMap hashMap;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            searchCallback = this.this$0.callback;
            if (searchCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callback");
                searchCallback = null;
            }
            List<SearchComponentView.SearchEntity> doSearchBlocking = searchCallback.doSearchBlocking(this.$keyword);
            hashMap = this.this$0.searchCache;
            hashMap.put(this.$keyword, doSearchBlocking);
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(this.this$0, doSearchBlocking, null), 2, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchComponentView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.widget.SearchComponentView$search$1$1", f = "SearchComponentView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.widget.SearchComponentView$search$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SearchComponentView.SearchEntity> $result;
        int label;
        final /* synthetic */ SearchComponentView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SearchComponentView searchComponentView, List<SearchComponentView.SearchEntity> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = searchComponentView;
            this.$result = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$result, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SearchComponentView.SimpleAdapter simpleAdapter;
            GlSearchViewBinding glSearchViewBinding;
            SearchComponentView.SearchCallback searchCallback;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                simpleAdapter = this.this$0.adapter;
                simpleAdapter.setNewData(this.$result);
                glSearchViewBinding = this.this$0.binding;
                RecyclerView rv = glSearchViewBinding.rv;
                Intrinsics.checkNotNullExpressionValue(rv, "rv");
                rv.setVisibility(0);
                searchCallback = this.this$0.callback;
                if (searchCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    searchCallback = null;
                }
                View noSearchDisplayView = searchCallback.noSearchDisplayView();
                if (noSearchDisplayView != null) {
                    noSearchDisplayView.setVisibility(8);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
