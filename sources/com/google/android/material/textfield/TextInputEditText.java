package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.y;
import com.bumptech.glide.d;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Locale;
import p6.a;

/* loaded from: classes3.dex */
public class TextInputEditText extends y {

    /* renamed from: i, reason: collision with root package name */
    public final Rect f11798i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11799j;

    public TextInputEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.z(context, attributeSet, R.attr.editTextStyle, 0), attributeSet);
        this.f11798i = new Rect();
        TypedArray s5 = d.s(context, attributeSet, r9.a.A, R.attr.editTextStyle, R.style.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(s5.getBoolean(0, false));
        s5.recycle();
    }

    @Nullable
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @Nullable
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        boolean z10;
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f11799j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && rect != null) {
            Rect rect2 = this.f11798i;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean z10;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f11799j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
            if (globalVisibleRect && point != null) {
                point.offset(-getScrollX(), -getScrollY());
            }
            return globalVisibleRect;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.G) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.G && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // androidx.appcompat.widget.y, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean z10;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f11799j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && rect != null) {
            int height = textInputLayout.getHeight() - getHeight();
            int i10 = rect.left;
            int i11 = rect.top;
            int i12 = rect.right;
            int i13 = rect.bottom + height;
            Rect rect2 = this.f11798i;
            rect2.set(i10, i11, i12, i13);
            return super.requestRectangleOnScreen(rect2);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f11799j = z10;
    }
}
