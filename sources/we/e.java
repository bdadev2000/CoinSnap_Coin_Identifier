package we;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public final class e extends FrameLayout implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final fe.c f26983d = new fe.c(e.class.getSimpleName());

    /* renamed from: b, reason: collision with root package name */
    public a f26984b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26985c;

    public e(Context context) {
        super(context);
        this.f26984b = a.PREVIEW;
        setWillNotDraw(false);
    }

    public final void a(a aVar, Canvas canvas) {
        synchronized (this) {
            try {
                this.f26984b = aVar;
                int ordinal = aVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1 || ordinal == 2) {
                        canvas.save();
                        float width = canvas.getWidth() / getWidth();
                        float height = canvas.getHeight() / getHeight();
                        f26983d.a(0, "draw", "target:", aVar, "canvas:", canvas.getWidth() + "x" + canvas.getHeight(), "view:", getWidth() + "x" + getHeight(), "widthScale:", Float.valueOf(width), "heightScale:", Float.valueOf(height), "hardwareCanvasMode:", Boolean.valueOf(this.f26985c));
                        canvas.scale(width, height);
                        dispatchDraw(canvas);
                        canvas.restore();
                    }
                } else {
                    super.draw(canvas);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
    
        if (r2.f26981b != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:2:0x0002->B:10:0x0034, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(we.a r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.getChildCount()
            if (r1 >= r2) goto L37
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            we.d r2 = (we.d) r2
            we.a r3 = we.a.PREVIEW
            r4 = 1
            if (r6 != r3) goto L1b
            boolean r3 = r2.a
            if (r3 != 0) goto L2b
        L1b:
            we.a r3 = we.a.VIDEO_SNAPSHOT
            if (r6 != r3) goto L23
            boolean r3 = r2.f26982c
            if (r3 != 0) goto L2b
        L23:
            we.a r3 = we.a.PICTURE_SNAPSHOT
            if (r6 != r3) goto L2d
            boolean r2 = r2.f26981b
            if (r2 == 0) goto L30
        L2b:
            r2 = r4
            goto L31
        L2d:
            r2.getClass()
        L30:
            r2 = r0
        L31:
            if (r2 == 0) goto L34
            return r4
        L34:
            int r1 = r1 + 1
            goto L2
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: we.e.b(we.a):boolean");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        f26983d.a(1, "normal draw called.");
        a aVar = a.PREVIEW;
        if (b(aVar)) {
            a(aVar, canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0021, code lost:
    
        if (r1.f26981b != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean drawChild(android.graphics.Canvas r14, android.view.View r15, long r16) {
        /*
            r13 = this;
            r0 = r13
            android.view.ViewGroup$LayoutParams r1 = r15.getLayoutParams()
            we.d r1 = (we.d) r1
            we.a r2 = r0.f26984b
            we.a r3 = we.a.PREVIEW
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L13
            boolean r3 = r1.a
            if (r3 != 0) goto L23
        L13:
            we.a r3 = we.a.VIDEO_SNAPSHOT
            if (r2 != r3) goto L1b
            boolean r3 = r1.f26982c
            if (r3 != 0) goto L23
        L1b:
            we.a r3 = we.a.PICTURE_SNAPSHOT
            if (r2 != r3) goto L25
            boolean r2 = r1.f26981b
            if (r2 == 0) goto L28
        L23:
            r2 = r4
            goto L29
        L25:
            r1.getClass()
        L28:
            r2 = r5
        L29:
            r3 = 5
            java.lang.String r6 = "params:"
            r7 = 4
            r8 = 3
            java.lang.String r9 = "target:"
            r10 = 2
            r11 = 6
            fe.c r12 = we.e.f26983d
            if (r2 == 0) goto L58
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r11 = "Performing drawing for view:"
            r2[r5] = r11
            java.lang.Class r11 = r15.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r2[r4] = r11
            r2[r10] = r9
            we.a r4 = r0.f26984b
            r2[r8] = r4
            r2[r7] = r6
            r2[r3] = r1
            r12.a(r5, r2)
            boolean r1 = super.drawChild(r14, r15, r16)
            return r1
        L58:
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r11 = "Skipping drawing for view:"
            r2[r5] = r11
            java.lang.Class r11 = r15.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r2[r4] = r11
            r2[r10] = r9
            we.a r4 = r0.f26984b
            r2[r8] = r4
            r2[r7] = r6
            r2[r3] = r1
            r12.a(r5, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: we.e.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public boolean getHardwareCanvasEnabled() {
        return this.f26985c;
    }

    public void setHardwareCanvasEnabled(boolean z10) {
        this.f26985c = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }
}
