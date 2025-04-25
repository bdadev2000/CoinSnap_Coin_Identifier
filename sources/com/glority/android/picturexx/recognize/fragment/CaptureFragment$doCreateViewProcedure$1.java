package com.glority.android.picturexx.recognize.fragment;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$doCreateViewProcedure$1", f = "CaptureFragment.kt", i = {0}, l = {275}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$1"})
/* loaded from: classes5.dex */
public final class CaptureFragment$doCreateViewProcedure$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<File> $inputImages;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ CaptureFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CaptureFragment$doCreateViewProcedure$1(List<? extends File> list, CaptureFragment captureFragment, Continuation<? super CaptureFragment$doCreateViewProcedure$1> continuation) {
        super(2, continuation);
        this.$inputImages = list;
        this.this$0 = captureFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptureFragment$doCreateViewProcedure$1(this.$inputImages, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CaptureFragment$doCreateViewProcedure$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006f -> B:5:0x0070). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r8.L$3
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r3 = r8.L$2
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r8.L$1
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r5 = r8.L$0
            com.glority.android.picturexx.recognize.fragment.CaptureFragment r5 = (com.glority.android.picturexx.recognize.fragment.CaptureFragment) r5
            kotlin.ResultKt.throwOnFailure(r9)
            goto L70
        L1f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L27:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.List<java.io.File> r9 = r8.$inputImages
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            com.glority.android.picturexx.recognize.fragment.CaptureFragment r1 = r8.this$0
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r9 = r9.iterator()
            r5 = r1
            r1 = r3
            r3 = r9
        L44:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L77
            java.lang.Object r9 = r3.next()
            java.io.File r9 = (java.io.File) r9
            com.glority.android.picturexx.recognize.vm.CoreViewModel r4 = com.glority.android.picturexx.recognize.fragment.CaptureFragment.access$getVm(r5)     // Catch: java.lang.Exception -> L58
            r4.addOriginalImageFile(r9)     // Catch: java.lang.Exception -> L58
            goto L5c
        L58:
            r9 = move-exception
            r9.printStackTrace()
        L5c:
            r8.L$0 = r5
            r8.L$1 = r1
            r8.L$2 = r3
            r8.L$3 = r1
            r8.label = r2
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r8)
            if (r9 != r0) goto L6f
            return r0
        L6f:
            r4 = r1
        L70:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            r1.add(r9)
            r1 = r4
            goto L44
        L77:
            java.util.List r1 = (java.util.List) r1
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.recognize.fragment.CaptureFragment$doCreateViewProcedure$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
