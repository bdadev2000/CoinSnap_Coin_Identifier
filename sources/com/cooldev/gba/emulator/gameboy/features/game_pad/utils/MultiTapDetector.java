package com.cooldev.gba.emulator.gameboy.features.game_pad.utils;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.d;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.events.MaxEvent;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.r;

@StabilityInferred
/* loaded from: classes2.dex */
public final class MultiTapDetector {
    public static final int $stable = 8;

    @NotNull
    private final r callback;
    private final long doubleTapTimeout;

    @NotNull
    private Event downEvent;

    @NotNull
    private final Handler handler;

    @NotNull
    private Event lastTapUpEvent;
    private final long longPressTimeout;
    private int numberOfTaps;
    private final long tapTimeout;
    private final ViewConfiguration viewConfig;

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Event {
        public static final int $stable = 8;
        private long time;
        private float x;

        /* renamed from: y */
        private float f28524y;

        public Event() {
            this(0L, 0.0f, 0.0f, 7, null);
        }

        public static /* synthetic */ Event copy$default(Event event, long j2, float f2, float f3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = event.time;
            }
            if ((i2 & 2) != 0) {
                f2 = event.x;
            }
            if ((i2 & 4) != 0) {
                f3 = event.f28524y;
            }
            return event.copy(j2, f2, f3);
        }

        public final void clear() {
            this.time = 0L;
        }

        public final long component1() {
            return this.time;
        }

        public final float component2() {
            return this.x;
        }

        public final float component3() {
            return this.f28524y;
        }

        @NotNull
        public final Event copy(long j2, float f2, float f3) {
            return new Event(j2, f2, f3);
        }

        public final void copyFrom(@NotNull MotionEvent motionEvent) {
            a.s(motionEvent, "motionEvent");
            this.time = motionEvent.getEventTime();
            this.x = motionEvent.getX();
            this.f28524y = motionEvent.getY();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return false;
            }
            Event event = (Event) obj;
            return this.time == event.time && Float.compare(this.x, event.x) == 0 && Float.compare(this.f28524y, event.f28524y) == 0;
        }

        public final long getTime() {
            return this.time;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.f28524y;
        }

        public int hashCode() {
            return Float.hashCode(this.f28524y) + d.b(this.x, Long.hashCode(this.time) * 31, 31);
        }

        public final void setTime(long j2) {
            this.time = j2;
        }

        public final void setX(float f2) {
            this.x = f2;
        }

        public final void setY(float f2) {
            this.f28524y = f2;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Event(time=");
            sb.append(this.time);
            sb.append(", x=");
            sb.append(this.x);
            sb.append(", y=");
            return d.n(sb, this.f28524y, ')');
        }

        public Event(long j2, float f2, float f3) {
            this.time = j2;
            this.x = f2;
            this.f28524y = f3;
        }

        public /* synthetic */ Event(long j2, float f2, float f3, int i2, k kVar) {
            this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.0f : f3);
        }
    }

    public MultiTapDetector(@NotNull Context context, @NotNull r rVar) {
        a.s(context, "context");
        a.s(rVar, "callback");
        this.callback = rVar;
        this.handler = new Handler();
        this.doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
        this.tapTimeout = ViewConfiguration.getTapTimeout();
        this.longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.viewConfig = ViewConfiguration.get(context);
        this.downEvent = new Event(0L, 0.0f, 0.0f, 7, null);
        this.lastTapUpEvent = new Event(0L, 0.0f, 0.0f, 7, null);
    }

    public static final void handleEvent$lambda$0(MultiTapDetector multiTapDetector, Event event, int i2) {
        a.s(multiTapDetector, "this$0");
        a.s(event, "$downEvent");
        multiTapDetector.callback.invoke(Float.valueOf(event.getX()), Float.valueOf(event.getY()), Integer.valueOf(i2), Boolean.valueOf(i2 == multiTapDetector.numberOfTaps));
    }

    public final void handleEvent(@NotNull MotionEvent motionEvent) {
        a.s(motionEvent, MaxEvent.f29810a);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (motionEvent.getEventTime() - motionEvent.getDownTime() >= this.tapTimeout || Math.abs(motionEvent.getX() - this.downEvent.getX()) <= this.viewConfig.getScaledTouchSlop() || Math.abs(motionEvent.getY() - this.downEvent.getY()) <= this.viewConfig.getScaledTouchSlop()) {
                        return;
                    }
                    this.downEvent.clear();
                    return;
                }
                if (action != 5) {
                    if (action != 6) {
                        return;
                    }
                }
            }
            Event event = this.downEvent;
            Event event2 = this.lastTapUpEvent;
            if (event.getTime() <= 0 || motionEvent.getEventTime() - event.getTime() >= this.longPressTimeout) {
                return;
            }
            if (event2.getTime() <= 0 || motionEvent.getEventTime() - event2.getTime() >= this.doubleTapTimeout || Math.abs(motionEvent.getX() - event2.getX()) >= this.viewConfig.getScaledDoubleTapSlop() || Math.abs(motionEvent.getY() - event2.getY()) >= this.viewConfig.getScaledDoubleTapSlop()) {
                this.numberOfTaps = 1;
            } else {
                this.numberOfTaps++;
            }
            this.lastTapUpEvent.copyFrom(motionEvent);
            this.handler.postDelayed(new androidx.profileinstaller.a(this, event, this.numberOfTaps), this.doubleTapTimeout);
            return;
        }
        this.downEvent.copyFrom(motionEvent);
        if (motionEvent.getEventTime() - this.lastTapUpEvent.getTime() > this.doubleTapTimeout) {
            this.callback.invoke(Float.valueOf(this.downEvent.getX()), Float.valueOf(this.downEvent.getY()), 0, Boolean.TRUE);
        }
    }
}
