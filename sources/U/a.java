package U;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final i f3083c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3084d;

    public a(int i9, i iVar, int i10) {
        this.b = i9;
        this.f3083c = iVar;
        this.f3084d = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.b);
        this.f3083c.f3098a.performAction(this.f3084d, bundle);
    }
}
