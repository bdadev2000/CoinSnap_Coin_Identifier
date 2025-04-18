package z2;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.facebook.login.i;
import com.facebook.login.r;
import com.plantcare.ai.identifier.plantid.R;
import com.vungle.ads.internal.presenter.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28471c;

    public /* synthetic */ c(Object obj, int i10) {
        this.f28470b = i10;
        this.f28471c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f28470b;
        Object obj = this.f28471c;
        switch (i11) {
            case 0:
                DefaultErrorActivity defaultErrorActivity = (DefaultErrorActivity) obj;
                int i12 = DefaultErrorActivity.f2780c;
                String b3 = y2.c.b(defaultErrorActivity, defaultErrorActivity.getIntent());
                ClipboardManager clipboardManager = (ClipboardManager) defaultErrorActivity.getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(defaultErrorActivity.getString(R.string.customactivityoncrash_error_activity_error_details_clipboard_label), b3));
                    Toast.makeText(defaultErrorActivity, R.string.customactivityoncrash_error_activity_error_details_copied, 0).show();
                    return;
                }
                return;
            case 1:
                i this$0 = (i) obj;
                int i13 = i.f11223n;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View f10 = this$0.f(false);
                Dialog dialog = this$0.getDialog();
                if (dialog != null) {
                    dialog.setContentView(f10);
                }
                r rVar = this$0.f11234m;
                if (rVar != null) {
                    this$0.m(rVar);
                    return;
                }
                return;
            default:
                y.m54showGdpr$lambda8((y) obj, dialogInterface, i10);
                return;
        }
    }
}
