package y6;

import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static int f27936b = -1;
    public final f a;

    public e(f fVar) {
        this.a = fVar;
    }

    public final void a(int i10) {
        f fVar = this.a;
        if (i10 != 0) {
            if (i10 != 1) {
                fVar.getClass();
                if (PAGSdk.isInitSuccess()) {
                    fVar.getClass();
                    PAGConfig.setChildDirected(-1);
                }
                f27936b = -1;
                return;
            }
            fVar.getClass();
            if (PAGSdk.isInitSuccess()) {
                fVar.getClass();
                PAGConfig.setChildDirected(1);
            }
            f27936b = 1;
            return;
        }
        fVar.getClass();
        if (PAGSdk.isInitSuccess()) {
            fVar.getClass();
            PAGConfig.setChildDirected(0);
        }
        f27936b = 0;
    }
}
