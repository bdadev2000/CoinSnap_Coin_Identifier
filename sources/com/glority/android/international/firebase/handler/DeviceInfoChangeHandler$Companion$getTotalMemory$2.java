package com.glority.android.international.firebase.handler;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceInfoChangeHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.international.firebase.handler.DeviceInfoChangeHandler$Companion$getTotalMemory$2", f = "DeviceInfoChangeHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class DeviceInfoChangeHandler$Companion$getTotalMemory$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fileNameMemInfo;
    final /* synthetic */ Ref.ObjectRef<String> $str2;
    final /* synthetic */ Ref.IntRef $total;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoChangeHandler$Companion$getTotalMemory$2(String str, Ref.ObjectRef<String> objectRef, Ref.IntRef intRef, Continuation<? super DeviceInfoChangeHandler$Companion$getTotalMemory$2> continuation) {
        super(2, continuation);
        this.$fileNameMemInfo = str;
        this.$str2 = objectRef;
        this.$total = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceInfoChangeHandler$Companion$getTotalMemory$2(this.$fileNameMemInfo, this.$str2, this.$total, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceInfoChangeHandler$Companion$getTotalMemory$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.$fileNameMemInfo), 8192);
            Ref.ObjectRef<String> objectRef = this.$str2;
            ?? readLine = bufferedReader.readLine();
            Intrinsics.checkNotNullExpressionValue(readLine, "localBufferedReader.readLine()");
            objectRef.element = readLine;
            List split$default = StringsKt.split$default((CharSequence) this.$str2.element, new String[]{" "}, false, 0, 6, (Object) null);
            bufferedReader.close();
            this.$total.element = Integer.parseInt((String) split$default.get(8)) / 1024;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
