package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

@RequiresApi
@RestrictTo
/* loaded from: classes3.dex */
final class EmojiInputFilter implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f19597a;

    /* renamed from: b, reason: collision with root package name */
    public EmojiCompat.InitCallback f19598b;

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class InitCallbackImpl extends EmojiCompat.InitCallback {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f19599a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f19600b;

        public InitCallbackImpl(TextView textView, EmojiInputFilter emojiInputFilter) {
            this.f19599a = new WeakReference(textView);
            this.f19600b = new WeakReference(emojiInputFilter);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void b() {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.f19599a.get();
            InputFilter inputFilter = (InputFilter) this.f19600b.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        EmojiCompat a2 = EmojiCompat.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a2.getClass();
                            length = text.length();
                        }
                        CharSequence k2 = a2.k(0, length, text, 0);
                        if (text == k2) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(k2);
                        int selectionEnd = Selection.getSelectionEnd(k2);
                        textView.setText(k2);
                        if (k2 instanceof Spannable) {
                            Spannable spannable = (Spannable) k2;
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

    public EmojiInputFilter(TextView textView) {
        this.f19597a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        TextView textView = this.f19597a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int d = EmojiCompat.a().d();
        if (d != 0) {
            if (d == 1) {
                if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return EmojiCompat.a().k(0, charSequence.length(), charSequence, 0);
            }
            if (d != 3) {
                return charSequence;
            }
        }
        EmojiCompat a2 = EmojiCompat.a();
        if (this.f19598b == null) {
            this.f19598b = new InitCallbackImpl(textView, this);
        }
        a2.l(this.f19598b);
        return charSequence;
    }
}
