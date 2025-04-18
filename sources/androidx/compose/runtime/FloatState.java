package androidx.compose.runtime;

@Stable
/* loaded from: classes2.dex */
public interface FloatState extends State<Float> {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    float c();

    @Override // androidx.compose.runtime.State
    default Float getValue() {
        return Float.valueOf(c());
    }
}
