package androidx.compose.runtime;

@Stable
/* loaded from: classes2.dex */
public interface DoubleState extends State<Double> {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    double e();

    @Override // androidx.compose.runtime.State
    default Double getValue() {
        return Double.valueOf(e());
    }
}
