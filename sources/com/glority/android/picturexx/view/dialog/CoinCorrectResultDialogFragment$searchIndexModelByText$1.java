package com.glority.android.picturexx.view.dialog;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoinCorrectResultDialogFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment", f = "CoinCorrectResultDialogFragment.kt", i = {}, l = {151}, m = "searchIndexModelByText", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CoinCorrectResultDialogFragment$searchIndexModelByText$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoinCorrectResultDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinCorrectResultDialogFragment$searchIndexModelByText$1(CoinCorrectResultDialogFragment coinCorrectResultDialogFragment, Continuation<? super CoinCorrectResultDialogFragment$searchIndexModelByText$1> continuation) {
        super(continuation);
        this.this$0 = coinCorrectResultDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object searchIndexModelByText;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        searchIndexModelByText = this.this$0.searchIndexModelByText(null, this);
        return searchIndexModelByText;
    }
}
