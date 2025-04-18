package androidx.compose.runtime;

@Stable
/* loaded from: classes4.dex */
public interface MutableFloatState extends FloatState, MutableState<Float> {

    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    @Override // androidx.compose.runtime.FloatState
    float c();

    default void k(float f2) {
        n(f2);
    }

    void n(float f2);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        k(((Number) obj).floatValue());
    }

    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    default Float getValue() {
        return Float.valueOf(c());
    }
}
