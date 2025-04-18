package androidx.compose.runtime;

@Stable
/* loaded from: classes2.dex */
public interface LongState extends State<Long> {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    long d();

    @Override // androidx.compose.runtime.State
    default Long getValue() {
        return Long.valueOf(d());
    }
}
