package com.facebook.login;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.tools.arruler.photomeasure.camera.ruler.R;
import i1.AbstractC2337c;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13709c;

    public /* synthetic */ g(Object obj, int i9) {
        this.b = i9;
        this.f13709c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        Object obj = this.f13709c;
        switch (this.b) {
            case 0:
                j jVar = (j) obj;
                G7.j.e(jVar, "this$0");
                View d2 = jVar.d(false);
                Dialog dialog = jVar.getDialog();
                if (dialog != null) {
                    dialog.setContentView(d2);
                }
                q qVar = jVar.m;
                if (qVar != null) {
                    jVar.k(qVar);
                    return;
                }
                return;
            case 1:
                com.vungle.ads.internal.presenter.y.a((com.vungle.ads.internal.presenter.y) obj, dialogInterface, i9);
                return;
            default:
                int i10 = DefaultErrorActivity.f5457c;
                DefaultErrorActivity defaultErrorActivity = (DefaultErrorActivity) obj;
                String b = AbstractC2337c.b(defaultErrorActivity, defaultErrorActivity.getIntent());
                ClipboardManager clipboardManager = (ClipboardManager) defaultErrorActivity.getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(defaultErrorActivity.getString(R.string.customactivityoncrash_error_activity_error_details_clipboard_label), b));
                    Toast.makeText(defaultErrorActivity, R.string.customactivityoncrash_error_activity_error_details_copied, 0).show();
                    return;
                }
                return;
        }
    }
}
