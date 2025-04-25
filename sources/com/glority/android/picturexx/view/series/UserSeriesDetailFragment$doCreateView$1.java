package com.glority.android.picturexx.view.series;

import androidx.fragment.app.FragmentActivity;
import com.glority.android.database.entities.UserSeriesListItem;
import com.glority.android.picturexx.repository.SeriesRepository;
import java.util.Iterator;
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
import kotlinx.coroutines.Dispatchers;

/* compiled from: UserSeriesDetailFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.series.UserSeriesDetailFragment$doCreateView$1", f = "UserSeriesDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class UserSeriesDetailFragment$doCreateView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UserSeriesDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSeriesDetailFragment$doCreateView$1(UserSeriesDetailFragment userSeriesDetailFragment, Continuation<? super UserSeriesDetailFragment$doCreateView$1> continuation) {
        super(2, continuation);
        this.this$0 = userSeriesDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UserSeriesDetailFragment$doCreateView$1 userSeriesDetailFragment$doCreateView$1 = new UserSeriesDetailFragment$doCreateView$1(this.this$0, continuation);
        userSeriesDetailFragment$doCreateView$1.L$0 = obj;
        return userSeriesDetailFragment$doCreateView$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserSeriesDetailFragment$doCreateView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserSeriesListItem userSeriesListItem;
        Object obj2;
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        try {
            List<UserSeriesListItem> userSeriesListMessageSync = SeriesRepository.INSTANCE.getUserSeriesListMessageSync();
            if (userSeriesListMessageSync != null) {
                UserSeriesDetailFragment userSeriesDetailFragment = this.this$0;
                Iterator<T> it = userSeriesListMessageSync.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    String indexListUid = ((UserSeriesListItem) obj2).getIndexListUid();
                    str = userSeriesDetailFragment.indexListUid;
                    if (Intrinsics.areEqual(indexListUid, str)) {
                        break;
                    }
                }
                userSeriesListItem = (UserSeriesListItem) obj2;
            } else {
                userSeriesListItem = null;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(userSeriesListItem, this.this$0, null), 2, null);
        } catch (Throwable unused) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass2(this.this$0, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserSeriesDetailFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.series.UserSeriesDetailFragment$doCreateView$1$1", f = "UserSeriesDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$doCreateView$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UserSeriesListItem $find;
        int label;
        final /* synthetic */ UserSeriesDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UserSeriesListItem userSeriesListItem, UserSeriesDetailFragment userSeriesDetailFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$find = userSeriesListItem;
            this.this$0 = userSeriesDetailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$find, this.this$0, continuation);
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
            UserSeriesListItem userSeriesListItem = this.$find;
            if (userSeriesListItem != null) {
                this.this$0.seriesId = userSeriesListItem.getSeriesId();
                this.this$0.initView();
                this.this$0.initData();
                this.this$0.initObserver();
            } else {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserSeriesDetailFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.series.UserSeriesDetailFragment$doCreateView$1$2", f = "UserSeriesDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$doCreateView$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ UserSeriesDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(UserSeriesDetailFragment userSeriesDetailFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = userSeriesDetailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }
}
