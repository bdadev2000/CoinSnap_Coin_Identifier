package com.cooldev.gba.emulator.gameboy.features.game_pad.event;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class Event {
    public static final int $stable = 0;
    private final int haptic;

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Button extends Event {
        public static final int $stable = 0;
        private final int action;
        private final int haptic;
        private final int id;

        public Button(int i2, int i3, int i4) {
            super(0, 1, null);
            this.id = i2;
            this.action = i3;
            this.haptic = i4;
        }

        public static /* synthetic */ Button copy$default(Button button, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i2 = button.id;
            }
            if ((i5 & 2) != 0) {
                i3 = button.action;
            }
            if ((i5 & 4) != 0) {
                i4 = button.haptic;
            }
            return button.copy(i2, i3, i4);
        }

        public final int component1() {
            return this.id;
        }

        public final int component2() {
            return this.action;
        }

        public final int component3() {
            return this.haptic;
        }

        @NotNull
        public final Button copy(int i2, int i3, int i4) {
            return new Button(i2, i3, i4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return this.id == button.id && this.action == button.action && this.haptic == button.haptic;
        }

        public final int getAction() {
            return this.action;
        }

        @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event
        public int getHaptic() {
            return this.haptic;
        }

        public final int getId() {
            return this.id;
        }

        public int hashCode() {
            return Integer.hashCode(this.haptic) + d.c(this.action, Integer.hashCode(this.id) * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Button(id=");
            sb.append(this.id);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", haptic=");
            return d.o(sb, this.haptic, ')');
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Direction extends Event {
        public static final int $stable = 0;
        private final int haptic;
        private final int id;
        private final float xAxis;
        private final float yAxis;

        public Direction(int i2, float f2, float f3, int i3) {
            super(0, 1, null);
            this.id = i2;
            this.xAxis = f2;
            this.yAxis = f3;
            this.haptic = i3;
        }

        public static /* synthetic */ Direction copy$default(Direction direction, int i2, float f2, float f3, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = direction.id;
            }
            if ((i4 & 2) != 0) {
                f2 = direction.xAxis;
            }
            if ((i4 & 4) != 0) {
                f3 = direction.yAxis;
            }
            if ((i4 & 8) != 0) {
                i3 = direction.haptic;
            }
            return direction.copy(i2, f2, f3, i3);
        }

        public final int component1() {
            return this.id;
        }

        public final float component2() {
            return this.xAxis;
        }

        public final float component3() {
            return this.yAxis;
        }

        public final int component4() {
            return this.haptic;
        }

        @NotNull
        public final Direction copy(int i2, float f2, float f3, int i3) {
            return new Direction(i2, f2, f3, i3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Direction)) {
                return false;
            }
            Direction direction = (Direction) obj;
            return this.id == direction.id && Float.compare(this.xAxis, direction.xAxis) == 0 && Float.compare(this.yAxis, direction.yAxis) == 0 && this.haptic == direction.haptic;
        }

        @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event
        public int getHaptic() {
            return this.haptic;
        }

        public final int getId() {
            return this.id;
        }

        public final float getXAxis() {
            return this.xAxis;
        }

        public final float getYAxis() {
            return this.yAxis;
        }

        public int hashCode() {
            return Integer.hashCode(this.haptic) + d.b(this.yAxis, d.b(this.xAxis, Integer.hashCode(this.id) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Direction(id=");
            sb.append(this.id);
            sb.append(", xAxis=");
            sb.append(this.xAxis);
            sb.append(", yAxis=");
            sb.append(this.yAxis);
            sb.append(", haptic=");
            return d.o(sb, this.haptic, ')');
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Gesture extends Event {
        public static final int $stable = 0;
        private final int id;

        @NotNull
        private final GestureType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gesture(int i2, @NotNull GestureType gestureType) {
            super(0, 1, null);
            a.s(gestureType, "type");
            this.id = i2;
            this.type = gestureType;
        }

        public static /* synthetic */ Gesture copy$default(Gesture gesture, int i2, GestureType gestureType, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = gesture.id;
            }
            if ((i3 & 2) != 0) {
                gestureType = gesture.type;
            }
            return gesture.copy(i2, gestureType);
        }

        public final int component1() {
            return this.id;
        }

        @NotNull
        public final GestureType component2() {
            return this.type;
        }

        @NotNull
        public final Gesture copy(int i2, @NotNull GestureType gestureType) {
            a.s(gestureType, "type");
            return new Gesture(i2, gestureType);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gesture)) {
                return false;
            }
            Gesture gesture = (Gesture) obj;
            return this.id == gesture.id && this.type == gesture.type;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final GestureType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "Gesture(id=" + this.id + ", type=" + this.type + ')';
        }
    }

    public Event() {
        this(0, 1, null);
    }

    public int getHaptic() {
        return this.haptic;
    }

    public Event(int i2) {
        this.haptic = i2;
    }

    public /* synthetic */ Event(int i2, int i3, k kVar) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
