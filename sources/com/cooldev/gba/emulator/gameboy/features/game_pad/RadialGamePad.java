package com.cooldev.gba.emulator.gameboy.features.game_pad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.foundation.text.input.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import b1.a1;
import b1.b1;
import b1.f0;
import b1.z0;
import com.cooldev.gba.emulator.gameboy.features.game_pad.accessibility.AccessibilityBox;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.ButtonConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.CrossConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.PrimaryDialConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.SecondaryDialConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.EmptyDial;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style.ButtonDialDefault;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style.CrossDialDefault;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style.DoubleButtonDialDefault;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style.PrimaryButtonsDialDefault;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style.StickDialDefault;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.future_tech.ButtonDialFutureTech;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.future_tech.CrossDialFutureTech;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.future_tech.DoubleButtonDialFutureTech;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.future_tech.PrimaryButtonsDialFutureTech;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.future_tech.StickDialFutureTech;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.new_style.ButtonDialNewStyle;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.new_style.CrossDialNewStyle;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.new_style.DoubleButtonDialNewStyle;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.new_style.PrimaryButtonsDialNewStyle;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.new_style.StickDialNewStyle;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.three_d_style.ButtonDialThreeDStyle;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.three_d_style.CrossDialThreeDStyle;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.three_d_style.DoubleButtonDialThreeDStyle;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.three_d_style.PrimaryButtonsDialThreeDStyle;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.three_d_style.StickDialThreeDStyle;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.EventsSource;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.HapticConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.HapticEngine;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.actuators.HapticActuator;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.actuators.VibrationEffectActuator;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.actuators.ViewActuator;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors.AdvancedHapticSelector;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors.HapticSelector;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors.NoEffectHapticSelector;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors.SimpleHapticSelector;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.MathUtils;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.Sector;
import com.cooldev.gba.emulator.gameboy.features.game_pad.simulation.SimulateKeyDial;
import com.cooldev.gba.emulator.gameboy.features.game_pad.simulation.SimulateMotionDial;
import com.cooldev.gba.emulator.gameboy.features.game_pad.touchbound.CircleTouchBound;
import com.cooldev.gba.emulator.gameboy.features.game_pad.touchbound.SectorTouchBound;
import com.cooldev.gba.emulator.gameboy.features.game_pad.touchbound.TouchBound;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.MultiTapDetector;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.PaintUtils;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.TouchUtils;
import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import com.safedk.android.analytics.events.MaxEvent;
import e0.b0;
import e0.e0;
import e0.q;
import e0.u;
import e0.w;
import e1.h;
import e1.l0;
import e1.t0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;
import t0.c;
import w0.g;
import x0.n;
import y0.j;
import y0.m;

@StabilityInferred
/* loaded from: classes.dex */
public final class RadialGamePad extends View implements EventsSource {
    static final /* synthetic */ n[] $$delegatedProperties;
    public static final int $stable;

    @NotNull
    public static final Companion Companion;
    public static final float DEFAULT_SECONDARY_DIAL_SCALE = 0.75f;
    private List<? extends Dial> allDials;

    @NotNull
    private PointF center;
    private int dials;

    @NotNull
    private final z0 eventDispatcher;

    @NotNull
    private final l0 eventsSubject;

    @NotNull
    private final RadialGamePad$exploreByTouchHelper$1 exploreByTouchHelper;

    @NotNull
    private final RadialGamePadConfig gamePadConfig;

    @NotNull
    private final c gravityX$delegate;

    @NotNull
    private final c gravityY$delegate;

    @NotNull
    private final z0 hapticDispatcher;

    @NotNull
    private final HapticEngine hapticEngine;
    private final int marginsInPixel;

    @NotNull
    private final c offsetX$delegate;

    @NotNull
    private final c offsetY$delegate;

    @NotNull
    private int[] positionOnScreen;

    @NotNull
    private Dial primaryDial;
    private float primaryDialMaxSizeDp;

    @NotNull
    private final c secondaryDialRotation$delegate;
    private float secondaryDialSpacing;

    @NotNull
    private List<? extends Dial> secondaryDials;
    private float size;

    @NotNull
    private final c spacingBottom$delegate;

    @NotNull
    private final c spacingLeft$delegate;

    @NotNull
    private final c spacingRight$delegate;

    @NotNull
    private final c spacingTop$delegate;

    @NotNull
    private final MultiTapDetector tapsDetector;

    @NotNull
    private final Map<Dial, TouchBound> touchBounds;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HapticConfig.values().length];
            try {
                iArr[HapticConfig.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HapticConfig.PRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HapticConfig.PRESS_AND_RELEASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GamePadTheme.values().length];
            try {
                iArr2[GamePadTheme.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GamePadTheme.NewStyle.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GamePadTheme.FutureTech.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GamePadTheme.ThreeDStyle.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        t tVar = new t(RadialGamePad.class, "gravityX", "getGravityX()F", 0);
        h0 h0Var = g0.f30932a;
        h0Var.getClass();
        $$delegatedProperties = new n[]{tVar, a.u(RadialGamePad.class, "gravityY", "getGravityY()F", 0, h0Var), a.u(RadialGamePad.class, "offsetX", "getOffsetX()F", 0, h0Var), a.u(RadialGamePad.class, "offsetY", "getOffsetY()F", 0, h0Var), a.u(RadialGamePad.class, "secondaryDialRotation", "getSecondaryDialRotation()F", 0, h0Var), a.u(RadialGamePad.class, "spacingTop", "getSpacingTop()I", 0, h0Var), a.u(RadialGamePad.class, "spacingBottom", "getSpacingBottom()I", 0, h0Var), a.u(RadialGamePad.class, "spacingLeft", "getSpacingLeft()I", 0, h0Var), a.u(RadialGamePad.class, "spacingRight", "getSpacingRight()I", 0, h0Var)};
        Companion = new Companion(null);
        $stable = 8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadialGamePad(@NotNull RadialGamePadConfig radialGamePadConfig, float f2, @NotNull Context context) {
        this(radialGamePadConfig, f2, context, null, 0, 24, null);
        p0.a.s(radialGamePadConfig, "gamePadConfig");
        p0.a.s(context, "context");
    }

    private final void applyMeasuredDimensions(int i2, int i3, RectF rectF) {
        d0.k extractModeAndDimension = extractModeAndDimension(i2);
        int intValue = ((Number) extractModeAndDimension.f30134a).intValue();
        int intValue2 = ((Number) extractModeAndDimension.f30135b).intValue();
        d0.k extractModeAndDimension2 = extractModeAndDimension(i3);
        int intValue3 = ((Number) extractModeAndDimension2.f30134a).intValue();
        int intValue4 = ((Number) extractModeAndDimension2.f30135b).intValue();
        int spacingLeft = ((intValue2 - getSpacingLeft()) - getSpacingRight()) - (this.marginsInPixel * 2);
        int spacingBottom = ((intValue4 - getSpacingBottom()) - getSpacingTop()) - (this.marginsInPixel * 2);
        PaintUtils paintUtils = PaintUtils.INSTANCE;
        float f2 = this.primaryDialMaxSizeDp;
        Context context = getContext();
        p0.a.r(context, "getContext(...)");
        float convertDpToPixel = paintUtils.convertDpToPixel(f2, context) / 2;
        if (intValue == 1073741824 && intValue3 == Integer.MIN_VALUE) {
            setMeasuredDimension(intValue2, (this.marginsInPixel * 2) + getSpacingTop() + getSpacingBottom() + Math.min(spacingBottom, Math.min(p0.a.t0((rectF.height() * spacingLeft) / rectF.width()), p0.a.t0(rectF.height() * convertDpToPixel))));
            return;
        }
        if (intValue != Integer.MIN_VALUE || intValue3 != 1073741824) {
            setMeasuredDimension(intValue2, intValue4);
            return;
        }
        setMeasuredDimension((this.marginsInPixel * 2) + getSpacingRight() + getSpacingLeft() + Math.min(spacingLeft, Math.min(p0.a.t0((rectF.width() * spacingBottom) / rectF.height()), p0.a.t0(rectF.width() * convertDpToPixel))), intValue4);
    }

    private final Dial buildPrimaryInteractor(PrimaryDialConfig primaryDialConfig) {
        if (primaryDialConfig instanceof PrimaryDialConfig.Cross) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[this.gamePadConfig.getGamePadTheme().ordinal()];
            if (i2 == 1) {
                Context context = getContext();
                p0.a.r(context, "getContext(...)");
                PrimaryDialConfig.Cross cross = (PrimaryDialConfig.Cross) primaryDialConfig;
                CrossConfig crossConfig = cross.getCrossConfig();
                RadialGamePadTheme theme = cross.getCrossConfig().getTheme();
                if (theme == null) {
                    theme = this.gamePadConfig.getTheme();
                }
                return new CrossDialDefault(context, crossConfig, theme);
            }
            if (i2 == 2) {
                Context context2 = getContext();
                p0.a.r(context2, "getContext(...)");
                PrimaryDialConfig.Cross cross2 = (PrimaryDialConfig.Cross) primaryDialConfig;
                CrossConfig crossConfig2 = cross2.getCrossConfig();
                RadialGamePadTheme theme2 = cross2.getCrossConfig().getTheme();
                if (theme2 == null) {
                    theme2 = this.gamePadConfig.getTheme();
                }
                return new CrossDialNewStyle(context2, crossConfig2, theme2);
            }
            if (i2 == 3) {
                Context context3 = getContext();
                p0.a.r(context3, "getContext(...)");
                PrimaryDialConfig.Cross cross3 = (PrimaryDialConfig.Cross) primaryDialConfig;
                CrossConfig crossConfig3 = cross3.getCrossConfig();
                RadialGamePadTheme theme3 = cross3.getCrossConfig().getTheme();
                if (theme3 == null) {
                    theme3 = this.gamePadConfig.getTheme();
                }
                return new CrossDialFutureTech(context3, crossConfig3, theme3);
            }
            if (i2 != 4) {
                throw new RuntimeException();
            }
            Context context4 = getContext();
            p0.a.r(context4, "getContext(...)");
            PrimaryDialConfig.Cross cross4 = (PrimaryDialConfig.Cross) primaryDialConfig;
            CrossConfig crossConfig4 = cross4.getCrossConfig();
            RadialGamePadTheme theme4 = cross4.getCrossConfig().getTheme();
            if (theme4 == null) {
                theme4 = this.gamePadConfig.getTheme();
            }
            return new CrossDialThreeDStyle(context4, crossConfig4, theme4);
        }
        if (primaryDialConfig instanceof PrimaryDialConfig.Stick) {
            int i3 = WhenMappings.$EnumSwitchMapping$1[this.gamePadConfig.getGamePadTheme().ordinal()];
            if (i3 == 1) {
                Context context5 = getContext();
                p0.a.r(context5, "getContext(...)");
                PrimaryDialConfig.Stick stick = (PrimaryDialConfig.Stick) primaryDialConfig;
                int id = stick.getId();
                Integer buttonPressId = stick.getButtonPressId();
                Set<GestureType> supportsGestures = stick.getSupportsGestures();
                String contentDescription = stick.getContentDescription();
                RadialGamePadTheme theme5 = stick.getTheme();
                if (theme5 == null) {
                    theme5 = this.gamePadConfig.getTheme();
                }
                return new StickDialDefault(context5, id, buttonPressId, supportsGestures, contentDescription, theme5);
            }
            if (i3 == 2) {
                Context context6 = getContext();
                p0.a.r(context6, "getContext(...)");
                PrimaryDialConfig.Stick stick2 = (PrimaryDialConfig.Stick) primaryDialConfig;
                int id2 = stick2.getId();
                Integer buttonPressId2 = stick2.getButtonPressId();
                Set<GestureType> supportsGestures2 = stick2.getSupportsGestures();
                String contentDescription2 = stick2.getContentDescription();
                RadialGamePadTheme theme6 = stick2.getTheme();
                if (theme6 == null) {
                    theme6 = this.gamePadConfig.getTheme();
                }
                return new StickDialNewStyle(context6, id2, buttonPressId2, supportsGestures2, contentDescription2, theme6);
            }
            if (i3 == 3) {
                Context context7 = getContext();
                p0.a.r(context7, "getContext(...)");
                PrimaryDialConfig.Stick stick3 = (PrimaryDialConfig.Stick) primaryDialConfig;
                int id3 = stick3.getId();
                Integer buttonPressId3 = stick3.getButtonPressId();
                Set<GestureType> supportsGestures3 = stick3.getSupportsGestures();
                String contentDescription3 = stick3.getContentDescription();
                RadialGamePadTheme theme7 = stick3.getTheme();
                if (theme7 == null) {
                    theme7 = this.gamePadConfig.getTheme();
                }
                return new StickDialFutureTech(context7, id3, buttonPressId3, supportsGestures3, contentDescription3, theme7);
            }
            if (i3 != 4) {
                throw new RuntimeException();
            }
            Context context8 = getContext();
            p0.a.r(context8, "getContext(...)");
            PrimaryDialConfig.Stick stick4 = (PrimaryDialConfig.Stick) primaryDialConfig;
            int id4 = stick4.getId();
            Integer buttonPressId4 = stick4.getButtonPressId();
            Set<GestureType> supportsGestures4 = stick4.getSupportsGestures();
            String contentDescription4 = stick4.getContentDescription();
            RadialGamePadTheme theme8 = stick4.getTheme();
            if (theme8 == null) {
                theme8 = this.gamePadConfig.getTheme();
            }
            return new StickDialThreeDStyle(context8, id4, buttonPressId4, supportsGestures4, contentDescription4, theme8);
        }
        if (!(primaryDialConfig instanceof PrimaryDialConfig.PrimaryButtons)) {
            throw new RuntimeException();
        }
        int i4 = WhenMappings.$EnumSwitchMapping$1[this.gamePadConfig.getGamePadTheme().ordinal()];
        if (i4 == 1) {
            Context context9 = getContext();
            p0.a.r(context9, "getContext(...)");
            PrimaryDialConfig.PrimaryButtons primaryButtons = (PrimaryDialConfig.PrimaryButtons) primaryDialConfig;
            List<ButtonConfig> dials = primaryButtons.getDials();
            ButtonConfig center = primaryButtons.getCenter();
            float radians = MathUtils.INSTANCE.toRadians(primaryButtons.getRotationInDegrees());
            boolean allowMultiplePressesSingleFinger = primaryButtons.getAllowMultiplePressesSingleFinger();
            RadialGamePadTheme theme9 = primaryButtons.getTheme();
            if (theme9 == null) {
                theme9 = this.gamePadConfig.getTheme();
            }
            return new PrimaryButtonsDialDefault(context9, dials, center, radians, allowMultiplePressesSingleFinger, theme9);
        }
        if (i4 == 2) {
            Context context10 = getContext();
            p0.a.r(context10, "getContext(...)");
            PrimaryDialConfig.PrimaryButtons primaryButtons2 = (PrimaryDialConfig.PrimaryButtons) primaryDialConfig;
            List<ButtonConfig> dials2 = primaryButtons2.getDials();
            ButtonConfig center2 = primaryButtons2.getCenter();
            float radians2 = MathUtils.INSTANCE.toRadians(primaryButtons2.getRotationInDegrees());
            boolean allowMultiplePressesSingleFinger2 = primaryButtons2.getAllowMultiplePressesSingleFinger();
            RadialGamePadTheme theme10 = primaryButtons2.getTheme();
            if (theme10 == null) {
                theme10 = this.gamePadConfig.getTheme();
            }
            return new PrimaryButtonsDialNewStyle(context10, dials2, center2, radians2, allowMultiplePressesSingleFinger2, theme10);
        }
        if (i4 == 3) {
            Context context11 = getContext();
            p0.a.r(context11, "getContext(...)");
            PrimaryDialConfig.PrimaryButtons primaryButtons3 = (PrimaryDialConfig.PrimaryButtons) primaryDialConfig;
            List<ButtonConfig> dials3 = primaryButtons3.getDials();
            ButtonConfig center3 = primaryButtons3.getCenter();
            float radians3 = MathUtils.INSTANCE.toRadians(primaryButtons3.getRotationInDegrees());
            boolean allowMultiplePressesSingleFinger3 = primaryButtons3.getAllowMultiplePressesSingleFinger();
            RadialGamePadTheme theme11 = primaryButtons3.getTheme();
            if (theme11 == null) {
                theme11 = this.gamePadConfig.getTheme();
            }
            return new PrimaryButtonsDialFutureTech(context11, dials3, center3, radians3, allowMultiplePressesSingleFinger3, theme11);
        }
        if (i4 != 4) {
            throw new RuntimeException();
        }
        Context context12 = getContext();
        p0.a.r(context12, "getContext(...)");
        PrimaryDialConfig.PrimaryButtons primaryButtons4 = (PrimaryDialConfig.PrimaryButtons) primaryDialConfig;
        List<ButtonConfig> dials4 = primaryButtons4.getDials();
        ButtonConfig center4 = primaryButtons4.getCenter();
        float radians4 = MathUtils.INSTANCE.toRadians(primaryButtons4.getRotationInDegrees());
        boolean allowMultiplePressesSingleFinger4 = primaryButtons4.getAllowMultiplePressesSingleFinger();
        RadialGamePadTheme theme12 = primaryButtons4.getTheme();
        if (theme12 == null) {
            theme12 = this.gamePadConfig.getTheme();
        }
        return new PrimaryButtonsDialThreeDStyle(context12, dials4, center4, radians4, allowMultiplePressesSingleFinger4, theme12);
    }

    private final List<Dial> buildSecondaryInteractors(List<? extends SecondaryDialConfig> list) {
        Dial crossDialDefault;
        List<? extends SecondaryDialConfig> list2 = list;
        ArrayList arrayList = new ArrayList(q.M(list2, 10));
        for (SecondaryDialConfig secondaryDialConfig : list2) {
            if (secondaryDialConfig instanceof SecondaryDialConfig.Stick) {
                int i2 = WhenMappings.$EnumSwitchMapping$1[this.gamePadConfig.getGamePadTheme().ordinal()];
                if (i2 == 1) {
                    Context context = getContext();
                    p0.a.r(context, "getContext(...)");
                    SecondaryDialConfig.Stick stick = (SecondaryDialConfig.Stick) secondaryDialConfig;
                    int id = stick.getId();
                    Integer buttonPressId = stick.getButtonPressId();
                    Set<GestureType> supportsGestures = stick.getSupportsGestures();
                    String contentDescription = stick.getContentDescription();
                    RadialGamePadTheme theme = stick.getTheme();
                    if (theme == null) {
                        theme = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new StickDialDefault(context, id, buttonPressId, supportsGestures, contentDescription, theme);
                } else if (i2 == 2) {
                    Context context2 = getContext();
                    p0.a.r(context2, "getContext(...)");
                    SecondaryDialConfig.Stick stick2 = (SecondaryDialConfig.Stick) secondaryDialConfig;
                    int id2 = stick2.getId();
                    Integer buttonPressId2 = stick2.getButtonPressId();
                    Set<GestureType> supportsGestures2 = stick2.getSupportsGestures();
                    String contentDescription2 = stick2.getContentDescription();
                    RadialGamePadTheme theme2 = stick2.getTheme();
                    if (theme2 == null) {
                        theme2 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new StickDialNewStyle(context2, id2, buttonPressId2, supportsGestures2, contentDescription2, theme2);
                } else if (i2 == 3) {
                    Context context3 = getContext();
                    p0.a.r(context3, "getContext(...)");
                    SecondaryDialConfig.Stick stick3 = (SecondaryDialConfig.Stick) secondaryDialConfig;
                    int id3 = stick3.getId();
                    Integer buttonPressId3 = stick3.getButtonPressId();
                    Set<GestureType> supportsGestures3 = stick3.getSupportsGestures();
                    String contentDescription3 = stick3.getContentDescription();
                    RadialGamePadTheme theme3 = stick3.getTheme();
                    if (theme3 == null) {
                        theme3 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new StickDialFutureTech(context3, id3, buttonPressId3, supportsGestures3, contentDescription3, theme3);
                } else {
                    if (i2 != 4) {
                        throw new RuntimeException();
                    }
                    Context context4 = getContext();
                    p0.a.r(context4, "getContext(...)");
                    SecondaryDialConfig.Stick stick4 = (SecondaryDialConfig.Stick) secondaryDialConfig;
                    int id4 = stick4.getId();
                    Integer buttonPressId4 = stick4.getButtonPressId();
                    Set<GestureType> supportsGestures4 = stick4.getSupportsGestures();
                    String contentDescription4 = stick4.getContentDescription();
                    RadialGamePadTheme theme4 = stick4.getTheme();
                    if (theme4 == null) {
                        theme4 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new StickDialThreeDStyle(context4, id4, buttonPressId4, supportsGestures4, contentDescription4, theme4);
                }
            } else if (secondaryDialConfig instanceof SecondaryDialConfig.SingleButton) {
                int i3 = WhenMappings.$EnumSwitchMapping$1[this.gamePadConfig.getGamePadTheme().ordinal()];
                if (i3 == 1) {
                    Context context5 = getContext();
                    p0.a.r(context5, "getContext(...)");
                    SecondaryDialConfig.SingleButton singleButton = (SecondaryDialConfig.SingleButton) secondaryDialConfig;
                    ButtonConfig buttonConfig = singleButton.getButtonConfig();
                    RadialGamePadTheme theme5 = singleButton.getTheme();
                    if (theme5 == null) {
                        theme5 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new ButtonDialDefault(context5, buttonConfig, theme5);
                } else if (i3 == 2) {
                    Context context6 = getContext();
                    p0.a.r(context6, "getContext(...)");
                    SecondaryDialConfig.SingleButton singleButton2 = (SecondaryDialConfig.SingleButton) secondaryDialConfig;
                    ButtonConfig buttonConfig2 = singleButton2.getButtonConfig();
                    RadialGamePadTheme theme6 = singleButton2.getTheme();
                    if (theme6 == null) {
                        theme6 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new ButtonDialNewStyle(context6, buttonConfig2, theme6);
                } else if (i3 == 3) {
                    Context context7 = getContext();
                    p0.a.r(context7, "getContext(...)");
                    SecondaryDialConfig.SingleButton singleButton3 = (SecondaryDialConfig.SingleButton) secondaryDialConfig;
                    ButtonConfig buttonConfig3 = singleButton3.getButtonConfig();
                    RadialGamePadTheme theme7 = singleButton3.getTheme();
                    if (theme7 == null) {
                        theme7 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new ButtonDialFutureTech(context7, buttonConfig3, theme7);
                } else {
                    if (i3 != 4) {
                        throw new RuntimeException();
                    }
                    Context context8 = getContext();
                    p0.a.r(context8, "getContext(...)");
                    SecondaryDialConfig.SingleButton singleButton4 = (SecondaryDialConfig.SingleButton) secondaryDialConfig;
                    ButtonConfig buttonConfig4 = singleButton4.getButtonConfig();
                    RadialGamePadTheme theme8 = singleButton4.getTheme();
                    if (theme8 == null) {
                        theme8 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new ButtonDialThreeDStyle(context8, buttonConfig4, theme8);
                }
            } else if (secondaryDialConfig instanceof SecondaryDialConfig.DoubleButton) {
                int i4 = WhenMappings.$EnumSwitchMapping$1[this.gamePadConfig.getGamePadTheme().ordinal()];
                if (i4 == 1) {
                    Context context9 = getContext();
                    p0.a.r(context9, "getContext(...)");
                    SecondaryDialConfig.DoubleButton doubleButton = (SecondaryDialConfig.DoubleButton) secondaryDialConfig;
                    ButtonConfig buttonConfig5 = doubleButton.getButtonConfig();
                    RadialGamePadTheme theme9 = doubleButton.getTheme();
                    if (theme9 == null) {
                        theme9 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new DoubleButtonDialDefault(context9, buttonConfig5, theme9);
                } else if (i4 == 2) {
                    Context context10 = getContext();
                    p0.a.r(context10, "getContext(...)");
                    SecondaryDialConfig.DoubleButton doubleButton2 = (SecondaryDialConfig.DoubleButton) secondaryDialConfig;
                    ButtonConfig buttonConfig6 = doubleButton2.getButtonConfig();
                    RadialGamePadTheme theme10 = doubleButton2.getTheme();
                    if (theme10 == null) {
                        theme10 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new DoubleButtonDialNewStyle(context10, buttonConfig6, theme10);
                } else if (i4 == 3) {
                    Context context11 = getContext();
                    p0.a.r(context11, "getContext(...)");
                    SecondaryDialConfig.DoubleButton doubleButton3 = (SecondaryDialConfig.DoubleButton) secondaryDialConfig;
                    ButtonConfig buttonConfig7 = doubleButton3.getButtonConfig();
                    RadialGamePadTheme theme11 = doubleButton3.getTheme();
                    if (theme11 == null) {
                        theme11 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new DoubleButtonDialFutureTech(context11, buttonConfig7, theme11);
                } else {
                    if (i4 != 4) {
                        throw new RuntimeException();
                    }
                    Context context12 = getContext();
                    p0.a.r(context12, "getContext(...)");
                    SecondaryDialConfig.DoubleButton doubleButton4 = (SecondaryDialConfig.DoubleButton) secondaryDialConfig;
                    ButtonConfig buttonConfig8 = doubleButton4.getButtonConfig();
                    RadialGamePadTheme theme12 = doubleButton4.getTheme();
                    if (theme12 == null) {
                        theme12 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new DoubleButtonDialThreeDStyle(context12, buttonConfig8, theme12);
                }
            } else if (secondaryDialConfig instanceof SecondaryDialConfig.Empty) {
                crossDialDefault = new EmptyDial();
            } else {
                if (!(secondaryDialConfig instanceof SecondaryDialConfig.Cross)) {
                    throw new RuntimeException();
                }
                int i5 = WhenMappings.$EnumSwitchMapping$1[this.gamePadConfig.getGamePadTheme().ordinal()];
                if (i5 == 1) {
                    Context context13 = getContext();
                    p0.a.r(context13, "getContext(...)");
                    SecondaryDialConfig.Cross cross = (SecondaryDialConfig.Cross) secondaryDialConfig;
                    CrossConfig crossConfig = cross.getCrossConfig();
                    RadialGamePadTheme theme13 = cross.getCrossConfig().getTheme();
                    if (theme13 == null) {
                        theme13 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new CrossDialDefault(context13, crossConfig, theme13);
                } else if (i5 == 2) {
                    Context context14 = getContext();
                    p0.a.r(context14, "getContext(...)");
                    SecondaryDialConfig.Cross cross2 = (SecondaryDialConfig.Cross) secondaryDialConfig;
                    CrossConfig crossConfig2 = cross2.getCrossConfig();
                    RadialGamePadTheme theme14 = cross2.getCrossConfig().getTheme();
                    if (theme14 == null) {
                        theme14 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new CrossDialNewStyle(context14, crossConfig2, theme14);
                } else if (i5 == 3) {
                    Context context15 = getContext();
                    p0.a.r(context15, "getContext(...)");
                    SecondaryDialConfig.Cross cross3 = (SecondaryDialConfig.Cross) secondaryDialConfig;
                    CrossConfig crossConfig3 = cross3.getCrossConfig();
                    RadialGamePadTheme theme15 = cross3.getCrossConfig().getTheme();
                    if (theme15 == null) {
                        theme15 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new CrossDialFutureTech(context15, crossConfig3, theme15);
                } else {
                    if (i5 != 4) {
                        throw new RuntimeException();
                    }
                    Context context16 = getContext();
                    p0.a.r(context16, "getContext(...)");
                    SecondaryDialConfig.Cross cross4 = (SecondaryDialConfig.Cross) secondaryDialConfig;
                    CrossConfig crossConfig4 = cross4.getCrossConfig();
                    RadialGamePadTheme theme16 = cross4.getCrossConfig().getTheme();
                    if (theme16 == null) {
                        theme16 = this.gamePadConfig.getTheme();
                    }
                    crossDialDefault = new CrossDialThreeDStyle(context16, crossConfig4, theme16);
                }
            }
            arrayList.add(crossDialDefault);
        }
        return arrayList;
    }

    private final float computeFinalSpacing(SecondaryDialConfig secondaryDialConfig) {
        return secondaryDialConfig.getRotationProcessor().getSpacing(secondaryDialConfig.getDistance(), getSecondaryDialRotation());
    }

    private final float computeRotationInRadiansForDial(SecondaryDialConfig secondaryDialConfig) {
        return MathUtils.INSTANCE.toRadians(secondaryDialConfig.getRotationProcessor().getRotation(getSecondaryDialRotation()));
    }

    private final RectF computeTotalSizeAsSizeMultipliers() {
        List<SecondaryDialConfig> secondaryDials = this.gamePadConfig.getSecondaryDials();
        ArrayList arrayList = new ArrayList(q.M(secondaryDials, 10));
        for (SecondaryDialConfig secondaryDialConfig : secondaryDials) {
            arrayList.add(secondaryDialConfig.getAvoidClipping$gba_v1_0_35_54__09Apr2025_1046_release() ? measureSecondaryDialDrawingBoxNoClipping(secondaryDialConfig) : measureSecondaryDialDrawingBox(secondaryDialConfig));
        }
        return PaintUtils.INSTANCE.mergeRectangles(u.P0(arrayList, f0.u(new RectF(-1.0f, -1.0f, 1.0f, 1.0f))));
    }

    private final HapticEngine createHapticEngine() {
        HapticActuator viewActuator;
        HapticSelector noEffectHapticSelector;
        if (Build.VERSION.SDK_INT >= 29) {
            Context applicationContext = getContext().getApplicationContext();
            p0.a.r(applicationContext, "getApplicationContext(...)");
            viewActuator = new VibrationEffectActuator(applicationContext);
        } else {
            viewActuator = new ViewActuator(new WeakReference(this));
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.gamePadConfig.getHaptic().ordinal()];
        if (i2 == 1) {
            noEffectHapticSelector = new NoEffectHapticSelector();
        } else if (i2 == 2) {
            noEffectHapticSelector = new SimpleHapticSelector();
        } else {
            if (i2 != 3) {
                throw new RuntimeException();
            }
            noEffectHapticSelector = new AdvancedHapticSelector();
        }
        return new HapticEngine(noEffectHapticSelector, viewActuator);
    }

    private final j extractFingersPositions(MotionEvent motionEvent) {
        if (!this.gamePadConfig.getPreferScreenTouchCoordinates() || Build.VERSION.SDK_INT < 29) {
            return TouchUtils.INSTANCE.extractFingersPositions(motionEvent);
        }
        getLocationOnScreen(this.positionOnScreen);
        TouchUtils touchUtils = TouchUtils.INSTANCE;
        int[] iArr = this.positionOnScreen;
        return touchUtils.extractRawFingersPositions(motionEvent, iArr[0], iArr[1]);
    }

    private final d0.k extractModeAndDimension(int i2) {
        return new d0.k(Integer.valueOf(View.MeasureSpec.getMode(i2)), Integer.valueOf(View.MeasureSpec.getSize(i2)));
    }

    private final Dial findInteractorForFinger(TouchUtils.FingerPosition fingerPosition) {
        List<? extends Dial> list = this.allDials;
        Object obj = null;
        if (list == null) {
            p0.a.B0("allDials");
            throw null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TouchBound touchBound = this.touchBounds.get((Dial) next);
            if (touchBound != null && touchBound.contains(fingerPosition.getX(), fingerPosition.getY())) {
                obj = next;
                break;
            }
        }
        return (Dial) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvents(List<? extends Event> list) {
        b1 b1Var = b1.f22288a;
        e.v(b1Var, this.hapticDispatcher, 0, new RadialGamePad$handleEvents$1(this, list, null), 2);
        e.v(b1Var, this.eventDispatcher, 0, new RadialGamePad$handleEvents$2(list, this, null), 2);
    }

    private final void measurePrimaryDial() {
        this.touchBounds.put(this.primaryDial, new CircleTouchBound(this.center, this.size));
        Dial dial = this.primaryDial;
        PointF pointF = this.center;
        float f2 = pointF.x;
        float f3 = this.size;
        float f4 = pointF.y;
        Dial.DefaultImpls.measure$default(dial, new RectF(f2 - f3, f4 - f3, f2 + f3, f4 + f3), null, 2, null);
    }

    private final d0.k measureSecondaryDial(SecondaryDialConfig secondaryDialConfig) {
        RectF scale = PaintUtils.INSTANCE.scale(measureSecondaryDialDrawingBox(secondaryDialConfig), this.size);
        PointF pointF = this.center;
        scale.offset(pointF.x, pointF.y);
        float f2 = 6.2831855f / this.dials;
        float scale2 = secondaryDialConfig.getScale() * this.size * 0.75f;
        float computeRotationInRadiansForDial = computeRotationInRadiansForDial(secondaryDialConfig);
        float computeFinalSpacing = (this.secondaryDialSpacing + computeFinalSpacing(secondaryDialConfig)) * this.size * 0.75f;
        PointF pointF2 = this.center;
        PointF pointF3 = new PointF(pointF2.x, pointF2.y);
        float f3 = this.size;
        float f4 = f3 + computeFinalSpacing;
        float scale3 = (secondaryDialConfig.getScale() * scale2) + f3 + computeFinalSpacing;
        float f5 = f2 / 2;
        return new d0.k(scale, new Sector(pointF3, f4, scale3, ((secondaryDialConfig.getIndex() * f2) + computeRotationInRadiansForDial) - f5, (((secondaryDialConfig.getSpread() + secondaryDialConfig.getIndex()) - 1) * f2) + computeRotationInRadiansForDial + f5));
    }

    private final RectF measureSecondaryDialDrawingBox(SecondaryDialConfig secondaryDialConfig) {
        return measureSecondaryDialDrawingBox(secondaryDialConfig, null, null);
    }

    private final RectF measureSecondaryDialDrawingBoxNoClipping(SecondaryDialConfig secondaryDialConfig) {
        g F0 = p0.a.F0(secondaryDialConfig.getIndex(), secondaryDialConfig.getSpread() + secondaryDialConfig.getIndex());
        ArrayList arrayList = new ArrayList(q.M(F0, 10));
        Iterator it = F0.iterator();
        while (it.hasNext()) {
            arrayList.add(measureSecondaryDialDrawingBox(secondaryDialConfig, Integer.valueOf(((b0) it).b()), 1));
        }
        return PaintUtils.INSTANCE.mergeRectangles(arrayList);
    }

    private final void measureSecondaryDials() {
        int i2 = 0;
        for (Object obj : this.gamePadConfig.getSecondaryDials()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                f0.D();
                throw null;
            }
            d0.k measureSecondaryDial = measureSecondaryDial((SecondaryDialConfig) obj);
            RectF rectF = (RectF) measureSecondaryDial.f30134a;
            Sector sector = (Sector) measureSecondaryDial.f30135b;
            Dial dial = this.secondaryDials.get(i2);
            this.touchBounds.put(dial, new SectorTouchBound(sector));
            dial.measure(rectF, sector);
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestLayoutAndInvalidate() {
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NotNull MotionEvent motionEvent) {
        p0.a.s(motionEvent, MaxEvent.f29810a);
        if (dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.event.EventsSource
    @NotNull
    public h events() {
        return this.eventsSubject;
    }

    public final float getGravityX() {
        return ((Number) this.gravityX$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final float getGravityY() {
        return ((Number) this.gravityY$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    public final float getOffsetX() {
        return ((Number) this.offsetX$delegate.getValue(this, $$delegatedProperties[2])).floatValue();
    }

    public final float getOffsetY() {
        return ((Number) this.offsetY$delegate.getValue(this, $$delegatedProperties[3])).floatValue();
    }

    public final float getPrimaryDialMaxSizeDp() {
        return this.primaryDialMaxSizeDp;
    }

    public final float getSecondaryDialRotation() {
        return ((Number) this.secondaryDialRotation$delegate.getValue(this, $$delegatedProperties[4])).floatValue();
    }

    public final float getSecondaryDialSpacing() {
        return this.secondaryDialSpacing;
    }

    public final int getSpacingBottom() {
        return ((Number) this.spacingBottom$delegate.getValue(this, $$delegatedProperties[6])).intValue();
    }

    public final int getSpacingLeft() {
        return ((Number) this.spacingLeft$delegate.getValue(this, $$delegatedProperties[7])).intValue();
    }

    public final int getSpacingRight() {
        return ((Number) this.spacingRight$delegate.getValue(this, $$delegatedProperties[8])).intValue();
    }

    public final int getSpacingTop() {
        return ((Number) this.spacingTop$delegate.getValue(this, $$delegatedProperties[5])).intValue();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        p0.a.s(canvas, "canvas");
        super.onDraw(canvas);
        this.primaryDial.draw(canvas);
        Iterator<T> it = this.secondaryDials.iterator();
        while (it.hasNext()) {
            ((Dial) it.next()).draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        RectF computeTotalSizeAsSizeMultipliers = computeTotalSizeAsSizeMultipliers();
        applyMeasuredDimensions(i2, i3, computeTotalSizeAsSizeMultipliers);
        int measuredWidth = ((getMeasuredWidth() - getSpacingLeft()) - getSpacingRight()) - (this.marginsInPixel * 2);
        int measuredHeight = ((getMeasuredHeight() - getSpacingTop()) - getSpacingBottom()) - (this.marginsInPixel * 2);
        float f2 = measuredWidth;
        float width = f2 / computeTotalSizeAsSizeMultipliers.width();
        float f3 = measuredHeight;
        float height = f3 / computeTotalSizeAsSizeMultipliers.height();
        PaintUtils paintUtils = PaintUtils.INSTANCE;
        float f4 = this.primaryDialMaxSizeDp;
        Context context = getContext();
        p0.a.r(context, "getContext(...)");
        float min = Math.min(width, Math.min(height, paintUtils.convertDpToPixel(f4, context) / 2.0f));
        this.size = min;
        float width2 = (f2 - (computeTotalSizeAsSizeMultipliers.width() * min)) / 2.0f;
        float height2 = (f3 - (computeTotalSizeAsSizeMultipliers.height() * this.size)) / 2.0f;
        float offsetX = getOffsetX() + (getGravityX() * width2);
        MathUtils mathUtils = MathUtils.INSTANCE;
        float clamp = mathUtils.clamp(offsetX, -width2, width2);
        PointF pointF = this.center;
        float measuredWidth2 = clamp + (((getMeasuredWidth() - getSpacingLeft()) - getSpacingRight()) / 2.0f) + getSpacingLeft();
        float f5 = computeTotalSizeAsSizeMultipliers.left + computeTotalSizeAsSizeMultipliers.right;
        float f6 = this.size;
        pointF.x = measuredWidth2 - ((f5 * f6) * 0.5f);
        pointF.y = (mathUtils.clamp(getOffsetY() + (getGravityY() * height2), -height2, height2) + ((((getMeasuredHeight() - getSpacingTop()) - getSpacingBottom()) / 2.0f) + getSpacingTop())) - (((computeTotalSizeAsSizeMultipliers.top + computeTotalSizeAsSizeMultipliers.bottom) * f6) * 0.5f);
        this.touchBounds.clear();
        measurePrimaryDial();
        measureSecondaryDials();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        p0.a.s(motionEvent, MaxEvent.f29810a);
        this.tapsDetector.handleEvent(motionEvent);
        List S = m.S(extractFingersPositions(motionEvent));
        List<? extends Dial> list = this.allDials;
        if (list == null) {
            p0.a.B0("allDials");
            throw null;
        }
        List<? extends Dial> list2 = list;
        ArrayList arrayList = new ArrayList(q.M(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Dial) it.next()).trackedPointersIds());
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        Object previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            Set set = (Set) listIterator.previous();
            Set set2 = (Set) previous;
            p0.a.s(set, "<this>");
            p0.a.s(set2, "other");
            Set d12 = u.d1(set);
            e0.t.t0(d12, set2);
            previous = d12;
        }
        Set set3 = (Set) previous;
        ArrayList arrayList2 = new ArrayList();
        List list3 = S;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list3) {
            Dial findInteractorForFinger = findInteractorForFinger((TouchUtils.FingerPosition) obj);
            Object obj2 = linkedHashMap.get(findInteractorForFinger);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(findInteractorForFinger, obj2);
            }
            ((List) obj2).add(obj);
        }
        List<? extends Dial> list4 = this.allDials;
        if (list4 == null) {
            p0.a.B0("allDials");
            throw null;
        }
        List<? extends Dial> list5 = list4;
        ArrayList arrayList3 = new ArrayList(q.M(list5, 10));
        for (Dial dial : list5) {
            Object obj3 = linkedHashMap.get(dial);
            if (obj3 == null) {
                obj3 = w.f30218a;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : (Iterable) obj3) {
                if (!set3.contains(Integer.valueOf(((TouchUtils.FingerPosition) obj4).getPointerId()))) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : list3) {
                if (dial.trackedPointersIds().contains(Integer.valueOf(((TouchUtils.FingerPosition) obj5).getPointerId()))) {
                    arrayList5.add(obj5);
                }
            }
            arrayList3.add(Boolean.valueOf(dial.touch(TouchUtils.INSTANCE.computeRelativeFingerPosition(u.P0(arrayList5, arrayList4), dial.drawingBox()), arrayList2)));
        }
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((Boolean) it2.next()).booleanValue()) {
                    postInvalidate();
                    break;
                }
            }
        }
        handleEvents(arrayList2);
        return true;
    }

    public final void performHapticFeedback() {
        this.hapticEngine.performHaptic(2);
    }

    public final void setGravityX(float f2) {
        this.gravityX$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f2));
    }

    public final void setGravityY(float f2) {
        this.gravityY$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f2));
    }

    public final void setOffsetX(float f2) {
        this.offsetX$delegate.setValue(this, $$delegatedProperties[2], Float.valueOf(f2));
    }

    public final void setOffsetY(float f2) {
        this.offsetY$delegate.setValue(this, $$delegatedProperties[3], Float.valueOf(f2));
    }

    public final void setPrimaryDialMaxSizeDp(float f2) {
        this.primaryDialMaxSizeDp = f2;
        requestLayoutAndInvalidate();
    }

    public final void setSecondaryDialRotation(float f2) {
        this.secondaryDialRotation$delegate.setValue(this, $$delegatedProperties[4], Float.valueOf(f2));
    }

    public final void setSecondaryDialSpacing(float f2) {
        this.secondaryDialSpacing = p0.a.z(f2, 0.0f, 1.0f);
        requestLayoutAndInvalidate();
    }

    public final void setSpacingBottom(int i2) {
        this.spacingBottom$delegate.setValue(this, $$delegatedProperties[6], Integer.valueOf(i2));
    }

    public final void setSpacingLeft(int i2) {
        this.spacingLeft$delegate.setValue(this, $$delegatedProperties[7], Integer.valueOf(i2));
    }

    public final void setSpacingRight(int i2) {
        this.spacingRight$delegate.setValue(this, $$delegatedProperties[8], Integer.valueOf(i2));
    }

    public final void setSpacingTop(int i2) {
        this.spacingTop$delegate.setValue(this, $$delegatedProperties[5], Integer.valueOf(i2));
    }

    public final void simulateClearKeyEvent(int i2) {
        ArrayList arrayList = new ArrayList();
        List<? extends Dial> list = this.allDials;
        if (list == null) {
            p0.a.B0("allDials");
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SimulateKeyDial) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q.M(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Boolean.valueOf(((SimulateKeyDial) it.next()).clearSimulateKeyPress(i2, arrayList)));
        }
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((Boolean) it2.next()).booleanValue()) {
                        postInvalidate();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        handleEvents(arrayList);
    }

    public final void simulateClearMotionEvent(int i2) {
        ArrayList arrayList = new ArrayList();
        List<? extends Dial> list = this.allDials;
        if (list == null) {
            p0.a.B0("allDials");
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SimulateMotionDial) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q.M(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Boolean.valueOf(((SimulateMotionDial) it.next()).clearSimulatedMotion(i2, arrayList)));
        }
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((Boolean) it2.next()).booleanValue()) {
                        postInvalidate();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        handleEvents(arrayList);
    }

    public final void simulateKeyEvent(int i2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        List<? extends Dial> list = this.allDials;
        if (list == null) {
            p0.a.B0("allDials");
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SimulateKeyDial) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q.M(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Boolean.valueOf(((SimulateKeyDial) it.next()).simulateKeyPress(i2, z2, arrayList)));
        }
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((Boolean) it2.next()).booleanValue()) {
                        postInvalidate();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        handleEvents(arrayList);
    }

    public final void simulateMotionEvent(int i2, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        List<? extends Dial> list = this.allDials;
        if (list == null) {
            p0.a.B0("allDials");
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SimulateMotionDial) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q.M(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Boolean.valueOf(((SimulateMotionDial) it.next()).simulateMotion(i2, f2, f3, arrayList)));
        }
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((Boolean) it2.next()).booleanValue()) {
                        postInvalidate();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        handleEvents(arrayList);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadialGamePad(@NotNull RadialGamePadConfig radialGamePadConfig, float f2, @NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(radialGamePadConfig, f2, context, attributeSet, 0, 16, null);
        p0.a.s(radialGamePadConfig, "gamePadConfig");
        p0.a.s(context, "context");
    }

    private final RectF measureSecondaryDialDrawingBox(SecondaryDialConfig secondaryDialConfig, Integer num, Integer num2) {
        int intValue = num != null ? num.intValue() : secondaryDialConfig.getIndex();
        int intValue2 = num2 != null ? num2.intValue() : secondaryDialConfig.getSpread();
        float scale = secondaryDialConfig.getScale() * 0.75f;
        float computeFinalSpacing = (this.secondaryDialSpacing + computeFinalSpacing(secondaryDialConfig)) * 0.75f;
        float tan = (scale * 0.5f) / ((float) Math.tan((intValue2 * r1) / 2.0f));
        float f2 = scale / 2.0f;
        float max = Math.max(tan, 1.0f + f2) + computeFinalSpacing;
        double computeRotationInRadiansForDial = ((((intValue2 - 1) * 0.5f) + intValue) * (6.2831855f / this.dials)) + computeRotationInRadiansForDial(secondaryDialConfig);
        return new RectF((((float) Math.cos(computeRotationInRadiansForDial)) * max) - f2, ((-((float) Math.sin(computeRotationInRadiansForDial))) * max) - f2, (((float) Math.cos(computeRotationInRadiansForDial)) * max) + f2, ((-((float) Math.sin(computeRotationInRadiansForDial))) * max) + f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadialGamePad(@NotNull RadialGamePadConfig radialGamePadConfig, @NotNull Context context) {
        this(radialGamePadConfig, 0.0f, context, null, 0, 26, null);
        p0.a.s(radialGamePadConfig, "gamePadConfig");
        p0.a.s(context, "context");
    }

    public /* synthetic */ RadialGamePad(RadialGamePadConfig radialGamePadConfig, float f2, Context context, AttributeSet attributeSet, int i2, int i3, k kVar) {
        this(radialGamePadConfig, (i3 & 2) != 0 ? 16.0f : f2, context, (i3 & 8) != 0 ? null : attributeSet, (i3 & 16) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$exploreByTouchHelper$1, androidx.core.view.AccessibilityDelegateCompat] */
    public RadialGamePad(@NotNull RadialGamePadConfig radialGamePadConfig, float f2, @NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        p0.a.s(radialGamePadConfig, "gamePadConfig");
        p0.a.s(context, "context");
        this.gamePadConfig = radialGamePadConfig;
        final AtomicInteger atomicInteger = new AtomicInteger();
        final String str = "touch-events";
        this.eventDispatcher = new a1(Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: b1.e2

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f22300a = 1;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i3 = this.f22300a;
                String str2 = str;
                if (i3 != 1) {
                    str2 = str2 + SignatureVisitor.SUPER + atomicInteger.incrementAndGet();
                }
                Thread thread = new Thread(runnable, str2);
                thread.setDaemon(true);
                return thread;
            }
        }));
        final AtomicInteger atomicInteger2 = new AtomicInteger();
        final String str2 = "haptic-events";
        this.hapticDispatcher = new a1(Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: b1.e2

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f22300a = 1;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i3 = this.f22300a;
                String str22 = str2;
                if (i3 != 1) {
                    str22 = str22 + SignatureVisitor.SUPER + atomicInteger2.incrementAndGet();
                }
                Thread thread = new Thread(runnable, str22);
                thread.setDaemon(true);
                return thread;
            }
        }));
        final int i3 = 0;
        this.eventsSubject = t0.b(0, 0, 0, 7);
        ?? r02 = new ExploreByTouchHelper() { // from class: com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$exploreByTouchHelper$1
            {
                super(RadialGamePad.this);
            }

            private final Map<Integer, AccessibilityBox> computeVirtualViews() {
                List list;
                list = RadialGamePad.this.allDials;
                if (list == null) {
                    p0.a.B0("allDials");
                    throw null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e0.t.t0(arrayList, ((Dial) it.next()).accessibilityBoxes());
                }
                List T0 = u.T0(arrayList, new Comparator() { // from class: com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$exploreByTouchHelper$1$computeVirtualViews$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t2, T t3) {
                        return kotlin.jvm.internal.q.c(Integer.valueOf(((AccessibilityBox) t2).getRect().top), Integer.valueOf(((AccessibilityBox) t3).getRect().top));
                    }
                });
                ArrayList arrayList2 = new ArrayList(q.M(T0, 10));
                int i4 = 0;
                for (Object obj : T0) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        f0.D();
                        throw null;
                    }
                    arrayList2.add(new d0.k(Integer.valueOf(i4), (AccessibilityBox) obj));
                    i4 = i5;
                }
                return e0.w(arrayList2);
            }

            @Override // androidx.customview.widget.ExploreByTouchHelper
            public int getVirtualViewAt(float f3, float f4) {
                Set<Map.Entry<Integer, AccessibilityBox>> entrySet = computeVirtualViews().entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : entrySet) {
                    if (((AccessibilityBox) ((Map.Entry) obj).getValue()).getRect().contains(p0.a.t0(f3), p0.a.t0(f4))) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q.M(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getKey()).intValue()));
                }
                Integer num = (Integer) u.F0(arrayList2);
                if (num != null) {
                    return num.intValue();
                }
                return Integer.MIN_VALUE;
            }

            @Override // androidx.customview.widget.ExploreByTouchHelper
            public void getVisibleVirtualViews(@NotNull List<Integer> list) {
                p0.a.s(list, "virtualViewIds");
                Iterator<Map.Entry<Integer, AccessibilityBox>> it = computeVirtualViews().entrySet().iterator();
                while (it.hasNext()) {
                    list.add(Integer.valueOf(it.next().getKey().intValue()));
                }
            }

            @Override // androidx.customview.widget.ExploreByTouchHelper
            public boolean onPerformActionForVirtualView(int i4, int i5, @Nullable Bundle bundle) {
                return false;
            }

            @Override // androidx.customview.widget.ExploreByTouchHelper
            public void onPopulateNodeForVirtualView(int i4, @NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                p0.a.s(accessibilityNodeInfoCompat, "node");
                AccessibilityBox accessibilityBox = computeVirtualViews().get(Integer.valueOf(i4));
                p0.a.p(accessibilityBox);
                accessibilityNodeInfoCompat.i(accessibilityBox.getRect());
                accessibilityNodeInfoCompat.o(accessibilityBox.getText());
            }
        };
        this.exploreByTouchHelper = r02;
        this.marginsInPixel = p0.a.t0(PaintUtils.INSTANCE.convertDpToPixel(f2, context));
        this.touchBounds = new LinkedHashMap();
        this.dials = radialGamePadConfig.getSockets();
        final Float valueOf = Float.valueOf(0.0f);
        this.center = new PointF(0.0f, 0.0f);
        this.positionOnScreen = new int[]{0, 0};
        this.gravityX$delegate = new t0.a(valueOf) { // from class: com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$special$$inlined$observable$1
            @Override // t0.a
            public void afterChange(@NotNull n nVar, Float f3, Float f4) {
                p0.a.s(nVar, "property");
                f4.floatValue();
                f3.floatValue();
                this.requestLayoutAndInvalidate();
            }
        };
        this.gravityY$delegate = new t0.a(valueOf) { // from class: com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$special$$inlined$observable$2
            @Override // t0.a
            public void afterChange(@NotNull n nVar, Float f3, Float f4) {
                p0.a.s(nVar, "property");
                f4.floatValue();
                f3.floatValue();
                this.requestLayoutAndInvalidate();
            }
        };
        this.offsetX$delegate = new t0.a(valueOf) { // from class: com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$special$$inlined$observable$3
            @Override // t0.a
            public void afterChange(@NotNull n nVar, Float f3, Float f4) {
                p0.a.s(nVar, "property");
                f4.floatValue();
                f3.floatValue();
                this.requestLayoutAndInvalidate();
            }
        };
        this.offsetY$delegate = new t0.a(valueOf) { // from class: com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$special$$inlined$observable$4
            @Override // t0.a
            public void afterChange(@NotNull n nVar, Float f3, Float f4) {
                p0.a.s(nVar, "property");
                f4.floatValue();
                f3.floatValue();
                this.requestLayoutAndInvalidate();
            }
        };
        this.primaryDialMaxSizeDp = Float.MAX_VALUE;
        this.secondaryDialRotation$delegate = new t0.a(valueOf) { // from class: com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$special$$inlined$observable$5
            @Override // t0.a
            public void afterChange(@NotNull n nVar, Float f3, Float f4) {
                p0.a.s(nVar, "property");
                f4.floatValue();
                f3.floatValue();
                this.requestLayoutAndInvalidate();
            }
        };
        this.secondaryDialSpacing = 0.1f;
        this.spacingTop$delegate = new t0.a(i3) { // from class: com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$special$$inlined$observable$6
            @Override // t0.a
            public void afterChange(@NotNull n nVar, Integer num, Integer num2) {
                p0.a.s(nVar, "property");
                num2.intValue();
                num.intValue();
                this.requestLayoutAndInvalidate();
            }
        };
        this.spacingBottom$delegate = new t0.a(i3) { // from class: com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$special$$inlined$observable$7
            @Override // t0.a
            public void afterChange(@NotNull n nVar, Integer num, Integer num2) {
                p0.a.s(nVar, "property");
                num2.intValue();
                num.intValue();
                this.requestLayoutAndInvalidate();
            }
        };
        this.spacingLeft$delegate = new t0.a(i3) { // from class: com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$special$$inlined$observable$8
            @Override // t0.a
            public void afterChange(@NotNull n nVar, Integer num, Integer num2) {
                p0.a.s(nVar, "property");
                num2.intValue();
                num.intValue();
                this.requestLayoutAndInvalidate();
            }
        };
        this.spacingRight$delegate = new t0.a(i3) { // from class: com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$special$$inlined$observable$9
            @Override // t0.a
            public void afterChange(@NotNull n nVar, Integer num, Integer num2) {
                p0.a.s(nVar, "property");
                num2.intValue();
                num.intValue();
                this.requestLayoutAndInvalidate();
            }
        };
        this.hapticEngine = createHapticEngine();
        this.tapsDetector = new MultiTapDetector(context, new RadialGamePad$tapsDetector$1(this));
        setBackgroundColor(0);
        this.primaryDial = buildPrimaryInteractor(radialGamePadConfig.getPrimaryDial());
        this.secondaryDials = buildSecondaryInteractors(radialGamePadConfig.getSecondaryDials());
        this.allDials = u.P0(this.secondaryDials, f0.u(this.primaryDial));
        ViewCompat.A(this, r02);
    }
}
