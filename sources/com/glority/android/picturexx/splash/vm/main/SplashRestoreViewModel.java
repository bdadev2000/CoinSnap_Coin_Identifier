package com.glority.android.picturexx.splash.vm.main;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.glority.android.picturexx.splash.composables.splashrestore.RestoreState;
import com.glority.base.viewmodel.BaseViewModel;
import kotlin.Metadata;

/* compiled from: SplashRestoreViewModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0087@¢\u0006\u0002\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/splash/vm/main/SplashRestoreViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "restoreState", "Landroidx/compose/runtime/MutableState;", "Lcom/glority/android/picturexx/splash/composables/splashrestore/RestoreState;", "getRestoreState", "()Landroidx/compose/runtime/MutableState;", "sendEmail", "", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashRestoreViewModel extends BaseViewModel {
    public static final int $stable = 0;
    private final MutableState<RestoreState> restoreState;

    public SplashRestoreViewModel() {
        MutableState<RestoreState> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(RestoreState.MANUAL, null, 2, null);
        this.restoreState = mutableStateOf$default;
    }

    public final MutableState<RestoreState> getRestoreState() {
        return this.restoreState;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendEmail(java.lang.String r6, kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel$sendEmail$1
            if (r0 == 0) goto L14
            r0 = r7
            com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel$sendEmail$1 r0 = (com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel$sendEmail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel$sendEmail$1 r0 = new com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel$sendEmail$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel$sendEmail$feedbackRes$1 r2 = new com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel$sendEmail$feedbackRes$1
            r4 = 0
            r2.<init>(r6, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            com.glority.network.model.Resource r7 = (com.glority.network.model.Resource) r7
            com.glority.network.model.Status r6 = r7.getStatus()
            com.glority.network.model.Status r7 = com.glority.network.model.Status.SUCCESS
            if (r6 != r7) goto L57
            goto L58
        L57:
            r3 = 0
        L58:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel.sendEmail(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
