package com.glority.android.picturexx.splash.fragment.splash;

import androidx.lifecycle.LifecycleOwnerKt;
import com.glority.android.core.route.abtest.AbtestGetVariableRequest;
import com.glority.android.picturexx.splash.DetectionBenchMark;
import com.glority.base.utils.AbTestUtil;
import com.glority.utils.stability.LogUtils;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment$updateVipInfo$1", f = "SplashFragment.kt", i = {0}, l = {319}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes5.dex */
public final class SplashFragment$updateVipInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SplashFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$updateVipInfo$1(SplashFragment splashFragment, Continuation<? super SplashFragment$updateVipInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = splashFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SplashFragment$updateVipInfo$1 splashFragment$updateVipInfo$1 = new SplashFragment$updateVipInfo$1(this.this$0, continuation);
        splashFragment$updateVipInfo$1.L$0 = obj;
        return splashFragment$updateVipInfo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SplashFragment$updateVipInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred deferred;
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            deferred = this.this$0.installReferrerJob;
            if (deferred == null) {
                coroutineScope = coroutineScope3;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(this.this$0, null), 2, null);
                return Unit.INSTANCE;
            }
            this.L$0 = coroutineScope3;
            this.label = 1;
            if (deferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope2 = coroutineScope3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        coroutineScope = coroutineScope2;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(this.this$0, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SplashFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment$updateVipInfo$1$1", f = "SplashFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$updateVipInfo$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SplashFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SplashFragment splashFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = splashFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
            final SplashFragment splashFragment = this.this$0;
            final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$updateVipInfo$1$1$action$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: SplashFragment.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment$updateVipInfo$1$1$action$1$1", f = "SplashFragment.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$updateVipInfo$1$1$action$1$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ SplashFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SplashFragment splashFragment, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = splashFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            if (DetectionBenchMark.INSTANCE.getDetectionSupport() == null) {
                                this.label = 1;
                                obj = this.this$0.startEvaluateDetectEfficiency(this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            this.this$0.jumpAccordingly();
                            return Unit.INSTANCE;
                        }
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        LogUtils.e("Realtime Detection is supported: " + booleanValue);
                        DetectionBenchMark.INSTANCE.setDetectionSupport(Boxing.boxBoolean(booleanValue));
                        this.this$0.jumpAccordingly();
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(SplashFragment.this), null, null, new AnonymousClass1(SplashFragment.this, null), 3, null);
                }
            };
            new AbtestGetVariableRequest(AbTestUtil.tag_conversion_page).subscribe(new Consumer() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$updateVipInfo$1$1$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    Function0.this.invoke();
                }
            }, new Consumer() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$updateVipInfo$1$1$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    Function0.this.invoke();
                }
            });
            return Unit.INSTANCE;
        }
    }
}
