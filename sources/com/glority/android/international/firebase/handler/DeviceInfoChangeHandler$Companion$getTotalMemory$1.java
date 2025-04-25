package com.glority.android.international.firebase.handler;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.international.firebase.handler.DeviceInfoChangeHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceInfoChangeHandler.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.international.firebase.handler.DeviceInfoChangeHandler$Companion", f = "DeviceInfoChangeHandler.kt", i = {0}, l = {124}, m = "getTotalMemory", n = {"total"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class DeviceInfoChangeHandler$Companion$getTotalMemory$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceInfoChangeHandler.Companion this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoChangeHandler$Companion$getTotalMemory$1(DeviceInfoChangeHandler.Companion companion, Continuation<? super DeviceInfoChangeHandler$Companion$getTotalMemory$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getTotalMemory(this);
    }
}
