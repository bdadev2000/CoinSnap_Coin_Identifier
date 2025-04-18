package s0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.app.h;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {
    public final /* synthetic */ h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, h hVar) {
        super(inputConnection, false);
        this.a = hVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        f.a aVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            aVar = new f.a(new d(inputContentInfo), 6);
        }
        if (this.a.e(aVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
