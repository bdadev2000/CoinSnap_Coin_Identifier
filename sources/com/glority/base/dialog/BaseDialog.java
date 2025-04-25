package com.glority.base.dialog;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.glority.base.R;
import com.glority.base.presenter.ILogEvent;
import kotlin.Metadata;

/* compiled from: BaseDialog.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/glority/base/dialog/BaseDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/glority/base/presenter/ILogEvent;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public class BaseDialog extends DialogFragment implements ILogEvent {
    public static final int $stable = 0;

    @Override // com.glority.base.presenter.ILogEvent
    public void logEvent(String str, Bundle bundle) {
        ILogEvent.DefaultImpls.logEvent(this, str, bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, R.style.BaseDialog);
    }
}
