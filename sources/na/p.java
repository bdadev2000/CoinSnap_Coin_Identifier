package na;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* loaded from: classes3.dex */
public final class p extends View.AccessibilityDelegate {
    public final /* synthetic */ q a;

    public p(q qVar) {
        this.a = qVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.a.f22669h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
