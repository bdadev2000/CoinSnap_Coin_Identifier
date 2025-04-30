package T;

/* loaded from: classes.dex */
public interface r {
    boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2, int i11);

    boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr, int i13);

    boolean hasNestedScrollingParent(int i9);

    boolean startNestedScroll(int i9, int i10);

    void stopNestedScroll(int i9);
}
