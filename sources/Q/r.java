package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g4.AbstractC2292b;

/* loaded from: classes.dex */
public final class r extends CheckedTextView {
    public final C2622s b;

    /* renamed from: c, reason: collision with root package name */
    public final C2617p f22708c;

    /* renamed from: d, reason: collision with root package name */
    public final W f22709d;

    /* renamed from: f, reason: collision with root package name */
    public C2628v f22710f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0087 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:3:0x004f, B:5:0x0055, B:8:0x005b, B:9:0x0080, B:11:0x0087, B:12:0x008e, B:14:0x0095, B:21:0x0069, B:23:0x006f, B:25:0x0075), top: B:2:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #1 {all -> 0x0067, blocks: (B:3:0x004f, B:5:0x0055, B:8:0x005b, B:9:0x0080, B:11:0x0087, B:12:0x008e, B:14:0x0095, B:21:0x0069, B:23:0x006f, B:25:0x0075), top: B:2:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            q.P0.a(r11)
            r7 = 2130968825(0x7f0400f9, float:1.7546315E38)
            r10.<init>(r11, r12, r7)
            android.content.Context r11 = r10.getContext()
            q.O0.a(r10, r11)
            q.W r11 = new q.W
            r11.<init>(r10)
            r10.f22709d = r11
            r11.f(r12, r7)
            r11.b()
            q.p r11 = new q.p
            r11.<init>(r10)
            r10.f22708c = r11
            r11.d(r12, r7)
            q.s r11 = new q.s
            r11.<init>(r10)
            r10.b = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = j.AbstractC2379a.l
            r8 = 0
            l5.k r11 = l5.k.i(r11, r12, r2, r7, r8)
            java.lang.Object r0 = r11.b
            r9 = r0
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            android.content.Context r1 = r10.getContext()
            r6 = 0
            java.lang.Object r0 = r11.b
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r10
            r3 = r12
            r5 = r7
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r0, r1, r2, r3, r4, r5, r6)
            r0 = 1
            boolean r1 = r9.hasValue(r0)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L69
            int r0 = r9.getResourceId(r0, r8)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L69
            android.content.Context r1 = r10.getContext()     // Catch: java.lang.Throwable -> L67 android.content.res.Resources.NotFoundException -> L69
            android.graphics.drawable.Drawable r0 = com.facebook.appevents.n.g(r1, r0)     // Catch: java.lang.Throwable -> L67 android.content.res.Resources.NotFoundException -> L69
            r10.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> L67 android.content.res.Resources.NotFoundException -> L69
            goto L80
        L67:
            r12 = move-exception
            goto Lad
        L69:
            boolean r0 = r9.hasValue(r8)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L80
            int r0 = r9.getResourceId(r8, r8)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L80
            android.content.Context r1 = r10.getContext()     // Catch: java.lang.Throwable -> L67
            android.graphics.drawable.Drawable r0 = com.facebook.appevents.n.g(r1, r0)     // Catch: java.lang.Throwable -> L67
            r10.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> L67
        L80:
            r0 = 2
            boolean r1 = r9.hasValue(r0)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L8e
            android.content.res.ColorStateList r0 = r11.d(r0)     // Catch: java.lang.Throwable -> L67
            r10.setCheckMarkTintList(r0)     // Catch: java.lang.Throwable -> L67
        L8e:
            r0 = 3
            boolean r1 = r9.hasValue(r0)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto La2
            r1 = -1
            int r0 = r9.getInt(r0, r1)     // Catch: java.lang.Throwable -> L67
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = q.AbstractC2610l0.c(r0, r1)     // Catch: java.lang.Throwable -> L67
            r10.setCheckMarkTintMode(r0)     // Catch: java.lang.Throwable -> L67
        La2:
            r11.j()
            q.v r11 = r10.getEmojiTextViewHelper()
            r11.b(r12, r7)
            return
        Lad:
            r11.j()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q.r.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @NonNull
    private C2628v getEmojiTextViewHelper() {
        if (this.f22710f == null) {
            this.f22710f = new C2628v(this);
        }
        return this.f22710f;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W w2 = this.f22709d;
        if (w2 != null) {
            w2.b();
        }
        C2617p c2617p = this.f22708c;
        if (c2617p != null) {
            c2617p.a();
        }
        C2622s c2622s = this.b;
        if (c2622s != null) {
            c2622s.b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2292b.q(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        C2617p c2617p = this.f22708c;
        if (c2617p != null) {
            return c2617p.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2617p c2617p = this.f22708c;
        if (c2617p != null) {
            return c2617p.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCheckMarkTintList() {
        C2622s c2622s = this.b;
        if (c2622s != null) {
            return c2622s.f22720a;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C2622s c2622s = this.b;
        if (c2622s != null) {
            return c2622s.b;
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f22709d.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f22709d.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.facebook.appevents.g.u(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2617p c2617p = this.f22708c;
        if (c2617p != null) {
            c2617p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2617p c2617p = this.f22708c;
        if (c2617p != null) {
            c2617p.f(i9);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C2622s c2622s = this.b;
        if (c2622s != null) {
            if (c2622s.f22723e) {
                c2622s.f22723e = false;
            } else {
                c2622s.f22723e = true;
                c2622s.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f22709d;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f22709d;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC2292b.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C2617p c2617p = this.f22708c;
        if (c2617p != null) {
            c2617p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C2617p c2617p = this.f22708c;
        if (c2617p != null) {
            c2617p.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        C2622s c2622s = this.b;
        if (c2622s != null) {
            c2622s.f22720a = colorStateList;
            c2622s.f22721c = true;
            c2622s.b();
        }
    }

    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        C2622s c2622s = this.b;
        if (c2622s != null) {
            c2622s.b = mode;
            c2622s.f22722d = true;
            c2622s.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        W w2 = this.f22709d;
        w2.l(colorStateList);
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        W w2 = this.f22709d;
        w2.m(mode);
        w2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        W w2 = this.f22709d;
        if (w2 != null) {
            w2.g(context, i9);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i9) {
        setCheckMarkDrawable(com.facebook.appevents.n.g(getContext(), i9));
    }
}
