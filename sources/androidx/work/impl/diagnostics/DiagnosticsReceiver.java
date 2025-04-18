package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;

@RestrictTo
/* loaded from: classes4.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22098a = Logger.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f22098a;
        Logger.c().a(str, "Requesting diagnostics", new Throwable[0]);
        try {
            WorkManagerImpl b2 = WorkManagerImpl.b(context);
            OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest) new OneTimeWorkRequest.Builder(DiagnosticsWorker.class).a();
            b2.getClass();
            b2.a(Collections.singletonList(oneTimeWorkRequest));
        } catch (IllegalStateException e) {
            Logger.c().b(str, "WorkManager is not initialized", e);
        }
    }
}
