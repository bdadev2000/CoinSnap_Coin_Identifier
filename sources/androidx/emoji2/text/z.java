package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class z implements TextWatcher, SpanWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1551b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f1552c = new AtomicInteger(0);

    public z(Object obj) {
        this.f1551b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f1551b).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f1551b).beforeTextChanged(charSequence, i10, i11, i12);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
        if (this.f1552c.get() > 0 && (obj instanceof b0)) {
            return;
        }
        ((SpanWatcher) this.f1551b).onSpanAdded(spannable, obj, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (this.f1552c.get() > 0 && (obj instanceof b0)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i10 > i11) {
                i10 = 0;
            }
            if (i12 > i13) {
                i14 = i10;
                i15 = 0;
                ((SpanWatcher) this.f1551b).onSpanChanged(spannable, obj, i14, i11, i15, i13);
            }
        }
        i14 = i10;
        i15 = i12;
        ((SpanWatcher) this.f1551b).onSpanChanged(spannable, obj, i14, i11, i15, i13);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
        if (this.f1552c.get() > 0 && (obj instanceof b0)) {
            return;
        }
        ((SpanWatcher) this.f1551b).onSpanRemoved(spannable, obj, i10, i11);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f1551b).onTextChanged(charSequence, i10, i11, i12);
    }
}
