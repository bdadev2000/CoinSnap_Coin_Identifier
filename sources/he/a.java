package he;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19025b;

    public final int a(int[] iArr, int[] iArr2) {
        switch (this.f19025b) {
            case 0:
                return (iArr2[1] - iArr2[0]) - (iArr[1] - iArr[0]);
            default:
                return (iArr[1] - iArr[0]) - (iArr2[1] - iArr2[0]);
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f19025b) {
            case 0:
                return a((int[]) obj, (int[]) obj2);
            default:
                return a((int[]) obj, (int[]) obj2);
        }
    }
}
