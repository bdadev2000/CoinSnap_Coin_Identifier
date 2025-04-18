package n0;

/* loaded from: classes.dex */
public interface t {
    boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12);

    boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14);

    boolean hasNestedScrollingParent(int i10);

    boolean startNestedScroll(int i10, int i11);

    void stopNestedScroll(int i10);
}
