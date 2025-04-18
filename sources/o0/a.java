package o0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final j f22954b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22955c;

    public a(int i10, j jVar, int i11) {
        this.a = i10;
        this.f22954b = jVar;
        this.f22955c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.f22954b.a.performAction(this.f22955c, bundle);
    }
}
