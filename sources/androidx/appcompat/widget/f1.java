package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class f1 extends v3.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(AppCompatTextView appCompatTextView) {
        super(appCompatTextView, 2);
        this.f867d = appCompatTextView;
    }

    @Override // v3.c, androidx.appcompat.widget.e1
    public final void i(int i10) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i10);
    }

    @Override // v3.c, androidx.appcompat.widget.e1
    public final void u(int i10) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i10);
    }
}
