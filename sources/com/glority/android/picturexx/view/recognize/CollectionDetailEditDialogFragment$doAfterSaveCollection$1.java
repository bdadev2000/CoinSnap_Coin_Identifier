package com.glority.android.picturexx.view.recognize;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionDetailEditDialogFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment", f = "CollectionDetailEditDialogFragment.kt", i = {0, 0}, l = {831}, m = "doAfterSaveCollection", n = {"this", "it"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
public final class CollectionDetailEditDialogFragment$doAfterSaveCollection$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CollectionDetailEditDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionDetailEditDialogFragment$doAfterSaveCollection$1(CollectionDetailEditDialogFragment collectionDetailEditDialogFragment, Continuation<? super CollectionDetailEditDialogFragment$doAfterSaveCollection$1> continuation) {
        super(continuation);
        this.this$0 = collectionDetailEditDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object doAfterSaveCollection;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        doAfterSaveCollection = this.this$0.doAfterSaveCollection(null, this);
        return doAfterSaveCollection;
    }
}
