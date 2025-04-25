package com.glority.android.picturexx.splash.fragment.splash;

import com.glority.component.generatedAPI.kotlinAPI.vip.GetVipCardMessage;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterGetVipCardMessageSuccess$1", f = "SplashFragment.kt", i = {0, 0, 0}, l = {657}, m = "invokeSuspend", n = {"$this$launch", "vipInfo", "startTime"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes5.dex */
public final class SplashFragment$doAfterGetVipCardMessageSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GetVipCardMessage $data;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SplashFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$doAfterGetVipCardMessageSuccess$1(SplashFragment splashFragment, GetVipCardMessage getVipCardMessage, Continuation<? super SplashFragment$doAfterGetVipCardMessageSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = splashFragment;
        this.$data = getVipCardMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SplashFragment$doAfterGetVipCardMessageSuccess$1 splashFragment$doAfterGetVipCardMessageSuccess$1 = new SplashFragment$doAfterGetVipCardMessageSuccess$1(this.this$0, this.$data, continuation);
        splashFragment$doAfterGetVipCardMessageSuccess$1.L$0 = obj;
        return splashFragment$doAfterGetVipCardMessageSuccess$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SplashFragment$doAfterGetVipCardMessageSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Type inference failed for: r12v21, types: [com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo, T] */
    /* JADX WARN: Type inference failed for: r12v5, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterGetVipCardMessageSuccess$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SplashFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterGetVipCardMessageSuccess$1$1", f = "SplashFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterGetVipCardMessageSuccess$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GetVipCardMessage $data;
        final /* synthetic */ Ref.ObjectRef<VipInfo> $vipInfo;
        int label;
        final /* synthetic */ SplashFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<VipInfo> objectRef, SplashFragment splashFragment, GetVipCardMessage getVipCardMessage, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$vipInfo = objectRef;
            this.this$0 = splashFragment;
            this.$data = getVipCardMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$vipInfo, this.this$0, this.$data, continuation);
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
            if (this.$vipInfo.element != null) {
                this.this$0.updateVipInfo(this.$vipInfo.element);
            } else {
                this.this$0.updateVipInfo(this.$data.getVipInfo());
            }
            return Unit.INSTANCE;
        }
    }
}
