package q;

import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.internal.C1838g;

/* loaded from: classes.dex */
public class Y extends C1838g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f22610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f22610c = appCompatTextView;
    }

    @Override // com.facebook.internal.C1838g, q.X
    public final void b(int i9) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i9);
    }

    @Override // com.facebook.internal.C1838g, q.X
    public final void c(int i9) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i9);
    }
}
