package com.bumptech.glide.integration.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.geometry.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.ListPreloader;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Preload.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u009a\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012L\u0010\u000f\u001aH\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0010j\b\u0012\u0004\u0012\u00028\u0000`\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0018J(\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u001e2\u0006\u0010\u001f\u001a\u00020\u0005H\u0097\u0002¢\u0006\u0002\u0010 R\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001aR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX\u0082\u0004¢\u0006\u0002\n\u0000RT\u0010\u000f\u001aH\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0010j\b\u0012\u0004\u0012\u00028\u0000`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lcom/bumptech/glide/integration/compose/PreloadDataImpl;", "DataT", "", "Lcom/bumptech/glide/integration/compose/GlidePreloadingData;", LogEventArguments.ARG_SIZE, "", "indexToData", "Lkotlin/Function1;", "requestManager", "Lcom/bumptech/glide/RequestManager;", "preloadImageSize", "Landroidx/compose/ui/geometry/Size;", "fixedVisibleItemCount", "preloader", "Lcom/bumptech/glide/ListPreloader;", "requestBuilderTransform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "requestBuilder", "Lcom/bumptech/glide/integration/compose/PreloadRequestBuilderTransform;", "(ILkotlin/jvm/functions/Function1;Lcom/bumptech/glide/RequestManager;JLjava/lang/Integer;Lcom/bumptech/glide/ListPreloader;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/lang/Integer;", "J", "getSize", "()I", LogEvents.exportemptyalert_close_click_type_get, "Lkotlin/Pair;", "index", "(ILandroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "compose_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
final class PreloadDataImpl<DataT> implements GlidePreloadingData<DataT> {
    private final Integer fixedVisibleItemCount;
    private final Function1<Integer, DataT> indexToData;
    private final long preloadImageSize;
    private final ListPreloader<DataT> preloader;
    private final Function2<DataT, RequestBuilder<Drawable>, RequestBuilder<Drawable>> requestBuilderTransform;
    private final RequestManager requestManager;
    private final int size;

    public /* synthetic */ PreloadDataImpl(int i, Function1 function1, RequestManager requestManager, long j, Integer num, ListPreloader listPreloader, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, function1, requestManager, j, num, listPreloader, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PreloadDataImpl(int i, Function1<? super Integer, ? extends DataT> function1, RequestManager requestManager, long j, Integer num, ListPreloader<DataT> listPreloader, Function2<? super DataT, ? super RequestBuilder<Drawable>, ? extends RequestBuilder<Drawable>> function2) {
        this.size = i;
        this.indexToData = function1;
        this.requestManager = requestManager;
        this.preloadImageSize = j;
        this.fixedVisibleItemCount = num;
        this.preloader = listPreloader;
        this.requestBuilderTransform = function2;
    }

    @Override // com.bumptech.glide.integration.compose.GlidePreloadingData
    public int getSize() {
        return this.size;
    }

    @Override // com.bumptech.glide.integration.compose.GlidePreloadingData
    public Pair<DataT, RequestBuilder<Drawable>> get(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-1344240489);
        ComposerKt.sourceInformation(composer, "C(get)");
        DataT invoke = this.indexToData.invoke(Integer.valueOf(i));
        Function2<DataT, RequestBuilder<Drawable>, RequestBuilder<Drawable>> function2 = this.requestBuilderTransform;
        Cloneable override = this.requestManager.asDrawable().override((int) Size.m4343getWidthimpl(this.preloadImageSize), (int) Size.m4340getHeightimpl(this.preloadImageSize));
        Intrinsics.checkNotNullExpressionValue(override, "requestManager.asDrawabl…ImageSize.height.toInt())");
        RequestBuilder requestBuilder = (RequestBuilder) function2.invoke(invoke, override);
        EffectsKt.LaunchedEffect(new Object[]{this.preloader, Size.m4331boximpl(this.preloadImageSize), this.requestBuilderTransform, this.indexToData, Integer.valueOf(i)}, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new PreloadDataImpl$get$1(this, i, null), composer, 72);
        Pair<DataT, RequestBuilder<Drawable>> pair = TuplesKt.to(invoke, requestBuilder);
        composer.endReplaceableGroup();
        return pair;
    }
}
