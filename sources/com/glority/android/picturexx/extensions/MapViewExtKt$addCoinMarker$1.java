package com.glority.android.picturexx.extensions;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapViewExt.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.extensions.MapViewExtKt", f = "MapViewExt.kt", i = {0, 0, 0, 0, 0, 0}, l = {TsExtractor.TS_SYNC_BYTE}, m = "addCoinMarker", n = {"$this$addCoinMarker", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "binding", "latitude", "longitude", "count"}, s = {"L$0", "L$1", "L$2", "D$0", "D$1", "I$0"})
/* loaded from: classes2.dex */
public final class MapViewExtKt$addCoinMarker$1 extends ContinuationImpl {
    double D$0;
    double D$1;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapViewExtKt$addCoinMarker$1(Continuation<? super MapViewExtKt$addCoinMarker$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MapViewExtKt.addCoinMarker(null, null, 0.0d, 0.0d, 0, null, this);
    }
}
