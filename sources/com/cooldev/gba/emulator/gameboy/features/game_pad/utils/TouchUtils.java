package com.cooldev.gba.emulator.gameboy.features.game_pad.utils;

import android.graphics.PointF;
import android.graphics.RectF;
import android.support.v4.media.d;
import android.view.MotionEvent;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.safedk.android.analytics.events.MaxEvent;
import e0.q;
import e0.u;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import y0.j;
import y0.m;

@StabilityInferred
/* loaded from: classes.dex */
public final class TouchUtils {
    public static final int $stable = 0;

    @NotNull
    public static final TouchUtils INSTANCE = new TouchUtils();

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class FingerPosition {
        public static final int $stable = 0;
        private final int pointerId;
        private final float x;

        /* renamed from: y, reason: collision with root package name */
        private final float f28525y;

        public FingerPosition(int i2, float f2, float f3) {
            this.pointerId = i2;
            this.x = f2;
            this.f28525y = f3;
        }

        public static /* synthetic */ FingerPosition copy$default(FingerPosition fingerPosition, int i2, float f2, float f3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = fingerPosition.pointerId;
            }
            if ((i3 & 2) != 0) {
                f2 = fingerPosition.x;
            }
            if ((i3 & 4) != 0) {
                f3 = fingerPosition.f28525y;
            }
            return fingerPosition.copy(i2, f2, f3);
        }

        public final int component1() {
            return this.pointerId;
        }

        public final float component2() {
            return this.x;
        }

        public final float component3() {
            return this.f28525y;
        }

        @NotNull
        public final FingerPosition copy(int i2, float f2, float f3) {
            return new FingerPosition(i2, f2, f3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FingerPosition)) {
                return false;
            }
            FingerPosition fingerPosition = (FingerPosition) obj;
            return this.pointerId == fingerPosition.pointerId && Float.compare(this.x, fingerPosition.x) == 0 && Float.compare(this.f28525y, fingerPosition.f28525y) == 0;
        }

        public final int getPointerId() {
            return this.pointerId;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.f28525y;
        }

        public int hashCode() {
            return Float.hashCode(this.f28525y) + d.b(this.x, Integer.hashCode(this.pointerId) * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("FingerPosition(pointerId=");
            sb.append(this.pointerId);
            sb.append(", x=");
            sb.append(this.x);
            sb.append(", y=");
            return d.n(sb, this.f28525y, ')');
        }
    }

    private TouchUtils() {
    }

    public static /* synthetic */ j extractRawFingersPositions$default(TouchUtils touchUtils, MotionEvent motionEvent, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        return touchUtils.extractRawFingersPositions(motionEvent, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCancelEvent(MotionEvent motionEvent, int i2) {
        return f0.C(1, 6, 3).contains(Integer.valueOf(motionEvent.getActionMasked())) && (motionEvent.getActionIndex() == i2);
    }

    private final j iteratePointerIndexes(MotionEvent motionEvent) {
        return m.L(m.P(m.P(u.z0(a.F0(0, motionEvent.getPointerCount())), new TouchUtils$iteratePointerIndexes$1(motionEvent)), new TouchUtils$iteratePointerIndexes$2(motionEvent)), new TouchUtils$iteratePointerIndexes$3(motionEvent));
    }

    @NotNull
    public final List<FingerPosition> computeRelativeFingerPosition(@NotNull List<FingerPosition> list, @NotNull RectF rectF) {
        a.s(list, "fingers");
        a.s(rectF, "rect");
        List<FingerPosition> list2 = list;
        ArrayList arrayList = new ArrayList(q.M(list2, 10));
        for (FingerPosition fingerPosition : list2) {
            arrayList.add(new FingerPosition(fingerPosition.getPointerId(), (fingerPosition.getX() - rectF.left) / rectF.width(), (fingerPosition.getY() - rectF.top) / rectF.height()));
        }
        return arrayList;
    }

    @NotNull
    public final PointF computeRelativePosition(float f2, float f3, @NotNull RectF rectF) {
        a.s(rectF, "rect");
        return new PointF((f2 - rectF.left) / rectF.width(), (f3 - rectF.top) / rectF.height());
    }

    @NotNull
    public final j extractFingersPositions(@NotNull MotionEvent motionEvent) {
        a.s(motionEvent, MaxEvent.f29810a);
        return m.P(iteratePointerIndexes(motionEvent), new TouchUtils$extractFingersPositions$1(motionEvent));
    }

    @RequiresApi
    @NotNull
    public final j extractRawFingersPositions(@NotNull MotionEvent motionEvent, int i2, int i3) {
        a.s(motionEvent, MaxEvent.f29810a);
        return m.P(iteratePointerIndexes(motionEvent), new TouchUtils$extractRawFingersPositions$1(motionEvent, i2, i3));
    }
}
