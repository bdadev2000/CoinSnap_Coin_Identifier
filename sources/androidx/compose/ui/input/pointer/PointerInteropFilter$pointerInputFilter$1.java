package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;

/* loaded from: classes3.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {

    /* renamed from: b, reason: collision with root package name */
    public PointerInteropFilter.DispatchToViewState f15625b = PointerInteropFilter.DispatchToViewState.f15622a;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PointerInteropFilter f15626c;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.f15626c = pointerInteropFilter;
    }

    public final void a(PointerEvent pointerEvent) {
        List list = pointerEvent.f15569a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            PointerInteropFilter.DispatchToViewState dispatchToViewState = PointerInteropFilter.DispatchToViewState.f15623b;
            PointerInteropFilter pointerInteropFilter = this.f15626c;
            if (i2 >= size) {
                LayoutCoordinates layoutCoordinates = this.f15618a;
                if (layoutCoordinates == null) {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
                PointerInteropUtils_androidKt.a(pointerEvent, layoutCoordinates.e0(0L), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, pointerInteropFilter), false);
                if (this.f15625b == dispatchToViewState) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((PointerInputChange) list.get(i3)).a();
                    }
                    InternalPointerEvent internalPointerEvent = pointerEvent.f15570b;
                    if (internalPointerEvent == null) {
                        return;
                    }
                    internalPointerEvent.f15556c = !pointerInteropFilter.f15621c;
                    return;
                }
                return;
            }
            if (((PointerInputChange) list.get(i2)).b()) {
                if (this.f15625b == dispatchToViewState) {
                    LayoutCoordinates layoutCoordinates2 = this.f15618a;
                    if (layoutCoordinates2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                    PointerInteropUtils_androidKt.a(pointerEvent, layoutCoordinates2.e0(0L), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(pointerInteropFilter), true);
                }
                this.f15625b = PointerInteropFilter.DispatchToViewState.f15624c;
                return;
            }
            i2++;
        }
    }

    public final void b() {
        if (this.f15625b == PointerInteropFilter.DispatchToViewState.f15623b) {
            long uptimeMillis = SystemClock.uptimeMillis();
            PointerInteropFilter pointerInteropFilter = this.f15626c;
            PointerInteropFilter$pointerInputFilter$1$onCancel$1 pointerInteropFilter$pointerInputFilter$1$onCancel$1 = new PointerInteropFilter$pointerInputFilter$1$onCancel$1(pointerInteropFilter);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            pointerInteropFilter$pointerInputFilter$1$onCancel$1.invoke(obtain);
            obtain.recycle();
            this.f15625b = PointerInteropFilter.DispatchToViewState.f15622a;
            pointerInteropFilter.f15621c = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.compose.ui.input.pointer.PointerEvent r8, androidx.compose.ui.input.pointer.PointerEventPass r9) {
        /*
            r7 = this;
            androidx.compose.ui.input.pointer.PointerInteropFilter r0 = r7.f15626c
            boolean r1 = r0.f15621c
            r2 = 0
            java.util.List r3 = r8.f15569a
            if (r1 != 0) goto L28
            int r1 = r3.size()
            r4 = r2
        Le:
            if (r4 >= r1) goto L26
            java.lang.Object r5 = r3.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.a(r5)
            if (r6 != 0) goto L28
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.c(r5)
            if (r5 == 0) goto L23
            goto L28
        L23:
            int r4 = r4 + 1
            goto Le
        L26:
            r1 = r2
            goto L29
        L28:
            r1 = 1
        L29:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r4 = r7.f15625b
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r5 = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.f15624c
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.f15574c
            if (r4 == r5) goto L41
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.f15572a
            if (r9 != r4) goto L3a
            if (r1 == 0) goto L3a
            r7.a(r8)
        L3a:
            if (r9 != r6) goto L41
            if (r1 != 0) goto L41
            r7.a(r8)
        L41:
            if (r9 != r6) goto L60
            int r8 = r3.size()
            r9 = r2
        L48:
            if (r9 >= r8) goto L5a
            java.lang.Object r1 = r3.get(r9)
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.c(r1)
            if (r1 != 0) goto L57
            goto L60
        L57:
            int r9 = r9 + 1
            goto L48
        L5a:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r8 = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.f15622a
            r7.f15625b = r8
            r0.f15621c = r2
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.c(androidx.compose.ui.input.pointer.PointerEvent, androidx.compose.ui.input.pointer.PointerEventPass):void");
    }
}
