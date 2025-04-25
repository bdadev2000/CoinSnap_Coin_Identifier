package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B9\b\u0016\u0012\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bBC\b\u0000\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010&\u001a\u00020\u0006H\u0002J \u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,H\u0002J-\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J-\u00104\u001a\u00028\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J%\u00105\u001a\u0002062\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00107R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u0012X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u001bR\u0010\u0010\u001c\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u001bR\u0010\u0010$\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "keyframes", "", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "durationMillis", "delayMillis", "(Ljava/util/Map;II)V", "timestamps", "Landroidx/collection/IntList;", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "defaultEasing", "initialArcMode", "Landroidx/compose/animation/core/ArcMode;", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "arcSpline", "Landroidx/compose/animation/core/ArcSpline;", "getDelayMillis", "()I", "getDurationMillis", "I", "lastInitialValue", "Landroidx/compose/animation/core/AnimationVector;", "lastTargetValue", "modes", "", "posArray", "", "slopeArray", "times", "valueVector", "velocityVector", "findEntryForTimeMillis", "timeMillis", "getEasedTime", "", "getEasedTimeFromIndex", "index", "asFraction", "", "getValueFromNanos", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "init", "", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private ArcSpline arcSpline;
    private final Easing defaultEasing;
    private final int delayMillis;
    private final int durationMillis;
    private final int initialArcMode;
    private final IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private int[] modes;
    private float[] posArray;
    private float[] slopeArray;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private V velocityVector;

    public /* synthetic */ VectorizedKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i, int i2, Easing easing, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(intList, intObjectMap, i, i2, easing, i3);
    }

    private VectorizedKeyframesSpec(IntList intList, IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> intObjectMap, int i, int i2, Easing easing, int i3) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i;
        this.delayMillis = i2;
        this.defaultEasing = easing;
        this.initialArcMode = i3;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, i, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public VectorizedKeyframesSpec(java.util.Map<java.lang.Integer, ? extends kotlin.Pair<? extends V, ? extends androidx.compose.animation.core.Easing>> r12, int r13, int r14) {
        /*
            r11 = this;
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            int r1 = r12.size()
            int r1 = r1 + 2
            r0.<init>(r1)
            java.util.Set r1 = r12.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.add(r2)
            goto L13
        L2d:
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r2 = r12.containsKey(r2)
            if (r2 != 0) goto L3b
            r0.add(r1, r1)
        L3b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            boolean r2 = r12.containsKey(r2)
            if (r2 != 0) goto L48
            r0.add(r13)
        L48:
            r0.sort()
            r4 = r0
            androidx.collection.IntList r4 = (androidx.collection.IntList) r4
            androidx.collection.MutableIntObjectMap r0 = new androidx.collection.MutableIntObjectMap
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L5d:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r12.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.getValue()
            kotlin.Pair r1 = (kotlin.Pair) r1
            androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo r5 = new androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo
            java.lang.Object r6 = r1.getFirst()
            androidx.compose.animation.core.AnimationVector r6 = (androidx.compose.animation.core.AnimationVector) r6
            java.lang.Object r1 = r1.getSecond()
            androidx.compose.animation.core.Easing r1 = (androidx.compose.animation.core.Easing) r1
            androidx.compose.animation.core.ArcMode$Companion r7 = androidx.compose.animation.core.ArcMode.INSTANCE
            int r7 = r7.m456getArcLinear9TMq4()
            r5.<init>(r6, r1, r7, r3)
            r0.set(r2, r5)
            goto L5d
        L94:
            r5 = r0
            androidx.collection.IntObjectMap r5 = (androidx.collection.IntObjectMap) r5
            androidx.compose.animation.core.Easing r8 = androidx.compose.animation.core.EasingKt.getLinearEasing()
            androidx.compose.animation.core.ArcMode$Companion r12 = androidx.compose.animation.core.ArcMode.INSTANCE
            int r9 = r12.m456getArcLinear9TMq4()
            r10 = 0
            r3 = r11
            r6 = r13
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.VectorizedKeyframesSpec.<init>(java.util.Map, int, int):void");
    }

    private final void init(V initialValue, V targetValue, V initialVelocity) {
        float[] fArr;
        float[] fArr2;
        boolean z = this.arcSpline != null;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
            int size = this.timestamps.getSize();
            float[] fArr3 = new float[size];
            for (int i = 0; i < size; i++) {
                fArr3[i] = this.timestamps.get(i) / ((float) 1000);
            }
            this.times = fArr3;
            int size2 = this.timestamps.getSize();
            int[] iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(this.timestamps.get(i2));
                int m510getArcMode9TMq4 = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.m510getArcMode9TMq4() : this.initialArcMode;
                if (!ArcMode.m450equalsimpl0(m510getArcMode9TMq4, ArcMode.INSTANCE.m456getArcLinear9TMq4())) {
                    z = true;
                }
                iArr[i2] = m510getArcMode9TMq4;
            }
            this.modes = iArr;
        }
        if (z) {
            float[] fArr4 = null;
            if (this.arcSpline != null) {
                V v = this.lastInitialValue;
                if (v == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lastInitialValue");
                    v = null;
                }
                if (Intrinsics.areEqual(v, initialValue)) {
                    V v2 = this.lastTargetValue;
                    if (v2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("lastTargetValue");
                        v2 = null;
                    }
                    if (Intrinsics.areEqual(v2, targetValue)) {
                        return;
                    }
                }
            }
            this.lastInitialValue = initialValue;
            this.lastTargetValue = targetValue;
            int size3 = (initialValue.getSize() % 2) + initialValue.getSize();
            this.posArray = new float[size3];
            this.slopeArray = new float[size3];
            int size4 = this.timestamps.getSize();
            float[][] fArr5 = new float[size4];
            for (int i3 = 0; i3 < size4; i3++) {
                int i4 = this.timestamps.get(i3);
                if (i4 == 0) {
                    if (!this.keyframes.contains(i4)) {
                        fArr2 = new float[size3];
                        for (int i5 = 0; i5 < size3; i5++) {
                            fArr2[i5] = initialValue.get$animation_core_release(i5);
                        }
                    } else {
                        fArr = new float[size3];
                        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(i4);
                        Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo2);
                        V vectorValue = vectorizedKeyframeSpecElementInfo2.getVectorValue();
                        for (int i6 = 0; i6 < size3; i6++) {
                            fArr[i6] = vectorValue.get$animation_core_release(i6);
                        }
                        fArr2 = fArr;
                    }
                } else {
                    if (i4 == getDurationMillis()) {
                        if (!this.keyframes.contains(i4)) {
                            fArr2 = new float[size3];
                            for (int i7 = 0; i7 < size3; i7++) {
                                fArr2[i7] = targetValue.get$animation_core_release(i7);
                            }
                        } else {
                            fArr = new float[size3];
                            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo3 = this.keyframes.get(i4);
                            Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo3);
                            V vectorValue2 = vectorizedKeyframeSpecElementInfo3.getVectorValue();
                            for (int i8 = 0; i8 < size3; i8++) {
                                fArr[i8] = vectorValue2.get$animation_core_release(i8);
                            }
                        }
                    } else {
                        fArr = new float[size3];
                        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo4 = this.keyframes.get(i4);
                        Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo4);
                        V vectorValue3 = vectorizedKeyframeSpecElementInfo4.getVectorValue();
                        for (int i9 = 0; i9 < size3; i9++) {
                            fArr[i9] = vectorValue3.get$animation_core_release(i9);
                        }
                    }
                    fArr2 = fArr;
                }
                fArr5[i3] = fArr2;
            }
            int[] iArr2 = this.modes;
            if (iArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("modes");
                iArr2 = null;
            }
            float[] fArr6 = this.times;
            if (fArr6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("times");
            } else {
                fArr4 = fArr6;
            }
            this.arcSpline = new ArcSpline(iArr2, fArr4, fArr5);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        int clampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        if (this.keyframes.contains(clampPlayTime)) {
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(clampPlayTime);
            Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo);
            return vectorizedKeyframeSpecElementInfo.getVectorValue();
        }
        if (clampPlayTime >= getDurationMillis()) {
            return targetValue;
        }
        if (clampPlayTime <= 0) {
            return initialValue;
        }
        init(initialValue, targetValue, initialVelocity);
        int i = 0;
        if (this.arcSpline != null) {
            float easedTime = getEasedTime(clampPlayTime);
            ArcSpline arcSpline = this.arcSpline;
            if (arcSpline == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arcSpline");
                arcSpline = null;
            }
            float[] fArr = this.posArray;
            if (fArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("posArray");
                fArr = null;
            }
            arcSpline.getPos(easedTime, fArr);
            float[] fArr2 = this.posArray;
            if (fArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("posArray");
                fArr2 = null;
            }
            int length = fArr2.length;
            while (i < length) {
                V v = this.valueVector;
                if (v == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                    v = null;
                }
                float[] fArr3 = this.posArray;
                if (fArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("posArray");
                    fArr3 = null;
                }
                v.set$animation_core_release(i, fArr3[i]);
                i++;
            }
            V v2 = this.valueVector;
            if (v2 != null) {
                return v2;
            }
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            return null;
        }
        int findEntryForTimeMillis = findEntryForTimeMillis(clampPlayTime);
        float easedTimeFromIndex = getEasedTimeFromIndex(findEntryForTimeMillis, clampPlayTime, true);
        int i2 = this.timestamps.get(findEntryForTimeMillis);
        if (this.keyframes.contains(i2)) {
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(i2);
            Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo2);
            initialValue = vectorizedKeyframeSpecElementInfo2.getVectorValue();
        }
        int i3 = this.timestamps.get(findEntryForTimeMillis + 1);
        if (this.keyframes.contains(i3)) {
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo3 = this.keyframes.get(i3);
            Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo3);
            targetValue = vectorizedKeyframeSpecElementInfo3.getVectorValue();
        }
        V v3 = this.valueVector;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v3 = null;
        }
        int size = v3.getSize();
        while (i < size) {
            V v4 = this.valueVector;
            if (v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v4 = null;
            }
            v4.set$animation_core_release(i, VectorConvertersKt.lerp(initialValue.get$animation_core_release(i), targetValue.get$animation_core_release(i), easedTimeFromIndex));
            i++;
        }
        V v5 = this.valueVector;
        if (v5 != null) {
            return v5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        if (clampPlayTime < 0) {
            return initialVelocity;
        }
        init(initialValue, targetValue, initialVelocity);
        int i = 0;
        if (this.arcSpline != null) {
            float easedTime = getEasedTime((int) clampPlayTime);
            ArcSpline arcSpline = this.arcSpline;
            if (arcSpline == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arcSpline");
                arcSpline = null;
            }
            float[] fArr = this.slopeArray;
            if (fArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
                fArr = null;
            }
            arcSpline.getSlope(easedTime, fArr);
            float[] fArr2 = this.slopeArray;
            if (fArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
                fArr2 = null;
            }
            int length = fArr2.length;
            while (i < length) {
                V v = this.velocityVector;
                if (v == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                    v = null;
                }
                float[] fArr3 = this.slopeArray;
                if (fArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
                    fArr3 = null;
                }
                v.set$animation_core_release(i, fArr3[i]);
                i++;
            }
            V v2 = this.velocityVector;
            if (v2 != null) {
                return v2;
            }
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        VectorizedKeyframesSpec<V> vectorizedKeyframesSpec = this;
        AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(vectorizedKeyframesSpec, clampPlayTime - 1, initialValue, targetValue, initialVelocity);
        AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(vectorizedKeyframesSpec, clampPlayTime, initialValue, targetValue, initialVelocity);
        int size = valueFromMillis.getSize();
        while (i < size) {
            V v3 = this.velocityVector;
            if (v3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v3 = null;
            }
            v3.set$animation_core_release(i, (valueFromMillis.get$animation_core_release(i) - valueFromMillis2.get$animation_core_release(i)) * 1000.0f);
            i++;
        }
        V v4 = this.velocityVector;
        if (v4 != null) {
            return v4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    private final float getEasedTime(int timeMillis) {
        return getEasedTimeFromIndex(findEntryForTimeMillis(timeMillis), timeMillis, false);
    }

    private final float getEasedTimeFromIndex(int index, int timeMillis, boolean asFraction) {
        Easing easing;
        float f;
        if (index >= this.timestamps._size - 1) {
            f = timeMillis;
        } else {
            int i = this.timestamps.get(index);
            int i2 = this.timestamps.get(index + 1);
            if (timeMillis == i) {
                f = i;
            } else {
                int i3 = i2 - i;
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(i);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f2 = i3;
                float transform = easing.transform((timeMillis - i) / f2);
                if (asFraction) {
                    return transform;
                }
                f = (f2 * transform) + i;
            }
        }
        return f / ((float) 1000);
    }

    private final int findEntryForTimeMillis(int timeMillis) {
        int binarySearch$default = IntListExtensionKt.binarySearch$default(this.timestamps, timeMillis, 0, 0, 6, null);
        return binarySearch$default < -1 ? -(binarySearch$default + 2) : binarySearch$default;
    }
}
