package com.glority.android.picturexx.recognize.fragment;

import com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CaptureFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1$2", f = "CaptureFragment.kt", i = {0, 0}, l = {954}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
public final class CaptureFragment$createAutoZoomInJob$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CaptureFragment$createAutoZoomInJob$1.AnonymousClass2<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CaptureFragment$createAutoZoomInJob$1$2$emit$1(CaptureFragment$createAutoZoomInJob$1.AnonymousClass2<? super T> anonymousClass2, Continuation<? super CaptureFragment$createAutoZoomInJob$1$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((AnalysisResult) null, (Continuation<? super Unit>) this);
    }
}
