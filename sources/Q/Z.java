package q;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class Z extends Y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f22623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f22623d = appCompatTextView;
    }

    @Override // com.facebook.internal.C1838g, q.X
    public final void d(int i9, float f9) {
        super/*android.widget.TextView*/.setLineHeight(i9, f9);
    }
}
