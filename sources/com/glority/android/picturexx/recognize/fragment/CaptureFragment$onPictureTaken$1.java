package com.glority.android.picturexx.recognize.fragment;

import androidx.appcompat.widget.AppCompatTextView;
import com.glority.android.picturexx.recognize.R;
import com.glority.widget.GlTextView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$onPictureTaken$1", f = "CaptureFragment.kt", i = {0, 0}, l = {899}, m = "invokeSuspend", n = {"$this$launch", "i"}, s = {"L$0", "I$0"})
/* loaded from: classes5.dex */
public final class CaptureFragment$onPictureTaken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CaptureFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureFragment$onPictureTaken$1(CaptureFragment captureFragment, Continuation<? super CaptureFragment$onPictureTaken$1> continuation) {
        super(2, continuation);
        this.this$0 = captureFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CaptureFragment$onPictureTaken$1 captureFragment$onPictureTaken$1 = new CaptureFragment$onPictureTaken$1(this.this$0, continuation);
        captureFragment$onPictureTaken$1.L$0 = obj;
        return captureFragment$onPictureTaken$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CaptureFragment$onPictureTaken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x004f -> B:5:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            int r1 = r9.I$0
            java.lang.Object r3 = r9.L$0
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r3
            goto L52
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            r1 = 3
        L26:
            r3 = 0
            if (r1 <= 0) goto L55
            kotlinx.coroutines.MainCoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.glority.android.picturexx.recognize.fragment.CaptureFragment$onPictureTaken$1$1 r5 = new com.glority.android.picturexx.recognize.fragment.CaptureFragment$onPictureTaken$1$1
            com.glority.android.picturexx.recognize.fragment.CaptureFragment r6 = r9.this$0
            r5.<init>(r6, r1, r3)
            r6 = r5
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 2
            r8 = 0
            r5 = 0
            r3 = r10
            kotlinx.coroutines.BuildersKt.launch$default(r3, r4, r5, r6, r7, r8)
            r3 = r9
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r9.L$0 = r10
            r9.I$0 = r1
            r9.label = r2
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r4, r3)
            if (r3 != r0) goto L52
            return r0
        L52:
            int r1 = r1 + (-1)
            goto L26
        L55:
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            r4 = r0
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.glority.android.picturexx.recognize.fragment.CaptureFragment$onPictureTaken$1$2 r0 = new com.glority.android.picturexx.recognize.fragment.CaptureFragment$onPictureTaken$1$2
            com.glority.android.picturexx.recognize.fragment.CaptureFragment r1 = r9.this$0
            r0.<init>(r1, r3)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 2
            r8 = 0
            r5 = 0
            r3 = r10
            kotlinx.coroutines.BuildersKt.launch$default(r3, r4, r5, r6, r7, r8)
            com.glority.android.picturexx.recognize.fragment.CaptureFragment r10 = r9.this$0
            r0 = 0
            com.glority.android.picturexx.recognize.fragment.CaptureFragment.access$holdDet(r10, r0)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.recognize.fragment.CaptureFragment$onPictureTaken$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CaptureFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$onPictureTaken$1$1", f = "CaptureFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.recognize.fragment.CaptureFragment$onPictureTaken$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $i;
        int label;
        final /* synthetic */ CaptureFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CaptureFragment captureFragment, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = captureFragment;
            this.$i = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$i, continuation);
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
            GlTextView countDownTv = CaptureFragment.access$getBinding(this.this$0).countDownTv;
            Intrinsics.checkNotNullExpressionValue(countDownTv, "countDownTv");
            countDownTv.setVisibility(0);
            CaptureFragment.access$getBinding(this.this$0).countDownTv.setText(String.valueOf(this.$i));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CaptureFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$onPictureTaken$1$2", f = "CaptureFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.recognize.fragment.CaptureFragment$onPictureTaken$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CaptureFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CaptureFragment captureFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = captureFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean enableAnalyse;
            String string;
            boolean enableAnalyse2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GlTextView glTextView = CaptureFragment.access$getBinding(this.this$0).tvImgTitle;
            enableAnalyse = this.this$0.getEnableAnalyse();
            String str = "";
            if (enableAnalyse) {
                string = "";
            } else {
                string = this.this$0.getString(R.string.camera_tips_focus);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            glTextView.setText(string);
            AppCompatTextView tvCaptureHint = CaptureFragment.access$getBinding(this.this$0).tvCaptureHint;
            Intrinsics.checkNotNullExpressionValue(tvCaptureHint, "tvCaptureHint");
            AppCompatTextView appCompatTextView = tvCaptureHint;
            enableAnalyse2 = this.this$0.getEnableAnalyse();
            if (!enableAnalyse2) {
                str = this.this$0.getString(R.string.camera_tips_focus);
                Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
            }
            CaptureFragmentKt.updateCaptureHint(appCompatTextView, str);
            GlTextView countDownTv = CaptureFragment.access$getBinding(this.this$0).countDownTv;
            Intrinsics.checkNotNullExpressionValue(countDownTv, "countDownTv");
            countDownTv.setVisibility(8);
            CaptureFragment.access$getBinding(this.this$0).countDownTv.setText("1");
            return Unit.INSTANCE;
        }
    }
}
