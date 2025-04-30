package i5;

import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.protobuf.D2;
import com.google.protobuf.O3;
import java.util.Map;

/* renamed from: i5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2352g extends D2 implements O3 {
    public final boolean a() {
        return ((ApplicationInfo) this.instance).hasAppInstanceId();
    }

    public final void b(Map map) {
        Map mutableCustomAttributesMap;
        copyOnWrite();
        mutableCustomAttributesMap = ((ApplicationInfo) this.instance).getMutableCustomAttributesMap();
        mutableCustomAttributesMap.putAll(map);
    }

    public final void c(C2347b c2347b) {
        copyOnWrite();
        ((ApplicationInfo) this.instance).setAndroidAppInfo((AndroidApplicationInfo) c2347b.build());
    }

    public final void d(String str) {
        copyOnWrite();
        ((ApplicationInfo) this.instance).setAppInstanceId(str);
    }

    public final void e(EnumC2355j enumC2355j) {
        copyOnWrite();
        ((ApplicationInfo) this.instance).setApplicationProcessState(enumC2355j);
    }

    public final void f(String str) {
        copyOnWrite();
        ((ApplicationInfo) this.instance).setGoogleAppId(str);
    }
}
