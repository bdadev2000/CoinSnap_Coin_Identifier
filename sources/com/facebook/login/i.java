package com.facebook.login;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes.dex */
public final class i extends Dialog {
    public final /* synthetic */ j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, FragmentActivity fragmentActivity) {
        super(fragmentActivity, R.style.com_facebook_auth_dialog);
        this.b = jVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.b.getClass();
        super.onBackPressed();
    }
}
