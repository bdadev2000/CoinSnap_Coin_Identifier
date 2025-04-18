package com.facebook.login;

import android.content.DialogInterface;
import com.facebook.login.widget.LoginButton;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28609b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f28608a = i2;
        this.f28609b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        int i3 = this.f28608a;
        Object obj = this.f28609b;
        switch (i3) {
            case 0:
                DeviceAuthDialog.m562presentConfirmation$lambda8((DeviceAuthDialog) obj, dialogInterface, i2);
                return;
            default:
                LoginButton.LoginClickListener.m578performLogout$lambda2((LoginManager) obj, dialogInterface, i2);
                return;
        }
    }
}
