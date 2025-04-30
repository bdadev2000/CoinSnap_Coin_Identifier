package U3;

import T.C0260b;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class z extends C0260b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f3243d;

    public z(TextInputLayout textInputLayout) {
        this.f3243d = textInputLayout;
    }

    @Override // T.C0260b
    public final void d(View view, U.i iVar) {
        CharSequence charSequence;
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.f2879a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f3098a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f3243d;
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
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z8 = !isEmpty;
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(hint);
        boolean z11 = !textInputLayout.f14197w0;
        boolean z12 = !TextUtils.isEmpty(error);
        if (!z12 && TextUtils.isEmpty(counterOverflowDescription)) {
            z9 = false;
        }
        if (z10) {
            str = hint.toString();
        } else {
            str = "";
        }
        x xVar = textInputLayout.f14160c;
        AppCompatTextView appCompatTextView = xVar.f3233c;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(xVar.f3235f);
        }
        if (z8) {
            iVar.l(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            iVar.l(str);
            if (z11 && placeholderText != null) {
                iVar.l(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            iVar.l(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 26) {
                iVar.j(str);
            } else {
                if (z8) {
                    str = ((Object) charSequence) + ", " + str;
                }
                iVar.l(str);
            }
            if (i9 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                iVar.h(4, isEmpty);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z9) {
            if (!z12) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.l.f3219y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.f14162d.b().n(iVar);
    }

    @Override // T.C0260b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f3243d.f14162d.b().o(accessibilityEvent);
    }
}
