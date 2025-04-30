package i5;

import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.protobuf.D2;
import com.google.protobuf.O3;

/* renamed from: i5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2347b extends D2 implements O3 {
    public final void a(String str) {
        copyOnWrite();
        ((AndroidApplicationInfo) this.instance).setPackageName(str);
    }

    public final void b() {
        copyOnWrite();
        ((AndroidApplicationInfo) this.instance).setSdkVersion("21.0.1");
    }

    public final void c(String str) {
        copyOnWrite();
        ((AndroidApplicationInfo) this.instance).setVersionName(str);
    }
}
