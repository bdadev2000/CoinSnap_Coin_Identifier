package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* loaded from: classes2.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends IUnusedAppRestrictionsBackportService.Stub {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.core.content.UnusedAppRestrictionsBackportCallback] */
        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public final void C(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
            if (iUnusedAppRestrictionsBackportCallback == null) {
                return;
            }
            new Object().f18479a = iUnusedAppRestrictionsBackportCallback;
            throw null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }
}
