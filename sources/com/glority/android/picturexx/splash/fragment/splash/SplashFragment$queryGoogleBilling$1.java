package com.glority.android.picturexx.splash.fragment.splash;

import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.glority.android.core.app.AppContext;
import com.glority.base.utils.GoogleBillingQuery;
import com.glority.utils.stability.LogUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lcom/android/billingclient/api/Purchase;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment$queryGoogleBilling$1", f = "SplashFragment.kt", i = {}, l = {534}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SplashFragment$queryGoogleBilling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Boolean, ? extends List<Purchase>>>, Object> {
    final /* synthetic */ GoogleBillingQuery $billing;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$queryGoogleBilling$1(GoogleBillingQuery googleBillingQuery, Continuation<? super SplashFragment$queryGoogleBilling$1> continuation) {
        super(2, continuation);
        this.$billing = googleBillingQuery;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashFragment$queryGoogleBilling$1(this.$billing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Boolean, ? extends List<Purchase>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<Boolean, ? extends List<Purchase>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<Boolean, ? extends List<Purchase>>> continuation) {
        return ((SplashFragment$queryGoogleBilling$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SplashFragment$queryGoogleBilling$1$1$1 splashFragment$queryGoogleBilling$1$1$1 = new SplashFragment$queryGoogleBilling$1$1$1(this.$billing, null);
                this.label = 1;
                obj = TimeoutKt.withTimeout(5000L, splashFragment$queryGoogleBilling$1$1$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (Pair) obj;
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }
}
