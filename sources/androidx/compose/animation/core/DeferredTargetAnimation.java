package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DeferredTargetAnimation.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J+\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0002\u0010\u001eR/\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0016\u0010\u0017\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/DeferredTargetAnimation;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "", "vectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/TwoWayConverter;)V", "<set-?>", "_pendingTarget", "get_pendingTarget", "()Ljava/lang/Object;", "set_pendingTarget", "(Ljava/lang/Object;)V", "_pendingTarget$delegate", "Landroidx/compose/runtime/MutableState;", "animatable", "Landroidx/compose/animation/core/Animatable;", "isIdle", "", "()Z", "pendingTarget", "getPendingTarget", "target", "getTarget", "updateTarget", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Ljava/lang/Object;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/FiniteAnimationSpec;)Ljava/lang/Object;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DeferredTargetAnimation<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final MutableState _pendingTarget$delegate;
    private Animatable<T, V> animatable;
    private final TwoWayConverter<T, V> vectorConverter;

    public DeferredTargetAnimation(TwoWayConverter<T, V> twoWayConverter) {
        MutableState mutableStateOf$default;
        this.vectorConverter = twoWayConverter;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._pendingTarget$delegate = mutableStateOf$default;
    }

    public final T getPendingTarget() {
        return get_pendingTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T get_pendingTarget() {
        return this._pendingTarget$delegate.getValue();
    }

    private final void set_pendingTarget(T t) {
        this._pendingTarget$delegate.setValue(t);
    }

    private final T getTarget() {
        Animatable<T, V> animatable = this.animatable;
        if (animatable != null) {
            return animatable.getTargetValue();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateTarget$default(DeferredTargetAnimation deferredTargetAnimation, Object obj, CoroutineScope coroutineScope, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj2) {
        if ((i & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return deferredTargetAnimation.updateTarget(obj, coroutineScope, finiteAnimationSpec);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 ??, still in use, count: 1, list:
          (r0v3 ?? I:androidx.compose.animation.core.Animatable<T, V extends androidx.compose.animation.core.AnimationVector>) from 0x0017: IPUT 
          (r0v3 ?? I:androidx.compose.animation.core.Animatable<T, V extends androidx.compose.animation.core.AnimationVector>)
          (r15v0 'this' ?? I:androidx.compose.animation.core.DeferredTargetAnimation A[IMMUTABLE_TYPE, THIS])
         androidx.compose.animation.core.DeferredTargetAnimation.animatable androidx.compose.animation.core.Animatable
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final T updateTarget(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 ??, still in use, count: 1, list:
          (r0v3 ?? I:androidx.compose.animation.core.Animatable<T, V extends androidx.compose.animation.core.AnimationVector>) from 0x0017: IPUT 
          (r0v3 ?? I:androidx.compose.animation.core.Animatable<T, V extends androidx.compose.animation.core.AnimationVector>)
          (r15v0 'this' ?? I:androidx.compose.animation.core.DeferredTargetAnimation A[IMMUTABLE_TYPE, THIS])
         androidx.compose.animation.core.DeferredTargetAnimation.animatable androidx.compose.animation.core.Animatable
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final boolean isIdle() {
        Animatable<T, V> animatable;
        return Intrinsics.areEqual(get_pendingTarget(), getTarget()) && ((animatable = this.animatable) == null || !animatable.isRunning());
    }
}
