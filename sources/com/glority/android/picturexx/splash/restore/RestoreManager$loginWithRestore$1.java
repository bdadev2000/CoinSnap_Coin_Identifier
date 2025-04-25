package com.glority.android.picturexx.splash.restore;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RestoreManager.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.restore.RestoreManager", f = "RestoreManager.kt", i = {0, 0}, l = {140, 152}, m = "loginWithRestore", n = {"this", "loginInfo"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
public final class RestoreManager$loginWithRestore$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RestoreManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestoreManager$loginWithRestore$1(RestoreManager restoreManager, Continuation<? super RestoreManager$loginWithRestore$1> continuation) {
        super(continuation);
        this.this$0 = restoreManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loginWithRestore;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loginWithRestore = this.this$0.loginWithRestore(null, this);
        return loginWithRestore;
    }
}
