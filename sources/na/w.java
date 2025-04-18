package na;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class w extends n0.b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f22714d;

    public w(TextInputLayout textInputLayout) {
        this.f22714d = textInputLayout;
    }

    @Override // n0.b
    public final void d(View view, o0.j jVar) {
        CharSequence charSequence;
        boolean z10;
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f22714d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean z11 = !TextUtils.isEmpty(charSequence);
        boolean z12 = !TextUtils.isEmpty(hint);
        boolean z13 = !textInputLayout.f11842w0;
        boolean z14 = !TextUtils.isEmpty(error);
        if (!z14 && TextUtils.isEmpty(counterOverflowDescription)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z12) {
            str = hint.toString();
        } else {
            str = "";
        }
        u uVar = textInputLayout.f11803c;
        AppCompatTextView appCompatTextView = uVar.f22702c;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(uVar.f22704f);
        }
        if (z11) {
            jVar.n(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            jVar.n(str);
            if (z13 && placeholderText != null) {
                jVar.n(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            jVar.n(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                jVar.l(str);
            } else {
                if (z11) {
                    str = ((Object) charSequence) + ", " + str;
                }
                jVar.n(str);
            }
            boolean z15 = true ^ z11;
            if (i10 >= 26) {
                accessibilityNodeInfo.setShowingHintText(z15);
            } else {
                jVar.h(4, z15);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            if (!z14) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.f11820l.f22685y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.f11805d.b().n(jVar);
    }

    @Override // n0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f22714d.f11805d.b().o(accessibilityEvent);
    }
}
