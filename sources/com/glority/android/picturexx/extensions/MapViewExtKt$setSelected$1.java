package com.glority.android.picturexx.extensions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapViewExt.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.extensions.MapViewExtKt", f = "MapViewExt.kt", i = {0, 0, 0, 0}, l = {120}, m = "setSelected", n = {"$this$setSelected", "context", "binding", "selected"}, s = {"L$0", "L$1", "L$2", "Z$0"})
/* loaded from: classes2.dex */
public final class MapViewExtKt$setSelected$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapViewExtKt$setSelected$1(Continuation<? super MapViewExtKt$setSelected$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MapViewExtKt.setSelected(null, null, false, this);
    }
}
