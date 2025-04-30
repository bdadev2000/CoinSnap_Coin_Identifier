package a3;

import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;

/* loaded from: classes.dex */
public final class e {
    public static int b = -1;

    /* renamed from: a, reason: collision with root package name */
    public final f f3958a;

    public e(f fVar) {
        this.f3958a = fVar;
    }

    public final void a(int i9) {
        f fVar = this.f3958a;
        if (i9 != 0) {
            if (i9 != 1) {
                fVar.getClass();
                if (PAGSdk.isInitSuccess()) {
                    fVar.getClass();
                    PAGConfig.setChildDirected(-1);
                }
                b = -1;
                return;
            }
            fVar.getClass();
            if (PAGSdk.isInitSuccess()) {
                fVar.getClass();
                PAGConfig.setChildDirected(1);
            }
            b = 1;
            return;
        }
        fVar.getClass();
        if (PAGSdk.isInitSuccess()) {
            fVar.getClass();
            PAGConfig.setChildDirected(0);
        }
        b = 0;
    }
}
