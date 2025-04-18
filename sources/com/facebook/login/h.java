package com.facebook.login;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes3.dex */
public final class h extends Dialog {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f11222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, FragmentActivity fragmentActivity) {
        super(fragmentActivity, R.style.com_facebook_auth_dialog);
        this.f11222b = iVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f11222b.getClass();
        super.onBackPressed();
    }
}
