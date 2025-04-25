package com.glority.android.picturexx.view.recognize;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecognizeCmsDetailFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment", f = "RecognizeCmsDetailFragment.kt", i = {}, l = {TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS}, m = "getCmsNameByUid", n = {}, s = {})
/* loaded from: classes5.dex */
public final class RecognizeCmsDetailFragment$getCmsNameByUid$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecognizeCmsDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecognizeCmsDetailFragment$getCmsNameByUid$1(RecognizeCmsDetailFragment recognizeCmsDetailFragment, Continuation<? super RecognizeCmsDetailFragment$getCmsNameByUid$1> continuation) {
        super(continuation);
        this.this$0 = recognizeCmsDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object cmsNameByUid;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        cmsNameByUid = this.this$0.getCmsNameByUid(null, this);
        return cmsNameByUid;
    }
}
