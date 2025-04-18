package com.swordfish.libretrodroid;

import androidx.lifecycle.LifecycleOwner;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class GLRetroView$onCreate$1 extends r implements q0.a {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ GLRetroView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRetroView$onCreate$1(GLRetroView gLRetroView, LifecycleOwner lifecycleOwner) {
        super(0);
        this.this$0 = gLRetroView;
        this.$lifecycleOwner = lifecycleOwner;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m623invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m623invoke() {
        int i2;
        GLRetroViewData gLRetroViewData;
        GLRetroViewData gLRetroViewData2;
        GLRetroViewData gLRetroViewData3;
        GLRetroViewData gLRetroViewData4;
        GLRetroViewData gLRetroViewData5;
        GLRetroShader buildShader;
        float defaultRefreshRate;
        GLRetroViewData gLRetroViewData6;
        GLRetroViewData gLRetroViewData7;
        GLRetroViewData gLRetroViewData8;
        String deviceLanguage;
        GLRetroViewData gLRetroViewData9;
        this.this$0.lifecycle = this.$lifecycleOwner.getLifecycle();
        i2 = this.this$0.openGLESVersion;
        gLRetroViewData = this.this$0.data;
        String coreFilePath = gLRetroViewData.getCoreFilePath();
        gLRetroViewData2 = this.this$0.data;
        String systemDirectory = gLRetroViewData2.getSystemDirectory();
        gLRetroViewData3 = this.this$0.data;
        String savesDirectory = gLRetroViewData3.getSavesDirectory();
        gLRetroViewData4 = this.this$0.data;
        Variable[] variables = gLRetroViewData4.getVariables();
        GLRetroView gLRetroView = this.this$0;
        gLRetroViewData5 = gLRetroView.data;
        buildShader = gLRetroView.buildShader(gLRetroViewData5.getShader());
        defaultRefreshRate = this.this$0.getDefaultRefreshRate();
        gLRetroViewData6 = this.this$0.data;
        boolean preferLowLatencyAudio = gLRetroViewData6.getPreferLowLatencyAudio();
        gLRetroViewData7 = this.this$0.data;
        boolean z2 = !gLRetroViewData7.getGameVirtualFiles().isEmpty();
        gLRetroViewData8 = this.this$0.data;
        boolean skipDuplicateFrames = gLRetroViewData8.getSkipDuplicateFrames();
        deviceLanguage = this.this$0.getDeviceLanguage();
        LibretroDroid.create(i2, coreFilePath, systemDirectory, savesDirectory, variables, buildShader, defaultRefreshRate, preferLowLatencyAudio, z2, skipDuplicateFrames, deviceLanguage);
        gLRetroViewData9 = this.this$0.data;
        LibretroDroid.setRumbleEnabled(gLRetroViewData9.getRumbleEventsEnabled());
    }
}
