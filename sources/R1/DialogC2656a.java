package r1;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC2656a extends Dialog {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ DialogC2656a(Context context, int i9) {
        super(context, i9);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        switch (this.b) {
            case 0:
                super.onCreate(bundle);
                setContentView(R.layout.dialog_prepair_loading_ads);
                return;
            default:
                super.onCreate(bundle);
                setContentView(R.layout.dialog_resume_loading);
                return;
        }
    }

    public DialogC2656a(Context context) {
        super(context, R.style.AppTheme);
    }
}
