package l0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c extends j0.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f21543a;
    public final WeakReference b;

    public c(TextView textView, d dVar) {
        this.f21543a = new WeakReference(textView);
        this.b = new WeakReference(dVar);
    }

    @Override // j0.h
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f21543a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        j0.j a6 = j0.j.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a6.getClass();
                            length = text.length();
                        }
                        CharSequence f9 = a6.f(text, 0, length);
                        if (text == f9) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(f9);
                        int selectionEnd = Selection.getSelectionEnd(f9);
                        textView.setText(f9);
                        if (f9 instanceof Spannable) {
                            Spannable spannable = (Spannable) f9;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
