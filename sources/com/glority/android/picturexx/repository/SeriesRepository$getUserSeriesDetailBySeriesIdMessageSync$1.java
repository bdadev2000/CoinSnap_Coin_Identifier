package com.glority.android.picturexx.repository;

import com.glority.android.xx.constants.Args;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeriesRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.SeriesRepository", f = "SeriesRepository.kt", i = {0, 1, 2}, l = {PsExtractor.AUDIO_STREAM, 199, 226}, m = "getUserSeriesDetailBySeriesIdMessageSync", n = {Args.seriesId, Args.seriesId, "item"}, s = {"J$0", "J$0", "L$0"})
/* loaded from: classes5.dex */
public final class SeriesRepository$getUserSeriesDetailBySeriesIdMessageSync$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SeriesRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeriesRepository$getUserSeriesDetailBySeriesIdMessageSync$1(SeriesRepository seriesRepository, Continuation<? super SeriesRepository$getUserSeriesDetailBySeriesIdMessageSync$1> continuation) {
        super(continuation);
        this.this$0 = seriesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getUserSeriesDetailBySeriesIdMessageSync(0L, this);
    }
}
