package com.swordfish.libretrodroid;

import java.util.List;

/* loaded from: classes3.dex */
public class LibretroDroid {
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
    public static final int SHADER_CRT = 1;
    public static final int SHADER_DEFAULT = 0;
    public static final int SHADER_LCD = 2;
    public static final int SHADER_SHARP = 3;
    public static final int SHADER_UPSCALE_CUT = 4;
    public static final int SHADER_UPSCALE_CUT2 = 5;
    public static final String SHADER_UPSCALE_CUT2_PARAM_BLEND_MAX_CONTRAST_EDGE = "BLEND_MAX_CONTRAST_EDGE";
    public static final String SHADER_UPSCALE_CUT2_PARAM_BLEND_MAX_SHARPNESS = "BLEND_MAX_SHARPNESS";
    public static final String SHADER_UPSCALE_CUT2_PARAM_BLEND_MIN_CONTRAST_EDGE = "BLEND_MIN_CONTRAST_EDGE";
    public static final String SHADER_UPSCALE_CUT2_PARAM_BLEND_MIN_SHARPNESS = "BLEND_MIN_SHARPNESS";
    public static final String SHADER_UPSCALE_CUT2_PARAM_EDGE_MIN_VALUE = "EDGE_MIN_VALUE";
    public static final String SHADER_UPSCALE_CUT2_PARAM_EDGE_USE_FAST_LUMA = "EDGE_USE_FAST_LUMA";
    public static final String SHADER_UPSCALE_CUT2_PARAM_SOFT_EDGES_SHARPENING = "SOFT_EDGES_SHARPENING";
    public static final String SHADER_UPSCALE_CUT2_PARAM_SOFT_EDGES_SHARPENING_AMOUNT = "SOFT_EDGES_SHARPENING_AMOUNT";
    public static final String SHADER_UPSCALE_CUT2_PARAM_STATIC_BLEND_SHARPNESS = "STATIC_BLEND_SHARPNESS";
    public static final String SHADER_UPSCALE_CUT2_PARAM_USE_DYNAMIC_BLEND = "USE_DYNAMIC_BLEND";
    public static final int SHADER_UPSCALE_CUT3 = 6;
    public static final String SHADER_UPSCALE_CUT3_PARAM_BLEND_MAX_CONTRAST_EDGE = "BLEND_MAX_CONTRAST_EDGE";
    public static final String SHADER_UPSCALE_CUT3_PARAM_BLEND_MAX_SHARPNESS = "BLEND_MAX_SHARPNESS";
    public static final String SHADER_UPSCALE_CUT3_PARAM_BLEND_MIN_CONTRAST_EDGE = "BLEND_MIN_CONTRAST_EDGE";
    public static final String SHADER_UPSCALE_CUT3_PARAM_BLEND_MIN_SHARPNESS = "BLEND_MIN_SHARPNESS";
    public static final String SHADER_UPSCALE_CUT3_PARAM_EDGE_MIN_VALUE = "EDGE_MIN_VALUE";
    public static final String SHADER_UPSCALE_CUT3_PARAM_EDGE_USE_FAST_LUMA = "EDGE_USE_FAST_LUMA";
    public static final String SHADER_UPSCALE_CUT3_PARAM_SEARCH_MAX_DISTANCE = "SEARCH_MAX_DISTANCE";
    public static final String SHADER_UPSCALE_CUT3_PARAM_SEARCH_MIN_CONTRAST = "SEARCH_MIN_CONTRAST";
    public static final String SHADER_UPSCALE_CUT3_PARAM_SOFT_EDGES_SHARPENING = "SOFT_EDGES_SHARPENING";
    public static final String SHADER_UPSCALE_CUT3_PARAM_SOFT_EDGES_SHARPENING_AMOUNT = "SOFT_EDGES_SHARPENING_AMOUNT";
    public static final String SHADER_UPSCALE_CUT3_PARAM_STATIC_BLEND_SHARPNESS = "STATIC_BLEND_SHARPNESS";
    public static final String SHADER_UPSCALE_CUT3_PARAM_USE_DYNAMIC_BLEND = "USE_DYNAMIC_BLEND";
    public static final String SHADER_UPSCALE_CUT_PARAM_BLEND_MAX_CONTRAST_EDGE = "BLEND_MAX_CONTRAST_EDGE";
    public static final String SHADER_UPSCALE_CUT_PARAM_BLEND_MAX_SHARPNESS = "BLEND_MAX_SHARPNESS";
    public static final String SHADER_UPSCALE_CUT_PARAM_BLEND_MIN_CONTRAST_EDGE = "BLEND_MIN_CONTRAST_EDGE";
    public static final String SHADER_UPSCALE_CUT_PARAM_BLEND_MIN_SHARPNESS = "BLEND_MIN_SHARPNESS";
    public static final String SHADER_UPSCALE_CUT_PARAM_EDGE_MIN_CONTRAST = "EDGE_MIN_CONTRAST";
    public static final String SHADER_UPSCALE_CUT_PARAM_EDGE_MIN_VALUE = "EDGE_MIN_VALUE";
    public static final String SHADER_UPSCALE_CUT_PARAM_EDGE_USE_FAST_LUMA = "EDGE_USE_FAST_LUMA";
    public static final String SHADER_UPSCALE_CUT_PARAM_STATIC_BLEND_SHARPNESS = "STATIC_BLEND_SHARPNESS";
    public static final String SHADER_UPSCALE_CUT_PARAM_USE_DYNAMIC_BLEND = "USE_DYNAMIC_BLEND";

    static {
        System.loadLibrary("libretrodroid");
    }

    public static native int availableDisks();

    public static native void changeDisk(int i2);

    public static native void create(int i2, String str, String str2, String str3, Variable[] variableArr, GLRetroShader gLRetroShader, float f2, boolean z2, boolean z3, boolean z4, String str4);

    public static native int currentDisk();

    public static native void destroy();

    public static native float getAspectRatio();

    public static native Controller[][] getControllers();

    public static native Variable[] getVariables();

    public static native void loadGameFromBytes(byte[] bArr);

    public static native void loadGameFromPath(String str);

    public static native void loadGameFromVirtualFiles(List<DetachedVirtualFile> list);

    public static native void onKeyEvent(int i2, int i3, int i4);

    public static native void onMotionEvent(int i2, int i3, float f2, float f3);

    public static native void onSurfaceChanged(int i2, int i3);

    public static native void onSurfaceCreated();

    public static native void pause();

    public static native void reset();

    public static native void resetCheat();

    public static native void resume();

    public static native byte[] serializeSRAM();

    public static native byte[] serializeState();

    public static native void setAudioEnabled(boolean z2);

    public static native void setCheat(int i2, boolean z2, String str);

    public static native void setControllerType(int i2, int i3);

    public static native void setFrameSpeed(int i2);

    public static native void setRumbleEnabled(boolean z2);

    public static native void setShaderConfig(GLRetroShader gLRetroShader);

    public static native void step(GLRetroView gLRetroView);

    public static native boolean unserializeSRAM(byte[] bArr);

    public static native boolean unserializeState(byte[] bArr);

    public static native void updateVariable(Variable variable);
}
