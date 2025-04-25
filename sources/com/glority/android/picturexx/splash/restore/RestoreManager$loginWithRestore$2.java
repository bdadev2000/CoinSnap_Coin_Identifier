package com.glority.android.picturexx.splash.restore;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RestoreManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.restore.RestoreManager$loginWithRestore$2", f = "RestoreManager.kt", i = {0, 1}, l = {155, 156}, m = "invokeSuspend", n = {"configRequestDeferred", "vipCardRequest"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
public final class RestoreManager$loginWithRestore$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RestoreManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestoreManager$loginWithRestore$2(RestoreManager restoreManager, Continuation<? super RestoreManager$loginWithRestore$2> continuation) {
        super(2, continuation);
        this.this$0 = restoreManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RestoreManager$loginWithRestore$2 restoreManager$loginWithRestore$2 = new RestoreManager$loginWithRestore$2(this.this$0, continuation);
        restoreManager$loginWithRestore$2.L$0 = obj;
        return restoreManager$loginWithRestore$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RestoreManager$loginWithRestore$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.restore.RestoreManager$loginWithRestore$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
