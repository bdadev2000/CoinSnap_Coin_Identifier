package com.glority.android.picturexx.view.me;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeCollectionOfficialSetsPageFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment", f = "MeCollectionOfficialSetsPageFragment.kt", i = {0, 0, 0}, l = {306}, m = "updateAdapter", n = {"this", "destination$iv$iv", "seriesItem"}, s = {"L$0", "L$1", "L$3"})
/* loaded from: classes5.dex */
public final class MeCollectionOfficialSetsPageFragment$updateAdapter$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MeCollectionOfficialSetsPageFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeCollectionOfficialSetsPageFragment$updateAdapter$1(MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment, Continuation<? super MeCollectionOfficialSetsPageFragment$updateAdapter$1> continuation) {
        super(continuation);
        this.this$0 = meCollectionOfficialSetsPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateAdapter;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateAdapter = this.this$0.updateAdapter(null, this);
        return updateAdapter;
    }
}
