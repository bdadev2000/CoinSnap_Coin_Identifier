package i3;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class a extends Dialog {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i10) {
        super(context, R.style.AppTheme);
        this.f19140b = i10;
        if (i10 != 1) {
        } else {
            super(context, R.style.AppTheme);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        switch (this.f19140b) {
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
}
