package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.media.d;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.features.game_pad.accessibility.AccessibilityBox;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.ButtonConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.Sector;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.BasePaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.CompositeButtonPaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.FillStrokePaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.PainterPalette;
import com.cooldev.gba.emulator.gameboy.features.game_pad.paint.TextPaint;
import com.cooldev.gba.emulator.gameboy.features.game_pad.touch.TouchAnchor;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.KotlinUtilsKt;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.PaintUtils;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.TouchUtils;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import e0.e0;
import e0.q;
import e0.u;
import e0.w;
import e0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import y0.e;
import y0.j;
import y0.m;
import y0.n;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PrimaryButtonsDialDefault implements Dial {
    private static final float ANCHOR_COMPOSITE_DISTANCE = 0.5f;
    private static final float ANCHOR_COMPOSITE_STRENGTH = 1.1f;
    private static final float BUTTON_SCALING = 0.8f;
    private static final float OUTER_CIRCLE_SCALING = 0.95f;
    private final float actionAngle;
    private final boolean allowMultiplePressesSingleFinger;
    private float buttonRadius;

    @NotNull
    private PointF center;

    @Nullable
    private final ButtonConfig centerAction;

    @NotNull
    private final List<ButtonConfig> circleActions;

    @NotNull
    private final CompositeButtonPaint compositeButtonPaint;
    private float distanceToCenter;

    @NotNull
    private final Map<Integer, Drawable> drawables;

    @NotNull
    private RectF drawingBox;

    @NotNull
    private final Map<Integer, ButtonConfig> idButtonConfigsMapping;

    @NotNull
    private Map<Integer, RectF> labelsDrawingBoxes;

    @NotNull
    private final PainterPalette painterPalette;

    @NotNull
    private Set<Integer> pressed;
    private final float rotationRadians;

    @NotNull
    private final TextPaint textPaint;

    @NotNull
    private final RadialGamePadTheme theme;

    @NotNull
    private final List<TouchAnchor> touchAnchors;

    @NotNull
    private Set<Integer> trackedPointerIds;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public PrimaryButtonsDialDefault(@NotNull Context context, @NotNull List<ButtonConfig> list, @Nullable ButtonConfig buttonConfig, float f2, boolean z2, @NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(context, "context");
        a.s(list, "circleActions");
        a.s(radialGamePadTheme, RouterName.THEME);
        this.circleActions = list;
        this.centerAction = buttonConfig;
        this.rotationRadians = f2;
        this.allowMultiplePressesSingleFinger = z2;
        this.theme = radialGamePadTheme;
        this.painterPalette = new PainterPalette(context, radialGamePadTheme);
        this.textPaint = new TextPaint();
        this.compositeButtonPaint = new CompositeButtonPaint(context, radialGamePadTheme);
        this.drawables = loadRequiredDrawables(context);
        this.pressed = y.f30220a;
        this.trackedPointerIds = new LinkedHashSet();
        this.idButtonConfigsMapping = buildIdButtonsAssociations();
        this.drawingBox = new RectF();
        this.actionAngle = 6.2831855f / list.size();
        this.center = new PointF(0.0f, 0.0f);
        this.labelsDrawingBoxes = new LinkedHashMap();
        this.touchAnchors = buildTouchAnchors();
    }

    private final boolean allowsMultiplePressed() {
        return this.allowMultiplePressesSingleFinger && this.centerAction == null;
    }

    private final List<TouchAnchor> buildCenterButtonAnchors() {
        ButtonConfig buttonConfig = this.centerAction;
        return buttonConfig != null ? f0.u(TouchAnchor.Companion.fromPolar(0.0f, 0.0f, 2.0f, f0.B(Integer.valueOf(buttonConfig.getId())))) : w.f30218a;
    }

    private final List<TouchAnchor> buildCircleButtonAnchors() {
        List<ButtonConfig> list = this.circleActions;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ButtonConfig) obj).getVisible()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.M(arrayList, 10));
        int i2 = 0;
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                f0.D();
                throw null;
            }
            arrayList2.add(TouchAnchor.Companion.fromPolar((this.actionAngle * i2) + 6.2831855f + this.rotationRadians, 0.25f, 2.0f, f0.B(Integer.valueOf(((ButtonConfig) obj2).getId()))));
            i2 = i3;
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<TouchAnchor> buildCompositeButtonAnchors() {
        if (!allowsMultiplePressed()) {
            return w.f30218a;
        }
        List<ButtonConfig> list = this.circleActions;
        ArrayList P0 = u.P0(f0.u(list.get(0)), list);
        ArrayList arrayList = new ArrayList();
        Iterator it = P0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ButtonConfig) next).getVisible()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.M(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                f0.D();
                throw null;
            }
            arrayList2.add(new d0.k(Float.valueOf((this.actionAngle * i2) + 6.2831855f + this.rotationRadians), Integer.valueOf(((ButtonConfig) next2).getId())));
            i2 = i3;
        }
        List<d0.k> neighborsPairs = KotlinUtilsKt.neighborsPairs(arrayList2);
        ArrayList arrayList3 = new ArrayList(q.M(neighborsPairs, 10));
        for (d0.k kVar : neighborsPairs) {
            d0.k kVar2 = (d0.k) kVar.f30134a;
            d0.k kVar3 = (d0.k) kVar.f30135b;
            arrayList3.add(TouchAnchor.Companion.fromPolar((float) q.L(new Float[]{kVar2.f30134a, kVar3.f30134a}), ANCHOR_COMPOSITE_DISTANCE, ANCHOR_COMPOSITE_STRENGTH, f0.C(kVar2.f30135b, kVar3.f30135b)));
        }
        return arrayList3;
    }

    private final Map<Integer, ButtonConfig> buildIdButtonsAssociations() {
        ArrayList C0 = u.C0(u.P0(f0.u(this.centerAction), this.circleActions));
        int g2 = kotlin.jvm.internal.q.g(q.M(C0, 10));
        if (g2 < 16) {
            g2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g2);
        Iterator it = C0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(Integer.valueOf(((ButtonConfig) next).getId()), next);
        }
        return linkedHashMap;
    }

    private final List<TouchAnchor> buildTouchAnchors() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(buildCenterButtonAnchors());
        arrayList.addAll(buildCircleButtonAnchors());
        if (allowsMultiplePressed()) {
            arrayList.addAll(buildCompositeButtonAnchors());
        }
        return arrayList;
    }

    private final float computeButtonRadius(float f2) {
        float sin = (float) Math.sin(3.141592653589793d / Math.max(this.circleActions.size(), 2));
        return Math.min((f2 * sin) / (sin + 1.0f), (this.centerAction == null || !(this.circleActions.isEmpty() ^ true)) ? Float.MAX_VALUE : f2 / 3);
    }

    private final void drawBackground(Canvas canvas, float f2) {
        FillStrokePaint background = this.painterPalette.getBackground();
        BasePaint fillPaint = background.getFillPaint();
        PointF pointF = this.center;
        canvas.drawCircle(pointF.x, pointF.y, f2, fillPaint);
        BasePaint strokePaint = background.getStrokePaint();
        if (strokePaint != null) {
            PointF pointF2 = this.center;
            canvas.drawCircle(pointF2.x, pointF2.y, f2, strokePaint);
        }
    }

    private final void drawCompositeActions(Canvas canvas, float f2) {
        for (TouchAnchor touchAnchor : getCompositeTouchAnchors()) {
            this.compositeButtonPaint.drawCompositeButton(canvas, (touchAnchor.getNormalizedX() * f2 * 0.75f) + this.center.x, this.center.y - ((touchAnchor.getNormalizedY() * f2) * 0.75f), this.pressed.containsAll(touchAnchor.getIds()));
        }
    }

    private final void drawSingleActions(Canvas canvas) {
        for (TouchAnchor touchAnchor : getSingleButtonAnchors()) {
            ButtonConfig buttonForId = getButtonForId(((Number) u.D0(touchAnchor.getIds())).intValue());
            if (buttonForId != null) {
                FillStrokePaint painterForIds = getPainterForIds(f0.B(Integer.valueOf(buttonForId.getId())));
                float D = d.D(touchAnchor.getX(), this.distanceToCenter, 4.0f, this.center.x);
                float y2 = this.center.y - ((touchAnchor.getY() * this.distanceToCenter) * 4.0f);
                canvas.drawCircle(D, y2, this.buttonRadius, painterForIds.getFillPaint());
                BasePaint strokePaint = painterForIds.getStrokePaint();
                if (strokePaint != null) {
                    canvas.drawCircle(D, y2, this.buttonRadius, strokePaint);
                }
                if (buttonForId.getLabel() != null) {
                    TextPaint textPaint = this.textPaint;
                    RectF rectF = this.labelsDrawingBoxes.get(Integer.valueOf(buttonForId.getId()));
                    a.p(rectF);
                    RectF rectF2 = rectF;
                    String label = buttonForId.getLabel();
                    RadialGamePadTheme theme = buttonForId.getTheme();
                    if (theme == null) {
                        theme = this.theme;
                    }
                    textPaint.paintText(rectF2, label, canvas, theme);
                }
                Drawable drawable = this.drawables.get(buttonForId.getIconId());
                if (drawable != null) {
                    drawable.draw(canvas);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j getAssociatedIds(float f2, float f3) {
        Object obj;
        Set<Integer> ids;
        Iterator<T> it = this.touchAnchors.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float f4 = f2 - ANCHOR_COMPOSITE_DISTANCE;
                float z2 = a.z(f4, -0.5f, ANCHOR_COMPOSITE_DISTANCE);
                float f5 = (-f3) + ANCHOR_COMPOSITE_DISTANCE;
                float normalizedDistance = ((TouchAnchor) next).getNormalizedDistance(z2, a.z(f5, -0.5f, ANCHOR_COMPOSITE_DISTANCE));
                do {
                    Object next2 = it.next();
                    float normalizedDistance2 = ((TouchAnchor) next2).getNormalizedDistance(a.z(f4, -0.5f, ANCHOR_COMPOSITE_DISTANCE), a.z(f5, -0.5f, ANCHOR_COMPOSITE_DISTANCE));
                    if (Float.compare(normalizedDistance, normalizedDistance2) > 0) {
                        next = next2;
                        normalizedDistance = normalizedDistance2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        TouchAnchor touchAnchor = (TouchAnchor) obj;
        return (touchAnchor == null || (ids = touchAnchor.getIds()) == null) ? n.K(new Integer[0]) : u.z0(ids);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonConfig getButtonForId(int i2) {
        return this.idButtonConfigsMapping.get(Integer.valueOf(i2));
    }

    private final List<TouchAnchor> getCompositeTouchAnchors() {
        List<TouchAnchor> list = this.touchAnchors;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TouchAnchor) obj).getIds().size() > 1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final FillStrokePaint getPainterForIds(Set<Integer> set) {
        return this.pressed.containsAll(set) ? this.painterPalette.getPressed() : set.size() == 1 ? this.painterPalette.getNormal() : this.painterPalette.getBackground();
    }

    private final List<TouchAnchor> getSingleButtonAnchors() {
        List<TouchAnchor> list = this.touchAnchors;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TouchAnchor) obj).getIds().size() == 1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final Map<Integer, Drawable> loadRequiredDrawables(Context context) {
        d0.k kVar;
        Integer iconId;
        ArrayList Q0 = u.Q0(this.circleActions, this.centerAction);
        ArrayList arrayList = new ArrayList();
        Iterator it = Q0.iterator();
        while (it.hasNext()) {
            ButtonConfig buttonConfig = (ButtonConfig) it.next();
            if (buttonConfig == null || (iconId = buttonConfig.getIconId()) == null) {
                kVar = null;
            } else {
                int intValue = iconId.intValue();
                Drawable a2 = AppCompatResources.a(context, intValue);
                a.p(a2);
                RadialGamePadTheme theme = buttonConfig.getTheme();
                if (theme == null) {
                    theme = this.theme;
                }
                a2.setTint(theme.getTextColor());
                kVar = new d0.k(Integer.valueOf(intValue), a2);
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return e0.w(arrayList);
    }

    private final void sendNewActionDowns(Set<Integer> set, Set<Integer> set2, List<Event> list) {
        e eVar = new e(m.L(u.z0(set), new PrimaryButtonsDialDefault$sendNewActionDowns$1(set2, this)));
        while (eVar.hasNext()) {
            list.add(new Event.Button(((Number) eVar.next()).intValue(), 0, 2));
        }
    }

    private final void sendNewActionUps(Set<Integer> set, Set<Integer> set2, List<Event> list) {
        e eVar = new e(m.L(u.z0(set2), new PrimaryButtonsDialDefault$sendNewActionUps$1(set, this)));
        while (eVar.hasNext()) {
            list.add(new Event.Button(((Number) eVar.next()).intValue(), 1, 1));
        }
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    @NotNull
    public List<AccessibilityBox> accessibilityBoxes() {
        AccessibilityBox accessibilityBox;
        List<ButtonConfig> list = this.circleActions;
        ArrayList<ButtonConfig> arrayList = new ArrayList();
        for (Object obj : list) {
            ButtonConfig buttonConfig = (ButtonConfig) obj;
            if (buttonConfig.getVisible() && buttonConfig.getContentDescription() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ButtonConfig buttonConfig2 : arrayList) {
            RectF rectF = this.labelsDrawingBoxes.get(Integer.valueOf(buttonConfig2.getId()));
            if (rectF != null) {
                Rect roundToInt = PaintUtils.INSTANCE.roundToInt(rectF);
                String contentDescription = buttonConfig2.getContentDescription();
                if (contentDescription == null) {
                    contentDescription = "";
                }
                accessibilityBox = new AccessibilityBox(roundToInt, contentDescription);
            } else {
                accessibilityBox = null;
            }
            if (accessibilityBox != null) {
                arrayList2.add(accessibilityBox);
            }
        }
        return arrayList2;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public void draw(@NotNull Canvas canvas) {
        a.s(canvas, "canvas");
        float min = Math.min(this.drawingBox.width(), this.drawingBox.height()) / 2;
        drawBackground(canvas, min);
        drawSingleActions(canvas);
        drawCompositeActions(canvas, min);
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
        e eVar = new e(m.L(m.Q(getAssociatedIds(f2, f3), new PrimaryButtonsDialDefault$gesture$1(this)), new PrimaryButtonsDialDefault$gesture$2(gestureType)));
        while (eVar.hasNext()) {
            list.add(new Event.Gesture(((ButtonConfig) eVar.next()).getId(), gestureType));
        }
        return false;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public void measure(@NotNull RectF rectF, @Nullable Sector sector) {
        a.s(rectF, "drawingBox");
        this.drawingBox = rectF;
        float min = (Math.min(rectF.width(), rectF.height()) * OUTER_CIRCLE_SCALING) / 2;
        float computeButtonRadius = computeButtonRadius(min);
        this.buttonRadius = computeButtonRadius;
        this.distanceToCenter = min - computeButtonRadius;
        this.center = new PointF(rectF.centerX(), drawingBox().centerY());
        this.buttonRadius *= BUTTON_SCALING;
        this.compositeButtonPaint.updateDrawingBox(rectF);
        for (TouchAnchor touchAnchor : getSingleButtonAnchors()) {
            ButtonConfig buttonForId = getButtonForId(((Number) u.D0(touchAnchor.getIds())).intValue());
            if (buttonForId != null) {
                float D = d.D(touchAnchor.getX(), this.distanceToCenter, 4.0f, this.center.x);
                float y2 = this.center.y - ((touchAnchor.getY() * this.distanceToCenter) * 4.0f);
                Map<Integer, RectF> map = this.labelsDrawingBoxes;
                Integer valueOf = Integer.valueOf(buttonForId.getId());
                float f2 = this.buttonRadius;
                map.put(valueOf, new RectF(D - f2, y2 - f2, D + f2, f2 + y2));
                Drawable drawable = this.drawables.get(buttonForId.getIconId());
                if (drawable != null) {
                    PaintUtils paintUtils = PaintUtils.INSTANCE;
                    float f3 = this.buttonRadius;
                    drawable.setBounds(paintUtils.roundToInt(paintUtils.scaleCentered(new RectF(D - f3, y2 - f3, D + f3, y2 + f3), ANCHOR_COMPOSITE_DISTANCE)));
                }
            }
        }
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    public boolean touch(@NotNull List<TouchUtils.FingerPosition> list, @NotNull List<Event> list2) {
        a.s(list, "fingers");
        a.s(list2, "outEvents");
        this.trackedPointerIds.clear();
        Set<Integer> set = this.trackedPointerIds;
        List<TouchUtils.FingerPosition> list3 = list;
        ArrayList arrayList = new ArrayList(q.M(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((TouchUtils.FingerPosition) it.next()).getPointerId()));
        }
        set.addAll(arrayList);
        Set<Integer> T = m.T(m.N(u.z0(list3), new PrimaryButtonsDialDefault$touch$newPressed$1(this)));
        if (a.g(T, this.pressed)) {
            return false;
        }
        sendNewActionDowns(T, this.pressed, list2);
        sendNewActionUps(T, this.pressed, list2);
        this.pressed = T;
        return true;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial
    @NotNull
    public Set<Integer> trackedPointersIds() {
        return this.trackedPointerIds;
    }

    public /* synthetic */ PrimaryButtonsDialDefault(Context context, List list, ButtonConfig buttonConfig, float f2, boolean z2, RadialGamePadTheme radialGamePadTheme, int i2, k kVar) {
        this(context, list, buttonConfig, (i2 & 8) != 0 ? 0.0f : f2, z2, radialGamePadTheme);
    }
}
