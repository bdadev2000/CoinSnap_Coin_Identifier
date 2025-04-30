package U3;

import android.text.Editable;

/* loaded from: classes2.dex */
public final class l extends L3.j {
    public final /* synthetic */ o b;

    public l(o oVar) {
        this.b = oVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.b().a();
    }

    @Override // L3.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        this.b.b().b();
    }
}
