package com.swordfish.libretrodroid;

import androidx.lifecycle.Lifecycle;
import com.swordfish.libretrodroid.GLRetroView;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class GLRetroView$initializeCore$1 extends r implements q0.a {
    final /* synthetic */ GLRetroView this$0;

    /* renamed from: com.swordfish.libretrodroid.GLRetroView$initializeCore$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends r implements q0.a {
        final /* synthetic */ GLRetroView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(GLRetroView gLRetroView) {
            super(0);
            this.this$0 = gLRetroView;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m622invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m622invoke() {
            Lifecycle lifecycle;
            lifecycle = this.this$0.lifecycle;
            if (lifecycle != null) {
                lifecycle.a(new GLRetroView.RenderLifecycleObserver());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRetroView$initializeCore$1(GLRetroView gLRetroView) {
        super(0);
        this.this$0 = gLRetroView;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m621invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m621invoke() {
        boolean z2;
        GLRetroViewData gLRetroViewData;
        GLRetroViewData gLRetroViewData2;
        GLRetroViewData gLRetroViewData3;
        GLRetroViewData gLRetroViewData4;
        GLRetroViewData gLRetroViewData5;
        GLRetroViewData gLRetroViewData6;
        GLRetroViewData gLRetroViewData7;
        GLRetroViewData gLRetroViewData8;
        GLRetroViewData gLRetroViewData9;
        z2 = this.this$0.isGameLoaded;
        if (z2) {
            return;
        }
        gLRetroViewData = this.this$0.data;
        if (gLRetroViewData.getGameFilePath() != null) {
            GLRetroView gLRetroView = this.this$0;
            gLRetroViewData9 = gLRetroView.data;
            String gameFilePath = gLRetroViewData9.getGameFilePath();
            p0.a.p(gameFilePath);
            gLRetroView.loadGameFromPath(gameFilePath);
        } else {
            gLRetroViewData2 = this.this$0.data;
            if (gLRetroViewData2.getGameFileBytes() != null) {
                GLRetroView gLRetroView2 = this.this$0;
                gLRetroViewData5 = gLRetroView2.data;
                byte[] gameFileBytes = gLRetroViewData5.getGameFileBytes();
                p0.a.p(gameFileBytes);
                gLRetroView2.loadGameFromBytes(gameFileBytes);
            } else {
                gLRetroViewData3 = this.this$0.data;
                if (!gLRetroViewData3.getGameVirtualFiles().isEmpty()) {
                    GLRetroView gLRetroView3 = this.this$0;
                    gLRetroViewData4 = gLRetroView3.data;
                    gLRetroView3.loadGameFromVirtualFiles(gLRetroViewData4.getGameVirtualFiles());
                }
            }
        }
        gLRetroViewData6 = this.this$0.data;
        if (gLRetroViewData6.getSaveRAMState() != null) {
            GLRetroView gLRetroView4 = this.this$0;
            gLRetroViewData7 = gLRetroView4.data;
            LibretroDroid.unserializeSRAM(gLRetroViewData7.getSaveRAMState());
            gLRetroViewData8 = gLRetroView4.data;
            gLRetroViewData8.setSaveRAMState(null);
        }
        LibretroDroid.onSurfaceCreated();
        this.this$0.isGameLoaded = true;
        KtUtils.INSTANCE.runOnUIThread(new AnonymousClass2(this.this$0));
    }
}
