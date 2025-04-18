package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(String str, int i10, int i11, int i12) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, i10, i11, i12);
    }

    public static final long systemProp(String str, long j3, long j10, long j11) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, j3, j10, j11);
    }

    public static final String systemProp(String str) {
        return SystemPropsKt__SystemPropsKt.systemProp(str);
    }

    public static final String systemProp(String str, String str2) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, str2);
    }

    public static final boolean systemProp(String str, boolean z10) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, z10);
    }
}
