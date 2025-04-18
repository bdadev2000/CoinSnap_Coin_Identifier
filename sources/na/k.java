package na;

import android.text.Editable;

/* loaded from: classes3.dex */
public final class k extends ea.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f22633b;

    public k(m mVar) {
        this.f22633b = mVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f22633b.b().a();
    }

    @Override // ea.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f22633b.b().b();
    }
}
