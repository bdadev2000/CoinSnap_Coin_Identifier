package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/serialization/json/internal/ByteArrayPool;", "", "()V", "MAX_CHARS_IN_POOL", "", "arrays", "Lkotlin/collections/ArrayDeque;", "", "charsTotal", "release", "", "array", "take", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class ByteArrayPool {
    private static final int MAX_CHARS_IN_POOL;
    private static int charsTotal;
    public static final ByteArrayPool INSTANCE = new ByteArrayPool();
    private static final ArrayDeque<byte[]> arrays = new ArrayDeque<>();

    static {
        Object m145constructorimpl;
        int i10;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            m145constructorimpl = Result.m145constructorimpl(StringsKt.toIntOrNull(property));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m145constructorimpl = Result.m145constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m151isFailureimpl(m145constructorimpl)) {
            m145constructorimpl = null;
        }
        Integer num = (Integer) m145constructorimpl;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 2097152;
        }
        MAX_CHARS_IN_POOL = i10;
    }

    private ByteArrayPool() {
    }

    public final void release(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            int i10 = charsTotal;
            if (array.length + i10 < MAX_CHARS_IN_POOL) {
                charsTotal = i10 + array.length;
                arrays.addLast(array);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final byte[] take() {
        byte[] removeLastOrNull;
        synchronized (this) {
            removeLastOrNull = arrays.removeLastOrNull();
            if (removeLastOrNull != null) {
                charsTotal -= removeLastOrNull.length;
            } else {
                removeLastOrNull = null;
            }
        }
        if (removeLastOrNull == null) {
            return new byte[512];
        }
        return removeLastOrNull;
    }
}
