package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.new_style;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.features.game_pad.accessibility.AccessibilityBox;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.MathUtils;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.Sector;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.BasePaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.FillStrokePaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.PainterPalette;
import com.cooldev.gba.emulator.gameboy.features.game_pad.simulation.SimulateMotionDial;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.PaintUtils;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.TouchUtils;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import e0.u;
import e0.w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class StickDialNewStyle implements SimulateMotionDial {
    public static final float STICK_BACKGROUND_SIZE = 0.75f;
    private float angle;

    @Nullable
    private final String contentDescription;

    @NotNull
    private RectF drawingBox;

    @Nullable
    private PointF firstTouch;
    private final int id;
    private boolean isButtonPressed;

    @Nullable
    private final Integer keyPressId;

    @NotNull
    private final PainterPalette paintPalette;
    private float radius;

    @Nullable
    private PointF simulatedFirstTouch;
    private float strength;

    @NotNull
    private final Set<GestureType> supportsGestures;

    @NotNull
    private Set<Integer> trackedPointersIds;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickDialNewStyle(@NotNull Context context, int i2, @Nullable Integer num, @NotNull Set<? extends GestureType> set, @Nullable String str, @NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(context, "context");
        a.s(set, "supportsGestures");
        a.s(radialGamePadTheme, RouterName.THEME);
        this.id = i2;
        this.keyPressId = num;
        this.supportsGestures = set;
        this.contentDescription = str;
        this.paintPalette = new PainterPalette(context, radialGamePadTheme);
        this.trackedPointersIds = new LinkedHashSet();
        this.drawingBox = new RectF();
    }

    private final void drawBackground(Canvas canvas) {
        int parseColor = Color.parseColor("#374049");
        FillStrokePaint pressed = this.isButtonPressed ? this.paintPalette.getPressed() : this.paintPalette.getBackground();
        BasePaint fillPaint = pressed.getFillPaint();
        fillPaint.setColor(parseColor);
        fillPaint.setStrokeWidth(4.0f);
        Paint.Style style = Paint.Style.STROKE;
        fillPaint.setStyle(style);
        fillPaint.setAntiAlias(true);
        RectF rectF = this.drawingBox;
        float f2 = rectF.left;
        float f3 = this.radius;
        canvas.drawCircle(f2 + f3, rectF.top + f3, f3 * 0.75f, fillPaint);
        BasePaint strokePaint = pressed.getStrokePaint();
        if (strokePaint != null) {
            strokePaint.setColor(parseColor);
            strokePaint.setStrokeWidth(4.0f);
            strokePaint.setStyle(style);
            strokePaint.setAntiAlias(true);
            RectF rectF2 = this.drawingBox;
            float f4 = rectF2.left;
            float f5 = this.radius;
            canvas.drawCircle(f4 + f5, rectF2.top + f5, f5 * 0.75f, strokePaint);
        }
    }

    private final void drawForeground(Canvas canvas) {
        float f2 = this.radius * 0.5f;
        FillStrokePaint pressed = this.firstTouch != null ? this.paintPalette.getPressed() : this.simulatedFirstTouch != null ? this.paintPalette.getPressed() : this.paintPalette.getPressed();
        int j2 = ColorKt.j(androidx.compose.ui.graphics.Color.b(MyColors.INSTANCE.m38getText80d7_KjU(), 0.3f));
        BasePaint fillPaint = pressed.getFillPaint();
        fillPaint.setColor(j2);
        Paint.Style style = Paint.Style.FILL;
        fillPaint.setStyle(style);
        fillPaint.setAntiAlias(true);
        canvas.drawCircle(d.D((float) Math.cos(this.angle), this.strength, f2, this.drawingBox.left + this.radius), d.D((float) Math.sin(this.angle), this.strength, f2, this.drawingBox.top + this.radius), f2, fillPaint);
        BasePaint strokePaint = pressed.getStrokePaint();
        if (strokePaint != null) {
            strokePaint.setColor(j2);
            strokePaint.setStyle(style);
            strokePaint.setAntiAlias(true);
            canvas.drawCircle(d.D((float) Math.cos(this.angle), this.strength, f2, this.drawingBox.left + this.radius), d.D((float) Math.sin(this.angle), this.strength, f2, this.drawingBox.top + this.radius), f2, strokePaint);
        }
        int parseColor = Color.parseColor("#B0BABF");
        BasePaint fillPaint2 = pressed.getFillPaint();
        fillPaint2.setColor(parseColor);
        Paint.Style style2 = Paint.Style.STROKE;
        fillPaint2.setStyle(style2);
        fillPaint2.setStrokeWidth(4.0f);
        fillPaint2.setAntiAlias(true);
        canvas.drawCircle(d.D((float) Math.cos(this.angle), this.strength, f2, this.drawingBox.left + this.radius), d.D((float) Math.sin(this.angle), this.strength, f2, this.drawingBox.top + this.radius), f2, fillPaint2);
        BasePaint strokePaint2 = pressed.getStrokePaint();
        if (strokePaint2 != null) {
            strokePaint2.setColor(parseColor);
            strokePaint2.setStyle(style2);
            strokePaint2.setStrokeWidth(4.0f);
            strokePaint2.setAntiAlias(true);
            canvas.drawCircle(d.D((float) Math.cos(this.angle), this.strength, f2, this.drawingBox.left + this.radius), d.D((float) Math.sin(this.angle), this.strength, f2, this.drawingBox.top + this.radius), f2, strokePaint2);
        }
    }

    private final void handleTouchEvent(float f2, float f3, List<Event> list) {
        PointF pointF = this.firstTouch;
        if (pointF == null) {
            pointF = this.simulatedFirstTouch;
        }
        if (pointF != null) {
            MathUtils mathUtils = MathUtils.INSTANCE;
            this.angle = -mathUtils.angle(pointF.x, f2, pointF.y, f3);
            float clamp = mathUtils.clamp(mathUtils.distance(pointF.x, f2, pointF.y, f3) * 2, 0.0f, 1.0f);
            this.strength = clamp;
            PointF convertPolarCoordinatesToSquares = mathUtils.convertPolarCoordinatesToSquares(this.angle, clamp);
            list.add(new Event.Direction(this.id, convertPolarCoordinatesToSquares.x, convertPolarCoordinatesToSquares.y, 0));
        }
    }

    private final boolean isCloseToCenter(TouchUtils.FingerPosition fingerPosition) {
        return MathUtils.INSTANCE.distance(fingerPosition.getX(), 0.5f, fingerPosition.getY(), 0.5f) < 0.6f;
    }

    private final boolean reset(List<Event> list) {
        boolean z2 = (this.firstTouch == null && this.simulatedFirstTouch == null) ? false : true;
        boolean z3 = this.isButtonPressed;
        this.strength = 0.0f;
        this.angle = 0.0f;
        this.firstTouch = null;
        this.simulatedFirstTouch = null;
        this.trackedPointersIds.clear();
        this.isButtonPressed = false;
        if (z2) {
            list.add(new Event.Direction(this.id, 0.0f, 0.0f, 1));
        }
        Integer num = this.keyPressId;
        if (num != null && z3) {
            list.add(new Event.Button(num.intValue(), 1, 1));
        }
        return z2 || z3;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    @NotNull
    public List<AccessibilityBox> accessibilityBoxes() {
        String str = this.contentDescription;
        return str != null ? f0.u(new AccessibilityBox(PaintUtils.INSTANCE.roundToInt(this.drawingBox), str)) : w.f30218a;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.simulation.SimulateMotionDial
    public boolean clearSimulatedMotion(int i2, @NotNull List<Event> list) {
        a.s(list, "outEvents");
        if (i2 != this.id) {
            return false;
        }
        reset(list);
        return true;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public void draw(@NotNull Canvas canvas) {
        a.s(canvas, "canvas");
        drawBackground(canvas);
        drawForeground(canvas);
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    @NotNull
    public RectF drawingBox() {
        return this.drawingBox;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public boolean gesture(float f2, float f3, @NotNull GestureType gestureType, @NotNull List<Event> list) {
        Integer num;
        a.s(gestureType, "gestureType");
        a.s(list, "outEvents");
        if (gestureType == GestureType.SINGLE_TAP && (num = this.keyPressId) != null && this.firstTouch != null) {
            this.isButtonPressed = true;
            list.add(new Event.Button(num.intValue(), 0, 2));
            return true;
        }
        if (!this.supportsGestures.contains(gestureType)) {
            return false;
        }
        list.add(new Event.Gesture(this.id, gestureType));
        return false;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public void measure(@NotNull RectF rectF, @Nullable Sector sector) {
        a.s(rectF, "drawingBox");
        this.drawingBox = rectF;
        this.radius = Math.min(rectF.width(), rectF.height()) / 2;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.simulation.SimulateMotionDial
    public boolean simulateMotion(int i2, float f2, float f3, @NotNull List<Event> list) {
        a.s(list, "outEvents");
        if (i2 != this.id) {
            return false;
        }
        this.simulatedFirstTouch = new PointF(0.5f, 0.5f);
        handleTouchEvent(f2, f3, list);
        return true;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public boolean touch(@NotNull List<TouchUtils.FingerPosition> list, @NotNull List<Event> list2) {
        Object obj;
        a.s(list, "fingers");
        a.s(list2, "outEvents");
        if (this.simulatedFirstTouch != null) {
            return false;
        }
        if (list.isEmpty()) {
            return reset(list2);
        }
        if (this.trackedPointersIds.isEmpty()) {
            TouchUtils.FingerPosition fingerPosition = (TouchUtils.FingerPosition) u.E0(list);
            if (!isCloseToCenter(fingerPosition)) {
                return false;
            }
            this.trackedPointersIds.add(Integer.valueOf(fingerPosition.getPointerId()));
            this.firstTouch = new PointF(fingerPosition.getX(), fingerPosition.getY());
            list2.add(new Event.Direction(this.id, 0.0f, 0.0f, 2));
            handleTouchEvent(fingerPosition.getX(), fingerPosition.getY(), list2);
            return true;
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
        if (fingerPosition2 == null) {
            return reset(list2);
        }
        handleTouchEvent(fingerPosition2.getX(), fingerPosition2.getY(), list2);
        return true;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    @NotNull
    public Set<Integer> trackedPointersIds() {
        return this.trackedPointersIds;
    }

    public /* synthetic */ StickDialNewStyle(Context context, int i2, Integer num, Set set, String str, RadialGamePadTheme radialGamePadTheme, int i3, k kVar) {
        this(context, i2, num, set, (i3 & 16) != 0 ? null : str, radialGamePadTheme);
    }
}
