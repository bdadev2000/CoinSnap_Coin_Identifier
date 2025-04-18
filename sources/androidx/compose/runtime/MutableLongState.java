package androidx.compose.runtime;

@Stable
/* loaded from: classes2.dex */
public interface MutableLongState extends LongState, MutableState<Long> {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    @Override // androidx.compose.runtime.LongState
    long d();

    default void i(long j2) {
        o(j2);
    }

    void o(long j2);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    default Long getValue() {
        return Long.valueOf(d());
    }
}
