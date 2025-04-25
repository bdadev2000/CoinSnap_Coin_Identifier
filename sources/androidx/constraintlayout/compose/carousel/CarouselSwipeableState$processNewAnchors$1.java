package androidx.constraintlayout.compose.carousel;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.app.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CarouselSwipeable.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState", f = "CarouselSwipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {146, BuildConfig.VERSION_CODE, 174}, m = "processNewAnchors$constraintlayout_compose_release", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
/* loaded from: classes8.dex */
public final class CarouselSwipeableState$processNewAnchors$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CarouselSwipeableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableState$processNewAnchors$1(CarouselSwipeableState<T> carouselSwipeableState, Continuation<? super CarouselSwipeableState$processNewAnchors$1> continuation) {
        super(continuation);
        this.this$0 = carouselSwipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processNewAnchors$constraintlayout_compose_release(null, null, this);
    }
}
