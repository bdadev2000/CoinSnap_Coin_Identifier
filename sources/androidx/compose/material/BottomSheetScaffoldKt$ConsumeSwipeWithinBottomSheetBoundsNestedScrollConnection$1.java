package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"androidx/compose/material/BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", LogEvents.available, "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ AnchoredDraggableState<?> $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        this.$state = anchoredDraggableState;
        this.$orientation = orientation;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo1061onPreScrollOzD1aCk(long available, int source) {
        float offsetToFloat = offsetToFloat(available);
        if (offsetToFloat < 0.0f && NestedScrollSource.m5605equalsimpl0(source, NestedScrollSource.INSTANCE.m5613getDragWNlRxjI())) {
            return toOffset(this.$state.dispatchRawDelta(offsetToFloat));
        }
        return Offset.INSTANCE.m4290getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo787onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (NestedScrollSource.m5605equalsimpl0(source, NestedScrollSource.INSTANCE.m5613getDragWNlRxjI())) {
            return toOffset(this.$state.dispatchRawDelta(offsetToFloat(available)));
        }
        return Offset.INSTANCE.m4290getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo1060onPreFlingQWom1Mo(long r6, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L14
            r0 = r8
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            r0.<init>(r5, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2c
            long r6 = r0.J$0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            float r8 = r5.velocityToFloat(r6)
            androidx.compose.material.AnchoredDraggableState<?> r2 = r5.$state
            float r2 = r2.requireOffset()
            r4 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L62
            androidx.compose.material.AnchoredDraggableState<?> r4 = r5.$state
            androidx.compose.material.DraggableAnchors r4 = r4.getAnchors()
            float r4 = r4.minAnchor()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L62
            androidx.compose.material.AnchoredDraggableState<?> r2 = r5.$state
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r8 = r2.settle(r8, r0)
            if (r8 != r1) goto L68
            return r1
        L62:
            androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.ui.unit.Velocity.INSTANCE
            long r6 = r6.m7245getZero9UxMQ8M()
        L68:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m7225boximpl(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.mo1060onPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo786onPostFlingRZ2iAVY(long r3, long r5, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L14
            r3 = r7
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r0
            if (r4 == 0) goto L14
            int r4 = r3.label
            int r4 = r4 - r0
            r3.label = r4
            goto L19
        L14:
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L19:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2c
            long r5 = r3.J$0
            kotlin.ResultKt.throwOnFailure(r4)
            goto L49
        L2c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L35:
            kotlin.ResultKt.throwOnFailure(r4)
            androidx.compose.material.AnchoredDraggableState<?> r4 = r2.$state
            float r0 = r2.velocityToFloat(r5)
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r3 = r4.settle(r0, r3)
            if (r3 != r7) goto L49
            return r7
        L49:
            androidx.compose.ui.unit.Velocity r3 = androidx.compose.ui.unit.Velocity.m7225boximpl(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.mo786onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final long toOffset(float f) {
        float f2 = this.$orientation == Orientation.Horizontal ? f : 0.0f;
        if (this.$orientation != Orientation.Vertical) {
            f = 0.0f;
        }
        return OffsetKt.Offset(f2, f);
    }

    private final float velocityToFloat(long j) {
        return this.$orientation == Orientation.Horizontal ? Velocity.m7234getXimpl(j) : Velocity.m7235getYimpl(j);
    }

    private final float offsetToFloat(long j) {
        return this.$orientation == Orientation.Horizontal ? Offset.m4274getXimpl(j) : Offset.m4275getYimpl(j);
    }
}
