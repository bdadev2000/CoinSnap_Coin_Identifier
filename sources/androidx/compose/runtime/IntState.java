package androidx.compose.runtime;

@Stable
/* loaded from: classes3.dex */
public interface IntState extends State<Integer> {

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    int g();

    @Override // androidx.compose.runtime.State
    default Integer getValue() {
        return Integer.valueOf(g());
    }
}
