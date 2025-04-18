package pf;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.diagnose.DiagnoseActivity;
import kf.e1;
import kf.t1;
import kotlin.jvm.internal.Intrinsics;
import sf.n;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23634b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.f23634b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        int i11 = this.a;
        Object obj = this.f23634b;
        switch (i11) {
            case 0:
                DiagnoseActivity this$0 = (DiagnoseActivity) obj;
                int i12 = DiagnoseActivity.f16607n;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i10 != 3) {
                    return false;
                }
                this$0.getClass();
                DiagnoseActivity.I(this$0);
                CharSequence text = textView.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                if (text.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return true;
                }
                Toast.makeText(this$0, this$0.getString(R.string.please_enter_text), 0).show();
                return true;
            case 1:
                sf.d this$02 = (sf.d) obj;
                int i13 = sf.d.f25022h;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (i10 == 6) {
                    Context context = this$02.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    EditText edtDescription = ((e1) this$02.b()).E;
                    Intrinsics.checkNotNullExpressionValue(edtDescription, "edtDescription");
                    this$02.f(context, edtDescription);
                }
                return true;
            default:
                n this$03 = (n) obj;
                int i14 = n.f25051j;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (i10 == 6) {
                    Context context2 = this$03.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    EditText edtDescription2 = ((t1) this$03.b()).E;
                    Intrinsics.checkNotNullExpressionValue(edtDescription2, "edtDescription");
                    this$03.f(context2, edtDescription2);
                }
                return true;
        }
    }
}
