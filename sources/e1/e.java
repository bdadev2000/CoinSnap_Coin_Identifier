package e1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e extends androidx.emoji2.text.j {
    public final WeakReference a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f17075b;

    public e(TextView textView, f fVar) {
        this.a = new WeakReference(textView);
        this.f17075b = new WeakReference(fVar);
    }

    @Override // androidx.emoji2.text.j
    public final void a() {
        boolean z10;
        int length;
        InputFilter[] filters;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.f17075b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (z10 && textView.isAttachedToWindow()) {
            CharSequence text = textView.getText();
            androidx.emoji2.text.l a = androidx.emoji2.text.l.a();
            if (text == null) {
                length = 0;
            } else {
                a.getClass();
                length = text.length();
            }
            CharSequence f10 = a.f(0, length, text);
            if (text == f10) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(f10);
            int selectionEnd = Selection.getSelectionEnd(f10);
            textView.setText(f10);
            if (f10 instanceof Spannable) {
                Spannable spannable = (Spannable) f10;
                if (selectionStart >= 0 && selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                } else if (selectionStart >= 0) {
                    Selection.setSelection(spannable, selectionStart);
                } else if (selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionEnd);
                }
            }
        }
    }
}
