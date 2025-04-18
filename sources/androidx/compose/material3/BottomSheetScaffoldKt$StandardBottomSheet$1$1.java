package androidx.compose.material3;

import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class BottomSheetScaffoldKt$StandardBottomSheet$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetState f7988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7989b;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$1$1(SheetState sheetState, float f2) {
        super(2);
        this.f7988a = sheetState;
        this.f7989b = f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r6.c(r1) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r6.c(r1) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r6.c(r1) != false) goto L16;
     */
    @Override // q0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            androidx.compose.ui.unit.IntSize r6 = (androidx.compose.ui.unit.IntSize) r6
            long r0 = r6.f17493a
            androidx.compose.ui.unit.Constraints r7 = (androidx.compose.ui.unit.Constraints) r7
            long r6 = r7.f17480a
            int r6 = androidx.compose.ui.unit.Constraints.h(r6)
            float r6 = (float) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r7 = (int) r0
            float r7 = (float) r7
            androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1 r0 = new androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1
            androidx.compose.material3.SheetState r1 = r5.f7988a
            float r2 = r5.f7989b
            r0.<init>(r1, r6, r2, r7)
            androidx.compose.material3.internal.DraggableAnchors r6 = androidx.compose.material3.internal.AnchoredDraggableKt.a(r0)
            androidx.compose.material3.internal.AnchoredDraggableState r7 = r1.f11199c
            androidx.compose.runtime.State r7 = r7.f12825h
            java.lang.Object r7 = r7.getValue()
            androidx.compose.material3.SheetValue r7 = (androidx.compose.material3.SheetValue) r7
            int r0 = r7.ordinal()
            androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.f11206a
            if (r0 == 0) goto L71
            androidx.compose.material3.SheetValue r2 = androidx.compose.material3.SheetValue.f11208c
            androidx.compose.material3.SheetValue r3 = androidx.compose.material3.SheetValue.f11207b
            r4 = 1
            if (r0 == r4) goto L5c
            r4 = 2
            if (r0 != r4) goto L56
            boolean r0 = r6.c(r2)
            if (r0 == 0) goto L46
        L44:
            r7 = r2
            goto L78
        L46:
            boolean r0 = r6.c(r3)
            if (r0 == 0) goto L4e
        L4c:
            r7 = r3
            goto L78
        L4e:
            boolean r0 = r6.c(r1)
            if (r0 == 0) goto L78
        L54:
            r7 = r1
            goto L78
        L56:
            d0.e r6 = new d0.e
            r6.<init>()
            throw r6
        L5c:
            boolean r0 = r6.c(r3)
            if (r0 == 0) goto L63
            goto L4c
        L63:
            boolean r0 = r6.c(r2)
            if (r0 == 0) goto L6a
            goto L44
        L6a:
            boolean r0 = r6.c(r1)
            if (r0 == 0) goto L78
            goto L54
        L71:
            boolean r0 = r6.c(r1)
            if (r0 == 0) goto L78
            goto L54
        L78:
            d0.k r0 = new d0.k
            r0.<init>(r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
