package androidx.appcompat.widget;

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
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public class y extends EditText implements n0.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final r f1081b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f1082c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f1083d;

    /* renamed from: f, reason: collision with root package name */
    public final t0.q f1084f;

    /* renamed from: g, reason: collision with root package name */
    public final d3.g f1085g;

    /* renamed from: h, reason: collision with root package name */
    public x f1086h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        q3.a(context);
        p3.a(getContext(), this);
        r rVar = new r(this);
        this.f1081b = rVar;
        rVar.d(attributeSet, R.attr.editTextStyle);
        d1 d1Var = new d1(this);
        this.f1082c = d1Var;
        d1Var.f(attributeSet, R.attr.editTextStyle);
        d1Var.b();
        this.f1083d = new v0(this);
        this.f1084f = new t0.q();
        d3.g gVar = new d3.g(this);
        this.f1085g = gVar;
        gVar.v(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener s5 = gVar.s(keyListener);
            if (s5 != keyListener) {
                super.setKeyListener(s5);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @NonNull
    @RequiresApi(26)
    private x getSuperCaller() {
        if (this.f1086h == null) {
            this.f1086h = new x(this);
        }
        return this.f1086h;
    }

    @Override // n0.b0
    public final n0.g a(n0.g gVar) {
        return this.f1084f.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f1081b;
        if (rVar != null) {
            rVar.a();
        }
        d1 d1Var = this.f1082c;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.g.L(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f1081b;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f1081b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1082c.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1082c.e();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        v0 v0Var;
        if (Build.VERSION.SDK_INT < 28 && (v0Var = this.f1083d) != null) {
            TextClassifier textClassifier = v0Var.f1062b;
            if (textClassifier == null) {
                return u0.a(v0Var.a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
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
            androidx.appcompat.widget.d1 r1 = r7.f1082c
            r1.getClass()
            androidx.appcompat.widget.d1.h(r7, r0, r8)
            com.bumptech.glide.c.L(r7, r8, r0)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            s0.a.f(r8, r2)
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
            androidx.core.app.h r2 = new androidx.core.app.h
            r6 = 1
            r2.<init>(r7, r6)
            if (r1 < r5) goto L4d
            s0.b r1 = new s0.b
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = com.bumptech.glide.d.f9623c
            if (r1 < r5) goto L59
            java.lang.String[] r1 = s0.a.h(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            s0.c r1 = new s0.c
            r1.<init>(r0, r2)
            goto L4b
        L77:
            d3.g r1 = r7.f1085g
            android.view.inputmethod.InputConnection r8 = r1.A(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z10 = false;
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
                z10 = h0.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        int i11 = 0;
        if (Build.VERSION.SDK_INT < 31 && ViewCompat.getOnReceiveContentMimeTypes(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                f.a aVar = new f.a(primaryClip, 1);
                if (i10 != 16908322) {
                    i11 = 1;
                }
                ((n0.d) aVar.f17509c).b(i11);
                ViewCompat.performReceiveContent(this, ((n0.d) aVar.f17509c).build());
            }
            i11 = 1;
        }
        if (i11 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f1081b;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f1081b;
        if (rVar != null) {
            rVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1082c;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1082c;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.g.M(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((ka.e) ((e1.b) this.f1085g.f16813d).f17071d).t(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f1085g.s(keyListener));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        r rVar = this.f1081b;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        r rVar = this.f1081b;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        d1 d1Var = this.f1082c;
        d1Var.l(colorStateList);
        d1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        d1 d1Var = this.f1082c;
        d1Var.m(mode);
        d1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d1 d1Var = this.f1082c;
        if (d1Var != null) {
            d1Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        v0 v0Var;
        if (Build.VERSION.SDK_INT < 28 && (v0Var = this.f1083d) != null) {
            v0Var.f1062b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
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
