package com.swordfish.libretrodroid;

import android.app.ActivityManager;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import b1.b1;
import com.facebook.appevents.AppEventsConstants;
import com.swordfish.libretrodroid.ShaderConfig;
import com.swordfish.libretrodroid.gamepad.GamepadsManager;
import e1.h;
import e1.l0;
import e1.t0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x0.n;
import z0.m;

/* loaded from: classes.dex */
public final class GLRetroView extends AspectRatioGLSurfaceView implements LifecycleObserver {
    static final /* synthetic */ n[] $$delegatedProperties;

    @NotNull
    public static final Companion Companion;
    public static final int ERROR_CHEAT = 4;
    public static final int ERROR_GENERIC = -1;
    public static final int ERROR_GL_NOT_COMPATIBLE = 2;
    public static final int ERROR_LOAD_GAME = 1;
    public static final int ERROR_LOAD_LIBRARY = 0;
    public static final int ERROR_SERIALIZATION = 3;
    public static final int MOTION_SOURCE_ANALOG_LEFT = 1;
    public static final int MOTION_SOURCE_ANALOG_RIGHT = 2;
    public static final int MOTION_SOURCE_DPAD = 0;
    public static final int MOTION_SOURCE_POINTER = 3;
    private static final String TAG_LOG;

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @NotNull
    private final t0.c audioEnabled$delegate;

    @NotNull
    private final GLRetroViewData data;

    @NotNull
    private final t0.c frameSpeed$delegate;
    private boolean isAborted;
    private boolean isEmulationReady;
    private boolean isGameLoaded;

    @Nullable
    private Lifecycle lifecycle;
    private final int openGLESVersion;

    @NotNull
    private final l0 retroGLEventsSubject;

    @NotNull
    private final l0 retroGLIssuesErrors;

    @NotNull
    private final l0 rumbleEventsSubject;

    @NotNull
    private final t0.c shader$delegate;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class GLRetroEvents {

        /* loaded from: classes.dex */
        public static final class FrameRendered extends GLRetroEvents {

            @NotNull
            public static final FrameRendered INSTANCE = new FrameRendered();

            private FrameRendered() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class SurfaceCreated extends GLRetroEvents {

            @NotNull
            public static final SurfaceCreated INSTANCE = new SurfaceCreated();

            private SurfaceCreated() {
                super(null);
            }
        }

        private GLRetroEvents() {
        }

        public /* synthetic */ GLRetroEvents(k kVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class RenderLifecycleObserver implements LifecycleObserver {
        public RenderLifecycleObserver() {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        private final void pause() {
            GLRetroView gLRetroView = GLRetroView.this;
            gLRetroView.catchExceptions(new GLRetroView$RenderLifecycleObserver$pause$1(gLRetroView));
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        private final void resume() {
            GLRetroView gLRetroView = GLRetroView.this;
            gLRetroView.catchExceptions(new GLRetroView$RenderLifecycleObserver$resume$1(gLRetroView));
        }
    }

    /* loaded from: classes.dex */
    public final class Renderer implements GLSurfaceView.Renderer {
        public Renderer() {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(@NotNull GL10 gl10) {
            p0.a.s(gl10, "gl");
            GLRetroView gLRetroView = GLRetroView.this;
            gLRetroView.catchExceptions(new GLRetroView$Renderer$onDrawFrame$1(gLRetroView));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(@NotNull GL10 gl10, int i2, int i3) {
            p0.a.s(gl10, "gl");
            GLRetroView.this.catchExceptions(new GLRetroView$Renderer$onSurfaceChanged$1(i2, i3));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(@NotNull GL10 gl10, @NotNull EGLConfig eGLConfig) {
            p0.a.s(gl10, "gl");
            p0.a.s(eGLConfig, "config");
            GLRetroView gLRetroView = GLRetroView.this;
            gLRetroView.catchExceptions(new GLRetroView$Renderer$onSurfaceCreated$1(gLRetroView));
        }
    }

    static {
        t tVar = new t(GLRetroView.class, "audioEnabled", "getAudioEnabled()Z", 0);
        h0 h0Var = g0.f30932a;
        h0Var.getClass();
        $$delegatedProperties = new n[]{tVar, androidx.compose.foundation.text.input.a.u(GLRetroView.class, "frameSpeed", "getFrameSpeed()I", 0, h0Var), androidx.compose.foundation.text.input.a.u(GLRetroView.class, "shader", "getShader()Lcom/swordfish/libretrodroid/ShaderConfig;", 0, h0Var)};
        Companion = new Companion(null);
        TAG_LOG = "GLRetroView";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRetroView(@NotNull Context context, @NotNull GLRetroViewData gLRetroViewData) {
        super(context);
        p0.a.s(context, "context");
        p0.a.s(gLRetroViewData, "data");
        this._$_findViewCache = new LinkedHashMap();
        this.data = gLRetroViewData;
        final Boolean bool = Boolean.TRUE;
        this.audioEnabled$delegate = new t0.a(bool) { // from class: com.swordfish.libretrodroid.GLRetroView$special$$inlined$observable$1
            @Override // t0.a
            public void afterChange(@NotNull n nVar, Boolean bool2, Boolean bool3) {
                p0.a.s(nVar, "property");
                boolean booleanValue = bool3.booleanValue();
                bool2.booleanValue();
                LibretroDroid.setAudioEnabled(booleanValue);
            }
        };
        final int i2 = 1;
        this.frameSpeed$delegate = new t0.a(i2) { // from class: com.swordfish.libretrodroid.GLRetroView$special$$inlined$observable$2
            @Override // t0.a
            public void afterChange(@NotNull n nVar, Integer num, Integer num2) {
                p0.a.s(nVar, "property");
                int intValue = num2.intValue();
                num.intValue();
                LibretroDroid.setFrameSpeed(intValue);
            }
        };
        final ShaderConfig shader = gLRetroViewData.getShader();
        this.shader$delegate = new t0.a(shader) { // from class: com.swordfish.libretrodroid.GLRetroView$special$$inlined$observable$3
            @Override // t0.a
            public void afterChange(@NotNull n nVar, ShaderConfig shaderConfig, ShaderConfig shaderConfig2) {
                GLRetroShader buildShader;
                p0.a.s(nVar, "property");
                buildShader = this.buildShader(shaderConfig2);
                LibretroDroid.setShaderConfig(buildShader);
            }
        };
        this.retroGLEventsSubject = t0.b(1, 0, 0, 6);
        this.retroGLIssuesErrors = t0.b(1, 0, 0, 6);
        this.rumbleEventsSubject = t0.b(0, 0, 0, 7);
        int gLESVersion = getGLESVersion(context);
        this.openGLESVersion = gLESVersion;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(gLESVersion);
        setRenderer(new Renderer());
        setKeepScreenOn(true);
    }

    private final Map<String, String> buildParams(d0.k... kVarArr) {
        ArrayList<d0.k> arrayList = new ArrayList();
        for (d0.k kVar : kVarArr) {
            if (((String) kVar.f30135b) != null) {
                arrayList.add(kVar);
            }
        }
        int g2 = q.g(e0.q.M(arrayList, 10));
        if (g2 < 16) {
            g2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g2);
        for (d0.k kVar2 : arrayList) {
            String str = (String) kVar2.f30134a;
            String str2 = (String) kVar2.f30135b;
            p0.a.p(str2);
            linkedHashMap.put(str, str2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GLRetroShader buildShader(ShaderConfig shaderConfig) {
        GLRetroShader gLRetroShader;
        int i2 = 2;
        Map map = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        if (shaderConfig instanceof ShaderConfig.Default) {
            return new GLRetroShader(0, map, i2, b8 == true ? 1 : 0);
        }
        if (shaderConfig instanceof ShaderConfig.CRT) {
            return new GLRetroShader(1, b7 == true ? 1 : 0, i2, b6 == true ? 1 : 0);
        }
        if (shaderConfig instanceof ShaderConfig.LCD) {
            return new GLRetroShader(i2, b5 == true ? 1 : 0, i2, b4 == true ? 1 : 0);
        }
        if (shaderConfig instanceof ShaderConfig.Sharp) {
            return new GLRetroShader(3, b3 == true ? 1 : 0, i2, b2 == true ? 1 : 0);
        }
        if (shaderConfig instanceof ShaderConfig.CUT) {
            ShaderConfig.CUT cut = (ShaderConfig.CUT) shaderConfig;
            gLRetroShader = new GLRetroShader(4, buildParams(new d0.k("USE_DYNAMIC_BLEND", toParam(cut.getUseDynamicBlend())), new d0.k("BLEND_MIN_CONTRAST_EDGE", toParam(cut.getBlendMinContrastEdge())), new d0.k("BLEND_MAX_CONTRAST_EDGE", toParam(cut.getBlendMaxContrastEdge())), new d0.k("BLEND_MIN_SHARPNESS", toParam(cut.getBlendMinSharpness())), new d0.k("BLEND_MAX_SHARPNESS", toParam(cut.getBlendMaxSharpness())), new d0.k("STATIC_BLEND_SHARPNESS", toParam(cut.getStaticSharpness())), new d0.k("EDGE_USE_FAST_LUMA", toParam(cut.getEdgeUseFastLuma())), new d0.k("EDGE_MIN_VALUE", toParam(cut.getEdgeMinValue())), new d0.k(LibretroDroid.SHADER_UPSCALE_CUT_PARAM_EDGE_MIN_CONTRAST, toParam(cut.getEdgeMinContrast()))));
        } else if (shaderConfig instanceof ShaderConfig.CUT2) {
            ShaderConfig.CUT2 cut2 = (ShaderConfig.CUT2) shaderConfig;
            gLRetroShader = new GLRetroShader(5, buildParams(new d0.k("USE_DYNAMIC_BLEND", toParam(cut2.getUseDynamicBlend())), new d0.k("BLEND_MIN_CONTRAST_EDGE", toParam(cut2.getBlendMinContrastEdge())), new d0.k("BLEND_MAX_CONTRAST_EDGE", toParam(cut2.getBlendMaxContrastEdge())), new d0.k("BLEND_MIN_SHARPNESS", toParam(cut2.getBlendMinSharpness())), new d0.k("BLEND_MAX_SHARPNESS", toParam(cut2.getBlendMaxSharpness())), new d0.k("STATIC_BLEND_SHARPNESS", toParam(cut2.getStaticSharpness())), new d0.k("EDGE_USE_FAST_LUMA", toParam(cut2.getEdgeUseFastLuma())), new d0.k("EDGE_MIN_VALUE", toParam(cut2.getEdgeMinValue())), new d0.k("SOFT_EDGES_SHARPENING", toParam(cut2.getSoftEdgesSharpening())), new d0.k("SOFT_EDGES_SHARPENING_AMOUNT", toParam(cut2.getSoftEdgesSharpeningAmount()))));
        } else {
            if (!(shaderConfig instanceof ShaderConfig.CUT3)) {
                throw new RuntimeException();
            }
            ShaderConfig.CUT3 cut3 = (ShaderConfig.CUT3) shaderConfig;
            gLRetroShader = new GLRetroShader(6, buildParams(new d0.k("USE_DYNAMIC_BLEND", toParam(cut3.getUseDynamicBlend())), new d0.k("BLEND_MIN_CONTRAST_EDGE", toParam(cut3.getBlendMinContrastEdge())), new d0.k("BLEND_MAX_CONTRAST_EDGE", toParam(cut3.getBlendMaxContrastEdge())), new d0.k("BLEND_MIN_SHARPNESS", toParam(cut3.getBlendMinSharpness())), new d0.k("BLEND_MAX_SHARPNESS", toParam(cut3.getBlendMaxSharpness())), new d0.k("STATIC_BLEND_SHARPNESS", toParam(cut3.getStaticSharpness())), new d0.k("EDGE_USE_FAST_LUMA", toParam(cut3.getEdgeUseFastLuma())), new d0.k("EDGE_MIN_VALUE", toParam(cut3.getEdgeMinValue())), new d0.k("SOFT_EDGES_SHARPENING", toParam(cut3.getSoftEdgesSharpening())), new d0.k("SOFT_EDGES_SHARPENING_AMOUNT", toParam(cut3.getSoftEdgesSharpeningAmount())), new d0.k(LibretroDroid.SHADER_UPSCALE_CUT3_PARAM_SEARCH_MIN_CONTRAST, toParam(cut3.getSearchMinContrast())), new d0.k(LibretroDroid.SHADER_UPSCALE_CUT3_PARAM_SEARCH_MAX_DISTANCE, toParam(cut3.getSearchMaxDistance()))));
        }
        return gLRetroShader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void catchExceptions(q0.a aVar) {
        b1 b1Var = b1.f22288a;
        try {
            if (this.isAborted) {
                return;
            }
            aVar.invoke();
        } catch (RetroException e) {
            e.v(b1Var, null, 0, new GLRetroView$catchExceptions$1(this, e, null), 3);
            this.isAborted = true;
        } catch (Exception e2) {
            Log.e(TAG_LOG, "Error in GLRetroView", e2);
            e.v(b1Var, null, 0, new GLRetroView$catchExceptions$2(this, null), 3);
        }
    }

    private final float clamp(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDefaultRefreshRate() {
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            return ((WindowManager) systemService).getDefaultDisplay().getRefreshRate();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDeviceLanguage() {
        return Locale.getDefault().getLanguage();
    }

    private final int getGLESVersion(Context context) {
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            return ((ActivityManager) systemService).getDeviceConfigurationInfo().reqGlEsVersion >= 196608 ? 3 : 2;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeCore() {
        catchExceptions(new GLRetroView$initializeCore$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadGameFromBytes(byte[] bArr) {
        LibretroDroid.loadGameFromBytes(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadGameFromPath(String str) {
        LibretroDroid.loadGameFromPath(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadGameFromVirtualFiles(List<VirtualFile> list) {
        List<VirtualFile> list2 = list;
        ArrayList arrayList = new ArrayList(e0.q.M(list2, 10));
        for (VirtualFile virtualFile : list2) {
            arrayList.add(new DetachedVirtualFile(virtualFile.getVirtualPath(), virtualFile.getFileDescriptor().detachFd()));
        }
        LibretroDroid.loadGameFromVirtualFiles(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshAspectRatio() {
        KtUtils.INSTANCE.runOnUIThread(new GLRetroView$refreshAspectRatio$1(this, LibretroDroid.getAspectRatio()));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    private final <T> T runOnGLThread(q0.a aVar) {
        String name = Thread.currentThread().getName();
        p0.a.r(name, "currentThread().name");
        if (m.q1(name, "GLThread", false)) {
            return (T) aVar.invoke();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ?? obj = new Object();
        queueEvent(new androidx.room.e(obj, 7, aVar, countDownLatch));
        KtUtils.INSTANCE.awaitUninterruptibly(countDownLatch);
        T t2 = (T) obj.f30930a;
        p0.a.p(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runOnGLThread$lambda-7, reason: not valid java name */
    public static final void m612runOnGLThread$lambda7(f0 f0Var, q0.a aVar, CountDownLatch countDownLatch) {
        p0.a.s(f0Var, "$result");
        p0.a.s(aVar, "$block");
        p0.a.s(countDownLatch, "$latch");
        f0Var.f30930a = aVar.invoke();
        countDownLatch.countDown();
    }

    public static /* synthetic */ void sendKeyEvent$default(GLRetroView gLRetroView, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        gLRetroView.sendKeyEvent(i2, i3, i4);
    }

    public static /* synthetic */ void sendMotionEvent$default(GLRetroView gLRetroView, int i2, float f2, float f3, int i3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        gLRetroView.sendMotionEvent(i2, f2, f3, i3);
    }

    private final void sendRumbleEvent(int i2, float f2, float f3) {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            e.v(LifecycleKt.a(lifecycle), null, 0, new GLRetroView$sendRumbleEvent$1(this, i2, f2, f3, null), 3);
        }
    }

    private final void sendTouchEvent(MotionEvent motionEvent) {
        sendMotionEvent$default(this, 3, clamp(motionEvent.getX() / getWidth(), 0.0f, 1.0f), clamp(motionEvent.getY() / getHeight(), 0.0f, 1.0f), 0, 8, null);
    }

    private final String toParam(boolean z2) {
        return z2 ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    @Override // com.swordfish.libretrodroid.AspectRatioGLSurfaceView
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.swordfish.libretrodroid.AspectRatioGLSurfaceView
    @Nullable
    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void changeDisk(int i2) {
        runOnGLThread(new GLRetroView$changeDisk$1(i2));
    }

    public final boolean getAudioEnabled() {
        return ((Boolean) this.audioEnabled$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final int getAvailableDisks() {
        return ((Number) runOnGLThread(GLRetroView$getAvailableDisks$1.INSTANCE)).intValue();
    }

    @NotNull
    public final Controller[][] getControllers() {
        Controller[][] controllers = LibretroDroid.getControllers();
        p0.a.r(controllers, "getControllers()");
        return controllers;
    }

    public final int getCurrentDisk() {
        return ((Number) runOnGLThread(GLRetroView$getCurrentDisk$1.INSTANCE)).intValue();
    }

    public final int getFrameSpeed() {
        return ((Number) this.frameSpeed$delegate.getValue(this, $$delegatedProperties[1])).intValue();
    }

    @NotNull
    public final h getGLRetroErrors() {
        return this.retroGLIssuesErrors;
    }

    @NotNull
    public final h getGLRetroEvents() {
        return this.retroGLEventsSubject;
    }

    @NotNull
    public final h getRumbleEvents() {
        return this.rumbleEventsSubject;
    }

    @NotNull
    public final ShaderConfig getShader() {
        return (ShaderConfig) this.shader$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @NotNull
    public final Variable[] getVariables() {
        Variable[] variables = LibretroDroid.getVariables();
        p0.a.r(variables, "getVariables()");
        return variables;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "lifecycleOwner");
        catchExceptions(new GLRetroView$onCreate$1(this, lifecycleOwner));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        catchExceptions(new GLRetroView$onDestroy$1(this));
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@Nullable MotionEvent motionEvent) {
        InputDevice device;
        int controllerNumber = ((motionEvent == null || (device = motionEvent.getDevice()) == null) ? 0 : device.getControllerNumber()) - 1;
        if (controllerNumber >= 0) {
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getSource()) : null;
            if (valueOf != null && valueOf.intValue() == 16777232) {
                sendMotionEvent(0, motionEvent.getAxisValue(15), motionEvent.getAxisValue(16), controllerNumber);
                sendMotionEvent(1, motionEvent.getAxisValue(0), motionEvent.getAxisValue(1), controllerNumber);
                sendMotionEvent(2, motionEvent.getAxisValue(11), motionEvent.getAxisValue(14), controllerNumber);
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @Nullable KeyEvent keyEvent) {
        InputDevice device;
        GamepadsManager gamepadsManager = GamepadsManager.INSTANCE;
        int gamepadKeyEvent = gamepadsManager.getGamepadKeyEvent(i2);
        int controllerNumber = ((keyEvent == null || (device = keyEvent.getDevice()) == null) ? 0 : device.getControllerNumber()) - 1;
        if (keyEvent == null || controllerNumber < 0 || !gamepadsManager.getGAMEPAD_KEYS().contains(Integer.valueOf(i2))) {
            return super.onKeyDown(i2, keyEvent);
        }
        sendKeyEvent(0, gamepadKeyEvent, controllerNumber);
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, @Nullable KeyEvent keyEvent) {
        InputDevice device;
        GamepadsManager gamepadsManager = GamepadsManager.INSTANCE;
        int gamepadKeyEvent = gamepadsManager.getGamepadKeyEvent(i2);
        int controllerNumber = ((keyEvent == null || (device = keyEvent.getDevice()) == null) ? 0 : device.getControllerNumber()) - 1;
        if (keyEvent == null || controllerNumber < 0 || !gamepadsManager.getGAMEPAD_KEYS().contains(Integer.valueOf(i2))) {
            return super.onKeyUp(i2, keyEvent);
        }
        sendKeyEvent(1, gamepadKeyEvent, controllerNumber);
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            sendTouchEvent(motionEvent);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            sendTouchEvent(motionEvent);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            sendMotionEvent$default(this, 3, -1.0f, -1.0f, 0, 8, null);
        }
        return true;
    }

    public final void reset() {
        runOnGLThread(GLRetroView$reset$1.INSTANCE);
    }

    public final void sendKeyEvent(final int i2, final int i3, final int i4) {
        queueEvent(new Runnable() { // from class: com.swordfish.libretrodroid.a
            @Override // java.lang.Runnable
            public final void run() {
                LibretroDroid.onKeyEvent(i4, i2, i3);
            }
        });
    }

    public final void sendMotionEvent(final int i2, final float f2, final float f3, final int i3) {
        queueEvent(new Runnable() { // from class: com.swordfish.libretrodroid.b
            @Override // java.lang.Runnable
            public final void run() {
                LibretroDroid.onMotionEvent(i3, i2, f2, f3);
            }
        });
    }

    @NotNull
    public final byte[] serializeSRAM() {
        Object runOnGLThread = runOnGLThread(GLRetroView$serializeSRAM$1.INSTANCE);
        p0.a.r(runOnGLThread, "runOnGLThread {\n        …oid.serializeSRAM()\n    }");
        return (byte[]) runOnGLThread;
    }

    @NotNull
    public final byte[] serializeState() {
        Object runOnGLThread = runOnGLThread(GLRetroView$serializeState$1.INSTANCE);
        p0.a.r(runOnGLThread, "runOnGLThread {\n        …id.serializeState()\n    }");
        return (byte[]) runOnGLThread;
    }

    public final void setAudioEnabled(boolean z2) {
        this.audioEnabled$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z2));
    }

    public final void setCheat(int i2, boolean z2, @NotNull String str) {
        p0.a.s(str, "code");
        runOnGLThread(new GLRetroView$setCheat$1(i2, z2, str));
    }

    public final void setControllerType(int i2, int i3) {
        LibretroDroid.setControllerType(i2, i3);
    }

    public final void setFrameSpeed(int i2) {
        this.frameSpeed$delegate.setValue(this, $$delegatedProperties[1], Integer.valueOf(i2));
    }

    public final void setShader(@NotNull ShaderConfig shaderConfig) {
        p0.a.s(shaderConfig, "<set-?>");
        this.shader$delegate.setValue(this, $$delegatedProperties[2], shaderConfig);
    }

    public final boolean unserializeSRAM(@NotNull byte[] bArr) {
        p0.a.s(bArr, "data");
        return ((Boolean) runOnGLThread(new GLRetroView$unserializeSRAM$1(bArr))).booleanValue();
    }

    public final boolean unserializeState(@NotNull byte[] bArr) {
        p0.a.s(bArr, "data");
        return ((Boolean) runOnGLThread(new GLRetroView$unserializeState$1(bArr))).booleanValue();
    }

    public final void updateVariables(@NotNull Variable... variableArr) {
        p0.a.s(variableArr, "variables");
        for (Variable variable : variableArr) {
            LibretroDroid.updateVariable(variable);
        }
    }

    private final String toParam(float f2) {
        return String.valueOf(f2);
    }

    private final String toParam(int i2) {
        return String.valueOf(i2);
    }
}
