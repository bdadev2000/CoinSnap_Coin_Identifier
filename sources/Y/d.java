package Y;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F2.d f3748a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, F2.d dVar) {
        super(inputConnection, false);
        this.f3748a = dVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i9, Bundle bundle) {
        E1.c cVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            cVar = new E1.c(new f(inputContentInfo), 24);
        }
        if (this.f3748a.e(cVar, i9, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i9, bundle);
    }
}
