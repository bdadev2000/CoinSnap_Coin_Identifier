package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class w2 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f1074c;

    public /* synthetic */ w2(KeyEvent.Callback callback, int i10) {
        this.f1073b = i10;
        this.f1074c = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        if (r3 != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTextChanged(java.lang.CharSequence r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w2.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
