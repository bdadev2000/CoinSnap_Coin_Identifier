package androidx.appcompat.widget;

import E1.c;
import T.C0264d;
import T.C0268f;
import T.InterfaceC0262c;
import T.InterfaceC0294z;
import Z.r;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import g4.AbstractC2292b;
import q.AbstractC2581D;
import q.C2578A;
import q.C2617p;
import q.C2626u;
import q.O0;
import q.P;
import q.P0;
import q.Q;
import q.W;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC0294z {
    public final C2617p b;

    /* renamed from: c, reason: collision with root package name */
    public final W f4207c;

    /* renamed from: d, reason: collision with root package name */
    public final Q f4208d;

    /* renamed from: f, reason: collision with root package name */
    public final r f4209f;

    /* renamed from: g, reason: collision with root package name */
    public final C2578A f4210g;

    /* renamed from: h, reason: collision with root package name */
    public C2626u f4211h;

    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @NonNull
    @RequiresApi(26)
    private C2626u getSuperCaller() {
        if (this.f4211h == null) {
            this.f4211h = new C2626u(this);
        }
        return this.f4211h;
    }

    @Override // T.InterfaceC0294z
    public final C0268f a(C0268f c0268f) {
        return this.f4209f.a(this, c0268f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.a();
        }
        W w2 = this.f4207c;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2292b.q(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            return c2617p.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            return c2617p.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4207c.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4207c.e();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        Q q9;
        if (Build.VERSION.SDK_INT < 28 && (q9 = this.f4208d) != null) {
            TextClassifier textClassifier = q9.b;
            if (textClassifier == null) {
                return P.a(q9.f22588a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            q.W r1 = r7.f4207c
            r1.getClass()
            q.W.h(r7, r0, r8)
            com.facebook.appevents.g.u(r0, r8, r7)
            if (r0 == 0) goto L78
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L78
            java.lang.String[] r2 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r7)
            if (r2 == 0) goto L78
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            Y.a.c(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            F2.d r2 = new F2.d
            r6 = 9
            r2.<init>(r7, r6)
            if (r1 < r5) goto L4e
            Y.d r1 = new Y.d
            r1.<init>(r0, r2)
        L4c:
            r0 = r1
            goto L78
        L4e:
            java.lang.String[] r6 = Y.c.f3747a
            if (r1 < r5) goto L5a
            java.lang.String[] r1 = Y.a.d(r8)
            if (r1 == 0) goto L6e
        L58:
            r6 = r1
            goto L6e
        L5a:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5f
            goto L6e
        L5f:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6b
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6b:
            if (r1 == 0) goto L6e
            goto L58
        L6e:
            int r1 = r6.length
            if (r1 != 0) goto L72
            goto L78
        L72:
            Y.e r1 = new Y.e
            r1.<init>(r0, r2)
            goto L4c
        L78:
            q.A r1 = r7.f4210g
            l0.b r8 = r1.c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatEditText.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30 && i9 < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z8 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ViewCompat.getOnReceiveContentMimeTypes(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z8 = AbstractC2581D.a(dragEvent, this, activity);
            }
        }
        if (z8) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i9) {
        ClipData primaryClip;
        InterfaceC0262c interfaceC0262c;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 && ViewCompat.getOnReceiveContentMimeTypes(this) != null && (i9 == 16908322 || i9 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i11 >= 31) {
                    interfaceC0262c = new c(primaryClip, 1);
                } else {
                    C0264d c0264d = new C0264d();
                    c0264d.f2880c = primaryClip;
                    c0264d.f2881d = 1;
                    interfaceC0262c = c0264d;
                }
                if (i9 == 16908322) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                interfaceC0262c.f(i10);
                ViewCompat.performReceiveContent(this, interfaceC0262c.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.f(i9);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f4207c;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f4207c;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC2292b.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        this.f4210g.d(z8);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f4210g.a(keyListener));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        W w2 = this.f4207c;
        w2.l(colorStateList);
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        W w2 = this.f4207c;
        w2.m(mode);
        w2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        W w2 = this.f4207c;
        if (w2 != null) {
            w2.g(context, i9);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        Q q9;
        if (Build.VERSION.SDK_INT < 28 && (q9 = this.f4208d) != null) {
            q9.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [q.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, Z.r] */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, R.attr.editTextStyle);
        P0.a(context);
        O0.a(this, getContext());
        C2617p c2617p = new C2617p(this);
        this.b = c2617p;
        c2617p.d(attributeSet, R.attr.editTextStyle);
        W w2 = new W(this);
        this.f4207c = w2;
        w2.f(attributeSet, R.attr.editTextStyle);
        w2.b();
        ?? obj = new Object();
        obj.f22588a = this;
        this.f4208d = obj;
        this.f4209f = new Object();
        C2578A c2578a = new C2578A(this);
        this.f4210g = c2578a;
        c2578a.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a6 = c2578a.a(keyListener);
            if (a6 == keyListener) {
                return;
            }
            super.setKeyListener(a6);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
