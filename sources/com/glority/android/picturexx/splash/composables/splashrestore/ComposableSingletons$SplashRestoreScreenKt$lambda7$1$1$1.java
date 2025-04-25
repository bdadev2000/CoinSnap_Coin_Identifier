package com.glority.android.picturexx.splash.composables.splashrestore;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashRestoreScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-7$1$1$1", f = "SplashRestoreScreen.kt", i = {}, l = {512}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-7$1$1$1, reason: invalid class name */
/* loaded from: classes5.dex */
public final class ComposableSingletons$SplashRestoreScreenKt$lambda7$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<RestoreState> $state$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$SplashRestoreScreenKt$lambda7$1$1$1(MutableState<RestoreState> mutableState, Continuation<? super ComposableSingletons$SplashRestoreScreenKt$lambda7$1$1$1> continuation) {
        super(2, continuation);
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ComposableSingletons$SplashRestoreScreenKt$lambda7$1$1$1(this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ComposableSingletons$SplashRestoreScreenKt$lambda7$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0025 -> B:5:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L28
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
        L1a:
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.label = r2
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r6 != r0) goto L28
            return r0
        L28:
            androidx.compose.runtime.MutableState<com.glority.android.picturexx.splash.composables.splashrestore.RestoreState> r6 = r5.$state$delegate
            com.glority.android.picturexx.splash.composables.splashrestore.RestoreState r6 = com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda7$1.access$invoke$lambda$1(r6)
            int r6 = r6.getIndex()
            int r6 = r6 + r2
            com.glority.android.picturexx.splash.composables.splashrestore.RestoreState[] r1 = com.glority.android.picturexx.splash.composables.splashrestore.RestoreState.values()
            int r1 = r1.length
            int r6 = r6 % r1
            androidx.compose.runtime.MutableState<com.glority.android.picturexx.splash.composables.splashrestore.RestoreState> r1 = r5.$state$delegate
            com.glority.android.picturexx.splash.composables.splashrestore.RestoreState$Companion r3 = com.glority.android.picturexx.splash.composables.splashrestore.RestoreState.INSTANCE
            com.glority.android.picturexx.splash.composables.splashrestore.RestoreState r6 = r3.fromIndex(r6)
            com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda7$1.access$invoke$lambda$2(r1, r6)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda7$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
