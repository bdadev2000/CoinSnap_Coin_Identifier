package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a,\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\t"}, d2 = {"systemProp", "", "propertyName", "", "defaultValue", "", "minValue", "maxValue", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class SystemPropsKt__SystemProps_commonKt {
    public static final boolean systemProp(String str, boolean z10) {
        String systemProp = SystemPropsKt.systemProp(str);
        return systemProp != null ? Boolean.parseBoolean(systemProp) : z10;
    }

    public static /* synthetic */ int systemProp$default(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return SystemPropsKt.systemProp(str, i10, i11, i12);
    }

    public static final int systemProp(String str, int i10, int i11, int i12) {
        return (int) SystemPropsKt.systemProp(str, i10, i11, i12);
    }

    public static /* synthetic */ long systemProp$default(String str, long j3, long j10, long j11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 1;
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return SystemPropsKt.systemProp(str, j3, j12, j11);
    }

    public static final long systemProp(String str, long j3, long j10, long j11) {
        String systemProp = SystemPropsKt.systemProp(str);
        if (systemProp == null) {
            return j3;
        }
        Long longOrNull = StringsKt.toLongOrNull(systemProp);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + systemProp + '\'').toString());
        }
        long longValue = longOrNull.longValue();
        boolean z10 = false;
        if (j10 <= longValue && longValue <= j11) {
            z10 = true;
        }
        if (z10) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + longValue + '\'').toString());
    }

    public static final String systemProp(String str, String str2) {
        String systemProp = SystemPropsKt.systemProp(str);
        return systemProp == null ? str2 : systemProp;
    }
}
