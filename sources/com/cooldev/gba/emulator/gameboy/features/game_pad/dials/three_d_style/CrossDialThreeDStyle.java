package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.three_d_style;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.features.game_pad.accessibility.AccessibilityBox;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.CrossConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.Sector;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.BasePaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.CompositeButtonPaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.FillStrokePaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.PainterPalette;
import com.cooldev.gba.emulator.gameboy.features.game_pad.path.ArrowPathBuilder;
import com.cooldev.gba.emulator.gameboy.features.game_pad.path.CirclePathBuilder;
import com.cooldev.gba.emulator.gameboy.features.game_pad.simulation.SimulateMotionDial;
import com.cooldev.gba.emulator.gameboy.features.game_pad.touch.TouchAnchor;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.PaintUtils;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.TouchUtils;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import e0.q;
import e0.u;
import e0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k0.a;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.e;
import y0.j;
import y0.m;

@StabilityInferred
/* loaded from: classes.dex */
public final class CrossDialThreeDStyle implements SimulateMotionDial {
    private static final float ACCESSIBILITY_BOX_SCALE = 0.33f;
    private static final float DEAD_ZONE = 0.1f;
    private static final float DIAGONAL_DISTANCE = 0.5f;
    private static final float DIAGONAL_STRENGTH = 1.25f;
    private static final int DRAWABLE_COUNT = 4;
    private static final int DRAWABLE_INDEX_DOWN = 1;
    private static final int DRAWABLE_INDEX_LEFT = 2;
    private static final int DRAWABLE_INDEX_RIGHT = 0;
    private static final int DRAWABLE_INDEX_UP = 3;
    private static final float DRAWABLE_SIZE_SCALING = 0.8f;
    private static final float MAIN_DISTANCE = 0.5f;
    private static final float MAIN_STRENGTH = 2.0f;
    private static final float SINGLE_DRAWABLE_ANGLE = 1.5707964f;

    @NotNull
    private final CompositeButtonPaint compositeButtonPaint;

    @NotNull
    private final CrossConfig config;

    @NotNull
    private Rect drawableRect;

    @NotNull
    private RectF drawingBox;

    @Nullable
    private Drawable foregroundDrawable;
    private final int id;

    @NotNull
    private final PainterPalette paintPalette;

    @NotNull
    private Path shapePath;

    @Nullable
    private State simulatedState;

    @NotNull
    private final RadialGamePadTheme theme;

    @Nullable
    private State touchState;

    @NotNull
    private Set<Integer> trackedPointersIds;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State CROSS_STATE_CENTER;
        public static final State CROSS_STATE_DOWN;
        public static final State CROSS_STATE_DOWN_LEFT;
        public static final State CROSS_STATE_DOWN_RIGHT;
        public static final State CROSS_STATE_LEFT;
        public static final State CROSS_STATE_RIGHT;
        public static final State CROSS_STATE_UP;
        public static final State CROSS_STATE_UP_LEFT;
        public static final State CROSS_STATE_UP_RIGHT;

        @NotNull
        private final TouchAnchor anchor;

        @NotNull
        private final PointF outEvent;

        private static final /* synthetic */ State[] $values() {
            return new State[]{CROSS_STATE_CENTER, CROSS_STATE_RIGHT, CROSS_STATE_DOWN_RIGHT, CROSS_STATE_DOWN, CROSS_STATE_DOWN_LEFT, CROSS_STATE_LEFT, CROSS_STATE_UP_LEFT, CROSS_STATE_UP, CROSS_STATE_UP_RIGHT};
        }

        static {
            TouchAnchor.Companion companion = TouchAnchor.Companion;
            CROSS_STATE_CENTER = new State("CROSS_STATE_CENTER", 0, companion.fromPolar(0.0f, 0.0f, 0.75f, y.f30220a), new PointF(0.0f, 0.0f));
            CROSS_STATE_RIGHT = new State("CROSS_STATE_RIGHT", 1, companion.fromPolar(0.0f, 0.5f, 2.0f, f0.B(0)), new PointF(1.0f, 0.0f));
            CROSS_STATE_DOWN_RIGHT = new State("CROSS_STATE_DOWN_RIGHT", 2, companion.fromPolar(0.7853982f, 0.5f, CrossDialThreeDStyle.DIAGONAL_STRENGTH, f0.C(1, 0)), new PointF(1.0f, 1.0f));
            CROSS_STATE_DOWN = new State("CROSS_STATE_DOWN", 3, companion.fromPolar(CrossDialThreeDStyle.SINGLE_DRAWABLE_ANGLE, 0.5f, 2.0f, f0.B(1)), new PointF(0.0f, 1.0f));
            CROSS_STATE_DOWN_LEFT = new State("CROSS_STATE_DOWN_LEFT", 4, companion.fromPolar(2.3561945f, 0.5f, CrossDialThreeDStyle.DIAGONAL_STRENGTH, f0.C(1, 2)), new PointF(-1.0f, 1.0f));
            CROSS_STATE_LEFT = new State("CROSS_STATE_LEFT", 5, companion.fromPolar(3.1415927f, 0.5f, 2.0f, f0.B(2)), new PointF(-1.0f, 0.0f));
            CROSS_STATE_UP_LEFT = new State("CROSS_STATE_UP_LEFT", 6, companion.fromPolar(3.926991f, 0.5f, CrossDialThreeDStyle.DIAGONAL_STRENGTH, f0.C(3, 2)), new PointF(-1.0f, -1.0f));
            CROSS_STATE_UP = new State("CROSS_STATE_UP", 7, companion.fromPolar(4.712389f, 0.5f, 2.0f, f0.B(3)), new PointF(0.0f, -1.0f));
            CROSS_STATE_UP_RIGHT = new State("CROSS_STATE_UP_RIGHT", 8, companion.fromPolar(5.4977875f, 0.5f, CrossDialThreeDStyle.DIAGONAL_STRENGTH, f0.C(3, 0)), new PointF(1.0f, -1.0f));
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = f0.l($values);
        }

        private State(String str, int i2, TouchAnchor touchAnchor, PointF pointF) {
            this.anchor = touchAnchor;
            this.outEvent = pointF;
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        @NotNull
        public final TouchAnchor getAnchor() {
            return this.anchor;
        }

        @NotNull
        public final PointF getOutEvent() {
            return this.outEvent;
        }

        public final boolean isDiagonal() {
            return this.anchor.getIds().size() > 1;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrossConfig.Shape.values().length];
            try {
                iArr[CrossConfig.Shape.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CrossConfig.Shape.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CrossDialThreeDStyle(@NotNull Context context, @NotNull CrossConfig crossConfig, @NotNull RadialGamePadTheme radialGamePadTheme) {
        p0.a.s(context, "context");
        p0.a.s(crossConfig, "config");
        p0.a.s(radialGamePadTheme, RouterName.THEME);
        this.config = crossConfig;
        this.theme = radialGamePadTheme;
        this.id = crossConfig.getId();
        Integer rightDrawableForegroundId = crossConfig.getRightDrawableForegroundId();
        this.foregroundDrawable = rightDrawableForegroundId != null ? getDrawableWithColor(context, rightDrawableForegroundId.intValue(), radialGamePadTheme.getTextColor()) : null;
        this.trackedPointersIds = new LinkedHashSet();
        this.drawingBox = new RectF();
        this.drawableRect = new Rect();
        this.shapePath = new Path();
        this.paintPalette = new PainterPalette(context, radialGamePadTheme);
        this.compositeButtonPaint = new CompositeButtonPaint(context, radialGamePadTheme);
    }

    private final Path buildPath(CrossConfig.Shape shape, Rect rect) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[shape.ordinal()];
        if (i2 == 1) {
            return ArrowPathBuilder.INSTANCE.build(rect);
        }
        if (i2 == 2) {
            return CirclePathBuilder.INSTANCE.build(rect);
        }
        throw new RuntimeException();
    }

    private final String composeDescriptionString(String str) {
        return this.config.getContentDescription().getBaseName() + ' ' + str;
    }

    private final State computeStateForPosition(float f2, float f3) {
        Object obj;
        e eVar = new e(m.L(q.K(State.values()), new CrossDialThreeDStyle$computeStateForPosition$1(this)));
        if (eVar.hasNext()) {
            Object next = eVar.next();
            if (eVar.hasNext()) {
                float normalizedDistance = ((State) next).getAnchor().getNormalizedDistance(f2, f3);
                do {
                    Object next2 = eVar.next();
                    float normalizedDistance2 = ((State) next2).getAnchor().getNormalizedDistance(f2, f3);
                    if (Float.compare(normalizedDistance, normalizedDistance2) > 0) {
                        next = next2;
                        normalizedDistance = normalizedDistance2;
                    }
                } while (eVar.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        State state = (State) obj;
        return state == null ? State.CROSS_STATE_CENTER : state;
    }

    private final State currentState() {
        State state = this.simulatedState;
        return state == null ? this.touchState : state;
    }

    private final void drawBackground(Canvas canvas, float f2) {
        int parseColor = Color.parseColor("#374049");
        FillStrokePaint background = this.paintPalette.getBackground();
        BasePaint fillPaint = background.getFillPaint();
        fillPaint.setColor(parseColor);
        Paint.Style style = Paint.Style.STROKE;
        fillPaint.setStyle(style);
        fillPaint.setStrokeWidth(4.0f);
        fillPaint.setAntiAlias(true);
        canvas.drawCircle(this.drawingBox.centerX(), this.drawingBox.centerY(), f2, fillPaint);
        BasePaint strokePaint = background.getStrokePaint();
        if (strokePaint != null) {
            strokePaint.setColor(parseColor);
            strokePaint.setStyle(style);
            strokePaint.setStrokeWidth(4.0f);
            strokePaint.setAntiAlias(true);
            canvas.drawCircle(this.drawingBox.centerX(), this.drawingBox.centerY(), f2, strokePaint);
        }
    }

    private final void drawDiagonalDirections(Canvas canvas, float f2) {
        for (State state : getDiagonalStates()) {
            this.compositeButtonPaint.drawCompositeButton1(canvas, (state.getAnchor().getNormalizedX() * f2 * 0.75f) + this.drawingBox.centerX(), (state.getAnchor().getNormalizedY() * f2 * 0.75f) + this.drawingBox.centerY(), state == currentState());
        }
    }

    private final void drawMainDirections(Canvas canvas) {
        Set<Integer> set;
        Drawable drawable;
        TouchAnchor anchor;
        canvas.save();
        canvas.translate(this.drawingBox.centerX(), this.drawingBox.centerY());
        State currentState = currentState();
        if (currentState == null || (anchor = currentState.getAnchor()) == null || (set = anchor.getIds()) == null) {
            set = y.f30220a;
        }
        Iterator<T> it = getMainStates().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) u.D0(((State) it.next()).getAnchor().getIds())).intValue();
            FillStrokePaint paint = getPaint(set.contains(Integer.valueOf(intValue)));
            float degrees = intValue * ((float) Math.toDegrees(1.5707963705062866d));
            canvas.save();
            canvas.rotate(degrees, 0.0f, 0.0f);
            paint.getFillPaint();
            Drawable drawable2 = this.foregroundDrawable;
            if (drawable2 != null) {
                int centerX = this.drawableRect.centerX();
                int centerY = this.drawableRect.centerY();
                this.drawableRect.set(centerX - 70, centerY - 70, centerX + 70, centerY + 70);
                drawable2.setBounds(this.drawableRect);
                drawable2.draw(canvas);
            }
            if (paint.getStrokePaint() != null && (drawable = this.foregroundDrawable) != null) {
                int centerX2 = this.drawableRect.centerX();
                int centerY2 = this.drawableRect.centerY();
                this.drawableRect.set(centerX2 - 70, centerY2 - 70, centerX2 + 70, centerY2 + 70);
                drawable.setBounds(this.drawableRect);
                drawable.draw(canvas);
            }
            canvas.restore();
        }
        canvas.restore();
    }

    private final j getDiagonalStates() {
        return m.L(q.K(State.values()), CrossDialThreeDStyle$getDiagonalStates$1.INSTANCE);
    }

    private final Drawable getDrawableWithColor(Context context, int i2, int i3) {
        Drawable a2 = AppCompatResources.a(context, i2);
        p0.a.p(a2);
        return a2;
    }

    private final List<State> getMainStates() {
        State[] values = State.values();
        ArrayList arrayList = new ArrayList();
        for (State state : values) {
            if (state.getAnchor().getIds().size() == 1) {
                arrayList.add(state);
            }
        }
        return arrayList;
    }

    private final FillStrokePaint getPaint(boolean z2) {
        return z2 ? this.paintPalette.getPressed() : this.simulatedState != null ? this.paintPalette.getSimulated() : this.paintPalette.getNormal();
    }

    private final boolean isActiveState(State state) {
        return (state == null || state == State.CROSS_STATE_CENTER) ? false : true;
    }

    private final boolean isInsideDeadZone(float f2, float f3) {
        return Math.abs(f2) < DEAD_ZONE && Math.abs(f3) < DEAD_ZONE;
    }

    private final boolean isTouchDisabled() {
        return this.simulatedState != null;
    }

    private final boolean reset(List<Event> list) {
        boolean z2 = currentState() != null;
        this.touchState = null;
        this.trackedPointersIds.clear();
        this.simulatedState = null;
        if (z2) {
            list.add(new Event.Direction(this.id, 0.0f, 0.0f, 1));
        }
        return z2;
    }

    private final void sendStateUpdateEvent(State state, State state2, List<Event> list) {
        TouchAnchor anchor;
        Set<Integer> ids;
        int i2 = 0;
        if (state == null || !isActiveState(state)) {
            list.add(new Event.Direction(this.id, 0.0f, 0.0f, 0));
            return;
        }
        int size = state.getAnchor().getIds().size();
        if (state2 != null && (anchor = state2.getAnchor()) != null && (ids = anchor.getIds()) != null) {
            i2 = ids.size();
        }
        list.add(new Event.Direction(this.id, state.getOutEvent().x, state.getOutEvent().y, size >= i2 ? 2 : 1));
    }

    private final boolean updateState(State state, State state2, List<Event> list) {
        State state3 = state2 == null ? state : state2;
        State currentState = currentState();
        if (state3 != currentState) {
            sendStateUpdateEvent(state3, currentState, list);
        }
        this.touchState = state;
        this.simulatedState = state2;
        return state3 != currentState;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    @NotNull
    public List<AccessibilityBox> accessibilityBoxes() {
        float width = this.drawingBox.width() * 0.25f;
        PaintUtils paintUtils = PaintUtils.INSTANCE;
        RectF scaleCentered = paintUtils.scaleCentered(this.drawingBox, ACCESSIBILITY_BOX_SCALE);
        float f2 = -width;
        scaleCentered.offset(0.0f, f2);
        RectF scaleCentered2 = paintUtils.scaleCentered(this.drawingBox, ACCESSIBILITY_BOX_SCALE);
        scaleCentered2.offset(f2, 0.0f);
        RectF scaleCentered3 = paintUtils.scaleCentered(this.drawingBox, ACCESSIBILITY_BOX_SCALE);
        scaleCentered3.offset(width, 0.0f);
        RectF scaleCentered4 = paintUtils.scaleCentered(this.drawingBox, ACCESSIBILITY_BOX_SCALE);
        scaleCentered4.offset(0.0f, width);
        return f0.v(new AccessibilityBox(paintUtils.roundToInt(scaleCentered), composeDescriptionString(this.config.getContentDescription().getUp())), new AccessibilityBox(paintUtils.roundToInt(scaleCentered2), composeDescriptionString(this.config.getContentDescription().getLeft())), new AccessibilityBox(paintUtils.roundToInt(scaleCentered3), composeDescriptionString(this.config.getContentDescription().getRight())), new AccessibilityBox(paintUtils.roundToInt(scaleCentered4), composeDescriptionString(this.config.getContentDescription().getDown())));
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.simulation.SimulateMotionDial
    public boolean clearSimulatedMotion(int i2, @NotNull List<Event> list) {
        p0.a.s(list, "outEvents");
        if (i2 != this.id) {
            return false;
        }
        return reset(list);
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public void draw(@NotNull Canvas canvas) {
        p0.a.s(canvas, "canvas");
        float min = Math.min(this.drawingBox.width(), this.drawingBox.height()) / 2;
        drawBackground(canvas, min);
        if (this.config.getUseDiagonals()) {
            drawDiagonalDirections(canvas, min);
        }
        drawMainDirections(canvas);
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    @NotNull
    public RectF drawingBox() {
        return this.drawingBox;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public boolean gesture(float f2, float f3, @NotNull GestureType gestureType, @NotNull List<Event> list) {
        p0.a.s(gestureType, "gestureType");
        p0.a.s(list, "outEvents");
        if ((isTouchDisabled() || isInsideDeadZone(f2 - 0.5f, f3 - 0.5f)) && this.config.getSupportsGestures().contains(gestureType)) {
            list.add(new Event.Gesture(this.id, gestureType));
        }
        return false;
    }

    public final int getId() {
        return this.id;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public void measure(@NotNull RectF rectF, @Nullable Sector sector) {
        p0.a.s(rectF, "drawingBox");
        this.drawingBox = rectF;
        float min = Math.min(rectF.width(), rectF.height()) / 2;
        int t02 = p0.a.t0(DRAWABLE_SIZE_SCALING * min);
        int i2 = (-t02) / 2;
        int i3 = t02 / 2;
        this.drawableRect = new Rect((p0.a.t0(min) / 2) + i2, i2, (p0.a.t0(min) / 2) + i3, i3);
        this.shapePath = buildPath(this.config.getShape(), this.drawableRect);
        this.compositeButtonPaint.updateDrawingBox(rectF);
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.simulation.SimulateMotionDial
    public boolean simulateMotion(int i2, float f2, float f3, @NotNull List<Event> list) {
        p0.a.s(list, "outEvents");
        if (i2 != this.id) {
            return false;
        }
        updateState(this.touchState, computeStateForPosition(f2 - 0.5f, f3 - 0.5f), list);
        return true;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public boolean touch(@NotNull List<TouchUtils.FingerPosition> list, @NotNull List<Event> list2) {
        Object obj;
        p0.a.s(list, "fingers");
        p0.a.s(list2, "outEvents");
        if (isTouchDisabled()) {
            return false;
        }
        if (list.isEmpty()) {
            return reset(list2);
        }
        if (this.trackedPointersIds.isEmpty()) {
            TouchUtils.FingerPosition fingerPosition = (TouchUtils.FingerPosition) u.E0(list);
            this.trackedPointersIds.add(Integer.valueOf(fingerPosition.getPointerId()));
            return updateState(computeStateForPosition(p0.a.z(fingerPosition.getX() - 0.5f, -0.5f, 0.5f), p0.a.z(fingerPosition.getY() - 0.5f, -0.5f, 0.5f)), this.simulatedState, list2);
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (this.trackedPointersIds.contains(Integer.valueOf(((TouchUtils.FingerPosition) obj).getPointerId()))) {
                break;
            }
        }
        TouchUtils.FingerPosition fingerPosition2 = (TouchUtils.FingerPosition) obj;
        return fingerPosition2 == null ? reset(list2) : updateState(computeStateForPosition(fingerPosition2.getX() - 0.5f, fingerPosition2.getY() - 0.5f), this.simulatedState, list2);
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    @NotNull
    public Set<Integer> trackedPointersIds() {
        return this.trackedPointersIds;
    }
}
