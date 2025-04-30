package q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: q.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2622s {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f22720a = null;
    public PorterDuff.Mode b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22721c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22722d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22723e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f22724f;

    public /* synthetic */ C2622s(TextView textView) {
        this.f22724f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f22724f;
        Drawable a6 = Z.c.a(compoundButton);
        if (a6 != null) {
            if (this.f22721c || this.f22722d) {
                Drawable mutate = a6.mutate();
                if (this.f22721c) {
                    M.a.h(mutate, this.f22720a);
                }
                if (this.f22722d) {
                    M.a.i(mutate, this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        CheckedTextView checkedTextView = (CheckedTextView) this.f22724f;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f22721c || this.f22722d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f22721c) {
                    M.a.h(mutate, this.f22720a);
                }
                if (this.f22722d) {
                    M.a.i(mutate, this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x0025, B:5:0x002b, B:8:0x0031, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x0025, B:5:0x002b, B:8:0x0031, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.util.AttributeSet r12, int r13) {
        /*
            r11 = this;
            android.widget.TextView r0 = r11.f22724f
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r1 = r0.getContext()
            int[] r3 = j.AbstractC2379a.m
            r8 = 0
            l5.k r9 = l5.k.i(r1, r12, r3, r13, r8)
            java.lang.Object r1 = r9.b
            r10 = r1
            android.content.res.TypedArray r10 = (android.content.res.TypedArray) r10
            android.content.Context r2 = r0.getContext()
            r7 = 0
            java.lang.Object r1 = r9.b
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r0
            r4 = r12
            r6 = r13
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            r12 = 1
            boolean r13 = r10.hasValue(r12)     // Catch: java.lang.Throwable -> L3d
            if (r13 == 0) goto L3f
            int r12 = r10.getResourceId(r12, r8)     // Catch: java.lang.Throwable -> L3d
            if (r12 == 0) goto L3f
            android.content.Context r13 = r0.getContext()     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r12 = com.facebook.appevents.n.g(r13, r12)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            r0.setButtonDrawable(r12)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            goto L56
        L3d:
            r12 = move-exception
            goto L7c
        L3f:
            boolean r12 = r10.hasValue(r8)     // Catch: java.lang.Throwable -> L3d
            if (r12 == 0) goto L56
            int r12 = r10.getResourceId(r8, r8)     // Catch: java.lang.Throwable -> L3d
            if (r12 == 0) goto L56
            android.content.Context r13 = r0.getContext()     // Catch: java.lang.Throwable -> L3d
            android.graphics.drawable.Drawable r12 = com.facebook.appevents.n.g(r13, r12)     // Catch: java.lang.Throwable -> L3d
            r0.setButtonDrawable(r12)     // Catch: java.lang.Throwable -> L3d
        L56:
            r12 = 2
            boolean r13 = r10.hasValue(r12)     // Catch: java.lang.Throwable -> L3d
            if (r13 == 0) goto L64
            android.content.res.ColorStateList r12 = r9.d(r12)     // Catch: java.lang.Throwable -> L3d
            Z.b.c(r0, r12)     // Catch: java.lang.Throwable -> L3d
        L64:
            r12 = 3
            boolean r13 = r10.hasValue(r12)     // Catch: java.lang.Throwable -> L3d
            if (r13 == 0) goto L78
            r13 = -1
            int r12 = r10.getInt(r12, r13)     // Catch: java.lang.Throwable -> L3d
            r13 = 0
            android.graphics.PorterDuff$Mode r12 = q.AbstractC2610l0.c(r12, r13)     // Catch: java.lang.Throwable -> L3d
            Z.b.d(r0, r12)     // Catch: java.lang.Throwable -> L3d
        L78:
            r9.j()
            return
        L7c:
            r9.j()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C2622s.c(android.util.AttributeSet, int):void");
    }
}
