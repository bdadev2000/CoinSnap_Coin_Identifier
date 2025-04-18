package androidx.compose.runtime;

@Stable
/* loaded from: classes.dex */
public interface MutableIntState extends IntState, MutableState<Integer> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    void b(int i2);

    @Override // androidx.compose.runtime.IntState
    int g();

    default void j(int i2) {
        b(i2);
    }

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        j(((Number) obj).intValue());
    }

    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    default Integer getValue() {
        return Integer.valueOf(g());
    }
}
