package com.glority.android.picturexx.extensions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeriesItemListExt.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.extensions.SeriesItemListExtKt", f = "SeriesItemListExt.kt", i = {0}, l = {39}, m = "sortByUpdatedDateDescending", n = {"$this$sortByUpdatedDateDescending"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class SeriesItemListExtKt$sortByUpdatedDateDescending$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SeriesItemListExtKt$sortByUpdatedDateDescending$1(Continuation<? super SeriesItemListExtKt$sortByUpdatedDateDescending$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SeriesItemListExtKt.sortByUpdatedDateDescending(null, this);
    }
}
