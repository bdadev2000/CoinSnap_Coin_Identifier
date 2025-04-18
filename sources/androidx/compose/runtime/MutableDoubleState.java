package androidx.compose.runtime;

@Stable
/* loaded from: classes.dex */
public interface MutableDoubleState extends DoubleState, MutableState<Double> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    @Override // androidx.compose.runtime.DoubleState
    double e();

    default void l(double d) {
        m(d);
    }

    void m(double d);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        l(((Number) obj).doubleValue());
    }

    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    default Double getValue() {
        return Double.valueOf(e());
    }
}
