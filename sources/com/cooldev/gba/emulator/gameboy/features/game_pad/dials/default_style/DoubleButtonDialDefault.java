package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.features.game_pad.accessibility.AccessibilityBox;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.ButtonConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.Sector;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.BasePaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.FillStrokePaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.PainterPalette;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.TextPaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.path.BeanPathBuilder;
import com.cooldev.gba.emulator.gameboy.features.game_pad.simulation.SimulateKeyDial;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.PaintUtils;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.TouchUtils;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import e0.w;
import e0.y;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class DoubleButtonDialDefault implements SimulateKeyDial {
    public static final int $stable = 8;

    @NotNull
    private Path backgroundBeanPath;

    @NotNull
    private Path beanPath;

    @NotNull
    private final ButtonConfig config;

    @NotNull
    private RectF drawingBox;

    @Nullable
    private final Drawable iconDrawable;

    @NotNull
    private RectF labelDrawingBox;

    @NotNull
    private final PainterPalette paintPalette;
    private boolean pressed;
    private float radius;

    @Nullable
    private Boolean simulatedPressed;

    @NotNull
    private final TextPaint textPainter;

    @NotNull
    private final RadialGamePadTheme theme;

    public DoubleButtonDialDefault(@NotNull Context context, @NotNull ButtonConfig buttonConfig, @NotNull RadialGamePadTheme radialGamePadTheme) {
        Drawable a2;
        a.s(context, "context");
        a.s(buttonConfig, "config");
        a.s(radialGamePadTheme, RouterName.THEME);
        this.config = buttonConfig;
        this.theme = radialGamePadTheme;
        Integer iconId = buttonConfig.getIconId();
        Drawable drawable = null;
        if (iconId != null && (a2 = AppCompatResources.a(context, iconId.intValue())) != null) {
            a2.setTint(radialGamePadTheme.getTextColor());
            drawable = a2;
        }
        this.iconDrawable = drawable;
        this.paintPalette = new PainterPalette(context, radialGamePadTheme);
        this.textPainter = new TextPaint();
        this.radius = 10.0f;
        this.drawingBox = new RectF();
        this.labelDrawingBox = new RectF();
        this.beanPath = new Path();
        this.backgroundBeanPath = new Path();
    }

    private final Path buildBeanPath(Sector sector, float f2) {
        return BeanPathBuilder.INSTANCE.build(PaintUtils.INSTANCE.roundToInt(this.drawingBox), sector, f2);
    }

    private final void drawBackground(Canvas canvas) {
        FillStrokePaint background = this.paintPalette.getBackground();
        canvas.drawPath(this.backgroundBeanPath, background.getFillPaint());
        BasePaint strokePaint = background.getStrokePaint();
        if (strokePaint != null) {
            canvas.drawPath(this.backgroundBeanPath, strokePaint);
        }
    }

    private final void drawForeground(Canvas canvas, RadialGamePadTheme radialGamePadTheme) {
        FillStrokePaint pressed = (a.g(this.simulatedPressed, Boolean.TRUE) || this.pressed) ? this.paintPalette.getPressed() : a.g(this.simulatedPressed, Boolean.FALSE) ? this.paintPalette.getSimulated() : this.paintPalette.getNormal();
        canvas.drawPath(this.beanPath, pressed.getFillPaint());
        BasePaint strokePaint = pressed.getStrokePaint();
        if (strokePaint != null) {
            canvas.drawPath(this.beanPath, strokePaint);
        }
        String label = this.config.getLabel();
        if (label != null) {
            this.textPainter.paintText(this.labelDrawingBox, label, canvas, radialGamePadTheme);
        }
        Drawable drawable = this.iconDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    private final RadialGamePadTheme getTheme() {
        RadialGamePadTheme theme = this.config.getTheme();
        return theme == null ? this.theme : theme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean updatePressed(boolean z2, Boolean bool, List<Event> list) {
        if (this.pressed == z2 && a.g(bool, this.simulatedPressed)) {
            return false;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : z2;
        Boolean bool2 = this.simulatedPressed;
        if (booleanValue != (bool2 != null ? bool2.booleanValue() : this.pressed) && this.config.getSupportsButtons()) {
            list.add(new Event.Button(this.config.getId(), !booleanValue, booleanValue != 0 ? 2 : 1));
        }
        this.pressed = z2;
        this.simulatedPressed = bool;
        return true;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    @NotNull
    public List<AccessibilityBox> accessibilityBoxes() {
        String contentDescription = this.config.getContentDescription();
        return contentDescription != null ? f0.u(new AccessibilityBox(PaintUtils.INSTANCE.roundToInt(this.drawingBox), contentDescription)) : w.f30218a;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.simulation.SimulateKeyDial
    public boolean clearSimulateKeyPress(int i2, @NotNull List<Event> list) {
        a.s(list, "outEvents");
        if (i2 != this.config.getId()) {
            return false;
        }
        return updatePressed(this.pressed, null, list);
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public void draw(@NotNull Canvas canvas) {
        a.s(canvas, "canvas");
        RadialGamePadTheme theme = getTheme();
        drawBackground(canvas);
        drawForeground(canvas, theme);
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    @NotNull
    public RectF drawingBox() {
        return this.drawingBox;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public boolean gesture(float f2, float f3, @NotNull GestureType gestureType, @NotNull List<Event> list) {
        a.s(gestureType, "gestureType");
        a.s(list, "outEvents");
        if (!this.config.getSupportsGestures().contains(gestureType)) {
            return false;
        }
        list.add(new Event.Gesture(this.config.getId(), gestureType));
        return false;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public void measure(@NotNull RectF rectF, @Nullable Sector sector) {
        a.s(rectF, "drawingBox");
        this.drawingBox = rectF;
        Drawable drawable = this.iconDrawable;
        if (drawable != null) {
            PaintUtils paintUtils = PaintUtils.INSTANCE;
            drawable.setBounds(paintUtils.roundToInt(paintUtils.scaleCentered(rectF, 0.5f)));
        }
        this.radius = Math.min(rectF.width(), rectF.height()) / 2;
        this.labelDrawingBox = PaintUtils.INSTANCE.scaleCentered(rectF, 0.6f);
        if (sector != null) {
            this.beanPath = buildBeanPath(sector, 0.15f);
            this.backgroundBeanPath = buildBeanPath(sector, 0.075f);
        }
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.simulation.SimulateKeyDial
    public boolean simulateKeyPress(int i2, boolean z2, @NotNull List<Event> list) {
        a.s(list, "outEvents");
        if (i2 != this.config.getId()) {
            return false;
        }
        return updatePressed(this.pressed, Boolean.valueOf(z2), list);
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public boolean touch(@NotNull List<TouchUtils.FingerPosition> list, @NotNull List<Event> list2) {
        a.s(list, "fingers");
        a.s(list2, "outEvents");
        return updatePressed(!list.isEmpty(), this.simulatedPressed, list2);
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    @NotNull
    public Set<Integer> trackedPointersIds() {
        return y.f30220a;
    }
}
