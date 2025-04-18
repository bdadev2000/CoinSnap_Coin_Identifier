package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;

/* loaded from: classes2.dex */
class AppCompatCompoundButtonHelper {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f965a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f966b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f967c = null;
    public boolean d = false;
    public boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f968f;

    public AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.f965a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f965a;
        Drawable a2 = CompoundButtonCompat.a(compoundButton);
        if (a2 != null) {
            if (this.d || this.e) {
                Drawable mutate = a2.mutate();
                if (this.d) {
                    DrawableCompat.j(mutate, this.f966b);
                }
                if (this.e) {
                    DrawableCompat.k(mutate, this.f967c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:3:0x001b, B:5:0x0022, B:8:0x0028, B:9:0x004d, B:11:0x0054, B:12:0x005b, B:14:0x0062, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:3:0x001b, B:5:0x0022, B:8:0x0028, B:9:0x004d, B:11:0x0054, B:12:0x005b, B:14:0x0062, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r6 = r9.f965a
            android.content.Context r0 = r6.getContext()
            int[] r2 = androidx.appcompat.R.styleable.f321m
            androidx.appcompat.widget.TintTypedArray r7 = androidx.appcompat.widget.TintTypedArray.e(r0, r10, r2, r11)
            android.content.res.TypedArray r8 = r7.f1237b
            android.content.Context r1 = r6.getContext()
            android.content.res.TypedArray r4 = r7.f1237b
            r0 = r6
            r3 = r10
            r5 = r11
            androidx.core.view.ViewCompat.z(r0, r1, r2, r3, r4, r5)
            r10 = 1
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L34
            r0 = 0
            if (r11 == 0) goto L36
            int r10 = r8.getResourceId(r10, r0)     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L36
            android.content.Context r11 = r6.getContext()     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L36
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.AppCompatResources.a(r11, r10)     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L36
            r6.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L36
            goto L4d
        L34:
            r10 = move-exception
            goto L73
        L36:
            boolean r10 = r8.hasValue(r0)     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L4d
            int r10 = r8.getResourceId(r0, r0)     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L4d
            android.content.Context r11 = r6.getContext()     // Catch: java.lang.Throwable -> L34
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.AppCompatResources.a(r11, r10)     // Catch: java.lang.Throwable -> L34
            r6.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L34
        L4d:
            r10 = 2
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto L5b
            android.content.res.ColorStateList r10 = r7.a(r10)     // Catch: java.lang.Throwable -> L34
            androidx.core.widget.CompoundButtonCompat.d(r6, r10)     // Catch: java.lang.Throwable -> L34
        L5b:
            r10 = 3
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto L6f
            r11 = -1
            int r10 = r8.getInt(r10, r11)     // Catch: java.lang.Throwable -> L34
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.DrawableUtils.c(r10, r11)     // Catch: java.lang.Throwable -> L34
            androidx.core.widget.CompoundButtonCompat.e(r6, r10)     // Catch: java.lang.Throwable -> L34
        L6f:
            r7.f()
            return
        L73:
            r7.f()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCompoundButtonHelper.b(android.util.AttributeSet, int):void");
    }
}
